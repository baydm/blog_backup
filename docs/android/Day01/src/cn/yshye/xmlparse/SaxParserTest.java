package cn.yshye.xmlparse;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.junit.Test;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserTest {

	@Test
	public void saxParser() throws Exception {
		SAXParserFactory parserFactory = SAXParserFactory.newInstance();
		SAXParser saxParser = parserFactory.newSAXParser();
		XMLReader xmlReader = saxParser.getXMLReader();
		xmlReader.setContentHandler(new Myhandler());
		xmlReader.parse("book.xml");
	}

	private class Myhandler extends DefaultHandler {

		@Override
		public void startDocument() throws SAXException {
			System.out.println("开始遍历");
		}

		@Override
		public void endDocument() throws SAXException {
			System.out.println("结束遍历");
		}

		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes)
				throws SAXException {
			System.out.println("开始节点<" + qName + ">");
		}

		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
			System.out.println("结束节点</" + qName + ">");
		}

		@Override
		public void characters(char[] ch, int start, int length) throws SAXException {
			String text = new String(ch, start, length);
			System.out.println("节点内容" + text);
		}

	}
}
