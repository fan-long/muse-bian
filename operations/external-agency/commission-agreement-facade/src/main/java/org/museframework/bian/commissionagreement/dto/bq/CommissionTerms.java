/*A collection of terms (within some jurisdiction) that can be selected and configured to define a contract /agreement

Examples: Required disclosures*/
package org.museframework.bian.commissionagreement.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CommissionTerms {
    /*The required status/situation for the terms to applyand or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField(0)
    private String commissionTermsPreconditions;

    /*Any timing/duration considerations applying to the terms*/
    @MetaField(0)
    private String commissionTermsTermSchedule;

    /*The Employee Commission Agreement 
specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService commissionTerms;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String commissionTermsServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String commissionTermsServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String commissionTermsServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String commissionTermsServiceWorkProduct;

    /**/
    @MetaField(0)
    private String commissionTermsServiceName;

    public void setCommissionTermsPreconditions(String commissionTermsPreconditions) {
        this.commissionTermsPreconditions = commissionTermsPreconditions;
    }

    public String getCommissionTermsPreconditions() {
        return commissionTermsPreconditions;
    }

    public void setCommissionTermsTermSchedule(String commissionTermsTermSchedule) {
        this.commissionTermsTermSchedule = commissionTermsTermSchedule;
    }

    public String getCommissionTermsTermSchedule() {
        return commissionTermsTermSchedule;
    }

    public void setCommissionTerms(org.museframework.bian.classes.BusinessService commissionTerms) {
        this.commissionTerms = commissionTerms;
    }

    public org.museframework.bian.classes.BusinessService getCommissionTerms() {
        return commissionTerms;
    }

    public void setCommissionTermsServiceType(String commissionTermsServiceType) {
        this.commissionTermsServiceType = commissionTermsServiceType;
    }

    public String getCommissionTermsServiceType() {
        return commissionTermsServiceType;
    }

    public void setCommissionTermsServiceDescription(String commissionTermsServiceDescription) {
        this.commissionTermsServiceDescription = commissionTermsServiceDescription;
    }

    public String getCommissionTermsServiceDescription() {
        return commissionTermsServiceDescription;
    }

    public void setCommissionTermsServiceInputsandOuputs(String commissionTermsServiceInputsandOuputs) {
        this.commissionTermsServiceInputsandOuputs = commissionTermsServiceInputsandOuputs;
    }

    public String getCommissionTermsServiceInputsandOuputs() {
        return commissionTermsServiceInputsandOuputs;
    }

    public void setCommissionTermsServiceWorkProduct(String commissionTermsServiceWorkProduct) {
        this.commissionTermsServiceWorkProduct = commissionTermsServiceWorkProduct;
    }

    public String getCommissionTermsServiceWorkProduct() {
        return commissionTermsServiceWorkProduct;
    }

    public void setCommissionTermsServiceName(String commissionTermsServiceName) {
        this.commissionTermsServiceName = commissionTermsServiceName;
    }

    public String getCommissionTermsServiceName() {
        return commissionTermsServiceName;
    }
}