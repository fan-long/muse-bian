/**/
package org.museframework.bian.classes;

public class PaymentWarrantyArrangement {
    /**/
    private String collateralAgreementReference;

    /*The amount that is arranged for earmarking*/
    private String warrantyAmount;

    /*duration for which the earmarking is enforced*/
    private String warrantyDuration;

    /*A time table to recall the allocated amounts.*/
    private String recallPlan;

    public void setCollateralAgreementReference(String collateralAgreementReference) {
        this.collateralAgreementReference = collateralAgreementReference;
    }

    public String getCollateralAgreementReference() {
        return collateralAgreementReference;
    }

    public void setWarrantyAmount(String warrantyAmount) {
        this.warrantyAmount = warrantyAmount;
    }

    public String getWarrantyAmount() {
        return warrantyAmount;
    }

    public void setWarrantyDuration(String warrantyDuration) {
        this.warrantyDuration = warrantyDuration;
    }

    public String getWarrantyDuration() {
        return warrantyDuration;
    }

    public void setRecallPlan(String recallPlan) {
        this.recallPlan = recallPlan;
    }

    public String getRecallPlan() {
        return recallPlan;
    }
}