package org.museframework.bian.cardcase;

import org.museframework.bian.cardcase.dto.RetrieveChargebackRequest;
import org.museframework.bian.cardcase.dto.RetrieveChargebackResponse;
import org.museframework.bian.cardcase.dto.UpdateChargebackRequest;
import org.museframework.bian.cardcase.dto.UpdateChargebackResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CardCase", group="Chargeback")
public interface BqChargeback {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of the chargeback in a card case")
    UpdateChargebackResponse updateChargeback(UpdateChargebackRequest req);

    @Description("ReBQ Retrieve details about the chargeback for a card case")
    RetrieveChargebackResponse retrieveChargeback(RetrieveChargebackRequest req);
}