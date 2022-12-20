/*Rule that governs business execution.

The set of basic principles and associated guidelines, formulated and enforced by the governing body of an organization, to direct and limit its actions in pursuit of long-term goals. (Business Dictionary)
*/
package org.museframework.bian.classes;

public class Policy {
    /*Classification of a policy according to the subject*/
    private String policyType;

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getPolicyType() {
        return policyType;
    }
}