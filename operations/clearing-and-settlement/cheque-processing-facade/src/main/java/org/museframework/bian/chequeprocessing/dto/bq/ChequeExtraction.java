/*Operate equipment and/or a largely automated facility  within Cheque Processing. 
Example: Operate the bank's internal intranet facility.*/
package org.museframework.bian.chequeprocessing.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ChequeExtraction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField
    private String chequeExtractionPreconditions;

    /*The schedule and timing of the function*/
    @MetaField
    private String chequeExtractionFunctionSchedule;

    /*The Cheque Processing Operating Session specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService chequeExtraction;

    /*Reference to the specific business service type*/
    @MetaField
    private String chequeExtractionServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String chequeExtractionServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String chequeExtractionServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String chequeExtractionServiceWorkProduct;

    /**/
    @MetaField
    private String chequeExtractionServiceName;

    public void setChequeExtractionPreconditions(String chequeExtractionPreconditions) {
        this.chequeExtractionPreconditions = chequeExtractionPreconditions;
    }

    public String getChequeExtractionPreconditions() {
        return chequeExtractionPreconditions;
    }

    public void setChequeExtractionFunctionSchedule(String chequeExtractionFunctionSchedule) {
        this.chequeExtractionFunctionSchedule = chequeExtractionFunctionSchedule;
    }

    public String getChequeExtractionFunctionSchedule() {
        return chequeExtractionFunctionSchedule;
    }

    public void setChequeExtraction(org.museframework.bian.classes.BusinessService chequeExtraction) {
        this.chequeExtraction = chequeExtraction;
    }

    public org.museframework.bian.classes.BusinessService getChequeExtraction() {
        return chequeExtraction;
    }

    public void setChequeExtractionServiceType(String chequeExtractionServiceType) {
        this.chequeExtractionServiceType = chequeExtractionServiceType;
    }

    public String getChequeExtractionServiceType() {
        return chequeExtractionServiceType;
    }

    public void setChequeExtractionServiceDescription(String chequeExtractionServiceDescription) {
        this.chequeExtractionServiceDescription = chequeExtractionServiceDescription;
    }

    public String getChequeExtractionServiceDescription() {
        return chequeExtractionServiceDescription;
    }

    public void setChequeExtractionServiceInputsandOuputs(String chequeExtractionServiceInputsandOuputs) {
        this.chequeExtractionServiceInputsandOuputs = chequeExtractionServiceInputsandOuputs;
    }

    public String getChequeExtractionServiceInputsandOuputs() {
        return chequeExtractionServiceInputsandOuputs;
    }

    public void setChequeExtractionServiceWorkProduct(String chequeExtractionServiceWorkProduct) {
        this.chequeExtractionServiceWorkProduct = chequeExtractionServiceWorkProduct;
    }

    public String getChequeExtractionServiceWorkProduct() {
        return chequeExtractionServiceWorkProduct;
    }

    public void setChequeExtractionServiceName(String chequeExtractionServiceName) {
        this.chequeExtractionServiceName = chequeExtractionServiceName;
    }

    public String getChequeExtractionServiceName() {
        return chequeExtractionServiceName;
    }
}