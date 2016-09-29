//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.29 at 11:18:37 AM MDT 
//


package gov.services.permits.electrical;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import gov.services.permits.PermitResponse;
import gov.services.permits.PermitStatusRequest;
import gov.services.permits.PermitStatusResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.services.permits.electrical package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RaiseElectricalPermitResponse_QNAME = new QName("http://services.gov/permits/electrical", "raiseElectricalPermitResponse");
    private final static QName _ElectricalPermitStatusRequest_QNAME = new QName("http://services.gov/permits/electrical", "electricalPermitStatusRequest");
    private final static QName _RaiseElectricalPermitRequest_QNAME = new QName("http://services.gov/permits/electrical", "raiseElectricalPermitRequest");
    private final static QName _ElectricalPermitStatusResponse_QNAME = new QName("http://services.gov/permits/electrical", "electricalPermitStatusResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.services.permits.electrical
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ElectricalPermitRequest }
     * 
     */
    public ElectricalPermitRequest createElectricalPermitRequest() {
        return new ElectricalPermitRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PermitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.gov/permits/electrical", name = "raiseElectricalPermitResponse")
    public JAXBElement<PermitResponse> createRaiseElectricalPermitResponse(PermitResponse value) {
        return new JAXBElement<PermitResponse>(_RaiseElectricalPermitResponse_QNAME, PermitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PermitStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.gov/permits/electrical", name = "electricalPermitStatusRequest")
    public JAXBElement<PermitStatusRequest> createElectricalPermitStatusRequest(PermitStatusRequest value) {
        return new JAXBElement<PermitStatusRequest>(_ElectricalPermitStatusRequest_QNAME, PermitStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricalPermitRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.gov/permits/electrical", name = "raiseElectricalPermitRequest")
    public JAXBElement<ElectricalPermitRequest> createRaiseElectricalPermitRequest(ElectricalPermitRequest value) {
        return new JAXBElement<ElectricalPermitRequest>(_RaiseElectricalPermitRequest_QNAME, ElectricalPermitRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PermitStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.gov/permits/electrical", name = "electricalPermitStatusResponse")
    public JAXBElement<PermitStatusResponse> createElectricalPermitStatusResponse(PermitStatusResponse value) {
        return new JAXBElement<PermitStatusResponse>(_ElectricalPermitStatusResponse_QNAME, PermitStatusResponse.class, null, value);
    }

}