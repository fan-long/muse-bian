package org.museframework.bian.corporatetreasury;

import org.museframework.bian.corporatetreasury.dto.RetrieveSecuritizationRequest;
import org.museframework.bian.corporatetreasury.dto.RetrieveSecuritizationResponse;
import org.museframework.bian.corporatetreasury.dto.UpdateSecuritizationRequest;
import org.museframework.bian.corporatetreasury.dto.UpdateSecuritizationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="CorporateTreasury", group="Securitization")
public interface BqSecuritization {
    @GenericDtxEndpoint
    @Description("UpBQ Update securitization tranche and task details")
    UpdateSecuritizationResponse updateSecuritization(UpdateSecuritizationRequest req);

    @Description("ReBQ Retrieve securitization tranche and task related details")
    RetrieveSecuritizationResponse retrieveSecuritization(RetrieveSecuritizationRequest req);
}