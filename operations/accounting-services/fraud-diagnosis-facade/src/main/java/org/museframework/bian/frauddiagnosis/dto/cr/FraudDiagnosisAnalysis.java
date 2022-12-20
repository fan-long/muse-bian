/*Analyze the performance or behavior of some on-going activity or entity  within Fraud Diagnosis. 
Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.

Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.*/
package org.museframework.bian.frauddiagnosis.dto.cr;

public class FraudDiagnosisAnalysis {
    /*Reference to the product fulfillment production session for which fraud diagnosis is performed*/
    private org.museframework.bian.classes.Object productProductionSessionReference;

    /*Details the types of fraud diagnosis algorithms and tests are applied*/
    private String fraudDiagnosisEvaluationProfile;

    /*The production transaction details that are submitted for fraud diagnosis*/
    private String fraudDiagnosisTransactionConsolidationRecord;

    /*Details of detected out of pattern production activity that could be fraud highlighted by Fraud Evaluation*/
    private String fraudEvaluationProductionAnomalyRecord;

    /*Reference to the one or more production transactions isolated by the fraud evaluation tests identified by Fraud Evaluation*/
    private org.museframework.bian.classes.Object fraudEvaluationProductionAnomalyProductionTransactionReference;

    /*Details the conclusion of the analysis and determination (e.g. diagnosis of likely fraud)*/
    private String fraudDiagnosisDetermination;

    /*Details the recommended action in response to the analysis (e.g. accept or reject the transaction, flag account for fraud)*/
    private String fraudDiagnosisRecommendation;

    public void setProductProductionSessionReference(org.museframework.bian.classes.Object productProductionSessionReference) {
        this.productProductionSessionReference = productProductionSessionReference;
    }

    public org.museframework.bian.classes.Object getProductProductionSessionReference() {
        return productProductionSessionReference;
    }

    public void setFraudDiagnosisEvaluationProfile(String fraudDiagnosisEvaluationProfile) {
        this.fraudDiagnosisEvaluationProfile = fraudDiagnosisEvaluationProfile;
    }

    public String getFraudDiagnosisEvaluationProfile() {
        return fraudDiagnosisEvaluationProfile;
    }

    public void setFraudDiagnosisTransactionConsolidationRecord(String fraudDiagnosisTransactionConsolidationRecord) {
        this.fraudDiagnosisTransactionConsolidationRecord = fraudDiagnosisTransactionConsolidationRecord;
    }

    public String getFraudDiagnosisTransactionConsolidationRecord() {
        return fraudDiagnosisTransactionConsolidationRecord;
    }

    public void setFraudEvaluationProductionAnomalyRecord(String fraudEvaluationProductionAnomalyRecord) {
        this.fraudEvaluationProductionAnomalyRecord = fraudEvaluationProductionAnomalyRecord;
    }

    public String getFraudEvaluationProductionAnomalyRecord() {
        return fraudEvaluationProductionAnomalyRecord;
    }

    public void setFraudEvaluationProductionAnomalyProductionTransactionReference(org.museframework.bian.classes.Object fraudEvaluationProductionAnomalyProductionTransactionReference) {
        this.fraudEvaluationProductionAnomalyProductionTransactionReference = fraudEvaluationProductionAnomalyProductionTransactionReference;
    }

    public org.museframework.bian.classes.Object getFraudEvaluationProductionAnomalyProductionTransactionReference() {
        return fraudEvaluationProductionAnomalyProductionTransactionReference;
    }

    public void setFraudDiagnosisDetermination(String fraudDiagnosisDetermination) {
        this.fraudDiagnosisDetermination = fraudDiagnosisDetermination;
    }

    public String getFraudDiagnosisDetermination() {
        return fraudDiagnosisDetermination;
    }

    public void setFraudDiagnosisRecommendation(String fraudDiagnosisRecommendation) {
        this.fraudDiagnosisRecommendation = fraudDiagnosisRecommendation;
    }

    public String getFraudDiagnosisRecommendation() {
        return fraudDiagnosisRecommendation;
    }
}