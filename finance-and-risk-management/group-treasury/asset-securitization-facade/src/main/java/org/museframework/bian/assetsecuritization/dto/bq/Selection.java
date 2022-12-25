/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Asset Securitization. 
Example: Execute a payment transaction.*/
package org.museframework.bian.assetsecuritization.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Selection {
    /*The required status/situation prior to the execution of the task*/
    @MetaField(0)
    private String selectionPreconditions;

    /*The timing and key actions/milestones involved in completing the transaction task*/
    @MetaField(0)
    private String selectionTaskSchedule;

    /*The Asset Securitization Transaction specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService assetSelection;

    /*The completion status and any triggered/dependent actions once the task has been completed*/
    @MetaField(0)
    private String selectionPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String selectionAssetSelectionServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String selectionAssetSelectionServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String selectionAssetSelectionServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String selectionAssetSelectionServiceWorkProduct;

    /**/
    @MetaField(0)
    private String selectionAssetSelectionServiceName;

    public void setSelectionPreconditions(String selectionPreconditions) {
        this.selectionPreconditions = selectionPreconditions;
    }

    public String getSelectionPreconditions() {
        return selectionPreconditions;
    }

    public void setSelectionTaskSchedule(String selectionTaskSchedule) {
        this.selectionTaskSchedule = selectionTaskSchedule;
    }

    public String getSelectionTaskSchedule() {
        return selectionTaskSchedule;
    }

    public void setAssetSelection(org.museframework.bian.classes.BusinessService assetSelection) {
        this.assetSelection = assetSelection;
    }

    public org.museframework.bian.classes.BusinessService getAssetSelection() {
        return assetSelection;
    }

    public void setSelectionPostconditions(String selectionPostconditions) {
        this.selectionPostconditions = selectionPostconditions;
    }

    public String getSelectionPostconditions() {
        return selectionPostconditions;
    }

    public void setSelectionAssetSelectionServiceType(String selectionAssetSelectionServiceType) {
        this.selectionAssetSelectionServiceType = selectionAssetSelectionServiceType;
    }

    public String getSelectionAssetSelectionServiceType() {
        return selectionAssetSelectionServiceType;
    }

    public void setSelectionAssetSelectionServiceDescription(String selectionAssetSelectionServiceDescription) {
        this.selectionAssetSelectionServiceDescription = selectionAssetSelectionServiceDescription;
    }

    public String getSelectionAssetSelectionServiceDescription() {
        return selectionAssetSelectionServiceDescription;
    }

    public void setSelectionAssetSelectionServiceInputsandOuputs(String selectionAssetSelectionServiceInputsandOuputs) {
        this.selectionAssetSelectionServiceInputsandOuputs = selectionAssetSelectionServiceInputsandOuputs;
    }

    public String getSelectionAssetSelectionServiceInputsandOuputs() {
        return selectionAssetSelectionServiceInputsandOuputs;
    }

    public void setSelectionAssetSelectionServiceWorkProduct(String selectionAssetSelectionServiceWorkProduct) {
        this.selectionAssetSelectionServiceWorkProduct = selectionAssetSelectionServiceWorkProduct;
    }

    public String getSelectionAssetSelectionServiceWorkProduct() {
        return selectionAssetSelectionServiceWorkProduct;
    }

    public void setSelectionAssetSelectionServiceName(String selectionAssetSelectionServiceName) {
        this.selectionAssetSelectionServiceName = selectionAssetSelectionServiceName;
    }

    public String getSelectionAssetSelectionServiceName() {
        return selectionAssetSelectionServiceName;
    }
}