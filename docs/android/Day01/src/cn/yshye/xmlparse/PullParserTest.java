package cn.yshye.xmlparse;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.junit.Test;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class PullParserTest {

	@Test
	public void pullTest() throws Exception {
		// ��ȡ����
		XmlPullParserFactory parserFactory = XmlPullParserFactory.newInstance();
		// ��ȡ��xml�Ľ�����
		XmlPullParser parser = parserFactory.newPullParser();
		// ������������һ������Դ
		// ��һ������������ �ڶ������� �ĵ��õ����ַ����뼯
		parser.setInput(new FileInputStream(new File("book.xml")), "utf-8");
		// ��ȡ��ǰ�¼�����
		int eventType = parser.getEventType();
		// �õ���ǩ������
		String tagName = null;
		ArrayList<Book> books = null;
		Book book = null;
		while (eventType != XmlPullParser.END_DOCUMENT) {
			switch (eventType) {
			case XmlPullParser.START_DOCUMENT:
				books = new ArrayList<>();
				System.out.println("--------��ü��϶���");
				break;
			case XmlPullParser.START_TAG:
				// ��ʼ��ǩ
				System.out.println("��ʼ��ǩ��" + parser.getName());
				// �õ���ʼ��ǩ������
				tagName = parser.getName();
				if ("book".equals(tagName)) {
					// ����һ��book ����
					book = new Book();
					System.out.println("--------ʵ�����û�����");
					book.setCategory(parser.getAttributeValue(0));
				} else if ("title".equals(tagName)) {
					book.setTitleLang(parser.getAttributeValue(0));
					book.setTitle(parser.nextText());
				} else if ("author".equals(tagName)) {
					book.setAuthor(
							book.getAuthor() == null ? parser.nextText() : book.getAuthor() + "," + parser.getText());
				} else if ("year".equals(tagName)) {
					book.setYear(parser.nextText());
				} else if ("price".equals(tagName)) {
					book.setPrice(parser.nextText());
				}
				break;
			case XmlPullParser.END_TAG:
				// ������ǩ
				System.out.println("������ǩ��" + parser.getName());
				tagName = parser.getName();
				if (tagName.equals("book")) {
					books.add(book);
					System.out.println("--------��ӽ�����");
				}
				break;
			}

			// ����parser.next����������һ��Ԫ�� ��������������eventType ����������ĵ�������ô�ͻ��Ƴ�ѭ��
			// ������������eventType ������ѭ��
			eventType = parser.next();
		}

		// ��������
		for (Book book1 : books) {
			System.out.println(book1);
		}
	}

}
