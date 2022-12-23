/*Operate equipment and/or a largely automated facility  within ATM Network Operations. 
Example: Operate the bank's internal intranet facility.*/
package org.museframework.bian.atmnetope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class NetworkOperation {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField
    private String networkOperationPreconditions;

    /*The schedule and timing of the function*/
    @MetaField
    private String networkOperationFunctionSchedule;

    /*The ATMNetwork Operating Session specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService networkOperation;

    /*Reference to the specific business service type*/
    @MetaField
    private String networkOperationServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String networkOperationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String networkOperationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String networkOperationServiceWorkProduct;

    /**/
    @MetaField
    private String networkOperationServiceName;

    public void setNetworkOperationPreconditions(String networkOperationPreconditions) {
        this.networkOperationPreconditions = networkOperationPreconditions;
    }

    public String getNetworkOperationPreconditions() {
        return networkOperationPreconditions;
    }

    public void setNetworkOperationFunctionSchedule(String networkOperationFunctionSchedule) {
        this.networkOperationFunctionSchedule = networkOperationFunctionSchedule;
    }

    public String getNetworkOperationFunctionSchedule() {
        return networkOperationFunctionSchedule;
    }

    public void setNetworkOperation(org.museframework.bian.classes.BusinessService networkOperation) {
        this.networkOperation = networkOperation;
    }

    public org.museframework.bian.classes.BusinessService getNetworkOperation() {
        return networkOperation;
    }

    public void setNetworkOperationServiceType(String networkOperationServiceType) {
        this.networkOperationServiceType = networkOperationServiceType;
    }

    public String getNetworkOperationServiceType() {
        return networkOperationServiceType;
    }

    public void setNetworkOperationServiceDescription(String networkOperationServiceDescription) {
        this.networkOperationServiceDescription = networkOperationServiceDescription;
    }

    public String getNetworkOperationServiceDescription() {
        return networkOperationServiceDescription;
    }

    public void setNetworkOperationServiceInputsandOuputs(String networkOperationServiceInputsandOuputs) {
        this.networkOperationServiceInputsandOuputs = networkOperationServiceInputsandOuputs;
    }

    public String getNetworkOperationServiceInputsandOuputs() {
        return networkOperationServiceInputsandOuputs;
    }

    public void setNetworkOperationServiceWorkProduct(String networkOperationServiceWorkProduct) {
        this.networkOperationServiceWorkProduct = networkOperationServiceWorkProduct;
    }

    public String getNetworkOperationServiceWorkProduct() {
        return networkOperationServiceWorkProduct;
    }

    public void setNetworkOperationServiceName(String networkOperationServiceName) {
        this.networkOperationServiceName = networkOperationServiceName;
    }

    public String getNetworkOperationServiceName() {
        return networkOperationServiceName;
    }
}