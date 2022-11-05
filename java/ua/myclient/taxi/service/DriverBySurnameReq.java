
package ua.myclient.taxi.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DriverBySurnameReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DriverBySurnameReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="driversSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriverBySurnameReq", propOrder = {
    "driversSurname"
})
public class DriverBySurnameReq {

    protected String driversSurname;

    /**
     * Gets the value of the driversSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversSurname() {
        return driversSurname;
    }

    /**
     * Sets the value of the driversSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversSurname(String value) {
        this.driversSurname = value;
    }

}
