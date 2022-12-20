package org.museframework.bian.accountrecovery;

import org.museframework.bian.accountrecovery.dto.UpdateWritedownRequest;
import org.museframework.bian.accountrecovery.dto.UpdateWritedownResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="AccountRecovery", group="Writedown")
public interface BqWritedown {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of an active case write-down")
    UpdateWritedownResponse updateWritedown(UpdateWritedownRequest req);
}