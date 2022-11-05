
package ua.myclient.taxi.service.order;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ua.myclient.taxi.service.Entity;
import ua.myclient.taxi.service.driver.Driver;
import ua.myclient.taxi.service.user.User;


/**
 * <p>Java class for Order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Order"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.taxi.myClient.ua/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="driver" type="{http://service.taxi.myClient.ua/driver/}Driver"/&gt;
 *         &lt;element name="user" type="{http://service.taxi.myClient.ua/user/}User"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="mark" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order", propOrder = {
    "driver",
    "user",
    "price",
    "mark"
})
public class Order
    extends Entity
{

    @XmlElement(required = true)
    protected Driver driver;
    @XmlElement(required = true)
    protected User user;
    @XmlElement(required = true)
    protected BigDecimal price;
    protected int mark;

    /**
     * Gets the value of the driver property.
     * 
     * @return
     *     possible object is
     *     {@link Driver }
     *     
     */
    public Driver getDriver() {
        return driver;
    }

    /**
     * Sets the value of the driver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Driver }
     *     
     */
    public void setDriver(Driver value) {
        this.driver = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the mark property.
     * 
     */
    public int getMark() {
        return mark;
    }

    /**
     * Sets the value of the mark property.
     * 
     */
    public void setMark(int value) {
        this.mark = value;
    }

    @Override
    public String toString() {
        return "Order{" +
                "driver=" + driver +
                ", user=" + user +
                ", price=" + price +
                ", mark=" + mark +
                ", id=" + id +
                ", code='" + code + '\'' +
                "}\n\n";
    }
}
