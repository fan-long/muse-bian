package org.museframework.bian.chelocbox.dto;

public class RetrieveLockBoxReportingandIssueResolutionFulfillmentRequest {
    private String chequelockboxid;

    private String lockboxreportingandissueresolutionfulfillmentid;

    public void setChequelockboxid(String chequelockboxid) {
        this.chequelockboxid = chequelockboxid;
    }

    public String getChequelockboxid() {
        return chequelockboxid;
    }

    public void setLockboxreportingandissueresolutionfulfillmentid(String lockboxreportingandissueresolutionfulfillmentid) {
        this.lockboxreportingandissueresolutionfulfillmentid = lockboxreportingandissueresolutionfulfillmentid;
    }

    public String getLockboxreportingandissueresolutionfulfillmentid() {
        return lockboxreportingandissueresolutionfulfillmentid;
    }
}