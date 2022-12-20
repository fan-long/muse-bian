/*The main design elements/views making up the overall specification

Examples: Business Requirements*/
package org.museframework.bian.fraudmodel.dto.bq;

public class FunctionalRequirements {
    /*Reference to a type of functional requirements specification activity*/
    private org.museframework.bian.classes.Object fraudModelDesignTaskReference;

    /*The record of work products used for the design task*/
    private String fraudModelDesignTaskRecord;

    /*Reference to external service information provider used to obtain example production data for design*/
    private org.museframework.bian.classes.Object customerMarketDataServiceReference;

    /*Record of example production data file*/
    private String customerMarketDataRecord;

    /*User provided and solicited feedback, suggestions for model refinement*/
    private String fraudModelFeedbackRecord;

    /*The model functional requirements specification (with versioning as appropriate)*/
    private String fraudModelRequirementsSpecification;

    public void setFraudModelDesignTaskReference(org.museframework.bian.classes.Object fraudModelDesignTaskReference) {
        this.fraudModelDesignTaskReference = fraudModelDesignTaskReference;
    }

    public org.museframework.bian.classes.Object getFraudModelDesignTaskReference() {
        return fraudModelDesignTaskReference;
    }

    public void setFraudModelDesignTaskRecord(String fraudModelDesignTaskRecord) {
        this.fraudModelDesignTaskRecord = fraudModelDesignTaskRecord;
    }

    public String getFraudModelDesignTaskRecord() {
        return fraudModelDesignTaskRecord;
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

    public void setFraudModelFeedbackRecord(String fraudModelFeedbackRecord) {
        this.fraudModelFeedbackRecord = fraudModelFeedbackRecord;
    }

    public String getFraudModelFeedbackRecord() {
        return fraudModelFeedbackRecord;
    }

    public void setFraudModelRequirementsSpecification(String fraudModelRequirementsSpecification) {
        this.fraudModelRequirementsSpecification = fraudModelRequirementsSpecification;
    }

    public String getFraudModelRequirementsSpecification() {
        return fraudModelRequirementsSpecification;
    }
}