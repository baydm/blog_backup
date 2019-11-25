package cn.yshye.down;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

public class MultiThreadDownLoad {
	private static String path = "http://v9app.mfzhaopu.com/app/apk/PMMobileToBV1.2.0.1911051734.apk";
	private static int threadCount = 4;

	public static void main(String[] args) throws Exception {
		URL url = new URL(path);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setConnectTimeout(10000);
		int code = connection.getResponseCode();
		if (code == 200) {
			int length = connection.getContentLength();
			RandomAccessFile file = new RandomAccessFile(getFileName(path), "rw");
			file.setLength(length);
			int blockSize = length / threadCount;

			for (int i = 0; i < threadCount; i++) {
				int startIndex = i * blockSize;
				int endIndex = (i + 1) * blockSize - 1;
				if (i == threadCount - 1) {
					endIndex = length - 1;
				}
				new DownLoadThred(startIndex, endIndex, i + 1).start();
			}
		}
	}

	private static class DownLoadThred extends Thread {
		private int startIndex;
		private int endIndex;
		private int threadId;

		public DownLoadThred(int startIndex, int endIndex, int threadId) {
			this.startIndex = startIndex;
			this.endIndex = endIndex;
			this.threadId = threadId;
		}

		@Override
		public void run() {
			try {
				// ��ȡ����¼������λ��
				File temp = new File(getFileName(path) + threadId + ".log");
				if (temp != null && temp.length() > 0) {
					// ˵����־�ļ�������
					FileInputStream fis = new FileInputStream(temp);
					BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
					String result = reader.readLine();
					// ������¼������λ�ø��������������ݵ���ʼλ��
					startIndex = Integer.parseInt(result);
				}
				URL url = new URL(path);
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("GET");
				connection.setConnectTimeout(10000);
				// ����Rangeͷ�����ڼ���õĿ�ʼ�����ͼ�����������������������
				connection.setRequestProperty("Range", "bytes=" + startIndex + "-" + endIndex);
				if (connection.getResponseCode() == 206) {
					System.out.println("�߳� " + threadId + "��ʼ����" + startIndex);
					InputStream inputStream = connection.getInputStream();
					int len = -1;
					byte[] buffer = new byte[1024];
					RandomAccessFile file = new RandomAccessFile(getFileName(path), "rw");
					// һ����Ҫ������Ҫseek��startIndexλ�ã�д������
					file.seek(startIndex);
					int count = 0;
					while ((len = inputStream.read(buffer)) != -1) {
						file.write(buffer, 0, len);
						count += len;
						int position = count + startIndex;
						RandomAccessFile tempFile = new RandomAccessFile(getFileName(path) + threadId + ".log", "rwd");
						tempFile.write(String.valueOf(position).getBytes());
						tempFile.close();
					}
					file.close();
					inputStream.close();
					if (temp != null) {
						temp.delete();
					}
					System.out.println("�߳� " + threadId + " ��������");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static String getFileName(String path) {
		String name = path.substring(path.lastIndexOf("/") + 1);
		return name;
	}
}
