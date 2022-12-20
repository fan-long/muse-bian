/*The main design elements/views making up the overall specification

Examples: Business Requirements*/
package org.museframework.bian.productdesign.dto.bq;

public class FunctionalRequirements {
    /*Reference to a type of functional requirements specification activity*/
    private org.museframework.bian.classes.Object productandServiceSpecificationDesignTaskReference;

    /*The record of work products used for the design task*/
    private String productandServiceSpecificationDesignTaskRecord;

    /*Reference to external service information provider used to obtain product or service related market research as input to the design*/
    private org.museframework.bian.classes.Object marketResearchDataServiceReference;

    /*Record of the product or service related market research*/
    private String marketResearchDataRecord;

    /*User provided and solicited feedback, suggestions for product or service refinement*/
    private String productandServiceFeedbackRecord;

    /*The product or service detailed functional requirements specification (with versioning as appropriate)*/
    private String productandServiceRequirementsSpecification;

    public void setProductandServiceSpecificationDesignTaskReference(org.museframework.bian.classes.Object productandServiceSpecificationDesignTaskReference) {
        this.productandServiceSpecificationDesignTaskReference = productandServiceSpecificationDesignTaskReference;
    }

    public org.museframework.bian.classes.Object getProductandServiceSpecificationDesignTaskReference() {
        return productandServiceSpecificationDesignTaskReference;
    }

    public void setProductandServiceSpecificationDesignTaskRecord(String productandServiceSpecificationDesignTaskRecord) {
        this.productandServiceSpecificationDesignTaskRecord = productandServiceSpecificationDesignTaskRecord;
    }

    public String getProductandServiceSpecificationDesignTaskRecord() {
        return productandServiceSpecificationDesignTaskRecord;
    }

    public void setMarketResearchDataServiceReference(org.museframework.bian.classes.Object marketResearchDataServiceReference) {
        this.marketResearchDataServiceReference = marketResearchDataServiceReference;
    }

    public org.museframework.bian.classes.Object getMarketResearchDataServiceReference() {
        return marketResearchDataServiceReference;
    }

    public void setMarketResearchDataRecord(String marketResearchDataRecord) {
        this.marketResearchDataRecord = marketResearchDataRecord;
    }

    public String getMarketResearchDataRecord() {
        return marketResearchDataRecord;
    }

    public void setProductandServiceFeedbackRecord(String productandServiceFeedbackRecord) {
        this.productandServiceFeedbackRecord = productandServiceFeedbackRecord;
    }

    public String getProductandServiceFeedbackRecord() {
        return productandServiceFeedbackRecord;
    }

    public void setProductandServiceRequirementsSpecification(String productandServiceRequirementsSpecification) {
        this.productandServiceRequirementsSpecification = productandServiceRequirementsSpecification;
    }

    public String getProductandServiceRequirementsSpecification() {
        return productandServiceRequirementsSpecification;
    }
}