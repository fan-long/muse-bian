/*PartyRole which is involved in the securities order 

Role played by a party associated with an order to buy or sell securities. (ISO20022)*/
package org.museframework.bian.classes;

public class SecuritiesOrderInvolvement {
    /**/
    private String securitiesOrderInvolvementType;

    public void setSecuritiesOrderInvolvementType(String securitiesOrderInvolvementType) {
        this.securitiesOrderInvolvementType = securitiesOrderInvolvementType;
    }

    public String getSecuritiesOrderInvolvementType() {
        return securitiesOrderInvolvementType;
    }
}