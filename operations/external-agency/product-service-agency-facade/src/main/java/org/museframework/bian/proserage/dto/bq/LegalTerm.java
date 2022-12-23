/*Covers the legal considerations of the agreement*/
package org.museframework.bian.proserage.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class LegalTerm {
    /*The required status/situation for the terms to apply and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*Any timing/duration considerations applying to the Legal Term*/
    @MetaField
    private String schedule;

    /*The Legal Term specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Legal Term*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement serviceProviderAgreementReference;

    /*Reference to Legal Term*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement legalTermReference;

    /*The type of Legal Term*/
    @MetaField
    private String legalTermType;

    /*The legal jurisdiction*/
    @MetaField
    private String jurisdiction;

    /*Reference to any legal requirements*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object applicableLawReference;

    /*Explanation or interpretation of the law as applied*/
    @MetaField
    private String applicableLawInterpretation;

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

    public void setLegalTermReference(org.museframework.bian.classes.Arrangement legalTermReference) {
        this.legalTermReference = legalTermReference;
    }

    public org.museframework.bian.classes.Arrangement getLegalTermReference() {
        return legalTermReference;
    }

    public void setLegalTermType(String legalTermType) {
        this.legalTermType = legalTermType;
    }

    public String getLegalTermType() {
        return legalTermType;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setApplicableLawReference(org.museframework.bian.classes.Object applicableLawReference) {
        this.applicableLawReference = applicableLawReference;
    }

    public org.museframework.bian.classes.Object getApplicableLawReference() {
        return applicableLawReference;
    }

    public void setApplicableLawInterpretation(String applicableLawInterpretation) {
        this.applicableLawInterpretation = applicableLawInterpretation;
    }

    public String getApplicableLawInterpretation() {
        return applicableLawInterpretation;
    }
}