package com.exhui.hessian.client;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;
import com.exhui.hessian.service.HessianService;
import com.exhui.hessian.vo.Car;

/**
 * 客户端调用（会依赖服务接口）
 *
 * @author chenyh 
 */
public class HessianClient {
	
	public static void main(String[] args){
		//未与Spring的调用方式
		String url = "http://localhost:8080/hessianDemo/hessianService"; 
		//与Spring整合的调用方式
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
