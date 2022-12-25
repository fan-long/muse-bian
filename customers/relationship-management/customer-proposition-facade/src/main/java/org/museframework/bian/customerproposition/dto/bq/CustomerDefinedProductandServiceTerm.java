/*The Customer Defined Product and Service Term reflects the application of a specific rule or regulation that is an aspect of the Customer Defined Product and Service Term*/
package org.museframework.bian.customerproposition.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CustomerDefinedProductandServiceTerm {
    /*The required status/situation for the terms to apply and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*Any timing/duration considerations applying to the Customer Defined Product and Service Term*/
    @MetaField(0)
    private String schedule;

    /*The Customer Defined Product and Service Term specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Customer Defined Product and Service Term*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement customerPropositionAgreementReference;

    /*Reference to Customer Defined Product and Service Term*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement customerDefinedProductandServiceTermReference;

    /*The type of Customer Defined Product and Service Term*/
    @MetaField(0)
    private String customerDefinedProductandServiceTermType;

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

    public void setCustomerPropositionAgreementReference(org.museframework.bian.classes.Agreement customerPropositionAgreementReference) {
        this.customerPropositionAgreementReference = customerPropositionAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getCustomerPropositionAgreementReference() {
        return customerPropositionAgreementReference;
    }

    public void setCustomerDefinedProductandServiceTermReference(org.museframework.bian.classes.Arrangement customerDefinedProductandServiceTermReference) {
        this.customerDefinedProductandServiceTermReference = customerDefinedProductandServiceTermReference;
    }

    public org.museframework.bian.classes.Arrangement getCustomerDefinedProductandServiceTermReference() {
        return customerDefinedProductandServiceTermReference;
    }

    public void setCustomerDefinedProductandServiceTermType(String customerDefinedProductandServiceTermType) {
        this.customerDefinedProductandServiceTermType = customerDefinedProductandServiceTermType;
    }

    public String getCustomerDefinedProductandServiceTermType() {
        return customerDefinedProductandServiceTermType;
    }
}