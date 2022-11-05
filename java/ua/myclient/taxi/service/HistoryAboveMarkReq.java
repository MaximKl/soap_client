
package ua.myclient.taxi.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HistoryAboveMarkReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoryAboveMarkReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="driversMark" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryAboveMarkReq", propOrder = {
    "driversMark"
})
public class HistoryAboveMarkReq {

    protected int driversMark;

    /**
     * Gets the value of the driversMark property.
     * 
     */
    public int getDriversMark() {
        return driversMark;
    }

    /**
     * Sets the value of the driversMark property.
     * 
     */
    public void setDriversMark(int value) {
        this.driversMark = value;
    }

}
