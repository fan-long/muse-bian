/*To test or assess an entity, possibly against some formal qualification or certification requirement  within Internal Audit. 

Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.*/
package org.museframework.bian.internalaudit.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.Audit
@MetaDto
public class Audit {
    /*The required status/situation before the test can be applied*/
    @MetaField(0)
    private String auditPreconditions;

    /*The schedule and timing of the testing performed*/
    @MetaField(0)
    private String auditAnalysisSchedule;

    /*The test version employed*/
    @MetaField(0)
    private String auditVersionNumber;

    /*The Internal Audit Assessment specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String serviceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String serviceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String serviceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String serviceWorkProduct;

    /**/
    @MetaField(0)
    private String serviceName;

    public void setAuditPreconditions(String auditPreconditions) {
        this.auditPreconditions = auditPreconditions;
    }

    public String getAuditPreconditions() {
        return auditPreconditions;
    }

    public void setAuditAnalysisSchedule(String auditAnalysisSchedule) {
        this.auditAnalysisSchedule = auditAnalysisSchedule;
    }

    public String getAuditAnalysisSchedule() {
        return auditAnalysisSchedule;
    }

    public void setAuditVersionNumber(String auditVersionNumber) {
        this.auditVersionNumber = auditVersionNumber;
    }

    public String getAuditVersionNumber() {
        return auditVersionNumber;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceInputsandOuputs(String serviceInputsandOuputs) {
        this.serviceInputsandOuputs = serviceInputsandOuputs;
    }

    public String getServiceInputsandOuputs() {
        return serviceInputsandOuputs;
    }

    public void setServiceWorkProduct(String serviceWorkProduct) {
        this.serviceWorkProduct = serviceWorkProduct;
    }

    public String getServiceWorkProduct() {
        return serviceWorkProduct;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }
}