/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.sessiondialogue.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Intelligence {
    /*An optional interaction within the session - to capture customer insights such as detected life events and or product and service preferences or concerns*/
    @MetaField
    private String intelligenceRecord;

    /*Defines a type of maintained customer insight (e.g. retention candidate, cross-sell candidate)*/
    @MetaField
    private String customerInsightType;

    /*The derived value of the specific insight for the customer and past values if appropriate*/
    @MetaField
    private String customerInsight;

    /*The result of the task (e.g. customer insight detected)*/
    @MetaField
    private String insightTaskResult;

    public void setIntelligenceRecord(String intelligenceRecord) {
        this.intelligenceRecord = intelligenceRecord;
    }

    public String getIntelligenceRecord() {
        return intelligenceRecord;
    }

    public void setCustomerInsightType(String customerInsightType) {
        this.customerInsightType = customerInsightType;
    }

    public String getCustomerInsightType() {
        return customerInsightType;
    }

    public void setCustomerInsight(String customerInsight) {
        this.customerInsight = customerInsight;
    }

    public String getCustomerInsight() {
        return customerInsight;
    }

    public void setInsightTaskResult(String insightTaskResult) {
        this.insightTaskResult = insightTaskResult;
    }

    public String getInsightTaskResult() {
        return insightTaskResult;
    }
}