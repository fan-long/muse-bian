/*An arrangement (ServiceArrangement) which is promised to deliver the TransactionScheduleService*/
package org.museframework.bian.classes;

public class TransactionScheduleArrangement {
    /**/
    private String applicableServiceFeeType;

    /**/
    private String applicableServiceFeeAmount;

    /**/
    private String serviceArrangementDateTime;

    public void setApplicableServiceFeeType(String applicableServiceFeeType) {
        this.applicableServiceFeeType = applicableServiceFeeType;
    }

    public String getApplicableServiceFeeType() {
        return applicableServiceFeeType;
    }

    public void setApplicableServiceFeeAmount(String applicableServiceFeeAmount) {
        this.applicableServiceFeeAmount = applicableServiceFeeAmount;
    }

    public String getApplicableServiceFeeAmount() {
        return applicableServiceFeeAmount;
    }

    public void setServiceArrangementDateTime(String serviceArrangementDateTime) {
        this.serviceArrangementDateTime = serviceArrangementDateTime;
    }

    public String getServiceArrangementDateTime() {
        return serviceArrangementDateTime;
    }
}