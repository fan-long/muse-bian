/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Servicing Order. */
package org.museframework.bian.servicingorder.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.ServicingOrderProcedure
@MetaDto
public class ServicingOrderProcedure {
    /*Reference to a third party service provider that handles some aspect of customer servicing access with the bank*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object thirdPartyReference;

    /*Reference to a third party servicing mandate - used when a third party is requesting the service order*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object thirdPartyServicingMandateReference;

    /*The servicing mandate for a third party defines the customers and service access allowed*/
    @MetaField(0)
    private String thirdPartyServicingMandate;

    /*The customer requesting the servicing order directly or the customer that is being serviced indirectly by the third party*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*Reference to the customer's active services and products record*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerEligibilityAssessmentInstanceReference;

    /*The type of servicing order being processed (e.g. change of address, change of employment…)*/
    @MetaField(0)
    private String servicingOrderType;

    /*The record for the servicing task*/
    @MetaField(0)
    private String servicingOrderTaskRecord;

    /*Defines the processing tasks and their sequencing followed by the servicing order*/
    @MetaField(0)
    private String servicingOrderDescription;

    /*The date and time that the servicing order is processed*/
    @MetaField(0)
    private String date;

    /*Employees involved in the servicing order*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Work documentation, forms and schedules produced and referenced during the analysis*/
    @MetaField(0)
    private String servicingOrderWorkProduct;

    /*The outcome of the servicing order*/
    @MetaField(0)
    private String servicingOrderWorkTaskResult;

    public void setThirdPartyReference(org.museframework.bian.classes.Object thirdPartyReference) {
        this.thirdPartyReference = thirdPartyReference;
    }

    public org.museframework.bian.classes.Object getThirdPartyReference() {
        return thirdPartyReference;
    }

    public void setThirdPartyServicingMandateReference(org.museframework.bian.classes.Object thirdPartyServicingMandateReference) {
        this.thirdPartyServicingMandateReference = thirdPartyServicingMandateReference;
    }

    public org.museframework.bian.classes.Object getThirdPartyServicingMandateReference() {
        return thirdPartyServicingMandateReference;
    }

    public void setThirdPartyServicingMandate(String thirdPartyServicingMandate) {
        this.thirdPartyServicingMandate = thirdPartyServicingMandate;
    }

    public String getThirdPartyServicingMandate() {
        return thirdPartyServicingMandate;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setCustomerEligibilityAssessmentInstanceReference(org.museframework.bian.classes.Object customerEligibilityAssessmentInstanceReference) {
        this.customerEligibilityAssessmentInstanceReference = customerEligibilityAssessmentInstanceReference;
    }

    public org.museframework.bian.classes.Object getCustomerEligibilityAssessmentInstanceReference() {
        return customerEligibilityAssessmentInstanceReference;
    }

    public void setServicingOrderType(String servicingOrderType) {
        this.servicingOrderType = servicingOrderType;
    }

    public String getServicingOrderType() {
        return servicingOrderType;
    }

    public void setServicingOrderTaskRecord(String servicingOrderTaskRecord) {
        this.servicingOrderTaskRecord = servicingOrderTaskRecord;
    }

    public String getServicingOrderTaskRecord() {
        return servicingOrderTaskRecord;
    }

    public void setServicingOrderDescription(String servicingOrderDescription) {
        this.servicingOrderDescription = servicingOrderDescription;
    }

    public String getServicingOrderDescription() {
        return servicingOrderDescription;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setServicingOrderWorkProduct(String servicingOrderWorkProduct) {
        this.servicingOrderWorkProduct = servicingOrderWorkProduct;
    }

    public String getServicingOrderWorkProduct() {
        return servicingOrderWorkProduct;
    }

    public void setServicingOrderWorkTaskResult(String servicingOrderWorkTaskResult) {
        this.servicingOrderWorkTaskResult = servicingOrderWorkTaskResult;
    }

    public String getServicingOrderWorkTaskResult() {
        return servicingOrderWorkTaskResult;
    }
}