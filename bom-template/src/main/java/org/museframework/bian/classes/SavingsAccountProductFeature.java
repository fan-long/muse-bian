/*An subject matter about which arrangements should or can be made when selling a savings account product.

*/
package org.museframework.bian.classes;

public class SavingsAccountProductFeature {
    /*Indication wether a feature is optional in a savingsagreement*/
    private String optionalindicator;

    /**/
    private String savingsAccountProductProductFeatureType;

    public void setOptionalindicator(String optionalindicator) {
        this.optionalindicator = optionalindicator;
    }

    public String getOptionalindicator() {
        return optionalindicator;
    }

    public void setSavingsAccountProductProductFeatureType(String savingsAccountProductProductFeatureType) {
        this.savingsAccountProductProductFeatureType = savingsAccountProductProductFeatureType;
    }

    public String getSavingsAccountProductProductFeatureType() {
        return savingsAccountProductProductFeatureType;
    }
}