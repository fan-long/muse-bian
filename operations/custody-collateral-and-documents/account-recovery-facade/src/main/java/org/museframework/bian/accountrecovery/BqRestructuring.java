package org.museframework.bian.accountrecovery;

import org.museframework.bian.accountrecovery.dto.RetrieveRestructuringRequest;
import org.museframework.bian.accountrecovery.dto.RetrieveRestructuringResponse;
import org.museframework.bian.accountrecovery.dto.UpdateRestructuringRequest;
import org.museframework.bian.accountrecovery.dto.UpdateRestructuringResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="AccountRecovery", group="Restructuring")
public interface BqRestructuring {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of case restructuring tasks")
    UpdateRestructuringResponse updateRestructuring(UpdateRestructuringRequest req);

    @Description("ReBQ Retrieve details of case restructuring tasks")
    RetrieveRestructuringResponse retrieveRestructuring(RetrieveRestructuringRequest req);
}