package rpcWebService;

import javax.xml.namespace.QName;

import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;


public class RPCtest {

	public static void main(String[] args) throws Exception {
		RPCServiceClient serviceClient = new RPCServiceClient();
		Options options = serviceClient.getOptions();
		EndpointReference targetEPR = new EndpointReference(
				"http://192.168.2.92:8088/axis2/services/MyService");
		options.setTo(targetEPR);
		
		Object[] opAddEntryArgs = new Object[]{"zm"};
		
		Class[] classes = new Class[]{String.class};
		
		QName opAddEntry = new QName("http://ws.apache.org/axis2","getName");
		
		System.out.println(serviceClient.invokeBlocking(opAddEntry, opAddEntryArgs,classes)[0]);
		
		 classes = new Class[]{int.class};
		
		opAddEntry = new QName("http://ws.apache.org/axis2","getAdd");
		
		System.out.println(serviceClient.invokeBlocking(opAddEntry,new Object[]{1,2},classes)[0]);
		
	}

}
