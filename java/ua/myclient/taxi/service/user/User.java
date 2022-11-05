
package ua.myclient.taxi.service.user;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ua.myclient.taxi.service.Entity;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.taxi.myClient.ua/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressFrom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="addressTo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="answer" type="{http://service.taxi.myClient.ua/user/}emailOrPhone"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "name",
    "surname",
    "addressFrom",
    "addressTo",
    "answer"
})
public class User
    extends Entity
{

    protected String name;
    protected String surname;
    @XmlElement(required = true)
    protected String addressFrom;
    @XmlElement(required = true)
    protected String addressTo;
    @XmlElement(required = true)
    protected EmailOrPhone answer;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the addressFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressFrom() {
        return addressFrom;
    }

    /**
     * Sets the value of the addressFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressFrom(String value) {
        this.addressFrom = value;
    }

    /**
     * Gets the value of the addressTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTo() {
        return addressTo;
    }

    /**
     * Sets the value of the addressTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTo(String value) {
        this.addressTo = value;
    }

    /**
     * Gets the value of the answer property.
     * 
     * @return
     *     possible object is
     *     {@link EmailOrPhone }
     *     
     */
    public EmailOrPhone getAnswer() {
        return answer;
    }

    /**
     * Sets the value of the answer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailOrPhone }
     *     
     */
    public void setAnswer(EmailOrPhone value) {
        this.answer = value;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", addressFrom='" + addressFrom + '\'' +
                ", addressTo='" + addressTo + '\'' +
                ", answer=" + answer +
                ", id=" + id +
                ", code='" + code + '\'' +
                "}\n";
    }
}
