/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Asset Securitization. 
Example: Execute a payment transaction.*/
package org.museframework.bian.assetsecuritization.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Securitization {
    /*The required status/situation prior to the execution of the task*/
    @MetaField(0)
    private String securitizationPreconditions;

    /*The timing and key actions/milestones involved in completing the transaction task*/
    @MetaField(0)
    private String securitizationTaskSchedule;

    /*The Asset Securitization Transaction specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the task has been completed*/
    @MetaField(0)
    private String securitizationPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String securitizationServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String securitizationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String securitizationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String securitizationServiceWorkProduct;

    /**/
    @MetaField(0)
    private String securitizationServiceName;

    public void setSecuritizationPreconditions(String securitizationPreconditions) {
        this.securitizationPreconditions = securitizationPreconditions;
    }

    public String getSecuritizationPreconditions() {
        return securitizationPreconditions;
    }

    public void setSecuritizationTaskSchedule(String securitizationTaskSchedule) {
        this.securitizationTaskSchedule = securitizationTaskSchedule;
    }

    public String getSecuritizationTaskSchedule() {
        return securitizationTaskSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setSecuritizationPostconditions(String securitizationPostconditions) {
        this.securitizationPostconditions = securitizationPostconditions;
    }

    public String getSecuritizationPostconditions() {
        return securitizationPostconditions;
    }

    public void setSecuritizationServiceType(String securitizationServiceType) {
        this.securitizationServiceType = securitizationServiceType;
    }

    public String getSecuritizationServiceType() {
        return securitizationServiceType;
    }

    public void setSecuritizationServiceDescription(String securitizationServiceDescription) {
        this.securitizationServiceDescription = securitizationServiceDescription;
    }

    public String getSecuritizationServiceDescription() {
        return securitizationServiceDescription;
    }

    public void setSecuritizationServiceInputsandOuputs(String securitizationServiceInputsandOuputs) {
        this.securitizationServiceInputsandOuputs = securitizationServiceInputsandOuputs;
    }

    public String getSecuritizationServiceInputsandOuputs() {
        return securitizationServiceInputsandOuputs;
    }

    public void setSecuritizationServiceWorkProduct(String securitizationServiceWorkProduct) {
        this.securitizationServiceWorkProduct = securitizationServiceWorkProduct;
    }

    public String getSecuritizationServiceWorkProduct() {
        return securitizationServiceWorkProduct;
    }

    public void setSecuritizationServiceName(String securitizationServiceName) {
        this.securitizationServiceName = securitizationServiceName;
    }

    public String getSecuritizationServiceName() {
        return securitizationServiceName;
    }
}