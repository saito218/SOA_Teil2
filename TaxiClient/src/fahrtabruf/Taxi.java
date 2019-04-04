
package fahrtabruf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taxi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taxi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cusId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="gefahreneKm" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nachOrt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vonOrt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxi", propOrder = {
    "cusId",
    "datum",
    "gefahreneKm",
    "nachOrt",
    "vonOrt"
})
public class Taxi {

    protected int cusId;
    protected int datum;
    protected int gefahreneKm;
    protected String nachOrt;
    protected String vonOrt;

    /**
     * Gets the value of the cusId property.
     * 
     */
    public int getCusId() {
        return cusId;
    }

    /**
     * Sets the value of the cusId property.
     * 
     */
    public void setCusId(int value) {
        this.cusId = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     */
    public int getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     */
    public void setDatum(int value) {
        this.datum = value;
    }

    /**
     * Gets the value of the gefahreneKm property.
     * 
     */
    public int getGefahreneKm() {
        return gefahreneKm;
    }

    /**
     * Sets the value of the gefahreneKm property.
     * 
     */
    public void setGefahreneKm(int value) {
        this.gefahreneKm = value;
    }

    /**
     * Gets the value of the nachOrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNachOrt() {
        return nachOrt;
    }

    /**
     * Sets the value of the nachOrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNachOrt(String value) {
        this.nachOrt = value;
    }

    /**
     * Gets the value of the vonOrt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVonOrt() {
        return vonOrt;
    }

    /**
     * Sets the value of the vonOrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVonOrt(String value) {
        this.vonOrt = value;
    }

}
