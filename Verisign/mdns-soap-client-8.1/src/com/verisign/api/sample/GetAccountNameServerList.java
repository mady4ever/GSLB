package com.verisign.api.sample;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.verisign.api.Base;
import com.verisign.dnsa.api.schema._1.BaseDnsaResType;
import com.verisign.dnsa.api.schema._1.GetCustomerNameServerListType;

@Component
@ContextConfiguration(locations = { "/test.xml" })
public class GetAccountNameServerList extends Base {
	
	@Test
	protected void getCustomerNameServerList() {
		GetCustomerNameServerListType getCustomerNameServerList = new GetCustomerNameServerListType();
		try {
			BaseDnsaResType response = getPort().getCustomerNameServerList(getCustomerNameServerList, getAuthInfo(), null, null);
			Assert.assertTrue(response.isCallSuccess());
		}
		catch (Exception ex) {
			Assert.fail(ex.getMessage());
		}
	}

	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
		GetAccountNameServerList it = context.getBean(GetAccountNameServerList.class);
		it.getCustomerNameServerList();
	}
}
