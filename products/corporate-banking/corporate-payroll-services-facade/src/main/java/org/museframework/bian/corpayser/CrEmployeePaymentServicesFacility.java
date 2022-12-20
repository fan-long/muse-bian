package org.museframework.bian.corpayser;

import org.museframework.bian.corpayser.dto.ControlEmployeePaymentServicesFacilityRequest;
import org.museframework.bian.corpayser.dto.ControlEmployeePaymentServicesFacilityResponse;
import org.museframework.bian.corpayser.dto.ExchangeEmployeePaymentServicesFacilityRequest;
import org.museframework.bian.corpayser.dto.ExchangeEmployeePaymentServicesFacilityResponse;
import org.museframework.bian.corpayser.dto.ExecuteEmployeePaymentServicesFacilityRequest;
import org.museframework.bian.corpayser.dto.ExecuteEmployeePaymentServicesFacilityResponse;
import org.museframework.bian.corpayser.dto.InitiateEmployeePaymentServicesFacilityRequest;
import org.museframework.bian.corpayser.dto.InitiateEmployeePaymentServicesFacilityResponse;
import org.museframework.bian.corpayser.dto.NotifyEmployeePaymentServicesFacilityRequest;
import org.museframework.bian.corpayser.dto.NotifyEmployeePaymentServicesFacilityResponse;
import org.museframework.bian.corpayser.dto.RequestEmployeePaymentServicesFacilityRequest;
import org.museframework.bian.corpayser.dto.RequestEmployeePaymentServicesFacilityResponse;
import org.museframework.bian.corpayser.dto.RetrieveEmployeePaymentServicesFacilityRequest;
import org.museframework.bian.corpayser.dto.RetrieveEmployeePaymentServicesFacilityResponse;
import org.museframework.bian.corpayser.dto.UpdateEmployeePaymentServicesFacilityRequest;
import org.museframework.bian.corpayser.dto.UpdateEmployeePaymentServicesFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Corporate Payroll Services. ")
@GenericDomain(name="CorporatePayrollServices", group="EmployeePaymentServicesFacility")
public interface CrEmployeePaymentServicesFacility {
    @GenericDtxEndpoint
    @Description("Control Employee Payment Services Facility")
    ControlEmployeePaymentServicesFacilityResponse controlEmployeePaymentServicesFacility(ControlEmployeePaymentServicesFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Employee Payment Services Facility")
    ExchangeEmployeePaymentServicesFacilityResponse exchangeEmployeePaymentServicesFacility(ExchangeEmployeePaymentServicesFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Execute Employee Payment Services Facility")
    ExecuteEmployeePaymentServicesFacilityResponse executeEmployeePaymentServicesFacility(ExecuteEmployeePaymentServicesFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Employee Payment Services Facility")
    InitiateEmployeePaymentServicesFacilityResponse initiateEmployeePaymentServicesFacility(InitiateEmployeePaymentServicesFacilityRequest req);

    @Description("Notify Employee Payment Services Facility")
    NotifyEmployeePaymentServicesFacilityResponse notifyEmployeePaymentServicesFacility(NotifyEmployeePaymentServicesFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Request Employee Payment Services Facility")
    RequestEmployeePaymentServicesFacilityResponse requestEmployeePaymentServicesFacility(RequestEmployeePaymentServicesFacilityRequest req);

    @Description("Retrieve Employee Payment Services Facility")
    RetrieveEmployeePaymentServicesFacilityResponse retrieveEmployeePaymentServicesFacility(RetrieveEmployeePaymentServicesFacilityRequest req);

    @GenericDtxEndpoint
    @Description("Update Employee Payment Services Facility")
    UpdateEmployeePaymentServicesFacilityResponse updateEmployeePaymentServicesFacility(UpdateEmployeePaymentServicesFacilityRequest req);
}