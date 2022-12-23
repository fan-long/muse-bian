/*To test or assess an entity, possibly against some formal qualification or certification requirement within Fraud Evaluation. */
package org.museframework.bian.fraudevaluation.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FraudEvaluationAssessment {
    /*Reference to the product fulfillment production session for which on-line fraud evaluation is performed*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productProductionSessionReference;

    /*Details the types of fraud evaluation tests applied*/
    @MetaField
    private String fraudEvaluationTestProfile;

    /*The type of technique use to combine results of the different tests used to detect out of pattern behavior*/
    @MetaField
    private String fraudEvaluationEnsembleTechniqueType;

    /*The definition of how the constituent rule set/decision tree and model test are combined to compete the assessment*/
    @MetaField
    private String fraudEvaluationEnsembleTechniqueDefinition;

    /*The production transaction details that are submitted for fraud evaluation - note this will typically be a real-time dataset*/
    @MetaField
    private String fraudEvaluationTransactionConsolidationRecord;

    /*Details of detected out of pattern production activity that could be fraud*/
    @MetaField
    private String fraudEvaluationProductionAnomalyRecord;

    /*Reference to the one or more production transactions isolated by the fraud evaluation tests*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object fraudEvaluationProductionAnomalyProductionTransactionReference;

    public void setProductProductionSessionReference(org.museframework.bian.classes.Object productProductionSessionReference) {
        this.productProductionSessionReference = productProductionSessionReference;
    }

    public org.museframework.bian.classes.Object getProductProductionSessionReference() {
        return productProductionSessionReference;
    }

    public void setFraudEvaluationTestProfile(String fraudEvaluationTestProfile) {
        this.fraudEvaluationTestProfile = fraudEvaluationTestProfile;
    }

    public String getFraudEvaluationTestProfile() {
        return fraudEvaluationTestProfile;
    }

    public void setFraudEvaluationEnsembleTechniqueType(String fraudEvaluationEnsembleTechniqueType) {
        this.fraudEvaluationEnsembleTechniqueType = fraudEvaluationEnsembleTechniqueType;
    }

    public String getFraudEvaluationEnsembleTechniqueType() {
        return fraudEvaluationEnsembleTechniqueType;
    }

    public void setFraudEvaluationEnsembleTechniqueDefinition(String fraudEvaluationEnsembleTechniqueDefinition) {
        this.fraudEvaluationEnsembleTechniqueDefinition = fraudEvaluationEnsembleTechniqueDefinition;
    }

    public String getFraudEvaluationEnsembleTechniqueDefinition() {
        return fraudEvaluationEnsembleTechniqueDefinition;
    }

    public void setFraudEvaluationTransactionConsolidationRecord(String fraudEvaluationTransactionConsolidationRecord) {
        this.fraudEvaluationTransactionConsolidationRecord = fraudEvaluationTransactionConsolidationRecord;
    }

    public String getFraudEvaluationTransactionConsolidationRecord() {
        return fraudEvaluationTransactionConsolidationRecord;
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
}