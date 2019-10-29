package cn.yshye.xmlparse;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomParseTest {
	
	@Test
	public void domParse() throws Exception {
        List<Book> lists = new ArrayList<Book>();  
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse("book.xml");
		NodeList bookList = document.getElementsByTagName("book");  
        for (int i = 0; i < bookList.getLength(); i++) {  
            Node bookNode = bookList.item(i);  
            if (bookNode.getNodeType() == Node.ELEMENT_NODE) {  
                Element bookElement = (Element) bookNode;  
                Book book = new Book();  
                book.setCategory(bookElement.getAttribute("category"));  
                Element titleElement = (Element) bookElement.getElementsByTagName("title").item(0);  
                book.setTitle(titleElement.getTextContent());  
                book.setTitleLang(titleElement.getAttribute("lang"));  
                NodeList authorList = bookElement.getElementsByTagName("author");  
                String author = "";  
                for (int j = 0; j < authorList.getLength(); j++) {  
                    author = author + authorList.item(j).getTextContent() + "/";  
                }  
                author = author.substring(0, author.length() - 1);  
                book.setAuthor(author);  
                book.setYear(bookElement.getElementsByTagName("year").item(0).getTextContent());  
                book.setPrice(bookElement.getElementsByTagName("price").item(0).getTextContent());  
                lists.add(book);  
            }  
        }  
		for (Book book : lists) {
			System.out.println(book);
		}
		
	}
	
}
