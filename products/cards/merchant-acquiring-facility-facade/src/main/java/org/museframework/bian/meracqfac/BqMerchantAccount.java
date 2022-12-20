package org.museframework.bian.meracqfac;

import org.museframework.bian.meracqfac.dto.RetrieveMerchantAccountRequest;
import org.museframework.bian.meracqfac.dto.RetrieveMerchantAccountResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="MerchantAcquiringFacility", group="MerchantAccount")
public interface BqMerchantAccount {
    @Description("ReBQ Retrieve accounting details for the merchant account")
    RetrieveMerchantAccountResponse retrieveMerchantAccount(RetrieveMerchantAccountRequest req);
}