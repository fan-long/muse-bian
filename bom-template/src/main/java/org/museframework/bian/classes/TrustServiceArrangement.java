/*A legal arrangement through which funds or assets are held by a third party (the trustee) for the benefit of another party (the beneficiary). */
package org.museframework.bian.classes;

public class TrustServiceArrangement {
    /**/
    private org.museframework.bian.enumerations.Trustservicearrangementinvolvementtypevalues trustServiceArrangementType;

    public void setTrustServiceArrangementType(org.museframework.bian.enumerations.Trustservicearrangementinvolvementtypevalues trustServiceArrangementType) {
        this.trustServiceArrangementType = trustServiceArrangementType;
    }

    public org.museframework.bian.enumerations.Trustservicearrangementinvolvementtypevalues getTrustServiceArrangementType() {
        return trustServiceArrangementType;
    }
}