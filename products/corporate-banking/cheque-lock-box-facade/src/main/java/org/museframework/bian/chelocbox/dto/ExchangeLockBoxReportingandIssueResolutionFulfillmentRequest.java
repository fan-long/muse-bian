package org.museframework.bian.chelocbox.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeLockBoxReportingandIssueResolutionFulfillmentRequest {
    @MetaField
    private String chequelockboxid;

    @MetaField
    private String lockboxreportingandissueresolutionfulfillmentid;

    @MetaField(ref=true)
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