/*An operational service or function supported within the Inbound Message Function for doing Inbound Message Function*/
package org.museframework.bian.operationalgateway.dto.bq;

public class InboundMessageFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    private String schedule;

    /*The Inbound Message Function specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Inbound Message Function*/
    private org.museframework.bian.classes.Session operationalGatewayOperatingSessionReference;

    /*Reference to Inbound Message Function*/
    private org.museframework.bian.classes.Function inboundMessageFunctionReference;

    /*The type of Inbound Message Function*/
    private String inboundMessageFunctionType;

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

    public void setInboundMessageFunctionReference(org.museframework.bian.classes.Function inboundMessageFunctionReference) {
        this.inboundMessageFunctionReference = inboundMessageFunctionReference;
    }

    public org.museframework.bian.classes.Function getInboundMessageFunctionReference() {
        return inboundMessageFunctionReference;
    }

    public void setInboundMessageFunctionType(String inboundMessageFunctionType) {
        this.inboundMessageFunctionType = inboundMessageFunctionType;
    }

    public String getInboundMessageFunctionType() {
        return inboundMessageFunctionType;
    }
}