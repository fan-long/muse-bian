/*Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Product Inventory Distribution. 
Example: Administer the time reporting and billing for the specialist sales support team.*/
package org.museframework.bian.proinvdis.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Mailing {
    /*The required status/situation before the routine can be undertaken*/
    @MetaField(0)
    private String mailingPreconditions;

    /*The operating unit/employee responsible for performing the routine*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object mailingBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    @MetaField(0)
    private String mailingWorkSchedule;

    /*The Product Inventory Distribution AdministrativePlan specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService mailing;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    @MetaField(0)
    private String mailingPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String mailingMailingServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String mailingMailingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String mailingMailingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String mailingMailingServiceWorkProduct;

    /**/
    @MetaField(0)
    private String mailingMailingServiceName;

    public void setMailingPreconditions(String mailingPreconditions) {
        this.mailingPreconditions = mailingPreconditions;
    }

    public String getMailingPreconditions() {
        return mailingPreconditions;
    }

    public void setMailingBusinessUnitEmployeeReference(org.museframework.bian.classes.Object mailingBusinessUnitEmployeeReference) {
        this.mailingBusinessUnitEmployeeReference = mailingBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getMailingBusinessUnitEmployeeReference() {
        return mailingBusinessUnitEmployeeReference;
    }

    public void setMailingWorkSchedule(String mailingWorkSchedule) {
        this.mailingWorkSchedule = mailingWorkSchedule;
    }

    public String getMailingWorkSchedule() {
        return mailingWorkSchedule;
    }

    public void setMailing(org.museframework.bian.classes.BusinessService mailing) {
        this.mailing = mailing;
    }

    public org.museframework.bian.classes.BusinessService getMailing() {
        return mailing;
    }

    public void setMailingPostconditions(String mailingPostconditions) {
        this.mailingPostconditions = mailingPostconditions;
    }

    public String getMailingPostconditions() {
        return mailingPostconditions;
    }

    public void setMailingMailingServiceType(String mailingMailingServiceType) {
        this.mailingMailingServiceType = mailingMailingServiceType;
    }

    public String getMailingMailingServiceType() {
        return mailingMailingServiceType;
    }

    public void setMailingMailingServiceDescription(String mailingMailingServiceDescription) {
        this.mailingMailingServiceDescription = mailingMailingServiceDescription;
    }

    public String getMailingMailingServiceDescription() {
        return mailingMailingServiceDescription;
    }

    public void setMailingMailingServiceInputsandOuputs(String mailingMailingServiceInputsandOuputs) {
        this.mailingMailingServiceInputsandOuputs = mailingMailingServiceInputsandOuputs;
    }

    public String getMailingMailingServiceInputsandOuputs() {
        return mailingMailingServiceInputsandOuputs;
    }

    public void setMailingMailingServiceWorkProduct(String mailingMailingServiceWorkProduct) {
        this.mailingMailingServiceWorkProduct = mailingMailingServiceWorkProduct;
    }

    public String getMailingMailingServiceWorkProduct() {
        return mailingMailingServiceWorkProduct;
    }

    public void setMailingMailingServiceName(String mailingMailingServiceName) {
        this.mailingMailingServiceName = mailingMailingServiceName;
    }

    public String getMailingMailingServiceName() {
        return mailingMailingServiceName;
    }
}