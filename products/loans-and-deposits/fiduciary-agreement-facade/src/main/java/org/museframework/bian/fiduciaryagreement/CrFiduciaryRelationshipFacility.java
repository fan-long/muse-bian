package org.museframework.bian.fiduciaryagreement;

import org.museframework.bian.fiduciaryagreement.dto.ControlFiduciaryRelationshipFacilityRequest;
import org.museframework.bian.fiduciaryagreement.dto.ControlFiduciaryRelationshipFacilityResponse;
import org.museframework.bian.fiduciaryagreement.dto.ExchangeFiduciaryRelationshipFacilityRequest;
import org.museframework.bian.fiduciaryagreement.dto.ExchangeFiduciaryRelationshipFacilityResponse;
import org.museframework.bian.fiduciaryagreement.dto.ExecuteFiduciaryRelationshipFacilityRequest;
import org.museframework.bian.fiduciaryagreement.dto.ExecuteFiduciaryRelationshipFacilityResponse;
import org.museframework.bian.fiduciaryagreement.dto.InitiateFiduciaryRelationshipFacilityRequest;
import org.museframework.bian.fiduciaryagreement.dto.InitiateFiduciaryRelationshipFacilityResponse;
import org.museframework.bian.fiduciaryagreement.dto.RequestFiduciaryRelationshipFacilityRequest;
import org.museframework.bian.fiduciaryagreement.dto.RequestFiduciaryRelationshipFacilityResponse;
import org.museframework.bian.fiduciaryagreement.dto.RetrieveFiduciaryRelationshipFacilityRequest;
import org.museframework.bian.fiduciaryagreement.dto.RetrieveFiduciaryRelationshipFacilityResponse;
import org.museframework.bian.fiduciaryagreement.dto.UpdateFiduciaryRelationshipFacilityRequest;
import org.museframework.bian.fiduciaryagreement.dto.UpdateFiduciaryRelationshipFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Fiduciary Agreement.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="FiduciaryAgreement", group="FiduciaryRelationshipFacility")
public interface CrFiduciaryRelationshipFacility {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Fiduciary Relationship Facility")
    ControlFiduciaryRelationshipFacilityResponse controlFiduciaryRelationshipFacility(ControlFiduciaryRelationshipFacilityRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Fiduciary Relationship Facility processing")
    ExchangeFiduciaryRelationshipFacilityResponse exchangeFiduciaryRelationshipFacility(ExchangeFiduciaryRelationshipFacilityRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Fiduciary Relationship Facility")
    ExecuteFiduciaryRelationshipFacilityResponse executeFiduciaryRelationshipFacility(ExecuteFiduciaryRelationshipFacilityRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Fiduciary Relationship Facility")
    InitiateFiduciaryRelationshipFacilityResponse initiateFiduciaryRelationshipFacility(InitiateFiduciaryRelationshipFacilityRequest req);

    @Description("ReCR Retrieve details about any aspect of Fiduciary Relationship Facility")
    RetrieveFiduciaryRelationshipFacilityResponse retrieveFiduciaryRelationshipFacility(RetrieveFiduciaryRelationshipFacilityRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Fiduciary Relationship Facility")
    RequestFiduciaryRelationshipFacilityResponse requestFiduciaryRelationshipFacility(RequestFiduciaryRelationshipFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Fiduciary Relationship Facility")
    UpdateFiduciaryRelationshipFacilityResponse updateFiduciaryRelationshipFacility(UpdateFiduciaryRelationshipFacilityRequest req);
}