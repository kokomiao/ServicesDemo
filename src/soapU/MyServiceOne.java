package soapU;

public class MyServiceOne {

	public void simpleWebService(String args[]) {
		System.out.println("This is first web services script !!!");
	}
	
	public String getSimpleWebServiceName(String name){
		return "Hello "+name;
	}
}
