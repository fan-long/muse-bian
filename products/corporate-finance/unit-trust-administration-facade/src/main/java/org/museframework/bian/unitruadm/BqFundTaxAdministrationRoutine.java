package org.museframework.bian.unitruadm;

import org.museframework.bian.unitruadm.dto.ExchangeFundTaxAdministrationRoutineRequest;
import org.museframework.bian.unitruadm.dto.ExchangeFundTaxAdministrationRoutineResponse;
import org.museframework.bian.unitruadm.dto.GrantFundTaxAdministrationRoutineRequest;
import org.museframework.bian.unitruadm.dto.GrantFundTaxAdministrationRoutineResponse;
import org.museframework.bian.unitruadm.dto.NotifyFundTaxAdministrationRoutineRequest;
import org.museframework.bian.unitruadm.dto.NotifyFundTaxAdministrationRoutineResponse;
import org.museframework.bian.unitruadm.dto.RequestFundTaxAdministrationRoutineRequest;
import org.museframework.bian.unitruadm.dto.RequestFundTaxAdministrationRoutineResponse;
import org.museframework.bian.unitruadm.dto.RetrieveFundTaxAdministrationRoutineRequest;
import org.museframework.bian.unitruadm.dto.RetrieveFundTaxAdministrationRoutineResponse;
import org.museframework.bian.unitruadm.dto.UpdateFundTaxAdministrationRoutineRequest;
import org.museframework.bian.unitruadm.dto.UpdateFundTaxAdministrationRoutineResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Fund Investor, Middle and Back Office Service Routine is an activity that is performed as one aspect of carrying out the Fund Investor, Middle and Back Office Service Routine")
@GenericDomain(name="UnitTrustAdministration", group="FundTaxAdministrationRoutine")
public interface BqFundTaxAdministrationRoutine {
    @GenericDtxEndpoint
    @Description("Exchange Fund Tax Administration Routine")
    ExchangeFundTaxAdministrationRoutineResponse exchangeFundTaxAdministrationRoutine(ExchangeFundTaxAdministrationRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Grant Fund Tax Administration Routine")
    GrantFundTaxAdministrationRoutineResponse grantFundTaxAdministrationRoutine(GrantFundTaxAdministrationRoutineRequest req);

    @Description("Notify Fund Tax Administration Routine")
    NotifyFundTaxAdministrationRoutineResponse notifyFundTaxAdministrationRoutine(NotifyFundTaxAdministrationRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Request Fund Tax Administration Routine")
    RequestFundTaxAdministrationRoutineResponse requestFundTaxAdministrationRoutine(RequestFundTaxAdministrationRoutineRequest req);

    @Description("Retrieve Fund Tax Administration Routine")
    RetrieveFundTaxAdministrationRoutineResponse retrieveFundTaxAdministrationRoutine(RetrieveFundTaxAdministrationRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Update Fund Tax Administration Routine")
    UpdateFundTaxAdministrationRoutineResponse updateFundTaxAdministrationRoutine(UpdateFundTaxAdministrationRoutineRequest req);
}