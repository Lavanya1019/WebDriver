package test1;

import java.io.File;


import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
public class XmlParser {

	public static void main(String[] args) throws ParserConfigurationException , SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
      //Build Document
        Document document = builder.parse(new File("employees.xml"));
        
        //Here comes the root node
        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());
        
        //Get all employees
        NodeList nList = document.getElementsByTagName("employee");
        System.out.println("============================");
        
        
        for (int temp = 0; temp < nList.getLength(); temp++)
        {
             Node node = nList.item(temp);
             
             System.out.println("");    //Just a separator
         
            //Print each employee's detail
            Element eElement = (Element) node;
            System.out.println("Employee id : "    + eElement.getAttribute("id"));
            System.out.println("First Name : "  + eElement.getElementsByTagName("firstName").item(0).getTextContent());
            System.out.println("Last Name : "   + eElement.getElementsByTagName("lastName").item(0).getTextContent());
            System.out.println("Location Name : "   + eElement.getElementsByTagName("location").item(0).getTextContent());



		
	}
	}
}


