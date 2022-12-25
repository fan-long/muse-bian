/*Covers the legal considerations of the agreement*/
package org.museframework.bian.proserage.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PolicyTerm {
    /*The required status/situation for the terms to apply and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*Any timing/duration considerations applying to the Policy Term*/
    @MetaField(0)
    private String schedule;

    /*The Policy Term specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Policy Term*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement serviceProviderAgreementReference;

    /*Reference to Policy Term*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement policyTermReference;

    /*The type of Policy Term*/
    @MetaField(0)
    private String policyTermType;

    /*The type of bank policy referenced (e.g. staff certification)*/
    @MetaField(0)
    private String bankPolicy_RuleType;

    /*Reference to the bank's policies or rules*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object applicableBankPolicy_RuleReference;

    /*Explanation or interpretation of the policy or rule as applied*/
    @MetaField(0)
    private String applicableBankPolicy_RuleInterpretation;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setServiceProviderAgreementReference(org.museframework.bian.classes.Agreement serviceProviderAgreementReference) {
        this.serviceProviderAgreementReference = serviceProviderAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getServiceProviderAgreementReference() {
        return serviceProviderAgreementReference;
    }

    public void setPolicyTermReference(org.museframework.bian.classes.Arrangement policyTermReference) {
        this.policyTermReference = policyTermReference;
    }

    public org.museframework.bian.classes.Arrangement getPolicyTermReference() {
        return policyTermReference;
    }

    public void setPolicyTermType(String policyTermType) {
        this.policyTermType = policyTermType;
    }

    public String getPolicyTermType() {
        return policyTermType;
    }

    public void setBankPolicy_RuleType(String bankPolicy_RuleType) {
        this.bankPolicy_RuleType = bankPolicy_RuleType;
    }

    public String getBankPolicy_RuleType() {
        return bankPolicy_RuleType;
    }

    public void setApplicableBankPolicy_RuleReference(org.museframework.bian.classes.Object applicableBankPolicy_RuleReference) {
        this.applicableBankPolicy_RuleReference = applicableBankPolicy_RuleReference;
    }

    public org.museframework.bian.classes.Object getApplicableBankPolicy_RuleReference() {
        return applicableBankPolicy_RuleReference;
    }

    public void setApplicableBankPolicy_RuleInterpretation(String applicableBankPolicy_RuleInterpretation) {
        this.applicableBankPolicy_RuleInterpretation = applicableBankPolicy_RuleInterpretation;
    }

    public String getApplicableBankPolicy_RuleInterpretation() {
        return applicableBankPolicy_RuleInterpretation;
    }
}