package org.museframework.bian.hedfunadm;

import org.museframework.bian.hedfunadm.dto.ExchangeFundEnrolmentCertificationRoutineRequest;
import org.museframework.bian.hedfunadm.dto.ExchangeFundEnrolmentCertificationRoutineResponse;
import org.museframework.bian.hedfunadm.dto.GrantFundEnrolmentCertificationRoutineRequest;
import org.museframework.bian.hedfunadm.dto.GrantFundEnrolmentCertificationRoutineResponse;
import org.museframework.bian.hedfunadm.dto.NotifyFundEnrolmentCertificationRoutineRequest;
import org.museframework.bian.hedfunadm.dto.NotifyFundEnrolmentCertificationRoutineResponse;
import org.museframework.bian.hedfunadm.dto.RequestFundEnrolmentCertificationRoutineRequest;
import org.museframework.bian.hedfunadm.dto.RequestFundEnrolmentCertificationRoutineResponse;
import org.museframework.bian.hedfunadm.dto.RetrieveFundEnrolmentCertificationRoutineRequest;
import org.museframework.bian.hedfunadm.dto.RetrieveFundEnrolmentCertificationRoutineResponse;
import org.museframework.bian.hedfunadm.dto.UpdateFundEnrolmentCertificationRoutineRequest;
import org.museframework.bian.hedfunadm.dto.UpdateFundEnrolmentCertificationRoutineResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Fund Inflows and Outflow Routine is an activity that is performed as one aspect of carrying out the Fund Inflows and Outflow Routine")
@GenericDomain(name="HedgeFundAdministration", group="FundEnrolmentCertificationRoutine")
public interface BqFundEnrolmentCertificationRoutine {
    @GenericDtxEndpoint
    @Description("Exchange Fund Enrolment Certification Routine")
    ExchangeFundEnrolmentCertificationRoutineResponse exchangeFundEnrolmentCertificationRoutine(ExchangeFundEnrolmentCertificationRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Grant Fund Enrolment Certification Routine")
    GrantFundEnrolmentCertificationRoutineResponse grantFundEnrolmentCertificationRoutine(GrantFundEnrolmentCertificationRoutineRequest req);

    @Description("Notify Fund Enrolment Certification Routine")
    NotifyFundEnrolmentCertificationRoutineResponse notifyFundEnrolmentCertificationRoutine(NotifyFundEnrolmentCertificationRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Request Fund Enrolment Certification Routine")
    RequestFundEnrolmentCertificationRoutineResponse requestFundEnrolmentCertificationRoutine(RequestFundEnrolmentCertificationRoutineRequest req);

    @Description("Retrieve Fund Enrolment Certification Routine")
    RetrieveFundEnrolmentCertificationRoutineResponse retrieveFundEnrolmentCertificationRoutine(RetrieveFundEnrolmentCertificationRoutineRequest req);

    @GenericDtxEndpoint
    @Description("Update Fund Enrolment Certification Routine")
    UpdateFundEnrolmentCertificationRoutineResponse updateFundEnrolmentCertificationRoutine(UpdateFundEnrolmentCertificationRoutineRequest req);
}