/*Information about an e-Branch Channel Operating Session

Maintained during and accessible during the session*/
package org.museframework.bian.classes;

public class EbranchChannelSessionReport {
    /*The type of information recorded during an e-Branch Channel Operating Session*/
    private String ebranchSessionInformationType;

    /*The information recorded during an e-Branch Channel Operating Session

e.g. real time status, session statistic*/
    private String ebranchSessionReportInformation;

    public void setEbranchSessionInformationType(String ebranchSessionInformationType) {
        this.ebranchSessionInformationType = ebranchSessionInformationType;
    }

    public String getEbranchSessionInformationType() {
        return ebranchSessionInformationType;
    }

    public void setEbranchSessionReportInformation(String ebranchSessionReportInformation) {
        this.ebranchSessionReportInformation = ebranchSessionReportInformation;
    }

    public String getEbranchSessionReportInformation() {
        return ebranchSessionReportInformation;
    }
}