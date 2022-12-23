package org.museframework.bian.chelocbox.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveLockBoxReportingandIssueResolutionFulfillmentRequest {
    @MetaField
    private String chequelockboxid;

    @MetaField
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