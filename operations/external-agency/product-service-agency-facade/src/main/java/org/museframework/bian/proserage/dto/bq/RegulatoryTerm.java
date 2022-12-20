/*Covers the legal considerations of the agreement*/
package org.museframework.bian.proserage.dto.bq;

public class RegulatoryTerm {
    /*The required status/situation for the terms to apply and or tasks that need to be completed prior to the initiation of the workstep*/
    private org.museframework.bian.classes.Condition preconditions;

    /*Any timing/duration considerations applying to the Regulatory Term*/
    private String schedule;

    /*The Regulatory Term specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Regulatory Term*/
    private org.museframework.bian.classes.Agreement serviceProviderAgreementReference;

    /*Reference to Regulatory Term*/
    private org.museframework.bian.classes.Arrangement regulatoryTermReference;

    /*The type of Regulatory Term*/
    private String regulatoryTermType;

    /*The applicable regulatory authority*/
    private String regulatoryAuthority;

    /*Reference to any regulatory requirements*/
    private org.museframework.bian.classes.Object applicableRegulationReference;

    /*Explanation or interpretation of the regulation as applied*/
    private String applicableRegulationInterpretation;

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

    public void setRegulatoryTermReference(org.museframework.bian.classes.Arrangement regulatoryTermReference) {
        this.regulatoryTermReference = regulatoryTermReference;
    }

    public org.museframework.bian.classes.Arrangement getRegulatoryTermReference() {
        return regulatoryTermReference;
    }

    public void setRegulatoryTermType(String regulatoryTermType) {
        this.regulatoryTermType = regulatoryTermType;
    }

    public String getRegulatoryTermType() {
        return regulatoryTermType;
    }

    public void setRegulatoryAuthority(String regulatoryAuthority) {
        this.regulatoryAuthority = regulatoryAuthority;
    }

    public String getRegulatoryAuthority() {
        return regulatoryAuthority;
    }

    public void setApplicableRegulationReference(org.museframework.bian.classes.Object applicableRegulationReference) {
        this.applicableRegulationReference = applicableRegulationReference;
    }

    public org.museframework.bian.classes.Object getApplicableRegulationReference() {
        return applicableRegulationReference;
    }

    public void setApplicableRegulationInterpretation(String applicableRegulationInterpretation) {
        this.applicableRegulationInterpretation = applicableRegulationInterpretation;
    }

    public String getApplicableRegulationInterpretation() {
        return applicableRegulationInterpretation;
    }
}