/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Accounts Receivable. 
Example: Process the evaluation and completion of customer offers.*/
package org.museframework.bian.accountsreceivable.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Resolution {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField(0)
    private String resolutionPreconditions;

    /*The operating unit/employee responsible for the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object resolutionBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    @MetaField(0)
    private String resolutionWorkSchedule;

    /*The Accounts Receivable Procedure specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    @MetaField(0)
    private String resolutionPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String resolutionServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String resolutionServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String resolutionServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String resolutionServiceWorkProduct;

    /**/
    @MetaField(0)
    private String resolutionServiceName;

    public void setResolutionPreconditions(String resolutionPreconditions) {
        this.resolutionPreconditions = resolutionPreconditions;
    }

    public String getResolutionPreconditions() {
        return resolutionPreconditions;
    }

    public void setResolutionBusinessUnitEmployeeReference(org.museframework.bian.classes.Object resolutionBusinessUnitEmployeeReference) {
        this.resolutionBusinessUnitEmployeeReference = resolutionBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getResolutionBusinessUnitEmployeeReference() {
        return resolutionBusinessUnitEmployeeReference;
    }

    public void setResolutionWorkSchedule(String resolutionWorkSchedule) {
        this.resolutionWorkSchedule = resolutionWorkSchedule;
    }

    public String getResolutionWorkSchedule() {
        return resolutionWorkSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setResolutionPostconditions(String resolutionPostconditions) {
        this.resolutionPostconditions = resolutionPostconditions;
    }

    public String getResolutionPostconditions() {
        return resolutionPostconditions;
    }

    public void setResolutionServiceType(String resolutionServiceType) {
        this.resolutionServiceType = resolutionServiceType;
    }

    public String getResolutionServiceType() {
        return resolutionServiceType;
    }

    public void setResolutionServiceDescription(String resolutionServiceDescription) {
        this.resolutionServiceDescription = resolutionServiceDescription;
    }

    public String getResolutionServiceDescription() {
        return resolutionServiceDescription;
    }

    public void setResolutionServiceInputsandOuputs(String resolutionServiceInputsandOuputs) {
        this.resolutionServiceInputsandOuputs = resolutionServiceInputsandOuputs;
    }

    public String getResolutionServiceInputsandOuputs() {
        return resolutionServiceInputsandOuputs;
    }

    public void setResolutionServiceWorkProduct(String resolutionServiceWorkProduct) {
        this.resolutionServiceWorkProduct = resolutionServiceWorkProduct;
    }

    public String getResolutionServiceWorkProduct() {
        return resolutionServiceWorkProduct;
    }

    public void setResolutionServiceName(String resolutionServiceName) {
        this.resolutionServiceName = resolutionServiceName;
    }

    public String getResolutionServiceName() {
        return resolutionServiceName;
    }
}