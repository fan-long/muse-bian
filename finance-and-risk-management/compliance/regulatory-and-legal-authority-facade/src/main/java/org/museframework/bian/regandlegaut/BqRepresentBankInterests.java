package org.museframework.bian.regandlegaut;

import org.museframework.bian.regandlegaut.dto.InitiateRepresentBankInterestsRequest;
import org.museframework.bian.regandlegaut.dto.InitiateRepresentBankInterestsResponse;
import org.museframework.bian.regandlegaut.dto.RequestRepresentBankInterestsRequest;
import org.museframework.bian.regandlegaut.dto.RequestRepresentBankInterestsResponse;
import org.museframework.bian.regandlegaut.dto.RetrieveRepresentBankInterestsRequest;
import org.museframework.bian.regandlegaut.dto.RetrieveRepresentBankInterestsResponse;
import org.museframework.bian.regandlegaut.dto.UpdateRepresentBankInterestsRequest;
import org.museframework.bian.regandlegaut.dto.UpdateRepresentBankInterestsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues  within Regulatory & Legal Authority. Example: Manage the day to day activities at a bank branch location.")
@GenericDomain(name="RegulatoryAndLegalAuthority", group="RepresentBankInterests")
public interface BqRepresentBankInterests {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Represent Bank Interests")
    InitiateRepresentBankInterestsResponse initiateRepresentBankInterests(InitiateRepresentBankInterestsRequest req);

    @Description("ReBQ Retrieve details about any aspect of Represent Bank Interests")
    RetrieveRepresentBankInterestsResponse retrieveRepresentBankInterests(RetrieveRepresentBankInterestsRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Represent Bank Interests")
    RequestRepresentBankInterestsResponse requestRepresentBankInterests(RequestRepresentBankInterestsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Represent Bank Interests")
    UpdateRepresentBankInterestsResponse updateRepresentBankInterests(UpdateRepresentBankInterestsRequest req);
}