/*Define the policies, goals & objectives and strategies for an organizational entity or unit  within Asset And Liability Management. 
Example: Direct a division of the enterprise.*/
package org.museframework.bian.assandliaman.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class AssetAndLiabilityPortfolioStrategy extends org.museframework.bian.classes.AssetAndLiabilityPortfolioStrategy {
    /*The consolidated book of the bank's loans and deposits*/
    @MetaField
    private String assetAndLiabilityBalanceSheet;

    /*An analysis of expected cash flows related to the book of business (used for long and short term liquidity management)*/
    @MetaField
    private String assetAndLiabilityMaturityLadder;

    /*An analysis of available bank capital covering the required allocations*/
    @MetaField
    private String assetAndLiabilityCapitalAllocation;

    /*The policy formulation and assessment of the bank's book of business for a specific perspective/policy type*/
    @MetaField
    private String assetAndLiabilityPolicyGoalRecord;

    /*The type of policy or goal applied to the book of business (e.g. Credit, Segment, Geopolitical, Instrument, Currency) can be referred to as a dimension of the book of business*/
    @MetaField
    private String assetAndLiabilityPolicyType;

    /*A definition of how the policy type is defined and goals and assessments applied*/
    @MetaField
    private String assetAndLiabilityPolicyTypeDefinition;

    /*Defines the target thresholds for the bank's asset and liability position for the specific dimension. These can be adjusted to influence transaction activity to remain within the bank's intended asset and liability risk profile*/
    @MetaField
    private String assetAndLiabilityPolicyTypeGoals;

    /*A consolidated assessment of the bank's current and projected position for the policy type dimension*/
    @MetaField
    private String assetAndLiabilityPolicyTypePosition;

    /*A range of sensitivity assessments that project the bank's position for different market scenarios*/
    @MetaField
    private String assetAndLiabilityPolicyTypeSensitivityAssessment;

    public void setAssetAndLiabilityBalanceSheet(String assetAndLiabilityBalanceSheet) {
        this.assetAndLiabilityBalanceSheet = assetAndLiabilityBalanceSheet;
    }

    public String getAssetAndLiabilityBalanceSheet() {
        return assetAndLiabilityBalanceSheet;
    }

    public void setAssetAndLiabilityMaturityLadder(String assetAndLiabilityMaturityLadder) {
        this.assetAndLiabilityMaturityLadder = assetAndLiabilityMaturityLadder;
    }

    public String getAssetAndLiabilityMaturityLadder() {
        return assetAndLiabilityMaturityLadder;
    }

    public void setAssetAndLiabilityCapitalAllocation(String assetAndLiabilityCapitalAllocation) {
        this.assetAndLiabilityCapitalAllocation = assetAndLiabilityCapitalAllocation;
    }

    public String getAssetAndLiabilityCapitalAllocation() {
        return assetAndLiabilityCapitalAllocation;
    }

    public void setAssetAndLiabilityPolicyGoalRecord(String assetAndLiabilityPolicyGoalRecord) {
        this.assetAndLiabilityPolicyGoalRecord = assetAndLiabilityPolicyGoalRecord;
    }

    public String getAssetAndLiabilityPolicyGoalRecord() {
        return assetAndLiabilityPolicyGoalRecord;
    }

    public void setAssetAndLiabilityPolicyType(String assetAndLiabilityPolicyType) {
        this.assetAndLiabilityPolicyType = assetAndLiabilityPolicyType;
    }

    public String getAssetAndLiabilityPolicyType() {
        return assetAndLiabilityPolicyType;
    }

    public void setAssetAndLiabilityPolicyTypeDefinition(String assetAndLiabilityPolicyTypeDefinition) {
        this.assetAndLiabilityPolicyTypeDefinition = assetAndLiabilityPolicyTypeDefinition;
    }

    public String getAssetAndLiabilityPolicyTypeDefinition() {
        return assetAndLiabilityPolicyTypeDefinition;
    }

    public void setAssetAndLiabilityPolicyTypeGoals(String assetAndLiabilityPolicyTypeGoals) {
        this.assetAndLiabilityPolicyTypeGoals = assetAndLiabilityPolicyTypeGoals;
    }

    public String getAssetAndLiabilityPolicyTypeGoals() {
        return assetAndLiabilityPolicyTypeGoals;
    }

    public void setAssetAndLiabilityPolicyTypePosition(String assetAndLiabilityPolicyTypePosition) {
        this.assetAndLiabilityPolicyTypePosition = assetAndLiabilityPolicyTypePosition;
    }

    public String getAssetAndLiabilityPolicyTypePosition() {
        return assetAndLiabilityPolicyTypePosition;
    }

    public void setAssetAndLiabilityPolicyTypeSensitivityAssessment(String assetAndLiabilityPolicyTypeSensitivityAssessment) {
        this.assetAndLiabilityPolicyTypeSensitivityAssessment = assetAndLiabilityPolicyTypeSensitivityAssessment;
    }

    public String getAssetAndLiabilityPolicyTypeSensitivityAssessment() {
        return assetAndLiabilityPolicyTypeSensitivityAssessment;
    }
}