/*To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Matching. 

Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.*/
package org.museframework.bian.productmatching.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class BankandCampaignAlignment {
    /*The required status/situation before the test can be applied*/
    @MetaField(0)
    private String bankandCampaignAlignmentPreconditions;

    /*The schedule and timing of the testing performed*/
    @MetaField(0)
    private String bankandCampaignAlignmentAnalysisSchedule;

    /*The test version employed*/
    @MetaField(0)
    private String bankandCampaignAlignmentVersionNumber;

    /*The Product/Customer Combination Assessment specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService bankandCampaignAlignment;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String bankandCampaignAlignmentServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String bankandCampaignAlignmentServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String bankandCampaignAlignmentServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String bankandCampaignAlignmentServiceWorkProduct;

    /**/
    @MetaField(0)
    private String bankandCampaignAlignmentServiceName;

    public void setBankandCampaignAlignmentPreconditions(String bankandCampaignAlignmentPreconditions) {
        this.bankandCampaignAlignmentPreconditions = bankandCampaignAlignmentPreconditions;
    }

    public String getBankandCampaignAlignmentPreconditions() {
        return bankandCampaignAlignmentPreconditions;
    }

    public void setBankandCampaignAlignmentAnalysisSchedule(String bankandCampaignAlignmentAnalysisSchedule) {
        this.bankandCampaignAlignmentAnalysisSchedule = bankandCampaignAlignmentAnalysisSchedule;
    }

    public String getBankandCampaignAlignmentAnalysisSchedule() {
        return bankandCampaignAlignmentAnalysisSchedule;
    }

    public void setBankandCampaignAlignmentVersionNumber(String bankandCampaignAlignmentVersionNumber) {
        this.bankandCampaignAlignmentVersionNumber = bankandCampaignAlignmentVersionNumber;
    }

    public String getBankandCampaignAlignmentVersionNumber() {
        return bankandCampaignAlignmentVersionNumber;
    }

    public void setBankandCampaignAlignment(org.museframework.bian.classes.BusinessService bankandCampaignAlignment) {
        this.bankandCampaignAlignment = bankandCampaignAlignment;
    }

    public org.museframework.bian.classes.BusinessService getBankandCampaignAlignment() {
        return bankandCampaignAlignment;
    }

    public void setBankandCampaignAlignmentServiceType(String bankandCampaignAlignmentServiceType) {
        this.bankandCampaignAlignmentServiceType = bankandCampaignAlignmentServiceType;
    }

    public String getBankandCampaignAlignmentServiceType() {
        return bankandCampaignAlignmentServiceType;
    }

    public void setBankandCampaignAlignmentServiceDescription(String bankandCampaignAlignmentServiceDescription) {
        this.bankandCampaignAlignmentServiceDescription = bankandCampaignAlignmentServiceDescription;
    }

    public String getBankandCampaignAlignmentServiceDescription() {
        return bankandCampaignAlignmentServiceDescription;
    }

    public void setBankandCampaignAlignmentServiceInputsandOuputs(String bankandCampaignAlignmentServiceInputsandOuputs) {
        this.bankandCampaignAlignmentServiceInputsandOuputs = bankandCampaignAlignmentServiceInputsandOuputs;
    }

    public String getBankandCampaignAlignmentServiceInputsandOuputs() {
        return bankandCampaignAlignmentServiceInputsandOuputs;
    }

    public void setBankandCampaignAlignmentServiceWorkProduct(String bankandCampaignAlignmentServiceWorkProduct) {
        this.bankandCampaignAlignmentServiceWorkProduct = bankandCampaignAlignmentServiceWorkProduct;
    }

    public String getBankandCampaignAlignmentServiceWorkProduct() {
        return bankandCampaignAlignmentServiceWorkProduct;
    }

    public void setBankandCampaignAlignmentServiceName(String bankandCampaignAlignmentServiceName) {
        this.bankandCampaignAlignmentServiceName = bankandCampaignAlignmentServiceName;
    }

    public String getBankandCampaignAlignmentServiceName() {
        return bankandCampaignAlignmentServiceName;
    }
}