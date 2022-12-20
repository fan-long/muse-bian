/*A banking product that offers the leasing facility

Comment:
Leasing Facility means the solution/posibility to meet the financial need of customer via the leasing. 

Leasing means the hiring out by one firm (the lessor) of an ASSET such as a factory building, piece of machinery or vehicle to another firm (the lessee) in return for the payment of an agreed rental. 

 

*/
package org.museframework.bian.classes;

public class LeasingProduct {
    /**/
    private String leasingProductType;

    public void setLeasingProductType(String leasingProductType) {
        this.leasingProductType = leasingProductType;
    }

    public String getLeasingProductType() {
        return leasingProductType;
    }
}