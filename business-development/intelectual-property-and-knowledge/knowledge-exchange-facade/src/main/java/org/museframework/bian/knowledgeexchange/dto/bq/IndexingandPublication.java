/*Operate equipment and/or a largely automated facility  within Knowledge Exchange. 
Example: Operate the bank's internal intranet facility.*/
package org.museframework.bian.knowledgeexchange.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class IndexingandPublication {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(0)
    private String indexingandPublicationPreconditions;

    /*The schedule and timing of the function*/
    @MetaField(0)
    private String indexingandPublicationFunctionSchedule;

    /*The Intellectual Property Exchange Operating Session specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService contentIndexingandPublication;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String contentIndexingandPublicationServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String contentIndexingandPublicationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String contentIndexingandPublicationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String contentIndexingandPublicationServiceWorkProduct;

    /**/
    @MetaField(0)
    private String contentIndexingandPublicationServiceName;

    public void setIndexingandPublicationPreconditions(String indexingandPublicationPreconditions) {
        this.indexingandPublicationPreconditions = indexingandPublicationPreconditions;
    }

    public String getIndexingandPublicationPreconditions() {
        return indexingandPublicationPreconditions;
    }

    public void setIndexingandPublicationFunctionSchedule(String indexingandPublicationFunctionSchedule) {
        this.indexingandPublicationFunctionSchedule = indexingandPublicationFunctionSchedule;
    }

    public String getIndexingandPublicationFunctionSchedule() {
        return indexingandPublicationFunctionSchedule;
    }

    public void setContentIndexingandPublication(org.museframework.bian.classes.BusinessService contentIndexingandPublication) {
        this.contentIndexingandPublication = contentIndexingandPublication;
    }

    public org.museframework.bian.classes.BusinessService getContentIndexingandPublication() {
        return contentIndexingandPublication;
    }

    public void setContentIndexingandPublicationServiceType(String contentIndexingandPublicationServiceType) {
        this.contentIndexingandPublicationServiceType = contentIndexingandPublicationServiceType;
    }

    public String getContentIndexingandPublicationServiceType() {
        return contentIndexingandPublicationServiceType;
    }

    public void setContentIndexingandPublicationServiceDescription(String contentIndexingandPublicationServiceDescription) {
        this.contentIndexingandPublicationServiceDescription = contentIndexingandPublicationServiceDescription;
    }

    public String getContentIndexingandPublicationServiceDescription() {
        return contentIndexingandPublicationServiceDescription;
    }

    public void setContentIndexingandPublicationServiceInputsandOuputs(String contentIndexingandPublicationServiceInputsandOuputs) {
        this.contentIndexingandPublicationServiceInputsandOuputs = contentIndexingandPublicationServiceInputsandOuputs;
    }

    public String getContentIndexingandPublicationServiceInputsandOuputs() {
        return contentIndexingandPublicationServiceInputsandOuputs;
    }

    public void setContentIndexingandPublicationServiceWorkProduct(String contentIndexingandPublicationServiceWorkProduct) {
        this.contentIndexingandPublicationServiceWorkProduct = contentIndexingandPublicationServiceWorkProduct;
    }

    public String getContentIndexingandPublicationServiceWorkProduct() {
        return contentIndexingandPublicationServiceWorkProduct;
    }

    public void setContentIndexingandPublicationServiceName(String contentIndexingandPublicationServiceName) {
        this.contentIndexingandPublicationServiceName = contentIndexingandPublicationServiceName;
    }

    public String getContentIndexingandPublicationServiceName() {
        return contentIndexingandPublicationServiceName;
    }
}