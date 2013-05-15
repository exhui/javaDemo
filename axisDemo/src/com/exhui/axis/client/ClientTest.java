package com.exhui.axis.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class ClientTest {

	public static void main(String[] args) {

		//编写客户端代码直接调用我们创建的服务
		String endPoint = "http://localhost:8080/axisDemo/services/webservcieDemo?wsdl";
		System.out.println(getHelloStr(endPoint));
		
		//以Stubs的方式调用服务
		System.out.println(getStubStr());
		
	}

	private static String getHelloStr(String endPoint) {
		String result = "";
		try {
			Service service = new Service();
			Call call = (Call) service.createCall();
			call.setOperationName(new QName(endPoint, "helloWorld"));
			call.setTargetEndpointAddress(new URL(endPoint));
			result = (String) call.invoke(new Object[] { "exhui" });

		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	private static String getStubStr(){
		WebservcieDemoService service = new WebservcieDemoServiceLocator();
		WebservcieDemo client = null;
		String result = "";
		try {
			client = service.getwebservcieDemo();
			result = client.getName("exhui");
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
