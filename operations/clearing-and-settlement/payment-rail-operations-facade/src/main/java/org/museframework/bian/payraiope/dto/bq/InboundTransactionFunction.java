/*An operational service or function supported within the Outbound Transaction Function for doing Outbound Transaction Function*/
package org.museframework.bian.payraiope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class InboundTransactionFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    @MetaField
    private String schedule;

    /*The Inbound Transaction Function specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Inbound Transaction Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session paymentRailOperatingSessionReference;

    /*Reference to Inbound Transaction Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Function inboundTransactionFunctionReference;

    /*The type of Inbound Transaction Function*/
    @MetaField
    private String inboundTransactionFunctionType;

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

    public void setInboundTransactionFunctionReference(org.museframework.bian.classes.Function inboundTransactionFunctionReference) {
        this.inboundTransactionFunctionReference = inboundTransactionFunctionReference;
    }

    public org.museframework.bian.classes.Function getInboundTransactionFunctionReference() {
        return inboundTransactionFunctionReference;
    }

    public void setInboundTransactionFunctionType(String inboundTransactionFunctionType) {
        this.inboundTransactionFunctionType = inboundTransactionFunctionType;
    }

    public String getInboundTransactionFunctionType() {
        return inboundTransactionFunctionType;
    }
}