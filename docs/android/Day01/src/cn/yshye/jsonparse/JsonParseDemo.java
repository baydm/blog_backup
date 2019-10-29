package cn.yshye.jsonparse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

public class JsonParseDemo {

	@Test
	public void jsonParseTest() throws Exception {
		StringBuffer buffer = new StringBuffer();
		File file = new File("City.json");
		FileInputStream inputStream = new FileInputStream(file);
		InputStreamReader reader = new InputStreamReader(inputStream,"UTF8");
		BufferedReader br = new BufferedReader(reader);
        String line;
        while ((line = br.readLine()) != null) {
        	buffer.append(line);
        }
        br.close();
        reader.close();
		JSONObject object = new JSONObject(buffer.toString());
		Iterator<String> keys = object.keys();
		while (keys.hasNext()) {
			String key = keys.next().toString();
			Object object2 = object.get(key);
			if(object2 instanceof JSONArray){
				JSONArray array = (JSONArray) object2;
				for (int i = 0; i < array.length(); i++) {
					System.out.println(array.get(i));
				}
			}else {
				System.out.println(object2);
			}
		}
	}
}
