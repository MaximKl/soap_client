
package ua.myclient.taxi.service.order;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ua.myclient.taxi.service.order package. 
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

    private final static QName _Orders_QNAME = new QName("http://service.taxi.myClient.ua/order/", "orders");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ua.myclient.taxi.service.order
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Orders }
     * 
     */
    public Orders createOrders() {
        return new Orders();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Orders }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Orders }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.taxi.myClient.ua/order/", name = "orders")
    public JAXBElement<Orders> createOrders(Orders value) {
        return new JAXBElement<Orders>(_Orders_QNAME, Orders.class, null, value);
    }

}
