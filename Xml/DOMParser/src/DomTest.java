import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class DomTest {
	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse("D://XML/employee.xml");
			// read the data from the document sequentially
			// get the root element from document
			Element element = document.getDocumentElement();
			// to get the name of the element of document use getNodeName()
			System.out.println("Root element of the document is:  "+element.getNodeName());
			// get the child elements of the root element
			NodeList nodeList = element.getChildNodes(); // it returns the NodeList (list) obj
			// now iterate the list object & get the child elements
			for(int i=0 ; i<nodeList.getLength() ; i++){
				Node node = nodeList.item(i);
				// to eliminate the space node elements in the output
				if(node.getNodeType()==node.ELEMENT_NODE){
				System.out.println("Child element of the "+element.getNodeName()+" is "+node.getNodeName()+" -->"+node.getTextContent());
				}
			}
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
