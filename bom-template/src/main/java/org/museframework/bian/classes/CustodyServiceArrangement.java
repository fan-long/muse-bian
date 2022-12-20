/*A Service Arrangement whitin Custodial Agreement*/
package org.museframework.bian.classes;

public class CustodyServiceArrangement {
    /**/
    private org.museframework.bian.enumerations.Custodyservicearrangementtypevalues custodyServiceArrangementType;

    public void setCustodyServiceArrangementType(org.museframework.bian.enumerations.Custodyservicearrangementtypevalues custodyServiceArrangementType) {
        this.custodyServiceArrangementType = custodyServiceArrangementType;
    }

    public org.museframework.bian.enumerations.Custodyservicearrangementtypevalues getCustodyServiceArrangementType() {
        return custodyServiceArrangementType;
    }
}