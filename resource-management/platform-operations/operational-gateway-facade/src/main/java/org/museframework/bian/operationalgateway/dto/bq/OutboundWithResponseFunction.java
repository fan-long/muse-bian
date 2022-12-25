/*An operational service or function supported within the Inbound Message Function for doing Inbound Message Function*/
package org.museframework.bian.operationalgateway.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class OutboundWithResponseFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    @MetaField(0)
    private String schedule;

    /*The Outbound With Response Function specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Outbound With Response Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session operationalGatewayOperatingSessionReference;

    /*Reference to Outbound With Response Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Function outboundWithResponseFunctionReference;

    /*The type of Outbound With Response Function*/
    @MetaField(0)
    private String outboundWithResponseFunctionType;

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

    public void setOutboundWithResponseFunctionReference(org.museframework.bian.classes.Function outboundWithResponseFunctionReference) {
        this.outboundWithResponseFunctionReference = outboundWithResponseFunctionReference;
    }

    public org.museframework.bian.classes.Function getOutboundWithResponseFunctionReference() {
        return outboundWithResponseFunctionReference;
    }

    public void setOutboundWithResponseFunctionType(String outboundWithResponseFunctionType) {
        this.outboundWithResponseFunctionType = outboundWithResponseFunctionType;
    }

    public String getOutboundWithResponseFunctionType() {
        return outboundWithResponseFunctionType;
    }
}