package org.museframework.bian.unitruadm;

import org.museframework.bian.unitruadm.dto.ControlUnitTrustAdministrativePlanRequest;
import org.museframework.bian.unitruadm.dto.ControlUnitTrustAdministrativePlanResponse;
import org.museframework.bian.unitruadm.dto.CreateUnitTrustAdministrativePlanRequest;
import org.museframework.bian.unitruadm.dto.CreateUnitTrustAdministrativePlanResponse;
import org.museframework.bian.unitruadm.dto.ExchangeUnitTrustAdministrativePlanRequest;
import org.museframework.bian.unitruadm.dto.ExchangeUnitTrustAdministrativePlanResponse;
import org.museframework.bian.unitruadm.dto.GrantUnitTrustAdministrativePlanRequest;
import org.museframework.bian.unitruadm.dto.GrantUnitTrustAdministrativePlanResponse;
import org.museframework.bian.unitruadm.dto.NotifyUnitTrustAdministrativePlanRequest;
import org.museframework.bian.unitruadm.dto.NotifyUnitTrustAdministrativePlanResponse;
import org.museframework.bian.unitruadm.dto.RequestUnitTrustAdministrativePlanRequest;
import org.museframework.bian.unitruadm.dto.RequestUnitTrustAdministrativePlanResponse;
import org.museframework.bian.unitruadm.dto.RetrieveUnitTrustAdministrativePlanRequest;
import org.museframework.bian.unitruadm.dto.RetrieveUnitTrustAdministrativePlanResponse;
import org.museframework.bian.unitruadm.dto.UpdateUnitTrustAdministrativePlanRequest;
import org.museframework.bian.unitruadm.dto.UpdateUnitTrustAdministrativePlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit within Unit Trust Administration. ")
@GenericDomain(name="UnitTrustAdministration", group="UnitTrustAdministrativePlan")
public interface CrUnitTrustAdministrativePlan {
    @GenericDtxEndpoint
    @Description("Control Unit Trust Administrative Plan")
    ControlUnitTrustAdministrativePlanResponse controlUnitTrustAdministrativePlan(ControlUnitTrustAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Create Unit Trust Administrative Plan")
    CreateUnitTrustAdministrativePlanResponse createUnitTrustAdministrativePlan(CreateUnitTrustAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Unit Trust Administrative Plan")
    ExchangeUnitTrustAdministrativePlanResponse exchangeUnitTrustAdministrativePlan(ExchangeUnitTrustAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Grant Unit Trust Administrative Plan")
    GrantUnitTrustAdministrativePlanResponse grantUnitTrustAdministrativePlan(GrantUnitTrustAdministrativePlanRequest req);

    @Description("Notify Unit Trust Administrative Plan")
    NotifyUnitTrustAdministrativePlanResponse notifyUnitTrustAdministrativePlan(NotifyUnitTrustAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Request Unit Trust Administrative Plan")
    RequestUnitTrustAdministrativePlanResponse requestUnitTrustAdministrativePlan(RequestUnitTrustAdministrativePlanRequest req);

    @Description("Retrieve Unit Trust Administrative Plan")
    RetrieveUnitTrustAdministrativePlanResponse retrieveUnitTrustAdministrativePlan(RetrieveUnitTrustAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Update Unit Trust Administrative Plan")
    UpdateUnitTrustAdministrativePlanResponse updateUnitTrustAdministrativePlan(UpdateUnitTrustAdministrativePlanRequest req);
}