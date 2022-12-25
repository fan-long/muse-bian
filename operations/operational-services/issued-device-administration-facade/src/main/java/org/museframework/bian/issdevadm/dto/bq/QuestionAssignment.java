/**/
package org.museframework.bian.issdevadm.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class QuestionAssignment {
    /*Defines the minimum requirements for answers*/
    @MetaField(0)
    private String formatRules;

    /*Recent values maintained to eliminate repeated values*/
    @MetaField(0)
    private String recentValues;

    /*Used to select secret questions and access prompts*/
    @MetaField(0)
    private String requestText;

    /*The stored response value possibly in suitably encrypted form*/
    @MetaField(0)
    private String responseText;

    /*The timing and frequency of access/use - includes errors for fraud detection*/
    @MetaField(0)
    private String usageLog;

    public void setFormatRules(String formatRules) {
        this.formatRules = formatRules;
    }

    public String getFormatRules() {
        return formatRules;
    }

    public void setRecentValues(String recentValues) {
        this.recentValues = recentValues;
    }

    public String getRecentValues() {
        return recentValues;
    }

    public void setRequestText(String requestText) {
        this.requestText = requestText;
    }

    public String getRequestText() {
        return requestText;
    }

    public void setResponseText(String responseText) {
        this.responseText = responseText;
    }

    public String getResponseText() {
        return responseText;
    }

    public void setUsageLog(String usageLog) {
        this.usageLog = usageLog;
    }

    public String getUsageLog() {
        return usageLog;
    }
}