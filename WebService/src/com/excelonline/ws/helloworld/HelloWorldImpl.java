package com.excelonline.ws.helloworld;

import javax.jws.WebService;

/**
 * @author Jayram
 * Second Create a Web Service Endpoint Implementation
 */
@WebService(endpointInterface="com.excelonline.ws.helloworld.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
@Override
	public String getHelloWorld(String name) {
		return "Hello World Welcome " + name;
	}
}
