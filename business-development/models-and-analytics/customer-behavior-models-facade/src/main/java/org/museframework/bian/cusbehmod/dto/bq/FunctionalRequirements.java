/*The main design elements/views making up the overall specification

Examples: Business Requirements*/
package org.museframework.bian.cusbehmod.dto.bq;

public class FunctionalRequirements {
    /*Reference to a type of functional requirements specification activity*/
    private org.museframework.bian.classes.Object customerBehaviorModelDesignTaskReference;

    /*The record of work products used for the design task*/
    private String customerBehaviorModelDesignTaskRecord;

    /*Reference to external service information provider used to obtain example production data for design*/
    private org.museframework.bian.classes.Object customerMarketDataServiceReference;

    /*Record of example production data file*/
    private String customerMarketDataRecord;

    /*User provided and solicited feedback, suggestions for model refinement*/
    private String customerBehaviorModelFeedbackRecord;

    /*The model functional requirements specification (with versioning as appropriate)*/
    private String customerBehaviorModelRequirementsSpecification;

    public void setCustomerBehaviorModelDesignTaskReference(org.museframework.bian.classes.Object customerBehaviorModelDesignTaskReference) {
        this.customerBehaviorModelDesignTaskReference = customerBehaviorModelDesignTaskReference;
    }

    public org.museframework.bian.classes.Object getCustomerBehaviorModelDesignTaskReference() {
        return customerBehaviorModelDesignTaskReference;
    }

    public void setCustomerBehaviorModelDesignTaskRecord(String customerBehaviorModelDesignTaskRecord) {
        this.customerBehaviorModelDesignTaskRecord = customerBehaviorModelDesignTaskRecord;
    }

    public String getCustomerBehaviorModelDesignTaskRecord() {
        return customerBehaviorModelDesignTaskRecord;
    }

    public void setCustomerMarketDataServiceReference(org.museframework.bian.classes.Object customerMarketDataServiceReference) {
        this.customerMarketDataServiceReference = customerMarketDataServiceReference;
    }

    public org.museframework.bian.classes.Object getCustomerMarketDataServiceReference() {
        return customerMarketDataServiceReference;
    }

    public void setCustomerMarketDataRecord(String customerMarketDataRecord) {
        this.customerMarketDataRecord = customerMarketDataRecord;
    }

    public String getCustomerMarketDataRecord() {
        return customerMarketDataRecord;
    }

    public void setCustomerBehaviorModelFeedbackRecord(String customerBehaviorModelFeedbackRecord) {
        this.customerBehaviorModelFeedbackRecord = customerBehaviorModelFeedbackRecord;
    }

    public String getCustomerBehaviorModelFeedbackRecord() {
        return customerBehaviorModelFeedbackRecord;
    }

    public void setCustomerBehaviorModelRequirementsSpecification(String customerBehaviorModelRequirementsSpecification) {
        this.customerBehaviorModelRequirementsSpecification = customerBehaviorModelRequirementsSpecification;
    }

    public String getCustomerBehaviorModelRequirementsSpecification() {
        return customerBehaviorModelRequirementsSpecification;
    }
}