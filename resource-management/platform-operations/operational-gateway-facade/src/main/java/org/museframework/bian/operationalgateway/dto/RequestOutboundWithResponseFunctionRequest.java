package org.museframework.bian.operationalgateway.dto;

public class RequestOutboundWithResponseFunctionRequest {
    private String operationalgatewayid;

    private String outboundwithresponsefunctionid;

    private org.museframework.bian.operationalgateway.dto.bq.OutboundWithResponseFunction outboundWithResponseFunction;

    public void setOperationalgatewayid(String operationalgatewayid) {
        this.operationalgatewayid = operationalgatewayid;
    }

    public String getOperationalgatewayid() {
        return operationalgatewayid;
    }

    public void setOutboundwithresponsefunctionid(String outboundwithresponsefunctionid) {
        this.outboundwithresponsefunctionid = outboundwithresponsefunctionid;
    }

    public String getOutboundwithresponsefunctionid() {
        return outboundwithresponsefunctionid;
    }

    public void setOutboundWithResponseFunction(org.museframework.bian.operationalgateway.dto.bq.OutboundWithResponseFunction outboundWithResponseFunction) {
        this.outboundWithResponseFunction = outboundWithResponseFunction;
    }

    public org.museframework.bian.operationalgateway.dto.bq.OutboundWithResponseFunction getOutboundWithResponseFunction() {
        return outboundWithResponseFunction;
    }
}