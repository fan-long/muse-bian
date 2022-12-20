package org.museframework.bian.cardclearing;

import org.museframework.bian.cardclearing.dto.RetrieveAddressingRequest;
import org.museframework.bian.cardclearing.dto.RetrieveAddressingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CardClearing", group="Addressing")
public interface BqAddressing {
    @Description("ReBQ Retrieve details about card transaction addressing")
    RetrieveAddressingResponse retrieveAddressing(RetrieveAddressingRequest req);
}