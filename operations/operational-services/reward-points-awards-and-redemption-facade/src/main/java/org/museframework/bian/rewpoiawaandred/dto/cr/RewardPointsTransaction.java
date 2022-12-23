/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Reward Points Awards & Redemption. 
Example: Execute a payment transaction.*/
package org.museframework.bian.rewpoiawaandred.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class RewardPointsTransaction {
    /*A Classification value that distinguishes between business service transaction within Reward Points Transaction*/
    @MetaField
    private String rewardPointsTransactionParameterType;

    /*A selected optional business service as subject matter of Reward Points Transaction*/
    @MetaField
    private String rewardPointsTransactionSelectedOption;

    /*The status of Reward Points Transaction*/
    @MetaField
    private String rewardPointsTransactionStatus;

    /*A Classification value that specifies type of business action for this  Reward Points Transaction*/
    @MetaField
    private String rewardPointsTransactionType;

    /*A Classification value that specifies type of transaction for this  Reward Points Transaction*/
    @MetaField
    private String rewardPointsTransactionTransactionType;

    /*Reference to Reward Points Transaction*/
    @MetaField
    private String rewardPointsTransactionTransaction;

    public void setRewardPointsTransactionParameterType(String rewardPointsTransactionParameterType) {
        this.rewardPointsTransactionParameterType = rewardPointsTransactionParameterType;
    }

    public String getRewardPointsTransactionParameterType() {
        return rewardPointsTransactionParameterType;
    }

    public void setRewardPointsTransactionSelectedOption(String rewardPointsTransactionSelectedOption) {
        this.rewardPointsTransactionSelectedOption = rewardPointsTransactionSelectedOption;
    }

    public String getRewardPointsTransactionSelectedOption() {
        return rewardPointsTransactionSelectedOption;
    }

    public void setRewardPointsTransactionStatus(String rewardPointsTransactionStatus) {
        this.rewardPointsTransactionStatus = rewardPointsTransactionStatus;
    }

    public String getRewardPointsTransactionStatus() {
        return rewardPointsTransactionStatus;
    }

    public void setRewardPointsTransactionType(String rewardPointsTransactionType) {
        this.rewardPointsTransactionType = rewardPointsTransactionType;
    }

    public String getRewardPointsTransactionType() {
        return rewardPointsTransactionType;
    }

    public void setRewardPointsTransactionTransactionType(String rewardPointsTransactionTransactionType) {
        this.rewardPointsTransactionTransactionType = rewardPointsTransactionTransactionType;
    }

    public String getRewardPointsTransactionTransactionType() {
        return rewardPointsTransactionTransactionType;
    }

    public void setRewardPointsTransactionTransaction(String rewardPointsTransactionTransaction) {
        this.rewardPointsTransactionTransaction = rewardPointsTransactionTransaction;
    }

    public String getRewardPointsTransactionTransaction() {
        return rewardPointsTransactionTransaction;
    }
}