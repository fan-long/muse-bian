/*An arrangement which specifies how the rights and duties are shared between involved parties which are jointly holding a savings account agreement.

eg. how the funds are devided between accountholders, how the profits are shared between beneficiaries, how costs are shared between involved parties of an account. This is all specified in arrangements*/
package org.museframework.bian.classes;

public class AccountShareArrangement {
    /*A classification value indicating the subject to be shared.

Example: Fund, Profit, Cost, Responsibility etc.*/
    private String shareType;

    /*A percentage indicating the part of the share of a specific account holder*/
    private String sharePercentage;

    /*A amount of the share of a specific account holder*/
    private String shareAmount;

    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    public String getShareType() {
        return shareType;
    }

    public void setSharePercentage(String sharePercentage) {
        this.sharePercentage = sharePercentage;
    }

    public String getSharePercentage() {
        return sharePercentage;
    }

    public void setShareAmount(String shareAmount) {
        this.shareAmount = shareAmount;
    }

    public String getShareAmount() {
        return shareAmount;
    }
}