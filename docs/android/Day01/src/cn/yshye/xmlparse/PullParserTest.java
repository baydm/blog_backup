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
		// 获取工厂
		XmlPullParserFactory parserFactory = XmlPullParserFactory.newInstance();
		// 获取到xml的解析器
		XmlPullParser parser = parserFactory.newPullParser();
		// 给解析器设置一个输入源
		// 第一个参数输入流 第二个参数 文档用到的字符编码集
		parser.setInput(new FileInputStream(new File("book.xml")), "utf-8");
		// 获取当前事件类型
		int eventType = parser.getEventType();
		// 得到标签的名称
		String tagName = null;
		ArrayList<Book> books = null;
		Book book = null;
		while (eventType != XmlPullParser.END_DOCUMENT) {
			switch (eventType) {
			case XmlPullParser.START_DOCUMENT:
				books = new ArrayList<>();
				System.out.println("--------获得集合对象");
				break;
			case XmlPullParser.START_TAG:
				// 开始标签
				System.out.println("开始标签：" + parser.getName());
				// 得到开始标签的名称
				tagName = parser.getName();
				if ("book".equals(tagName)) {
					// 创建一个book 对象
					book = new Book();
					System.out.println("--------实例化用户对象");
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
				// 结束标签
				System.out.println("结束标签：" + parser.getName());
				tagName = parser.getName();
				if (tagName.equals("book")) {
					books.add(book);
					System.out.println("--------添加进集合");
				}
				break;
			}

			// 调用parser.next方法解析下一个元素 用这个结果来更新eventType 如果解析到文档结束那么就会推出循环
			// 如果不更新这个eventType 就是死循环
			eventType = parser.next();
		}

		// 遍历集合
		for (Book book1 : books) {
			System.out.println(book1);
		}
	}

}
