/*An operational service or function supported within the Outbound Transaction Function for doing Outbound Transaction Function*/
package org.museframework.bian.payraiope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class OutboundTransactionFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    @MetaField
    private String schedule;

    /*The Outbound Transaction Function specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Outbound Transaction Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session paymentRailOperatingSessionReference;

    /*Reference to Outbound Transaction Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Function outboundTransactionFunctionReference;

    /*The type of Outbound Transaction Function*/
    @MetaField
    private String outboundTransactionFunctionType;

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

    public void setOutboundTransactionFunctionReference(org.museframework.bian.classes.Function outboundTransactionFunctionReference) {
        this.outboundTransactionFunctionReference = outboundTransactionFunctionReference;
    }

    public org.museframework.bian.classes.Function getOutboundTransactionFunctionReference() {
        return outboundTransactionFunctionReference;
    }

    public void setOutboundTransactionFunctionType(String outboundTransactionFunctionType) {
        this.outboundTransactionFunctionType = outboundTransactionFunctionType;
    }

    public String getOutboundTransactionFunctionType() {
        return outboundTransactionFunctionType;
    }
}