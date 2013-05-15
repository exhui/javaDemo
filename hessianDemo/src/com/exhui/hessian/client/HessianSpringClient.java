package com.exhui.hessian.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exhui.hessian.service.HessianService;
import com.exhui.hessian.vo.Car;

/**
 * Spring整合Hessian，客户端测试
 *
 * @author chenyh 
 */
public class HessianSpringClient {
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/exhui/hessian/client/remoting-client.xml"); 
		HessianService hessianService = null;
		try {
			hessianService = (HessianService) context.getBean("hessianServiceClient");
		    Car car = hessianService.getCar();   
		    System.out.println("Hello: " + hessianService.getName());   
		    System.out.println("carName: " + car.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}   
	}
}
