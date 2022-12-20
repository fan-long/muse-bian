package org.museframework.bian.regandlegaut;

import org.museframework.bian.regandlegaut.dto.InitiateMaintainRelationsRequest;
import org.museframework.bian.regandlegaut.dto.InitiateMaintainRelationsResponse;
import org.museframework.bian.regandlegaut.dto.RequestMaintainRelationsRequest;
import org.museframework.bian.regandlegaut.dto.RequestMaintainRelationsResponse;
import org.museframework.bian.regandlegaut.dto.RetrieveMaintainRelationsRequest;
import org.museframework.bian.regandlegaut.dto.RetrieveMaintainRelationsResponse;
import org.museframework.bian.regandlegaut.dto.UpdateMaintainRelationsRequest;
import org.museframework.bian.regandlegaut.dto.UpdateMaintainRelationsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues  within Regulatory & Legal Authority. Example: Manage the day to day activities at a bank branch location.")
@GenericDomain(name="RegulatoryAndLegalAuthority", group="MaintainRelations")
public interface BqMaintainRelations {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Maintain Relations")
    InitiateMaintainRelationsResponse initiateMaintainRelations(InitiateMaintainRelationsRequest req);

    @Description("ReBQ Retrieve details about any aspect of Maintain Relations")
    RetrieveMaintainRelationsResponse retrieveMaintainRelations(RetrieveMaintainRelationsRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Maintain Relations")
    RequestMaintainRelationsResponse requestMaintainRelations(RequestMaintainRelationsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Maintain Relations")
    UpdateMaintainRelationsResponse updateMaintainRelations(UpdateMaintainRelationsRequest req);
}