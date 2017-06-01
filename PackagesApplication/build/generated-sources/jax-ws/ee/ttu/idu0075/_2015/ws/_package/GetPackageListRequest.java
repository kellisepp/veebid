
package ee.ttu.idu0075._2015.ws._package;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="minPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="maxPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="hasRelatedMembers" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="jah|ei"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "token",
    "minPrice",
    "maxPrice",
    "hasRelatedMembers"
})
@XmlRootElement(name = "getPackageListRequest")
public class GetPackageListRequest {

    @XmlElement(required = true)
    protected String token;
    protected double minPrice;
    protected double maxPrice;
    protected String hasRelatedMembers;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the minPrice property.
     * 
     */
    public double getMinPrice() {
        return minPrice;
    }

    /**
     * Sets the value of the minPrice property.
     * 
     */
    public void setMinPrice(double value) {
        this.minPrice = value;
    }

    /**
     * Gets the value of the maxPrice property.
     * 
     */
    public double getMaxPrice() {
        return maxPrice;
    }

    /**
     * Sets the value of the maxPrice property.
     * 
     */
    public void setMaxPrice(double value) {
        this.maxPrice = value;
    }

    /**
     * Gets the value of the hasRelatedMembers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasRelatedMembers() {
        return hasRelatedMembers;
    }

    /**
     * Sets the value of the hasRelatedMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasRelatedMembers(String value) {
        this.hasRelatedMembers = value;
    }

}
