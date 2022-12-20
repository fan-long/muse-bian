package org.museframework.bian.chelocbox.dto;

public class ExecuteLockBoxReportingandIssueResolutionFulfillmentRequest {
    private String chequelockboxid;

    private String lockboxreportingandissueresolutionfulfillmentid;

    private org.museframework.bian.chelocbox.dto.bq.LockBoxReportingandIssueResolutionFulfillment lockBoxReportingandIssueResolutionFulfillment;

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

    public void setLockBoxReportingandIssueResolutionFulfillment(org.museframework.bian.chelocbox.dto.bq.LockBoxReportingandIssueResolutionFulfillment lockBoxReportingandIssueResolutionFulfillment) {
        this.lockBoxReportingandIssueResolutionFulfillment = lockBoxReportingandIssueResolutionFulfillment;
    }

    public org.museframework.bian.chelocbox.dto.bq.LockBoxReportingandIssueResolutionFulfillment getLockBoxReportingandIssueResolutionFulfillment() {
        return lockBoxReportingandIssueResolutionFulfillment;
    }
}