package com.excelonline.ws.helloworld;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * @author Jayram
 * First Create a Web Service Endpoint Interface
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld {
	
	@WebMethod String getHelloWorld(String name);
}