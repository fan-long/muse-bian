/*Operate equipment and/or a largely automated facility  within Knowledge Exchange. 
Example: Operate the bank's internal intranet facility.*/
package org.museframework.bian.knowledgeexchange.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Archiving {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField
    private String archivingPreconditions;

    /*The schedule and timing of the function*/
    @MetaField
    private String archivingFunctionSchedule;

    /*The Intellectual Property Exchange Operating Session specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService contentArchiving;

    /*Reference to the specific business service type*/
    @MetaField
    private String contentArchivingServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String contentArchivingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String contentArchivingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String contentArchivingServiceWorkProduct;

    /**/
    @MetaField
    private String contentArchivingServiceName;

    public void setArchivingPreconditions(String archivingPreconditions) {
        this.archivingPreconditions = archivingPreconditions;
    }

    public String getArchivingPreconditions() {
        return archivingPreconditions;
    }

    public void setArchivingFunctionSchedule(String archivingFunctionSchedule) {
        this.archivingFunctionSchedule = archivingFunctionSchedule;
    }

    public String getArchivingFunctionSchedule() {
        return archivingFunctionSchedule;
    }

    public void setContentArchiving(org.museframework.bian.classes.BusinessService contentArchiving) {
        this.contentArchiving = contentArchiving;
    }

    public org.museframework.bian.classes.BusinessService getContentArchiving() {
        return contentArchiving;
    }

    public void setContentArchivingServiceType(String contentArchivingServiceType) {
        this.contentArchivingServiceType = contentArchivingServiceType;
    }

    public String getContentArchivingServiceType() {
        return contentArchivingServiceType;
    }

    public void setContentArchivingServiceDescription(String contentArchivingServiceDescription) {
        this.contentArchivingServiceDescription = contentArchivingServiceDescription;
    }

    public String getContentArchivingServiceDescription() {
        return contentArchivingServiceDescription;
    }

    public void setContentArchivingServiceInputsandOuputs(String contentArchivingServiceInputsandOuputs) {
        this.contentArchivingServiceInputsandOuputs = contentArchivingServiceInputsandOuputs;
    }

    public String getContentArchivingServiceInputsandOuputs() {
        return contentArchivingServiceInputsandOuputs;
    }

    public void setContentArchivingServiceWorkProduct(String contentArchivingServiceWorkProduct) {
        this.contentArchivingServiceWorkProduct = contentArchivingServiceWorkProduct;
    }

    public String getContentArchivingServiceWorkProduct() {
        return contentArchivingServiceWorkProduct;
    }

    public void setContentArchivingServiceName(String contentArchivingServiceName) {
        this.contentArchivingServiceName = contentArchivingServiceName;
    }

    public String getContentArchivingServiceName() {
        return contentArchivingServiceName;
    }
}