/*An operational support service to orchestrate a schedule of payment transaction */
package org.museframework.bian.classes;

public class TransactionScheduleService {
    /**/
    private String serviceDateTime;

    /**/
    private String serviceFeeType;

    /**/
    private String serviceFunctionType;

    /**/
    private String serviceFunctionDescription;

    public void setServiceDateTime(String serviceDateTime) {
        this.serviceDateTime = serviceDateTime;
    }

    public String getServiceDateTime() {
        return serviceDateTime;
    }

    public void setServiceFeeType(String serviceFeeType) {
        this.serviceFeeType = serviceFeeType;
    }

    public String getServiceFeeType() {
        return serviceFeeType;
    }

    public void setServiceFunctionType(String serviceFunctionType) {
        this.serviceFunctionType = serviceFunctionType;
    }

    public String getServiceFunctionType() {
        return serviceFunctionType;
    }

    public void setServiceFunctionDescription(String serviceFunctionDescription) {
        this.serviceFunctionDescription = serviceFunctionDescription;
    }

    public String getServiceFunctionDescription() {
        return serviceFunctionDescription;
    }
}