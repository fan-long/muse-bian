/*A record of events/entries.
*/
package org.museframework.bian.classes;

public class Log {
    /**/
    private String logType;

    /**/
    private String logPeriod;

    /*Key dates associated with the log (e.g. start time).*/
    private String logDate;

    /**/
    private String logIdentification;

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogPeriod(String logPeriod) {
        this.logPeriod = logPeriod;
    }

    public String getLogPeriod() {
        return logPeriod;
    }

    public void setLogDate(String logDate) {
        this.logDate = logDate;
    }

    public String getLogDate() {
        return logDate;
    }

    public void setLogIdentification(String logIdentification) {
        this.logIdentification = logIdentification;
    }

    public String getLogIdentification() {
        return logIdentification;
    }
}