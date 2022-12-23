package org.museframework.bian.chelocbox.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeLockBoxReportingandIssueResolutionFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.chelocbox.dto.bq.LockBoxReportingandIssueResolutionFulfillment lockBoxReportingandIssueResolutionFulfillment;

    public void setLockBoxReportingandIssueResolutionFulfillment(org.museframework.bian.chelocbox.dto.bq.LockBoxReportingandIssueResolutionFulfillment lockBoxReportingandIssueResolutionFulfillment) {
        this.lockBoxReportingandIssueResolutionFulfillment = lockBoxReportingandIssueResolutionFulfillment;
    }

    public org.museframework.bian.chelocbox.dto.bq.LockBoxReportingandIssueResolutionFulfillment getLockBoxReportingandIssueResolutionFulfillment() {
        return lockBoxReportingandIssueResolutionFulfillment;
    }
}