/*A right to claim in case of non-payment.*/
package org.museframework.bian.classes;

public class LienFeature {
    /*The type of lien (e.g. final, pending)*/
    private String lienType;

    /*Definition of lien.*/
    private String lienDefinition;

    public void setLienType(String lienType) {
        this.lienType = lienType;
    }

    public String getLienType() {
        return lienType;
    }

    public void setLienDefinition(String lienDefinition) {
        this.lienDefinition = lienDefinition;
    }

    public String getLienDefinition() {
        return lienDefinition;
    }
}