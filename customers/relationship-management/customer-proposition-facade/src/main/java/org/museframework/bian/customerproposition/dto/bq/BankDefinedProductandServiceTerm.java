/*The Customer Defined Product and Service Term reflects the application of a specific rule or regulation that is an aspect of the Customer Defined Product and Service Term*/
package org.museframework.bian.customerproposition.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class BankDefinedProductandServiceTerm {
    /*The required status/situation for the terms to apply and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*Any timing/duration considerations applying to the Bank Defined Product and Service Term*/
    @MetaField(0)
    private String schedule;

    /*The Bank Defined Product and Service Term specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Bank Defined Product and Service Term*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement customerPropositionAgreementReference;

    /*Reference to Bank Defined Product and Service Term*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement bankDefinedProductandServiceTermReference;

    /*The type of Bank Defined Product and Service Term*/
    @MetaField(0)
    private String bankDefinedProductandServiceTermType;

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

    public void setBankDefinedProductandServiceTermReference(org.museframework.bian.classes.Arrangement bankDefinedProductandServiceTermReference) {
        this.bankDefinedProductandServiceTermReference = bankDefinedProductandServiceTermReference;
    }

    public org.museframework.bian.classes.Arrangement getBankDefinedProductandServiceTermReference() {
        return bankDefinedProductandServiceTermReference;
    }

    public void setBankDefinedProductandServiceTermType(String bankDefinedProductandServiceTermType) {
        this.bankDefinedProductandServiceTermType = bankDefinedProductandServiceTermType;
    }

    public String getBankDefinedProductandServiceTermType() {
        return bankDefinedProductandServiceTermType;
    }
}