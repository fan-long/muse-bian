/*A design specification defined for a model (e.g. Fraud Model, Customer Behaviour Model, Credit Risk Model)*/
package org.museframework.bian.classes;

public class ModelDesignSpecification {
    /**/
    private String modelDesignSpecificationType;

    public void setModelDesignSpecificationType(String modelDesignSpecificationType) {
        this.modelDesignSpecificationType = modelDesignSpecificationType;
    }

    public String getModelDesignSpecificationType() {
        return modelDesignSpecificationType;
    }
}