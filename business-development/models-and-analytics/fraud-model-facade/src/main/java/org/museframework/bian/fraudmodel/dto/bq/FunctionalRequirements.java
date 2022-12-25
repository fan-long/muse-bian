/*The main design elements/views making up the overall specification

Examples: Business Requirements*/
package org.museframework.bian.fraudmodel.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FunctionalRequirements {
    /*Reference to a type of functional requirements specification activity*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object fraudModelDesignTaskReference;

    /*The record of work products used for the design task*/
    @MetaField(0)
    private String fraudModelDesignTaskRecord;

    /*Reference to external service information provider used to obtain example production data for design*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerMarketDataServiceReference;

    /*Record of example production data file*/
    @MetaField(0)
    private String customerMarketDataRecord;

    /*User provided and solicited feedback, suggestions for model refinement*/
    @MetaField(0)
    private String fraudModelFeedbackRecord;

    /*The model functional requirements specification (with versioning as appropriate)*/
    @MetaField(0)
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