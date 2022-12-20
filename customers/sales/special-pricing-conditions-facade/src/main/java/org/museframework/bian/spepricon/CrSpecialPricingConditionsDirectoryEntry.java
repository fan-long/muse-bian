package org.museframework.bian.spepricon;

import org.museframework.bian.spepricon.dto.ControlSpecialPricingConditionsDirectoryEntryRequest;
import org.museframework.bian.spepricon.dto.ControlSpecialPricingConditionsDirectoryEntryResponse;
import org.museframework.bian.spepricon.dto.ExchangeSpecialPricingConditionsDirectoryEntryRequest;
import org.museframework.bian.spepricon.dto.ExchangeSpecialPricingConditionsDirectoryEntryResponse;
import org.museframework.bian.spepricon.dto.ExecuteSpecialPricingConditionsDirectoryEntryRequest;
import org.museframework.bian.spepricon.dto.ExecuteSpecialPricingConditionsDirectoryEntryResponse;
import org.museframework.bian.spepricon.dto.InitiateSpecialPricingConditionsDirectoryEntryRequest;
import org.museframework.bian.spepricon.dto.InitiateSpecialPricingConditionsDirectoryEntryResponse;
import org.museframework.bian.spepricon.dto.RequestSpecialPricingConditionsDirectoryEntryRequest;
import org.museframework.bian.spepricon.dto.RequestSpecialPricingConditionsDirectoryEntryResponse;
import org.museframework.bian.spepricon.dto.RetrieveSpecialPricingConditionsDirectoryEntryRequest;
import org.museframework.bian.spepricon.dto.RetrieveSpecialPricingConditionsDirectoryEntryResponse;
import org.museframework.bian.spepricon.dto.UpdateSpecialPricingConditionsDirectoryEntryRequest;
import org.museframework.bian.spepricon.dto.UpdateSpecialPricingConditionsDirectoryEntryResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Capture and maintain reference information about some type of entitity  within Special Pricing Conditions.")
@GenericDomain(name="SpecialPricingConditions", group="SpecialPricingConditionsDirectoryEntry")
public interface CrSpecialPricingConditionsDirectoryEntry {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Special Pricing Conditions Directory Entry")
    ControlSpecialPricingConditionsDirectoryEntryResponse controlSpecialPricingConditionsDirectoryEntry(ControlSpecialPricingConditionsDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Special Pricing Conditions Directory Entry processing")
    ExchangeSpecialPricingConditionsDirectoryEntryResponse exchangeSpecialPricingConditionsDirectoryEntry(ExchangeSpecialPricingConditionsDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Special Pricing Conditions Directory Entry")
    ExecuteSpecialPricingConditionsDirectoryEntryResponse executeSpecialPricingConditionsDirectoryEntry(ExecuteSpecialPricingConditionsDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Special Pricing Conditions Directory Entry")
    InitiateSpecialPricingConditionsDirectoryEntryResponse initiateSpecialPricingConditionsDirectoryEntry(InitiateSpecialPricingConditionsDirectoryEntryRequest req);

    @Description("ReCR Retrieve details about any aspect of Special Pricing Conditions Directory Entry")
    RetrieveSpecialPricingConditionsDirectoryEntryResponse retrieveSpecialPricingConditionsDirectoryEntry(RetrieveSpecialPricingConditionsDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Special Pricing Conditions Directory Entry")
    RequestSpecialPricingConditionsDirectoryEntryResponse requestSpecialPricingConditionsDirectoryEntry(RequestSpecialPricingConditionsDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Special Pricing Conditions Directory Entry")
    UpdateSpecialPricingConditionsDirectoryEntryResponse updateSpecialPricingConditionsDirectoryEntry(UpdateSpecialPricingConditionsDirectoryEntryRequest req);
}