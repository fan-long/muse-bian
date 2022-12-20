package org.museframework.bian.mutfunadm;

import org.museframework.bian.mutfunadm.dto.ControlMutualFundAdministrativePlanRequest;
import org.museframework.bian.mutfunadm.dto.ControlMutualFundAdministrativePlanResponse;
import org.museframework.bian.mutfunadm.dto.CreateMutualFundAdministrativePlanRequest;
import org.museframework.bian.mutfunadm.dto.CreateMutualFundAdministrativePlanResponse;
import org.museframework.bian.mutfunadm.dto.ExchangeMutualFundAdministrativePlanRequest;
import org.museframework.bian.mutfunadm.dto.ExchangeMutualFundAdministrativePlanResponse;
import org.museframework.bian.mutfunadm.dto.GrantMutualFundAdministrativePlanRequest;
import org.museframework.bian.mutfunadm.dto.GrantMutualFundAdministrativePlanResponse;
import org.museframework.bian.mutfunadm.dto.NotifyMutualFundAdministrativePlanRequest;
import org.museframework.bian.mutfunadm.dto.NotifyMutualFundAdministrativePlanResponse;
import org.museframework.bian.mutfunadm.dto.RequestMutualFundAdministrativePlanRequest;
import org.museframework.bian.mutfunadm.dto.RequestMutualFundAdministrativePlanResponse;
import org.museframework.bian.mutfunadm.dto.RetrieveMutualFundAdministrativePlanRequest;
import org.museframework.bian.mutfunadm.dto.RetrieveMutualFundAdministrativePlanResponse;
import org.museframework.bian.mutfunadm.dto.UpdateMutualFundAdministrativePlanRequest;
import org.museframework.bian.mutfunadm.dto.UpdateMutualFundAdministrativePlanResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit within Mutual Fund Administration. ")
@GenericDomain(name="MutualFundAdministration", group="MutualFundAdministrativePlan")
public interface CrMutualFundAdministrativePlan {
    @GenericDtxEndpoint
    @Description("Control Mutual Fund Administrative Plan")
    ControlMutualFundAdministrativePlanResponse controlMutualFundAdministrativePlan(ControlMutualFundAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Create Mutual Fund Administrative Plan")
    CreateMutualFundAdministrativePlanResponse createMutualFundAdministrativePlan(CreateMutualFundAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Mutual Fund Administrative Plan")
    ExchangeMutualFundAdministrativePlanResponse exchangeMutualFundAdministrativePlan(ExchangeMutualFundAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Grant Mutual Fund Administrative Plan")
    GrantMutualFundAdministrativePlanResponse grantMutualFundAdministrativePlan(GrantMutualFundAdministrativePlanRequest req);

    @Description("Notify Mutual Fund Administrative Plan")
    NotifyMutualFundAdministrativePlanResponse notifyMutualFundAdministrativePlan(NotifyMutualFundAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Request Mutual Fund Administrative Plan")
    RequestMutualFundAdministrativePlanResponse requestMutualFundAdministrativePlan(RequestMutualFundAdministrativePlanRequest req);

    @Description("Retrieve Mutual Fund Administrative Plan")
    RetrieveMutualFundAdministrativePlanResponse retrieveMutualFundAdministrativePlan(RetrieveMutualFundAdministrativePlanRequest req);

    @GenericDtxEndpoint
    @Description("Update Mutual Fund Administrative Plan")
    UpdateMutualFundAdministrativePlanResponse updateMutualFundAdministrativePlan(UpdateMutualFundAdministrativePlanRequest req);
}