/*To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Matching. 

Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.*/
package org.museframework.bian.productmatching.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductTypeSelection {
    /*The required status/situation before the test can be applied*/
    @MetaField
    private String productTypeSelectionPreconditions;

    /*The schedule and timing of the testing performed*/
    @MetaField
    private String productTypeSelectionAnalysisSchedule;

    /*The test version employed*/
    @MetaField
    private String productTypeSelectionVersionNumber;

    /*The Product/Customer Combination Assessment specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService productTypeSelection;

    /*Reference to the specific business service type*/
    @MetaField
    private String productTypeSelectionServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String productTypeSelectionServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String productTypeSelectionServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String productTypeSelectionServiceWorkProduct;

    /**/
    @MetaField
    private String productTypeSelectionServiceName;

    public void setProductTypeSelectionPreconditions(String productTypeSelectionPreconditions) {
        this.productTypeSelectionPreconditions = productTypeSelectionPreconditions;
    }

    public String getProductTypeSelectionPreconditions() {
        return productTypeSelectionPreconditions;
    }

    public void setProductTypeSelectionAnalysisSchedule(String productTypeSelectionAnalysisSchedule) {
        this.productTypeSelectionAnalysisSchedule = productTypeSelectionAnalysisSchedule;
    }

    public String getProductTypeSelectionAnalysisSchedule() {
        return productTypeSelectionAnalysisSchedule;
    }

    public void setProductTypeSelectionVersionNumber(String productTypeSelectionVersionNumber) {
        this.productTypeSelectionVersionNumber = productTypeSelectionVersionNumber;
    }

    public String getProductTypeSelectionVersionNumber() {
        return productTypeSelectionVersionNumber;
    }

    public void setProductTypeSelection(org.museframework.bian.classes.BusinessService productTypeSelection) {
        this.productTypeSelection = productTypeSelection;
    }

    public org.museframework.bian.classes.BusinessService getProductTypeSelection() {
        return productTypeSelection;
    }

    public void setProductTypeSelectionServiceType(String productTypeSelectionServiceType) {
        this.productTypeSelectionServiceType = productTypeSelectionServiceType;
    }

    public String getProductTypeSelectionServiceType() {
        return productTypeSelectionServiceType;
    }

    public void setProductTypeSelectionServiceDescription(String productTypeSelectionServiceDescription) {
        this.productTypeSelectionServiceDescription = productTypeSelectionServiceDescription;
    }

    public String getProductTypeSelectionServiceDescription() {
        return productTypeSelectionServiceDescription;
    }

    public void setProductTypeSelectionServiceInputsandOuputs(String productTypeSelectionServiceInputsandOuputs) {
        this.productTypeSelectionServiceInputsandOuputs = productTypeSelectionServiceInputsandOuputs;
    }

    public String getProductTypeSelectionServiceInputsandOuputs() {
        return productTypeSelectionServiceInputsandOuputs;
    }

    public void setProductTypeSelectionServiceWorkProduct(String productTypeSelectionServiceWorkProduct) {
        this.productTypeSelectionServiceWorkProduct = productTypeSelectionServiceWorkProduct;
    }

    public String getProductTypeSelectionServiceWorkProduct() {
        return productTypeSelectionServiceWorkProduct;
    }

    public void setProductTypeSelectionServiceName(String productTypeSelectionServiceName) {
        this.productTypeSelectionServiceName = productTypeSelectionServiceName;
    }

    public String getProductTypeSelectionServiceName() {
        return productTypeSelectionServiceName;
    }
}