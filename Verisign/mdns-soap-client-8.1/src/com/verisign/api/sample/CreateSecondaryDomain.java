package com.verisign.api.sample;

import org.springframework.test.context.ContextConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.verisign.api.Base;
import com.verisign.dnsa.api.schema._1.BaseDnsaResType;
import com.verisign.dnsa.api.schema._1.CreateZoneType;
import com.verisign.dnsa.api.schema._1.ZoneType;

@ContextConfiguration(locations = { "/test.xml" })
public class CreateSecondaryDomain extends Base {

	@Test
	protected void createSecondaryZone() {
		//String uniqueId = genUniqueId();
		CreateZoneType createZone = new CreateZoneType();
		createZone.setDomainName("from.api.created.gslbdev.cloud.cisco.com"); //set by mahendra
		//createZone.setType(ZoneType.BACKUP_DNS);
		//DNS_HOSTING
		createZone.setType(ZoneType.DNS_HOSTING); //set by mahendra.	
		try {
			BaseDnsaResType response = getPort().createZone(createZone, getAuthInfo(), null, null);
			Assert.assertTrue(response.isCallSuccess());
		}
		catch (Exception ex) {
			Assert.fail(ex.getMessage());
		}
	}


}
