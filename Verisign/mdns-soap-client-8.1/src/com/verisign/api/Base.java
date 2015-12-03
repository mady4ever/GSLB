package com.verisign.api;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;

import com.verisign.dnsa.api.wsdl._2.DNSAV20;
import com.verisign.dnsa.api.wsdl._2.DNSAV20_Service;
import com.verisign.dnsa.auth.schema._1.AuthInfoType;
import com.verisign.dnsa.auth.schema._1.CustomerContextType;
import com.verisign.dnsa.auth.schema._1.UserTokenType;

@ContextConfiguration(locations = { "/test.xml" })
public class Base extends AbstractTestNGSpringContextTests {

	@Value("${wsdlUrl}")
	String wsdlUrl;
	
	@Value("${userName}")
	private String userName;
	@Value("${password}")
	private String password;
	@Value("${resellerCustomerId}")
	private String resellerCustomerId;

	@Value("${uniquePrefix}")
	private String uniquePrefix;

	private AuthInfoType authInfo;
	private DNSAV20 port;
	
	private synchronized void initPort() {
		if(port != null)
			return;

		DNSAV20_Service dnsaV20_Service = new DNSAV20_Service();
		port = dnsaV20_Service.getDNSAV20();
		
		Binding binding = ((BindingProvider)port).getBinding();
		List<Handler> handlerList = binding.getHandlerChain();
		handlerList.add(new SOAPLoggingHandler());
		binding.setHandlerChain(handlerList);
	}
	
	private synchronized void initAuth() {
		if(authInfo != null)
			return;
		authInfo = new AuthInfoType();
		authInfo.setUserToken(new UserTokenType());
        authInfo.getUserToken().setUserName(userName);
        authInfo.getUserToken().setPassword(password);

        if(resellerCustomerId != null && resellerCustomerId.length() > 0) {
			authInfo.setCustomerContext(new CustomerContextType());
			authInfo.getCustomerContext().setResellerCustomerId(resellerCustomerId);
        }
	}
	
	@PostConstruct
	@BeforeClass
	public void beforeClass() {
		initPort();
		initAuth();
	}
	
	public String genUniqueId() {
		return uniquePrefix + System.currentTimeMillis();
	}
	
	public DNSAV20 getPort() {
		return port;
	}
	public AuthInfoType getAuthInfo() {
		return authInfo;
	}
	
}