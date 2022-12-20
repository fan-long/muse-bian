package org.museframework.bian.hedfunadm;

import org.museframework.bian.hedfunadm.dto.ExchangeFundTaxAdministrationRoutineRequest;
import org.museframework.bian.hedfunadm.dto.ExchangeFundTaxAdministrationRoutineResponse;
import org.museframework.bian.hedfunadm.dto.GrantFundTaxAdministrationRoutineRequest;
import org.museframework.bian.hedfunadm.dto.GrantFundTaxAdministrationRoutineResponse;
import org.museframework.bian.hedfunadm.dto.NotifyFundTaxAdministrationRoutineRequest;
import org.museframework.bian.hedfunadm.dto.NotifyFundTaxAdministrationRoutineResponse;
import org.museframework.bian.hedfunadm.dto.RequestFundTaxAdministrationRoutineRequest;
import org.museframework.bian.hedfunadm.dto.RequestFundTaxAdministrationRoutineResponse;
import org.museframework.bian.hedfunadm.dto.RetrieveFundTaxAdministrationRoutineRequest;
import org.museframework.bian.hedfunadm.dto.RetrieveFundTaxAdministrationRoutineResponse;
import org.museframework.bian.hedfunadm.dto.UpdateFundTaxAdministrationRoutineRequest;
import org.museframework.bian.hedfunadm.dto.UpdateFundTaxAdministrationRoutineResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Fund Inflows and Outflow Routine is an activity that is performed as one aspect of carrying out the Fund Inflows and Outflow Routine")
@GenericDomain(name="HedgeFundAdministration", group="FundTaxAdministrationRoutine")
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