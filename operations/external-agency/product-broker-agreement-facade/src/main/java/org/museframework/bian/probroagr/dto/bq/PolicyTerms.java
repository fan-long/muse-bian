/*A collection of terms (within some jurisdiction) that can be selected and configured to define a contract /agreement

Examples: Required disclosures*/
package org.museframework.bian.probroagr.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PolicyTerms {
    /*The type of bank policy referenced (e.g. staff certification)*/
    @MetaField(0)
    private String bankPolicy_RuleType;

    /*Reference to the bank's policies or rules*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object applicableBankPolicy_RuleReference;

    /*Explanation or interpretation of the policy or rule as applied*/
    @MetaField(0)
    private String applicableBankPolicy_RuleInterpretation;

    public void setBankPolicy_RuleType(String bankPolicy_RuleType) {
        this.bankPolicy_RuleType = bankPolicy_RuleType;
    }

    public String getBankPolicy_RuleType() {
        return bankPolicy_RuleType;
    }

    public void setApplicableBankPolicy_RuleReference(org.museframework.bian.classes.Object applicableBankPolicy_RuleReference) {
        this.applicableBankPolicy_RuleReference = applicableBankPolicy_RuleReference;
    }

    public org.museframework.bian.classes.Object getApplicableBankPolicy_RuleReference() {
        return applicableBankPolicy_RuleReference;
    }

    public void setApplicableBankPolicy_RuleInterpretation(String applicableBankPolicy_RuleInterpretation) {
        this.applicableBankPolicy_RuleInterpretation = applicableBankPolicy_RuleInterpretation;
    }

    public String getApplicableBankPolicy_RuleInterpretation() {
        return applicableBankPolicy_RuleInterpretation;
    }
}