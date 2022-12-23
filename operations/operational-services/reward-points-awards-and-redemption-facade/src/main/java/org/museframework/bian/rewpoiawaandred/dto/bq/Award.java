/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Reward Points Awards & Redemption. 
Example: Execute a payment transaction.*/
package org.museframework.bian.rewpoiawaandred.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Award {
    /*The required status/situation prior to the execution of the task*/
    @MetaField
    private String awardPreconditions;

    /*The timing and key actions/milestones involved in completing the transaction task*/
    @MetaField
    private String awardTaskSchedule;

    /*The Reward Points Transaction specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService awards;

    /*The completion status and any triggered/dependent actions once the task has been completed*/
    @MetaField
    private String awardPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String awardAwardsServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String awardAwardsServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String awardAwardsServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String awardAwardsServiceWorkProduct;

    /**/
    @MetaField
    private String awardAwardsServiceName;

    public void setAwardPreconditions(String awardPreconditions) {
        this.awardPreconditions = awardPreconditions;
    }

    public String getAwardPreconditions() {
        return awardPreconditions;
    }

    public void setAwardTaskSchedule(String awardTaskSchedule) {
        this.awardTaskSchedule = awardTaskSchedule;
    }

    public String getAwardTaskSchedule() {
        return awardTaskSchedule;
    }

    public void setAwards(org.museframework.bian.classes.BusinessService awards) {
        this.awards = awards;
    }

    public org.museframework.bian.classes.BusinessService getAwards() {
        return awards;
    }

    public void setAwardPostconditions(String awardPostconditions) {
        this.awardPostconditions = awardPostconditions;
    }

    public String getAwardPostconditions() {
        return awardPostconditions;
    }

    public void setAwardAwardsServiceType(String awardAwardsServiceType) {
        this.awardAwardsServiceType = awardAwardsServiceType;
    }

    public String getAwardAwardsServiceType() {
        return awardAwardsServiceType;
    }

    public void setAwardAwardsServiceDescription(String awardAwardsServiceDescription) {
        this.awardAwardsServiceDescription = awardAwardsServiceDescription;
    }

    public String getAwardAwardsServiceDescription() {
        return awardAwardsServiceDescription;
    }

    public void setAwardAwardsServiceInputsandOuputs(String awardAwardsServiceInputsandOuputs) {
        this.awardAwardsServiceInputsandOuputs = awardAwardsServiceInputsandOuputs;
    }

    public String getAwardAwardsServiceInputsandOuputs() {
        return awardAwardsServiceInputsandOuputs;
    }

    public void setAwardAwardsServiceWorkProduct(String awardAwardsServiceWorkProduct) {
        this.awardAwardsServiceWorkProduct = awardAwardsServiceWorkProduct;
    }

    public String getAwardAwardsServiceWorkProduct() {
        return awardAwardsServiceWorkProduct;
    }

    public void setAwardAwardsServiceName(String awardAwardsServiceName) {
        this.awardAwardsServiceName = awardAwardsServiceName;
    }

    public String getAwardAwardsServiceName() {
        return awardAwardsServiceName;
    }
}