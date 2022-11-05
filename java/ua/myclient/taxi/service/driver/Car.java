
package ua.myclient.taxi.service.driver;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ua.myclient.taxi.service.Entity;


/**
 * <p>Java class for Car complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Car"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.taxi.myClient.ua/}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="c_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="yearOfProduction" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vinNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="c_class" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Car", propOrder = {
    "brand",
    "cName",
    "yearOfProduction",
    "number",
    "vinNumber",
    "cClass",
    "color"
})
public class Car
    extends Entity
{

    @XmlElement(required = true)
    protected String brand;
    @XmlElement(name = "c_name", required = true)
    protected String cName;
    protected int yearOfProduction;
    @XmlElement(required = true)
    protected String number;
    @XmlElement(required = true)
    protected String vinNumber;
    @XmlElement(name = "c_class", required = true, defaultValue = "\u0415\u043a\u043e\u043d\u043e\u043c")
    protected String cClass;
    @XmlElement(required = true, defaultValue = "\u0421\u0456\u0440\u0438\u0439")
    protected String color;

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the cName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCName() {
        return cName;
    }

    /**
     * Sets the value of the cName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCName(String value) {
        this.cName = value;
    }

    /**
     * Gets the value of the yearOfProduction property.
     * 
     */
    public int getYearOfProduction() {
        return yearOfProduction;
    }

    /**
     * Sets the value of the yearOfProduction property.
     * 
     */
    public void setYearOfProduction(int value) {
        this.yearOfProduction = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the vinNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVinNumber() {
        return vinNumber;
    }

    /**
     * Sets the value of the vinNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVinNumber(String value) {
        this.vinNumber = value;
    }

    /**
     * Gets the value of the cClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCClass() {
        return cClass;
    }

    /**
     * Sets the value of the cClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCClass(String value) {
        this.cClass = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "brand='" + brand + '\'' +
                ", cName='" + cName + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", number='" + number + '\'' +
                ", vinNumber='" + vinNumber + '\'' +
                ", cClass='" + cClass + '\'' +
                ", color='" + color + '\'' +
                ", id=" + id +
                ", code='" + code + '\'' +
                "}\n";
    }
}
