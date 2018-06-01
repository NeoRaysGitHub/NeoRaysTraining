package jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
      
public class EmployJAXB
{
	public void marshall()
	{
		try{
			
			Employee emp=new Employee("A001", "Pruthvi", "Bangalore", 50000);
			JAXBContext jc=JAXBContext.newInstance(Employee.class);
			Marshaller ms=jc.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ms.marshal(emp,System.out);
			ms.marshal(emp, new File("src\\data\\Employee.xml"));
	
		}catch(Exception e){
			System.out.println(""+e.getMessage());
		}
	}
	
	public void unmarshall()
	{
		try{
			JAXBContext jc=JAXBContext.newInstance(Employee.class);
			Unmarshaller ums=jc.createUnmarshaller();
			Employee emp=(Employee)ums.unmarshal(new File("src\\data\\Employee.xml"));
			System.out.println("Employee Information");
			System.out.println("id:"+emp.getId());
			System.out.println("Name:"+emp.getName());
			System.out.println("Address:"+emp.getAddress());
			System.out.println("Salary:"+emp.getSalary());
			
		}catch(Exception e){
			System.out.println(""+e.getMessage());
		}
	}
}
