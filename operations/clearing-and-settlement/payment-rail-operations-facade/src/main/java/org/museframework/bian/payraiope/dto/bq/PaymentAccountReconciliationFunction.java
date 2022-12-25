/*An operational service or function supported within the Outbound Transaction Function for doing Outbound Transaction Function*/
package org.museframework.bian.payraiope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PaymentAccountReconciliationFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    @MetaField(0)
    private String schedule;

    /*The Payment Account Reconciliation Function specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Payment Account Reconciliation Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session paymentRailOperatingSessionReference;

    /*Reference to Payment Account Reconciliation Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Function paymentAccountReconciliationFunctionReference;

    /*The type of Payment Account Reconciliation Function*/
    @MetaField(0)
    private String paymentAccountReconciliationFunctionType;

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

    public void setPaymentRailOperatingSessionReference(org.museframework.bian.classes.Session paymentRailOperatingSessionReference) {
        this.paymentRailOperatingSessionReference = paymentRailOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session getPaymentRailOperatingSessionReference() {
        return paymentRailOperatingSessionReference;
    }

    public void setPaymentAccountReconciliationFunctionReference(org.museframework.bian.classes.Function paymentAccountReconciliationFunctionReference) {
        this.paymentAccountReconciliationFunctionReference = paymentAccountReconciliationFunctionReference;
    }

    public org.museframework.bian.classes.Function getPaymentAccountReconciliationFunctionReference() {
        return paymentAccountReconciliationFunctionReference;
    }

    public void setPaymentAccountReconciliationFunctionType(String paymentAccountReconciliationFunctionType) {
        this.paymentAccountReconciliationFunctionType = paymentAccountReconciliationFunctionType;
    }

    public String getPaymentAccountReconciliationFunctionType() {
        return paymentAccountReconciliationFunctionType;
    }
}