/*Party roles involved in the collateral arrangement like Giver and Taker.

Role played by a party in the context of collateral. (ISO20022)*/
package org.museframework.bian.classes;

public class CollateralArrangementInvolvement {
    /**/
    private org.museframework.bian.enumerations.Collateralarrangementinvolvementtype collateralArrangementInvolvementType;

    /**/
    private Party collateralArrangementInvolvement;

    public void setCollateralArrangementInvolvementType(org.museframework.bian.enumerations.Collateralarrangementinvolvementtype collateralArrangementInvolvementType) {
        this.collateralArrangementInvolvementType = collateralArrangementInvolvementType;
    }

    public org.museframework.bian.enumerations.Collateralarrangementinvolvementtype getCollateralArrangementInvolvementType() {
        return collateralArrangementInvolvementType;
    }

    public void setCollateralArrangementInvolvement(Party collateralArrangementInvolvement) {
        this.collateralArrangementInvolvement = collateralArrangementInvolvement;
    }

    public Party getCollateralArrangementInvolvement() {
        return collateralArrangementInvolvement;
    }
}