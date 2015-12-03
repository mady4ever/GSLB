
package com.verisign.dnsa.api.wsdl._2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import com.verisign.dnsa.api.schema._1.BaseDnsaResType;
import com.verisign.dnsa.api.schema._1.CloneZoneResType;
import com.verisign.dnsa.api.schema._1.CloneZoneType;
import com.verisign.dnsa.api.schema._1.CreateCustomerNameServerResType;
import com.verisign.dnsa.api.schema._1.CreateCustomerNameServerType;
import com.verisign.dnsa.api.schema._1.CreateCustomerSiteOptionType;
import com.verisign.dnsa.api.schema._1.CreateCustomerWithServicesType;
import com.verisign.dnsa.api.schema._1.CreateMultiZoneAllowTransferType;
import com.verisign.dnsa.api.schema._1.CreatePerZoneAllowTransferType;
import com.verisign.dnsa.api.schema._1.CreateResourceRecordsType;
import com.verisign.dnsa.api.schema._1.CreateWebForwardType;
import com.verisign.dnsa.api.schema._1.CreateZoneResType;
import com.verisign.dnsa.api.schema._1.CreateZoneType;
import com.verisign.dnsa.api.schema._1.CustomerListResType;
import com.verisign.dnsa.api.schema._1.DeleteCustomerNameServerType;
import com.verisign.dnsa.api.schema._1.DeleteCustomerSiteOptionType;
import com.verisign.dnsa.api.schema._1.DeleteCustomerType;
import com.verisign.dnsa.api.schema._1.DeletePerZoneAllowTransferType;
import com.verisign.dnsa.api.schema._1.DeleteResourceRecordFailoverServiceType;
import com.verisign.dnsa.api.schema._1.DeleteResourceRecordsType;
import com.verisign.dnsa.api.schema._1.DeleteWebForwardType;
import com.verisign.dnsa.api.schema._1.DeleteZoneType;
import com.verisign.dnsa.api.schema._1.GetCustomerListType;
import com.verisign.dnsa.api.schema._1.GetCustomerNameServerByIpResType;
import com.verisign.dnsa.api.schema._1.GetCustomerNameServerByIpType;
import com.verisign.dnsa.api.schema._1.GetCustomerNameServerListResType;
import com.verisign.dnsa.api.schema._1.GetCustomerNameServerListType;
import com.verisign.dnsa.api.schema._1.GetCustomerSiteOptionListResType;
import com.verisign.dnsa.api.schema._1.GetCustomerSiteOptionListType;
import com.verisign.dnsa.api.schema._1.GetCustomerType;
import com.verisign.dnsa.api.schema._1.GetResourceRecordListGenericResType;
import com.verisign.dnsa.api.schema._1.GetResourceRecordListGenericType;
import com.verisign.dnsa.api.schema._1.GetResourceRecordListResType;
import com.verisign.dnsa.api.schema._1.GetResourceRecordListType;
import com.verisign.dnsa.api.schema._1.GetResourceRecordResType;
import com.verisign.dnsa.api.schema._1.GetResourceRecordType;
import com.verisign.dnsa.api.schema._1.GetTaskInfoResType;
import com.verisign.dnsa.api.schema._1.GetTaskInfoType;
import com.verisign.dnsa.api.schema._1.GetTaskListResType;
import com.verisign.dnsa.api.schema._1.GetTaskListType;
import com.verisign.dnsa.api.schema._1.GetUserListResType;
import com.verisign.dnsa.api.schema._1.GetUserListType;
import com.verisign.dnsa.api.schema._1.GetUserResType;
import com.verisign.dnsa.api.schema._1.GetUserType;
import com.verisign.dnsa.api.schema._1.GetZoneHistoryResType;
import com.verisign.dnsa.api.schema._1.GetZoneHistoryType;
import com.verisign.dnsa.api.schema._1.GetZoneInfoResType;
import com.verisign.dnsa.api.schema._1.GetZoneInfoType;
import com.verisign.dnsa.api.schema._1.GetZoneListResType;
import com.verisign.dnsa.api.schema._1.GetZoneListType;
import com.verisign.dnsa.api.schema._1.GetZoneResourceRecordFailoverServiceListResType;
import com.verisign.dnsa.api.schema._1.GetZoneResourceRecordFailoverServiceListType;
import com.verisign.dnsa.api.schema._1.ResourceRecordFailoverServiceInfo;
import com.verisign.dnsa.api.schema._1.TaskedResType;
import com.verisign.dnsa.api.schema._1.TransferZoneType;
import com.verisign.dnsa.api.schema._1.UpdateCustomerNameServerResType;
import com.verisign.dnsa.api.schema._1.UpdateCustomerNameServerType;
import com.verisign.dnsa.api.schema._1.UpdateCustomerWithServicesType;
import com.verisign.dnsa.api.schema._1.UpdateMultiZoneAllowTransferType;
import com.verisign.dnsa.api.schema._1.UpdateMultiZoneResourceRecordsType;
import com.verisign.dnsa.api.schema._1.UpdateMultiZoneSOAType;
import com.verisign.dnsa.api.schema._1.UpdateMultiZoneSiteOptionType;
import com.verisign.dnsa.api.schema._1.UpdateResourceRecordResType;
import com.verisign.dnsa.api.schema._1.UpdateResourceRecordType;
import com.verisign.dnsa.api.schema._1.UpdateSOAType;
import com.verisign.dnsa.api.schema._1.UpdateWebForwardType;
import com.verisign.dnsa.api.schema._1.UpdateWebParkingType;
import com.verisign.dnsa.api.schema._1.UpdateZoneResType;
import com.verisign.dnsa.api.schema._1.UpdateZoneType;
import com.verisign.dnsa.api.schema._1.UserInfo;
import com.verisign.dnsa.api.schema._2.AddGeoLocationZoneResType;
import com.verisign.dnsa.api.schema._2.AddGeoLocationZoneType;
import com.verisign.dnsa.api.schema._2.BulkUpdateSingleZone;
import com.verisign.dnsa.api.schema._2.ConvertPrimary2SecondaryType;
import com.verisign.dnsa.api.schema._2.ConvertSecondary2PrimaryType;
import com.verisign.dnsa.api.schema._2.CreateCustomerNameServerResTypeV2;
import com.verisign.dnsa.api.schema._2.CreateCustomerNameServerTypeV2;
import com.verisign.dnsa.api.schema._2.CreateLoadBalanceType;
import com.verisign.dnsa.api.schema._2.CreateRemoveUserZoneAssociationsType;
import com.verisign.dnsa.api.schema._2.CreateWebForwardTypeV2;
import com.verisign.dnsa.api.schema._2.DelUserParameters;
import com.verisign.dnsa.api.schema._2.DeleteCustomerNameServerTypeV2;
import com.verisign.dnsa.api.schema._2.DeleteFailOverInfoType;
import com.verisign.dnsa.api.schema._2.DeleteLoadBalanceType;
import com.verisign.dnsa.api.schema._2.DeleteTrafficManagementType;
import com.verisign.dnsa.api.schema._2.DeleteWebForwardTypeV2;
import com.verisign.dnsa.api.schema._2.EnableGeoLocationResType;
import com.verisign.dnsa.api.schema._2.EnableGeoLocationType;
import com.verisign.dnsa.api.schema._2.FailOverInfoType;
import com.verisign.dnsa.api.schema._2.GetCustomerNameServerByIpResTypeV2;
import com.verisign.dnsa.api.schema._2.GetCustomerNameServerByIpTypeV2;
import com.verisign.dnsa.api.schema._2.GetCustomerNameServerListResTypeV2;
import com.verisign.dnsa.api.schema._2.GetCustomerNameServerListTypeV2;
import com.verisign.dnsa.api.schema._2.GetEnabledGeoLocationViewsResType;
import com.verisign.dnsa.api.schema._2.GetEnabledGeoLocationViewsType;
import com.verisign.dnsa.api.schema._2.GetFailOverInfoListResType;
import com.verisign.dnsa.api.schema._2.GetFailOverInfoListType;
import com.verisign.dnsa.api.schema._2.GetFailOverInfoResType;
import com.verisign.dnsa.api.schema._2.GetFailOverInfoType;
import com.verisign.dnsa.api.schema._2.GetGeoLocationViewSetsResType;
import com.verisign.dnsa.api.schema._2.GetGeoLocationViewSetsType;
import com.verisign.dnsa.api.schema._2.GetLoadBalanceResType;
import com.verisign.dnsa.api.schema._2.GetLoadBalanceType;
import com.verisign.dnsa.api.schema._2.GetResourceRecordsWithServiceListResType;
import com.verisign.dnsa.api.schema._2.GetResourceRecordsWithServiceListType;
import com.verisign.dnsa.api.schema._2.GetTrafficManagementResType;
import com.verisign.dnsa.api.schema._2.GetTrafficManagementType;
import com.verisign.dnsa.api.schema._2.GetUserParameters;
import com.verisign.dnsa.api.schema._2.GetUserParametersResType;
import com.verisign.dnsa.api.schema._2.GetUserZoneAssociationsResType;
import com.verisign.dnsa.api.schema._2.GetUserZoneAssociationsType;
import com.verisign.dnsa.api.schema._2.GetZoneInfoResTypeV2;
import com.verisign.dnsa.api.schema._2.GetZoneInfoTypeV2;
import com.verisign.dnsa.api.schema._2.RegeneratePasswordType;
import com.verisign.dnsa.api.schema._2.RemoveGeoLocationType;
import com.verisign.dnsa.api.schema._2.RemoveGeoLocationZoneType;
import com.verisign.dnsa.api.schema._2.TrafficManagementType;
import com.verisign.dnsa.api.schema._2.UpdateCustomerNameServerResTypeV2;
import com.verisign.dnsa.api.schema._2.UpdateCustomerNameServerTypeV2;
import com.verisign.dnsa.api.schema._2.UpdateLoadBalanceType;
import com.verisign.dnsa.api.schema._2.UpdateTrafficManagementType;
import com.verisign.dnsa.api.schema._2.UpdateWebForwardTypeV2;
import com.verisign.dnsa.api.schema._2.UserParameters;
import com.verisign.dnsa.auth.schema._1.AuthInfoType;
import com.verisign.dnsa.messaging.schema._1.RequestType;
import com.verisign.dnsa.messaging.schema._1.ResponseType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DNSAV20", targetNamespace = "urn:com:verisign:dnsa:api:wsdl:2")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.verisign.dnsa.api.schema._1.ObjectFactory.class,
    com.verisign.dnsa.api.schema._2.ObjectFactory.class,
    com.verisign.dnsa.auth.schema._1.ObjectFactory.class,
    com.verisign.dnsa.messaging.schema._1.ObjectFactory.class
})
public interface DNSAV20 {


