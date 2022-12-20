/*Phase in a customer relationship in which a party has been identified as a possible target for a sale. */
package org.museframework.bian.classes;

public class SalesLead {
    /*The origin of the lead, such as walk-in, solicitation, referral etc.*/
    private String leadOrigin;

    /*A description of lead/opportunity generated by the customer campaign*/
    private String leadDescription;

    public void setLeadOrigin(String leadOrigin) {
        this.leadOrigin = leadOrigin;
    }

    public String getLeadOrigin() {
        return leadOrigin;
    }

    public void setLeadDescription(String leadDescription) {
        this.leadDescription = leadDescription;
    }

    public String getLeadDescription() {
        return leadDescription;
    }
}