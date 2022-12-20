/*conforming to a regulation

Ability to support operational transparency that demonstrates compliance with some specification, law, policy, restriction, or other rule specified by a regulatory agency. (Adapted from FIBO definition of Regulatory Report)*/
package org.museframework.bian.classes;

public class RegulatoryCompliance {
    /*Outline of the possible implications of non-compliance.*/
    private String implication;

    public void setImplication(String implication) {
        this.implication = implication;
    }

    public String getImplication() {
        return implication;
    }
}