    /**
     * 
     * @param reliableMessageRes
     * @param getCustomerList
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.CustomerListResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getCustomerList")
    @WebResult(name = "getCustomerListRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getCustomerListRes")
    public CustomerListResType getCustomerList(
        @WebParam(name = "getCustomerList", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getCustomerList")
        GetCustomerListType getCustomerList,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param deleteCustomer
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/deleteCustomer")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteCustomerRes")
    public BaseDnsaResType deleteCustomer(
        @WebParam(name = "deleteCustomer", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteCustomer")
        DeleteCustomerType deleteCustomer,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param createUser
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/createUser")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createUserRes")
    public BaseDnsaResType createUser(
        @WebParam(name = "createUser", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createUser")
        UserInfo createUser,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param getUser
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.GetUserResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getUser")
    @WebResult(name = "getUserRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getUserRes")
    public GetUserResType getUser(
        @WebParam(name = "getUser", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getUser")
        GetUserType getUser,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param getUserList
     * @return
     *     returns com.verisign.dnsa.api.schema._1.GetUserListResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getUserList")
    @WebResult(name = "getUserListRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getUserListRes")
    public GetUserListResType getUserList(
        @WebParam(name = "getUserList", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getUserList")
        GetUserListType getUserList,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param updateUser
     * @return
     *     returns com.verisign.dnsa.api.schema._1.GetUserResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/updateUser")
    @WebResult(name = "updateUserRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateUserRes")
    public GetUserResType updateUser(
        @WebParam(name = "updateUser", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateUser")
        UserInfo updateUser,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param deleteUser
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/deleteUser")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteUserRes")
    public BaseDnsaResType deleteUser(
        @WebParam(name = "deleteUser", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteUser")
        GetUserType deleteUser,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param createZone
     * @return
     *     returns com.verisign.dnsa.api.schema._1.CreateZoneResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/createZone")
    @WebResult(name = "createZoneRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createZoneRes")
    public CreateZoneResType createZone(
        @WebParam(name = "createZone", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createZone")
        CreateZoneType createZone,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param updateZone
     * @return
     *     returns com.verisign.dnsa.api.schema._1.UpdateZoneResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/updateZone")
    @WebResult(name = "updateZoneRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateZoneRes")
    public UpdateZoneResType updateZone(
        @WebParam(name = "updateZone", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateZone")
        UpdateZoneType updateZone,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param deleteZone
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/deleteZone")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteZoneRes")
    public BaseDnsaResType deleteZone(
        @WebParam(name = "deleteZone", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteZone")
        DeleteZoneType deleteZone,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param getZoneInfo
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.GetZoneInfoResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getZoneInfo")
    @WebResult(name = "getZoneInfoRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getZoneInfoRes")
    public GetZoneInfoResType getZoneInfo(
        @WebParam(name = "getZoneInfo", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getZoneInfo")
        GetZoneInfoType getZoneInfo,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param getZoneInfoV2
     * @return
     *     returns com.verisign.dnsa.api.schema._2.GetZoneInfoResTypeV2
     * @throws DnsaGenErrorRes
     */
    @WebMethod(operationName = "getZoneInfo_V2", action = "urn:com:verisign:dnsa:api:wsdl:2/getZoneInfo_V2")
    @WebResult(name = "getZoneInfoRes_V2", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getZoneInfoRes_V2")
    public GetZoneInfoResTypeV2 getZoneInfoV2(
        @WebParam(name = "getZoneInfo_V2", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getZoneInfo_V2")
        GetZoneInfoTypeV2 getZoneInfoV2,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param getZoneList
     * @return
     *     returns com.verisign.dnsa.api.schema._1.GetZoneListResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getZoneList")
    @WebResult(name = "getZoneListRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getZoneListRes")
    public GetZoneListResType getZoneList(
        @WebParam(name = "getZoneList", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getZoneList")
        GetZoneListType getZoneList,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param updateSOA
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/updateSOA")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateSOARes")
    public BaseDnsaResType updateSOA(
        @WebParam(name = "updateSOA", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateSOA")
        UpdateSOAType updateSOA,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param createPerZoneAllowTransfer
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/createPerZoneAllowTransfer")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createPerZoneAllowTransferRes")
    public BaseDnsaResType createPerZoneAllowTransfer(
        @WebParam(name = "createPerZoneAllowTransfer", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createPerZoneAllowTransfer")
        CreatePerZoneAllowTransferType createPerZoneAllowTransfer,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param deletePerZoneAllowTransfer
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/deletePerZoneAllowTransfer")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deletePerZoneAllowTransferRes")
    public BaseDnsaResType deletePerZoneAllowTransfer(
        @WebParam(name = "deletePerZoneAllowTransfer", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deletePerZoneAllowTransfer")
        DeletePerZoneAllowTransferType deletePerZoneAllowTransfer,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param transferZone
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/transferZone")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "transferZoneRes")
    public BaseDnsaResType transferZone(
        @WebParam(name = "transferZone", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "transferZone")
        TransferZoneType transferZone,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param createWebForward
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/createWebForward")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createWebForwardRes")
    public BaseDnsaResType createWebForward(
        @WebParam(name = "createWebForward", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createWebForward")
        CreateWebForwardType createWebForward,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param updateWebForward
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/updateWebForward")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateWebForwardRes")
    public BaseDnsaResType updateWebForward(
        @WebParam(name = "updateWebForward", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateWebForward")
        UpdateWebForwardType updateWebForward,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param deleteWebForward
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/deleteWebForward")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteWebForwardRes")
    public BaseDnsaResType deleteWebForward(
        @WebParam(name = "deleteWebForward", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteWebForward")
        DeleteWebForwardType deleteWebForward,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param updateWebParking
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/updateWebParking")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateWebParkingRes")
    public BaseDnsaResType updateWebParking(
        @WebParam(name = "updateWebParking", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateWebParking")
        UpdateWebParkingType updateWebParking,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param getZoneHistory
     * @return
     *     returns com.verisign.dnsa.api.schema._1.GetZoneHistoryResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getZoneHistory")
    @WebResult(name = "getZoneHistoryRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getZoneHistoryRes")
    public GetZoneHistoryResType getZoneHistory(
        @WebParam(name = "getZoneHistory", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getZoneHistory")
        GetZoneHistoryType getZoneHistory,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param cloneZone
     * @return
     *     returns com.verisign.dnsa.api.schema._1.CloneZoneResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/cloneZone")
    @WebResult(name = "cloneZoneRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "cloneZoneRes")
    public CloneZoneResType cloneZone(
        @WebParam(name = "cloneZone", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "cloneZone")
        CloneZoneType cloneZone,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param createResourceRecords
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/createResourceRecords")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createResourceRecordsRes")
    public BaseDnsaResType createResourceRecords(
        @WebParam(name = "createResourceRecords", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createResourceRecords")
        CreateResourceRecordsType createResourceRecords,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param updateResourceRecord
     * @return
     *     returns com.verisign.dnsa.api.schema._1.UpdateResourceRecordResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/updateResourceRecord")
    @WebResult(name = "updateResourceRecordRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateResourceRecordRes")
    public UpdateResourceRecordResType updateResourceRecord(
        @WebParam(name = "updateResourceRecord", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateResourceRecord")
        UpdateResourceRecordType updateResourceRecord,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param deleteResourceRecords
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/deleteResourceRecords")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteResourceRecordsRes")
    public BaseDnsaResType deleteResourceRecords(
        @WebParam(name = "deleteResourceRecords", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteResourceRecords")
        DeleteResourceRecordsType deleteResourceRecords,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param getResourceRecordList
     * @return
     *     returns com.verisign.dnsa.api.schema._1.GetResourceRecordListResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getResourceRecordList")
    @WebResult(name = "getResourceRecordListRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getResourceRecordListRes")
    public GetResourceRecordListResType getResourceRecordList(
        @WebParam(name = "getResourceRecordList", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getResourceRecordList")
        GetResourceRecordListType getResourceRecordList,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param getResourceRecordListGeneric
     * @return
     *     returns com.verisign.dnsa.api.schema._1.GetResourceRecordListGenericResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getResourceRecordListGeneric")
    @WebResult(name = "getResourceRecordListGenericRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getResourceRecordListGenericRes")
    public GetResourceRecordListGenericResType getResourceRecordListGeneric(
        @WebParam(name = "getResourceRecordListGeneric", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getResourceRecordListGeneric")
        GetResourceRecordListGenericType getResourceRecordListGeneric,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param getResourceRecordsWithServiceList
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._2.GetResourceRecordsWithServiceListResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getResourceRecordsWithServiceList")
    @WebResult(name = "getResourceRecordsWithServiceListRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getResourceRecordsWithServiceListRes")
    public GetResourceRecordsWithServiceListResType getResourceRecordsWithServiceList(
        @WebParam(name = "getResourceRecordsWithServiceList", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getResourceRecordsWithServiceList")
        GetResourceRecordsWithServiceListType getResourceRecordsWithServiceList,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param getResourceRecord
     * @return
     *     returns com.verisign.dnsa.api.schema._1.GetResourceRecordResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getResourceRecord")
    @WebResult(name = "getResourceRecordRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getResourceRecordRes")
    public GetResourceRecordResType getResourceRecord(
        @WebParam(name = "getResourceRecord", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getResourceRecord")
        GetResourceRecordType getResourceRecord,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param createResourceRecordFailoverService
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/createResourceRecordFailoverService")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createResourceRecordFailoverServiceRes")
    public BaseDnsaResType createResourceRecordFailoverService(
        @WebParam(name = "createResourceRecordFailoverService", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createResourceRecordFailoverService")
        ResourceRecordFailoverServiceInfo createResourceRecordFailoverService,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param updateResourceRecordFailoverService
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/updateResourceRecordFailoverService")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateResourceRecordFailoverServiceRes")
    public BaseDnsaResType updateResourceRecordFailoverService(
        @WebParam(name = "updateResourceRecordFailoverService", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateResourceRecordFailoverService")
        ResourceRecordFailoverServiceInfo updateResourceRecordFailoverService,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param deleteResourceRecordFailoverService
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/deleteResourceRecordFailoverService")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteResourceRecordFailoverServiceRes")
    public BaseDnsaResType deleteResourceRecordFailoverService(
        @WebParam(name = "deleteResourceRecordFailoverService", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteResourceRecordFailoverService")
        DeleteResourceRecordFailoverServiceType deleteResourceRecordFailoverService,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param getZoneResourceRecordFailoverServiceList
     * @return
     *     returns com.verisign.dnsa.api.schema._1.GetZoneResourceRecordFailoverServiceListResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getZoneResourceRecordFailoverServiceList")
    @WebResult(name = "getZoneResourceRecordFailoverServiceListRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getZoneResourceRecordFailoverServiceListRes")
    public GetZoneResourceRecordFailoverServiceListResType getZoneResourceRecordFailoverServiceList(
        @WebParam(name = "getZoneResourceRecordFailoverServiceList", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getZoneResourceRecordFailoverServiceList")
        GetZoneResourceRecordFailoverServiceListType getZoneResourceRecordFailoverServiceList,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param updateMultiZoneResourceRecords
     * @return
     *     returns com.verisign.dnsa.api.schema._1.TaskedResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/updateMultiZoneResourceRecords")
    @WebResult(name = "TaskedResType", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateMultiZoneResourceRecordsRes")
    public TaskedResType updateMultiZoneResourceRecords(
        @WebParam(name = "updateMultiZoneResourceRecords", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateMultiZoneResourceRecords")
        UpdateMultiZoneResourceRecordsType updateMultiZoneResourceRecords,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param updateMultiZoneSiteOption
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.TaskedResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/updateMultiZoneSiteOption")
    @WebResult(name = "TaskedResType", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateMultiZoneSiteOptionRes")
    public TaskedResType updateMultiZoneSiteOption(
        @WebParam(name = "updateMultiZoneSiteOption", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateMultiZoneSiteOption")
        UpdateMultiZoneSiteOptionType updateMultiZoneSiteOption,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param updateMultiZoneSOA
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.TaskedResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/updateMultiZoneSOA")
    @WebResult(name = "TaskedResType", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateMultiZoneSOARes")
    public TaskedResType updateMultiZoneSOA(
        @WebParam(name = "updateMultiZoneSOA", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateMultiZoneSOA")
        UpdateMultiZoneSOAType updateMultiZoneSOA,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param createMultiZoneAllowTransfer
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/createMultiZoneAllowTransfer")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createMultiZoneAllowTransferRes")
    public BaseDnsaResType createMultiZoneAllowTransfer(
        @WebParam(name = "createMultiZoneAllowTransfer", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createMultiZoneAllowTransfer")
        CreateMultiZoneAllowTransferType createMultiZoneAllowTransfer,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param updateMultiZoneAllowTransfer
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/updateMultiZoneAllowTransfer")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateMultiZoneAllowTransferRes")
    public BaseDnsaResType updateMultiZoneAllowTransfer(
        @WebParam(name = "updateMultiZoneAllowTransfer", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateMultiZoneAllowTransfer")
        UpdateMultiZoneAllowTransferType updateMultiZoneAllowTransfer,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param createCustomerNameServer
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.CreateCustomerNameServerResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/createCustomerNameServer")
    @WebResult(name = "createCustomerNameServerRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createCustomerNameServerRes")
    public CreateCustomerNameServerResType createCustomerNameServer(
        @WebParam(name = "createCustomerNameServer", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createCustomerNameServer")
        CreateCustomerNameServerType createCustomerNameServer,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param updateCustomerNameServer
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.UpdateCustomerNameServerResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/updateCustomerNameServer")
    @WebResult(name = "updateCustomerNameServerRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateCustomerNameServerRes")
    public UpdateCustomerNameServerResType updateCustomerNameServer(
        @WebParam(name = "updateCustomerNameServer", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateCustomerNameServer")
        UpdateCustomerNameServerType updateCustomerNameServer,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param deleteCustomerNameServer
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/deleteCustomerNameServer")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteCustomerNameServerRes")
    public BaseDnsaResType deleteCustomerNameServer(
        @WebParam(name = "deleteCustomerNameServer", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteCustomerNameServer")
        DeleteCustomerNameServerType deleteCustomerNameServer,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param getCustomerNameServerList
     * @return
     *     returns com.verisign.dnsa.api.schema._1.GetCustomerNameServerListResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getCustomerNameServerList")
    @WebResult(name = "getCustomerNameServerListRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getCustomerNameServerListRes")
    public GetCustomerNameServerListResType getCustomerNameServerList(
        @WebParam(name = "getCustomerNameServerList", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getCustomerNameServerList")
        GetCustomerNameServerListType getCustomerNameServerList,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param getCustomerNameServerByIp
     * @return
     *     returns com.verisign.dnsa.api.schema._1.GetCustomerNameServerByIpResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getCustomerNameServerByIp")
    @WebResult(name = "getCustomerNameServerByIpRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getCustomerNameServerByIpRes")
    public GetCustomerNameServerByIpResType getCustomerNameServerByIp(
        @WebParam(name = "getCustomerNameServerByIp", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getCustomerNameServerByIp")
        GetCustomerNameServerByIpType getCustomerNameServerByIp,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param createCustomerSiteOption
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/createCustomerSiteOption")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createCustomerSiteOptionRes")
    public BaseDnsaResType createCustomerSiteOption(
        @WebParam(name = "createCustomerSiteOption", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createCustomerSiteOption")
        CreateCustomerSiteOptionType createCustomerSiteOption,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param deleteCustomerSiteOption
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/deleteCustomerSiteOption")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteCustomerSiteOptionRes")
    public BaseDnsaResType deleteCustomerSiteOption(
        @WebParam(name = "deleteCustomerSiteOption", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteCustomerSiteOption")
        DeleteCustomerSiteOptionType deleteCustomerSiteOption,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param getCustomerSiteOptionList
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.GetCustomerSiteOptionListResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getCustomerSiteOptionList")
    @WebResult(name = "getCustomerSiteOptionListRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getCustomerSiteOptionListRes")
    public GetCustomerSiteOptionListResType getCustomerSiteOptionList(
        @WebParam(name = "getCustomerSiteOptionList", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getCustomerSiteOptionList")
        GetCustomerSiteOptionListType getCustomerSiteOptionList,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param enableGeoLocation
     * @return
     *     returns com.verisign.dnsa.api.schema._2.EnableGeoLocationResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/enableGeoLocation")
    @WebResult(name = "enableGeoLocationRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "enableGeoLocationRes")
    public EnableGeoLocationResType enableGeoLocation(
        @WebParam(name = "enableGeoLocation", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "enableGeoLocation")
        EnableGeoLocationType enableGeoLocation,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param removeGeoLocation
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/removeGeoLocation")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "removeGeoLocationRes")
    public BaseDnsaResType removeGeoLocation(
        @WebParam(name = "removeGeoLocation", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "removeGeoLocation")
        RemoveGeoLocationType removeGeoLocation,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param addGeoLocationZone
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._2.AddGeoLocationZoneResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/addGeoLocationZone")
    @WebResult(name = "addGeoLocationZoneRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "addGeoLocationZoneRes")
    public AddGeoLocationZoneResType addGeoLocationZone(
        @WebParam(name = "addGeoLocationZone", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "addGeoLocationZone")
        AddGeoLocationZoneType addGeoLocationZone,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param removeGeoLocationZone
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/removeGeoLocationZone")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "removeGeoLocationZoneRes")
    public BaseDnsaResType removeGeoLocationZone(
        @WebParam(name = "removeGeoLocationZone", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "removeGeoLocationZone")
        RemoveGeoLocationZoneType removeGeoLocationZone,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param getGeoLocationViewSets
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._2.GetGeoLocationViewSetsResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getGeoLocationViewSets")
    @WebResult(name = "getGeoLocationViewSetsRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getGeoLocationViewSetsRes")
    public GetGeoLocationViewSetsResType getGeoLocationViewSets(
        @WebParam(name = "getGeoLocationViewSets", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getGeoLocationViewSets")
        GetGeoLocationViewSetsType getGeoLocationViewSets,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param getEnabledGeoLocationViews
     * @return
     *     returns com.verisign.dnsa.api.schema._2.GetEnabledGeoLocationViewsResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getEnabledGeoLocationViews")
    @WebResult(name = "getEnabledGeoLocationViewsRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getEnabledGeoLocationViews")
    public GetEnabledGeoLocationViewsResType getEnabledGeoLocationViews(
        @WebParam(name = "getEnabledGeoLocationViews", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getEnabledGeoLocationViews")
        GetEnabledGeoLocationViewsType getEnabledGeoLocationViews,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param getFailOverInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._2.GetFailOverInfoResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getFailOverInfo")
    @WebResult(name = "getFailOverInfoRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getFailOverInfoRes")
    public GetFailOverInfoResType getFailOverInfo(
        @WebParam(name = "getFailOverInfo", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getFailOverInfo")
        GetFailOverInfoType getFailOverInfo,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param getFailOverInfoListReq
     * @return
     *     returns com.verisign.dnsa.api.schema._2.GetFailOverInfoListResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getFailOverInfoList")
    @WebResult(name = "getFailOverInfoListRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getFailOverInfoListRes")
    public GetFailOverInfoListResType getFailOverInfoList(
        @WebParam(name = "getFailOverInfoList", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getFailOverInfoListReq")
        GetFailOverInfoListType getFailOverInfoListReq,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param createFailOverInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/createFailOverInfo")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createFailOverInfoRes")
    public BaseDnsaResType createFailOverInfo(
        @WebParam(name = "createFailOverInfo", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "createFailOverInfo")
        FailOverInfoType createFailOverInfo,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param deleteFailOverInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/deleteFailOverInfo")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteFailOverInfoRes")
    public BaseDnsaResType deleteFailOverInfo(
        @WebParam(name = "deleteFailOverInfo", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "deleteFailOverInfo")
        DeleteFailOverInfoType deleteFailOverInfo,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param updateFailOverInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/updateFailOverInfo")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateFailOverInfoRes")
    public BaseDnsaResType updateFailOverInfo(
        @WebParam(name = "updateFailOverInfo", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "updateFailOverInfo")
        FailOverInfoType updateFailOverInfo,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param convertSecondary2Primary
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/convertSecondary2Primary")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "convertSecondary2PrimaryRes")
    public BaseDnsaResType convertSecondary2Primary(
        @WebParam(name = "convertSecondary2Primary", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "convertSecondary2Primary")
        ConvertSecondary2PrimaryType convertSecondary2Primary,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param convertPrimary2Secondary
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/convertPrimary2Secondary")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "convertPrimary2SecondaryRes")
    public BaseDnsaResType convertPrimary2Secondary(
        @WebParam(name = "convertPrimary2Secondary", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "convertPrimary2Secondary")
        ConvertPrimary2SecondaryType convertPrimary2Secondary,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param getTaskInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.GetTaskInfoResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getTaskInfo")
    @WebResult(name = "getTaskInfoRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getTaskInfoRes")
    public GetTaskInfoResType getTaskInfo(
        @WebParam(name = "getTaskInfo", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getTaskInfo")
        GetTaskInfoType getTaskInfo,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param getTaskList
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.GetTaskListResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getTaskList")
    @WebResult(name = "getTaskListRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getTaskListRes")
    public GetTaskListResType getTaskList(
        @WebParam(name = "getTaskList", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getTaskList")
        GetTaskListType getTaskList,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param createCustomerWithServices
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/createCustomerWithServices")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createCustomerWithServicesRes")
    public BaseDnsaResType createCustomerWithServices(
        @WebParam(name = "createCustomerWithServices", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createCustomerWithServices")
        CreateCustomerWithServicesType createCustomerWithServices,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param getCustomerWithServices
     * @return
     *     returns com.verisign.dnsa.api.schema._2.CustomerWithServicesResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getCustomerWithServices")
    @WebResult(name = "getCustomerWithServicesRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getCustomerWithServicesRes")
    public com.verisign.dnsa.api.schema._2.CustomerWithServicesResType getCustomerWithServices(
        @WebParam(name = "getCustomerWithServices", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "getCustomerWithServices")
        GetCustomerType getCustomerWithServices,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param updateCustomerWithServices
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.CustomerWithServicesResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/updateCustomerWithServices")
    @WebResult(name = "updateCustomerWithServicesRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateCustomerWithServicesRes")
    public com.verisign.dnsa.api.schema._1.CustomerWithServicesResType updateCustomerWithServices(
        @WebParam(name = "updateCustomerWithServices", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateCustomerWithServices")
        UpdateCustomerWithServicesType updateCustomerWithServices,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param createTrafficManagement
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/createTrafficManagement")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createTrafficManagementRes")
    public BaseDnsaResType createTrafficManagement(
        @WebParam(name = "createTrafficManagement", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "createTrafficManagement")
        TrafficManagementType createTrafficManagement,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param updateTrafficManagement
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/updateTrafficManagement")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateTrafficManagementRes")
    public BaseDnsaResType updateTrafficManagement(
        @WebParam(name = "updateTrafficManagement", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "updateTrafficManagement")
        UpdateTrafficManagementType updateTrafficManagement,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param getTrafficManagement
     * @return
     *     returns com.verisign.dnsa.api.schema._2.GetTrafficManagementResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getTrafficManagement")
    @WebResult(name = "getTrafficManagementRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getTrafficManagementRes")
    public GetTrafficManagementResType getTrafficManagement(
        @WebParam(name = "getTrafficManagement", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getTrafficManagement")
        GetTrafficManagementType getTrafficManagement,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param deleteTrafficManagement
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/deleteTrafficManagement")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteTrafficManagementRes")
    public BaseDnsaResType deleteTrafficManagement(
        @WebParam(name = "deleteTrafficManagement", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "deleteTrafficManagement")
        DeleteTrafficManagementType deleteTrafficManagement,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param getUserZoneAssociations
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._2.GetUserZoneAssociationsResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getUserZoneAssociations")
    @WebResult(name = "getUserZoneAssociationsRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getUserZoneAssociationsRes")
    public GetUserZoneAssociationsResType getUserZoneAssociations(
        @WebParam(name = "getUserZoneAssociations", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getUserZoneAssociations")
        GetUserZoneAssociationsType getUserZoneAssociations,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param createRemoveUserZoneAssociations
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/createRemoveUserZoneAssociations")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createRemoveUserZoneAssociationsRes")
    public BaseDnsaResType createRemoveUserZoneAssociations(
        @WebParam(name = "createRemoveUserZoneAssociations", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "createRemoveUserZoneAssociations")
        CreateRemoveUserZoneAssociationsType createRemoveUserZoneAssociations,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param createLoadBalance
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/createLoadBalance")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createLoadBalanceRes")
    public BaseDnsaResType createLoadBalance(
        @WebParam(name = "createLoadBalance", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "createLoadBalance")
        CreateLoadBalanceType createLoadBalance,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param updateLoadBalance
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/updateLoadBalance")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateLoadBalanceRes")
    public BaseDnsaResType updateLoadBalance(
        @WebParam(name = "updateLoadBalance", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "updateLoadBalance")
        UpdateLoadBalanceType updateLoadBalance,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param getLoadBalance
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._2.GetLoadBalanceResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getLoadBalance")
    @WebResult(name = "getLoadBalanceRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getLoadBalanceRes")
    public GetLoadBalanceResType getLoadBalance(
        @WebParam(name = "getLoadBalance", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getLoadBalance")
        GetLoadBalanceType getLoadBalance,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param deleteLoadBalance
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/deleteLoadBalance")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteLoadBalanceRes")
    public BaseDnsaResType deleteLoadBalance(
        @WebParam(name = "deleteLoadBalance", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "deleteLoadBalance")
        DeleteLoadBalanceType deleteLoadBalance,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param addUserParameters
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/addUserParameters")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "addUserParametersRes")
    public BaseDnsaResType addUserParameters(
        @WebParam(name = "addUserParameters", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "addUserParameters")
        UserParameters addUserParameters,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param getUserParameters
     * @return
     *     returns com.verisign.dnsa.api.schema._2.GetUserParametersResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/getUserParameters")
    @WebResult(name = "getUserParametersRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getUserParametersRes")
    public GetUserParametersResType getUserParameters(
        @WebParam(name = "getUserParameters", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getUserParameters")
        GetUserParameters getUserParameters,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param deleteUserParameters
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/deleteUserParameters")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteUserParametersRes")
    public BaseDnsaResType deleteUserParameters(
        @WebParam(name = "deleteUserParameters", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "deleteUserParameters")
        DelUserParameters deleteUserParameters,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param bulkUpdateSingleZone
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/bulkUpdateSingleZone")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "bulkUpdateSingleZoneRes")
    public BaseDnsaResType bulkUpdateSingleZone(
        @WebParam(name = "bulkUpdateSingleZone", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "bulkUpdateSingleZone")
        BulkUpdateSingleZone bulkUpdateSingleZone,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param regeneratePassword
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(action = "urn:com:verisign:dnsa:api:wsdl:2/regeneratePassword")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "regeneratePasswordRes")
    public BaseDnsaResType regeneratePassword(
        @WebParam(name = "regeneratePassword", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "regeneratePassword")
        RegeneratePasswordType regeneratePassword,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param createWebForwardV2
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(operationName = "createWebForward_V2", action = "urn:com:verisign:dnsa:api:wsdl:2/createWebForward_V2")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "createWebForwardRes_V2")
    public BaseDnsaResType createWebForwardV2(
        @WebParam(name = "createWebForward_V2", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "createWebForward_V2")
        CreateWebForwardTypeV2 createWebForwardV2,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param updateWebForwardV2
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(operationName = "updateWebForward_V2", action = "urn:com:verisign:dnsa:api:wsdl:2/updateWebForward_V2")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "updateWebForwardRes_V2")
    public BaseDnsaResType updateWebForwardV2(
        @WebParam(name = "updateWebForward_V2", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "updateWebForward_V2")
        UpdateWebForwardTypeV2 updateWebForwardV2,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param deleteWebForwardV2
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(operationName = "deleteWebForward_V2", action = "urn:com:verisign:dnsa:api:wsdl:2/deleteWebForward_V2")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteWebForwardRes_V2")
    public BaseDnsaResType deleteWebForwardV2(
        @WebParam(name = "deleteWebForward_V2", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "deleteWebForward_V2")
        DeleteWebForwardTypeV2 deleteWebForwardV2,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param createCustomerNameServerV2
     * @return
     *     returns com.verisign.dnsa.api.schema._2.CreateCustomerNameServerResTypeV2
     * @throws DnsaGenErrorRes
     */
    @WebMethod(operationName = "createCustomerNameServer_V2", action = "urn:com:verisign:dnsa:api:wsdl:2/createCustomerNameServer_V2")
    @WebResult(name = "createCustomerNameServerRes_V2", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "createCustomerNameServerRes_V2")
    public CreateCustomerNameServerResTypeV2 createCustomerNameServerV2(
        @WebParam(name = "createCustomerNameServer_V2", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "createCustomerNameServer_V2")
        CreateCustomerNameServerTypeV2 createCustomerNameServerV2,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param updateCustomerNameServerV2
     * @return
     *     returns com.verisign.dnsa.api.schema._2.UpdateCustomerNameServerResTypeV2
     * @throws DnsaGenErrorRes
     */
    @WebMethod(operationName = "updateCustomerNameServer_V2", action = "urn:com:verisign:dnsa:api:wsdl:2/updateCustomerNameServer_V2")
    @WebResult(name = "updateCustomerNameServerRes_V2", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "updateCustomerNameServerRes_V2")
    public UpdateCustomerNameServerResTypeV2 updateCustomerNameServerV2(
        @WebParam(name = "updateCustomerNameServer_V2", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "updateCustomerNameServer_V2")
        UpdateCustomerNameServerTypeV2 updateCustomerNameServerV2,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param deleteCustomerNameServerV2
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @return
     *     returns com.verisign.dnsa.api.schema._1.BaseDnsaResType
     * @throws DnsaGenErrorRes
     */
    @WebMethod(operationName = "deleteCustomerNameServer_V2", action = "urn:com:verisign:dnsa:api:wsdl:2/deleteCustomerNameServer_V2")
    @WebResult(name = "dnsaWSRes", targetNamespace = "urn:com:verisign:dnsa:api:schema:1", partName = "deleteCustomerNameServerRes_V2")
    public BaseDnsaResType deleteCustomerNameServerV2(
        @WebParam(name = "deleteCustomerNameServer_V2", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "deleteCustomerNameServer_V2")
        DeleteCustomerNameServerTypeV2 deleteCustomerNameServerV2,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param getCustomerNameServerListV2
     * @return
     *     returns com.verisign.dnsa.api.schema._2.GetCustomerNameServerListResTypeV2
     * @throws DnsaGenErrorRes
     */
    @WebMethod(operationName = "getCustomerNameServerList_V2", action = "urn:com:verisign:dnsa:api:wsdl:2/getCustomerNameServerList_V2")
    @WebResult(name = "getCustomerNameServerListRes_V2", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getCustomerNameServerListRes_V2")
    public GetCustomerNameServerListResTypeV2 getCustomerNameServerListV2(
        @WebParam(name = "getCustomerNameServerList_V2", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getCustomerNameServerList_V2")
        GetCustomerNameServerListTypeV2 getCustomerNameServerListV2,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

    /**
     * 
     * @param reliableMessageRes
     * @param reliableMessageReq
     * @param authInfo
     * @param getCustomerNameServerByIpV2
     * @return
     *     returns com.verisign.dnsa.api.schema._2.GetCustomerNameServerByIpResTypeV2
     * @throws DnsaGenErrorRes
     */
    @WebMethod(operationName = "getCustomerNameServerByIp_V2", action = "urn:com:verisign:dnsa:api:wsdl:2/getCustomerNameServerByIp_V2")
    @WebResult(name = "getCustomerNameServerByIpRes_V2", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getCustomerNameServerByIpRes_V2")
    public GetCustomerNameServerByIpResTypeV2 getCustomerNameServerByIpV2(
        @WebParam(name = "getCustomerNameServerByIp_V2", targetNamespace = "urn:com:verisign:dnsa:api:schema:2", partName = "getCustomerNameServerByIp_V2")
        GetCustomerNameServerByIpTypeV2 getCustomerNameServerByIpV2,
        @WebParam(name = "authInfo", targetNamespace = "urn:com:verisign:dnsa:auth:schema:1", header = true, partName = "AuthInfo")
        AuthInfoType authInfo,
        @WebParam(name = "reliableMessageReq", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, partName = "reliableMessageReq")
        RequestType reliableMessageReq,
        @WebParam(name = "reliableMessageRes", targetNamespace = "urn:com:verisign:dnsa:messaging:schema:1", header = true, mode = WebParam.Mode.OUT, partName = "reliableMessageRes")
        Holder<ResponseType> reliableMessageRes)
        throws DnsaGenErrorRes
    ;

}
