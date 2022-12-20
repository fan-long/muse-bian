/**/
package org.museframework.bian.classes;

public class TermDepositArrangement {
    /*Classification of the Term Deposit Arrangement according to the subject of the arrangement
*/
    private org.museframework.bian.enumerations.Arrangementtypevalues termDepositArrangementType;

    /*Reference to the product feature applied in this arrangement 
*/
    private String termDepositArrangementProductFeatureType;

    /*The amount to be deposited for a fixed term*/
    private String termDepositAmount;

    /*The Period for which the TermDepositAmount needs ti stay deposited with the Bank*/
    private String depositTerm;

    public void setTermDepositArrangementType(org.museframework.bian.enumerations.Arrangementtypevalues termDepositArrangementType) {
        this.termDepositArrangementType = termDepositArrangementType;
    }

    public org.museframework.bian.enumerations.Arrangementtypevalues getTermDepositArrangementType() {
        return termDepositArrangementType;
    }

    public void setTermDepositArrangementProductFeatureType(String termDepositArrangementProductFeatureType) {
        this.termDepositArrangementProductFeatureType = termDepositArrangementProductFeatureType;
    }

    public String getTermDepositArrangementProductFeatureType() {
        return termDepositArrangementProductFeatureType;
    }

    public void setTermDepositAmount(String termDepositAmount) {
        this.termDepositAmount = termDepositAmount;
    }

    public String getTermDepositAmount() {
        return termDepositAmount;
    }

    public void setDepositTerm(String depositTerm) {
        this.depositTerm = depositTerm;
    }

    public String getDepositTerm() {
        return depositTerm;
    }
}