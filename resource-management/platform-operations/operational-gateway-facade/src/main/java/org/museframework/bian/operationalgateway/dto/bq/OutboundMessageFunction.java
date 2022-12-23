/*An operational service or function supported within the Inbound Message Function for doing Inbound Message Function*/
package org.museframework.bian.operationalgateway.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class OutboundMessageFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    @MetaField
    private String schedule;

    /*The Outbound Message Function specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Outbound Message Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session operationalGatewayOperatingSessionReference;

    /*Reference to Outbound Message Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Function outboundMessageFunctionReference;

    /*The type of Outbound Message Function*/
    @MetaField
    private String outboundMessageFunctionType;

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

    public void setOperationalGatewayOperatingSessionReference(org.museframework.bian.classes.Session operationalGatewayOperatingSessionReference) {
        this.operationalGatewayOperatingSessionReference = operationalGatewayOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session getOperationalGatewayOperatingSessionReference() {
        return operationalGatewayOperatingSessionReference;
    }

    public void setOutboundMessageFunctionReference(org.museframework.bian.classes.Function outboundMessageFunctionReference) {
        this.outboundMessageFunctionReference = outboundMessageFunctionReference;
    }

    public org.museframework.bian.classes.Function getOutboundMessageFunctionReference() {
        return outboundMessageFunctionReference;
    }

    public void setOutboundMessageFunctionType(String outboundMessageFunctionType) {
        this.outboundMessageFunctionType = outboundMessageFunctionType;
    }

    public String getOutboundMessageFunctionType() {
        return outboundMessageFunctionType;
    }
}