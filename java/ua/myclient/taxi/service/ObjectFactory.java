
package ua.myclient.taxi.service;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ua.myclient.taxi.service package. 
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

    private final static QName _CrateResp_QNAME = new QName("http://service.taxi.myClient.ua/", "CrateResp");
    private final static QName _CreateReq_QNAME = new QName("http://service.taxi.myClient.ua/", "CreateReq");
    private final static QName _DriverByCodeReq_QNAME = new QName("http://service.taxi.myClient.ua/", "DriverByCodeReq");
    private final static QName _DriverByCodeResp_QNAME = new QName("http://service.taxi.myClient.ua/", "DriverByCodeResp");
    private final static QName _DriverBySurnameReq_QNAME = new QName("http://service.taxi.myClient.ua/", "DriverBySurnameReq");
    private final static QName _DriverBySurnameResp_QNAME = new QName("http://service.taxi.myClient.ua/", "DriverBySurnameResp");
    private final static QName _ExceptionMessage_QNAME = new QName("http://service.taxi.myClient.ua/", "ExceptionMessage");
    private final static QName _HistoryAboveMarkReq_QNAME = new QName("http://service.taxi.myClient.ua/", "HistoryAboveMarkReq");
    private final static QName _HistoryAboveMarkResp_QNAME = new QName("http://service.taxi.myClient.ua/", "HistoryAboveMarkResp");
    private final static QName _HistoryBelowMarkReq_QNAME = new QName("http://service.taxi.myClient.ua/", "HistoryBelowMarkReq");
    private final static QName _HistoryBelowMarkResp_QNAME = new QName("http://service.taxi.myClient.ua/", "HistoryBelowMarkResp");
    private final static QName _HistoryReq_QNAME = new QName("http://service.taxi.myClient.ua/", "HistoryReq");
    private final static QName _HistoryResp_QNAME = new QName("http://service.taxi.myClient.ua/", "HistoryResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ua.myclient.taxi.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrateResp }
     * 
     */
    public CrateResp createCrateResp() {
        return new CrateResp();
    }

    /**
     * Create an instance of {@link CreateReq }
     * 
     */
    public CreateReq createCreateReq() {
        return new CreateReq();
    }

    /**
     * Create an instance of {@link DriverByCodeReq }
     * 
     */
    public DriverByCodeReq createDriverByCodeReq() {
        return new DriverByCodeReq();
    }

    /**
     * Create an instance of {@link DriverByCodeResp }
     * 
     */
    public DriverByCodeResp createDriverByCodeResp() {
        return new DriverByCodeResp();
    }

    /**
     * Create an instance of {@link DriverBySurnameReq }
     * 
     */
    public DriverBySurnameReq createDriverBySurnameReq() {
        return new DriverBySurnameReq();
    }

    /**
     * Create an instance of {@link DriverBySurnameResp }
     * 
     */
    public DriverBySurnameResp createDriverBySurnameResp() {
        return new DriverBySurnameResp();
    }

    /**
     * Create an instance of {@link ExceptionMessage }
     * 
     */
    public ExceptionMessage createExceptionMessage() {
        return new ExceptionMessage();
    }

    /**
     * Create an instance of {@link HistoryAboveMarkReq }
     * 
     */
    public HistoryAboveMarkReq createHistoryAboveMarkReq() {
        return new HistoryAboveMarkReq();
    }

    /**
     * Create an instance of {@link HistoryAboveMarkResp }
     * 
     */
    public HistoryAboveMarkResp createHistoryAboveMarkResp() {
        return new HistoryAboveMarkResp();
    }

    /**
     * Create an instance of {@link HistoryBelowMarkReq }
     * 
     */
    public HistoryBelowMarkReq createHistoryBelowMarkReq() {
        return new HistoryBelowMarkReq();
    }

    /**
     * Create an instance of {@link HistoryBelowMarkResp }
     * 
     */
    public HistoryBelowMarkResp createHistoryBelowMarkResp() {
        return new HistoryBelowMarkResp();
    }

    /**
     * Create an instance of {@link HistoryReq }
     * 
     */
    public HistoryReq createHistoryReq() {
        return new HistoryReq();
    }

    /**
     * Create an instance of {@link HistoryResp }
     * 
     */
    public HistoryResp createHistoryResp() {
        return new HistoryResp();
    }

    /**
     * Create an instance of {@link Entity }
     * 
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrateResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrateResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.taxi.myClient.ua/", name = "CrateResp")
    public JAXBElement<CrateResp> createCrateResp(CrateResp value) {
        return new JAXBElement<CrateResp>(_CrateResp_QNAME, CrateResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateReq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateReq }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.taxi.myClient.ua/", name = "CreateReq")
    public JAXBElement<CreateReq> createCreateReq(CreateReq value) {
        return new JAXBElement<CreateReq>(_CreateReq_QNAME, CreateReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriverByCodeReq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DriverByCodeReq }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.taxi.myClient.ua/", name = "DriverByCodeReq")
    public JAXBElement<DriverByCodeReq> createDriverByCodeReq(DriverByCodeReq value) {
        return new JAXBElement<DriverByCodeReq>(_DriverByCodeReq_QNAME, DriverByCodeReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriverByCodeResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DriverByCodeResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.taxi.myClient.ua/", name = "DriverByCodeResp")
    public JAXBElement<DriverByCodeResp> createDriverByCodeResp(DriverByCodeResp value) {
        return new JAXBElement<DriverByCodeResp>(_DriverByCodeResp_QNAME, DriverByCodeResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriverBySurnameReq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DriverBySurnameReq }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.taxi.myClient.ua/", name = "DriverBySurnameReq")
    public JAXBElement<DriverBySurnameReq> createDriverBySurnameReq(DriverBySurnameReq value) {
        return new JAXBElement<DriverBySurnameReq>(_DriverBySurnameReq_QNAME, DriverBySurnameReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriverBySurnameResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DriverBySurnameResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.taxi.myClient.ua/", name = "DriverBySurnameResp")
    public JAXBElement<DriverBySurnameResp> createDriverBySurnameResp(DriverBySurnameResp value) {
        return new JAXBElement<DriverBySurnameResp>(_DriverBySurnameResp_QNAME, DriverBySurnameResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExceptionMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.taxi.myClient.ua/", name = "ExceptionMessage")
    public JAXBElement<ExceptionMessage> createExceptionMessage(ExceptionMessage value) {
        return new JAXBElement<ExceptionMessage>(_ExceptionMessage_QNAME, ExceptionMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoryAboveMarkReq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HistoryAboveMarkReq }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.taxi.myClient.ua/", name = "HistoryAboveMarkReq")
    public JAXBElement<HistoryAboveMarkReq> createHistoryAboveMarkReq(HistoryAboveMarkReq value) {
        return new JAXBElement<HistoryAboveMarkReq>(_HistoryAboveMarkReq_QNAME, HistoryAboveMarkReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoryAboveMarkResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HistoryAboveMarkResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.taxi.myClient.ua/", name = "HistoryAboveMarkResp")
    public JAXBElement<HistoryAboveMarkResp> createHistoryAboveMarkResp(HistoryAboveMarkResp value) {
        return new JAXBElement<HistoryAboveMarkResp>(_HistoryAboveMarkResp_QNAME, HistoryAboveMarkResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoryBelowMarkReq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HistoryBelowMarkReq }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.taxi.myClient.ua/", name = "HistoryBelowMarkReq")
    public JAXBElement<HistoryBelowMarkReq> createHistoryBelowMarkReq(HistoryBelowMarkReq value) {
        return new JAXBElement<HistoryBelowMarkReq>(_HistoryBelowMarkReq_QNAME, HistoryBelowMarkReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoryBelowMarkResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HistoryBelowMarkResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.taxi.myClient.ua/", name = "HistoryBelowMarkResp")
    public JAXBElement<HistoryBelowMarkResp> createHistoryBelowMarkResp(HistoryBelowMarkResp value) {
        return new JAXBElement<HistoryBelowMarkResp>(_HistoryBelowMarkResp_QNAME, HistoryBelowMarkResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoryReq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HistoryReq }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.taxi.myClient.ua/", name = "HistoryReq")
    public JAXBElement<HistoryReq> createHistoryReq(HistoryReq value) {
        return new JAXBElement<HistoryReq>(_HistoryReq_QNAME, HistoryReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoryResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HistoryResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.taxi.myClient.ua/", name = "HistoryResp")
    public JAXBElement<HistoryResp> createHistoryResp(HistoryResp value) {
        return new JAXBElement<HistoryResp>(_HistoryResp_QNAME, HistoryResp.class, null, value);
    }

}
