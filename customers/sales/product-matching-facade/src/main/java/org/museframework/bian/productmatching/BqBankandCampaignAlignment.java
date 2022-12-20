package org.museframework.bian.productmatching;

import org.museframework.bian.productmatching.dto.InitiateBankandCampaignAlignmentRequest;
import org.museframework.bian.productmatching.dto.InitiateBankandCampaignAlignmentResponse;
import org.museframework.bian.productmatching.dto.RetrieveBankandCampaignAlignmentRequest;
import org.museframework.bian.productmatching.dto.RetrieveBankandCampaignAlignmentResponse;
import org.museframework.bian.productmatching.dto.UpdateBankandCampaignAlignmentRequest;
import org.museframework.bian.productmatching.dto.UpdateBankandCampaignAlignmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("To test or assess an entity, possibly against some formal qualification or certification requirement  within Product Matching.   Examples: Perform regulatory tests on a proposed financial transaction and check a new offer conforms to an existing contractual agreement.")
@GenericDomain(name="ProductMatching", group="BankandCampaignAlignment")
public interface BqBankandCampaignAlignment {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Bank and Campaign Alignment")
    InitiateBankandCampaignAlignmentResponse initiateBankandCampaignAlignment(InitiateBankandCampaignAlignmentRequest req);

    @Description("ReBQ Retrieve details about any aspect of Bank and Campaign Alignment")
    RetrieveBankandCampaignAlignmentResponse retrieveBankandCampaignAlignment(RetrieveBankandCampaignAlignmentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Bank and Campaign Alignment")
    UpdateBankandCampaignAlignmentResponse updateBankandCampaignAlignment(UpdateBankandCampaignAlignmentRequest req);
}