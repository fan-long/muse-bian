package org.museframework.bian.regandlegaut;

import org.museframework.bian.regandlegaut.dto.InitiateEstablishRelationsRequest;
import org.museframework.bian.regandlegaut.dto.InitiateEstablishRelationsResponse;
import org.museframework.bian.regandlegaut.dto.RequestEstablishRelationsRequest;
import org.museframework.bian.regandlegaut.dto.RequestEstablishRelationsResponse;
import org.museframework.bian.regandlegaut.dto.RetrieveEstablishRelationsRequest;
import org.museframework.bian.regandlegaut.dto.RetrieveEstablishRelationsResponse;
import org.museframework.bian.regandlegaut.dto.UpdateEstablishRelationsRequest;
import org.museframework.bian.regandlegaut.dto.UpdateEstablishRelationsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues  within Regulatory & Legal Authority. Example: Manage the day to day activities at a bank branch location.")
@GenericDomain(name="RegulatoryAndLegalAuthority", group="EstablishRelations")
public interface BqEstablishRelations {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Establish Relations")
    InitiateEstablishRelationsResponse initiateEstablishRelations(InitiateEstablishRelationsRequest req);

    @Description("ReBQ Retrieve details about any aspect of Establish Relations")
    RetrieveEstablishRelationsResponse retrieveEstablishRelations(RetrieveEstablishRelationsRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Establish Relations")
    RequestEstablishRelationsResponse requestEstablishRelations(RequestEstablishRelationsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Establish Relations")
    UpdateEstablishRelationsResponse updateEstablishRelations(UpdateEstablishRelationsRequest req);
}