/**/
package org.museframework.bian.issdevadm.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PasswordAssignment {
    /*The required format or minimum requirements for the password (e.g. 8 chars)*/
    @MetaField
    private String formatRules;

    /*Recent values maintained to eliminate repeated values*/
    @MetaField
    private String recentValues;

    /*The stored value possibly in suitably encrypted form*/
    @MetaField
    private String passwordValue;

    /*The timing and frequency of access/use - includes errors for fraud detection*/
    @MetaField
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

    public void setPasswordValue(String passwordValue) {
        this.passwordValue = passwordValue;
    }

    public String getPasswordValue() {
        return passwordValue;
    }

    public void setUsageLog(String usageLog) {
        this.usageLog = usageLog;
    }

    public String getUsageLog() {
        return usageLog;
    }
}