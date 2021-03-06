
package com.verisign.dnsa.api.wsdl._2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DNSAV20", targetNamespace = "urn:com:verisign:dnsa:api:wsdl:2", wsdlLocation = "https://api.dns-tool.com/dnsa-ws/V2.0/dnsaapi?wsdl")
public class DNSAV20_Service
    extends Service
{

    private final static URL DNSAV20_WSDL_LOCATION;
    private final static WebServiceException DNSAV20_EXCEPTION;
    private final static QName DNSAV20_QNAME = new QName("urn:com:verisign:dnsa:api:wsdl:2", "DNSAV20");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://api.dns-tool.com/dnsa-ws/V2.0/dnsaapi?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DNSAV20_WSDL_LOCATION = url;
        DNSAV20_EXCEPTION = e;
    }

    public DNSAV20_Service() {
        super(__getWsdlLocation(), DNSAV20_QNAME);
    }

    public DNSAV20_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), DNSAV20_QNAME, features);
    }

    public DNSAV20_Service(URL wsdlLocation) {
        super(wsdlLocation, DNSAV20_QNAME);
    }

    public DNSAV20_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DNSAV20_QNAME, features);
    }

    public DNSAV20_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DNSAV20_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DNSAV20
     */
    @WebEndpoint(name = "DNSAV20")
    public DNSAV20 getDNSAV20() {
        return super.getPort(new QName("urn:com:verisign:dnsa:api:wsdl:2", "DNSAV20"), DNSAV20.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DNSAV20
     */
    @WebEndpoint(name = "DNSAV20")
    public DNSAV20 getDNSAV20(WebServiceFeature... features) {
        return super.getPort(new QName("urn:com:verisign:dnsa:api:wsdl:2", "DNSAV20"), DNSAV20.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DNSAV20_EXCEPTION!= null) {
            throw DNSAV20_EXCEPTION;
        }
        return DNSAV20_WSDL_LOCATION;
    }

}
