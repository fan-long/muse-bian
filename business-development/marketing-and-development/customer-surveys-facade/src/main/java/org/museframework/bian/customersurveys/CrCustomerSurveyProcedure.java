package org.museframework.bian.customersurveys;

import org.museframework.bian.customersurveys.dto.InitiateCustomerSurveyProcedureRequest;
import org.museframework.bian.customersurveys.dto.InitiateCustomerSurveyProcedureResponse;
import org.museframework.bian.customersurveys.dto.RequestCustomerSurveyProcedureRequest;
import org.museframework.bian.customersurveys.dto.RequestCustomerSurveyProcedureResponse;
import org.museframework.bian.customersurveys.dto.RetrieveCustomerSurveyProcedureRequest;
import org.museframework.bian.customersurveys.dto.RetrieveCustomerSurveyProcedureResponse;
import org.museframework.bian.customersurveys.dto.UpdateCustomerSurveyProcedureRequest;
import org.museframework.bian.customersurveys.dto.UpdateCustomerSurveyProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Customer Surveys. ")
@GenericDomain(name="CustomerSurveys", group="CustomerSurveyProcedure")
public interface CrCustomerSurveyProcedure {
    @GenericDtxEndpoint
    @Description("InCR Initiate customer survey processing")
    InitiateCustomerSurveyProcedureResponse initiateCustomerSurveyProcedure(InitiateCustomerSurveyProcedureRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of an active customer survey process")
    UpdateCustomerSurveyProcedureResponse updateCustomerSurveyProcedure(UpdateCustomerSurveyProcedureRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention to the survey process")
    RequestCustomerSurveyProcedureResponse requestCustomerSurveyProcedure(RequestCustomerSurveyProcedureRequest req);

    @Description("ReCR Retrieve details about a customer survey process")
    RetrieveCustomerSurveyProcedureResponse retrieveCustomerSurveyProcedure(RetrieveCustomerSurveyProcedureRequest req);
}