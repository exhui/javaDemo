package com.exhui.hessian.client;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;
import com.exhui.hessian.service.HessianService;
import com.exhui.hessian.vo.Car;

/**
 * �ͻ��˵��ã�����������ӿڣ�
 *
 * @author chenyh 
 */
public class HessianClient {
	
	public static void main(String[] args){
		//δ��Spring�ĵ��÷�ʽ
		String url = "http://localhost:8080/hessianDemo/hessianService"; 
		//��Spring���ϵĵ��÷�ʽ
		//String url = "http://localhost:8080/hessianDemo/hessian/hessianTest"; 
		HessianProxyFactory factory = new HessianProxyFactory();   
		HessianService hessianService = null;
		try {
			hessianService = (HessianService) factory.create(HessianService.class, url);
		    Car car = hessianService.getCar();   
		    System.out.println("Hello: " + hessianService.getName());   
		    System.out.println("carName: " + car.getName());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}   
	}
}
