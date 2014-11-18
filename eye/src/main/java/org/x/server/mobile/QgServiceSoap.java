package org.x.server.mobile;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.6 2013-08-19T14:20:26.203+08:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "QgServiceSoap")
@XmlSeeAlso({ ObjectFactory.class })
public interface QgServiceSoap {
	@WebResult(name = "EcPhoneSendResult", targetNamespace = "http://tempuri.org/")
	@RequestWrapper(localName = "EcPhoneSend", targetNamespace = "http://tempuri.org/", className = "mobile.client.EcPhoneSend")
	@WebMethod(operationName = "EcPhoneSend", action = "http://tempuri.org/EcPhoneSend")
	@ResponseWrapper(localName = "EcPhoneSendResponse", targetNamespace = "http://tempuri.org/", className = "mobile.client.EcPhoneSendResponse")
	public int ecPhoneSend(@WebParam(name = "phone", targetNamespace = "http://tempuri.org/") long phone, @WebParam(name = "context", targetNamespace = "http://tempuri.org/") java.lang.String context);

}
