/*An algorithm is a step by step procedure designed to perform an operation. 

Algorithms are a collection of models/calculations/algorithms that can be applied to a subject or activity. (Behavior Qualifier Type)*/
package org.museframework.bian.classes;

public class Algorithm {
    /**/
    private String algorithmType;

    /**/
    private String algorithmUsage;

    /**/
    private String algorithmImpact;

    /**/
    private String algorithmFeedback;

    /**/
    private String algorithmSpecification;

    /**/
    private String algorithmUsageGuideline;

    public void setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
    }

    public String getAlgorithmType() {
        return algorithmType;
    }

    public void setAlgorithmUsage(String algorithmUsage) {
        this.algorithmUsage = algorithmUsage;
    }

    public String getAlgorithmUsage() {
        return algorithmUsage;
    }

    public void setAlgorithmImpact(String algorithmImpact) {
        this.algorithmImpact = algorithmImpact;
    }

    public String getAlgorithmImpact() {
        return algorithmImpact;
    }

    public void setAlgorithmFeedback(String algorithmFeedback) {
        this.algorithmFeedback = algorithmFeedback;
    }

    public String getAlgorithmFeedback() {
        return algorithmFeedback;
    }

    public void setAlgorithmSpecification(String algorithmSpecification) {
        this.algorithmSpecification = algorithmSpecification;
    }

    public String getAlgorithmSpecification() {
        return algorithmSpecification;
    }

    public void setAlgorithmUsageGuideline(String algorithmUsageGuideline) {
        this.algorithmUsageGuideline = algorithmUsageGuideline;
    }

    public String getAlgorithmUsageGuideline() {
        return algorithmUsageGuideline;
    }
}