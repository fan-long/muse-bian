package org.museframework.bian.casmanandaccser;

import org.museframework.bian.casmanandaccser.dto.InitiateCashManagementAndAccountServicesFacilityRequest;
import org.museframework.bian.casmanandaccser.dto.InitiateCashManagementAndAccountServicesFacilityResponse;
import org.museframework.bian.casmanandaccser.dto.RetrieveCashManagementAndAccountServicesFacilityRequest;
import org.museframework.bian.casmanandaccser.dto.RetrieveCashManagementAndAccountServicesFacilityResponse;
import org.museframework.bian.casmanandaccser.dto.UpdateCashManagementAndAccountServicesFacilityRequest;
import org.museframework.bian.casmanandaccser.dto.UpdateCashManagementAndAccountServicesFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Cash Management And Account Services. ")
@GenericDomain(name="CashManagementAndAccountServices", group="CashManagementAndAccountServicesFacility")
public interface CrCashManagementAndAccountServicesFacility {
    @GenericDtxEndpoint
    @Description("InCR Initiate a new cash management and accounting services account")
    InitiateCashManagementAndAccountServicesFacilityResponse initiateCashManagementAndAccountServicesFacility(InitiateCashManagementAndAccountServicesFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update properties of an active cash management and accounting services account")
    UpdateCashManagementAndAccountServicesFacilityResponse updateCashManagementAndAccountServicesFacility(UpdateCashManagementAndAccountServicesFacilityRequest req);

    @Description("ReCR Retrieve information about a cash management and accounting services account - either standard canned reports or selected instance attribute values")
    RetrieveCashManagementAndAccountServicesFacilityResponse retrieveCashManagementAndAccountServicesFacility(RetrieveCashManagementAndAccountServicesFacilityRequest req);
}