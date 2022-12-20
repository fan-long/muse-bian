package org.museframework.bian.meracqfac;

import org.museframework.bian.meracqfac.dto.ExecuteChargebackRequest;
import org.museframework.bian.meracqfac.dto.ExecuteChargebackResponse;
import org.museframework.bian.meracqfac.dto.RetrieveChargebackRequest;
import org.museframework.bian.meracqfac.dto.RetrieveChargebackResponse;
import org.museframework.bian.meracqfac.dto.UpdateChargebackRequest;
import org.museframework.bian.meracqfac.dto.UpdateChargebackResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="MerchantAcquiringFacility", group="Chargeback")
public interface BqChargeback {
    @GenericDtxEndpoint
    @Description("UpBQ Update a chargeback transaction booked against the account")
    UpdateChargebackResponse updateChargeback(UpdateChargebackRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute a chargeback transaction against the account")
    ExecuteChargebackResponse executeChargeback(ExecuteChargebackRequest req);

    @Description("ReBQ Retrieve details about a chargeback transaction")
    RetrieveChargebackResponse retrieveChargeback(RetrieveChargebackRequest req);
}