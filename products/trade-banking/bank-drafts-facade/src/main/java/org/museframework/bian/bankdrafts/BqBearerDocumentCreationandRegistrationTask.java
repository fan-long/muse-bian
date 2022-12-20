package org.museframework.bian.bankdrafts;

import org.museframework.bian.bankdrafts.dto.ExchangeBearerDocumentCreationandRegistrationTaskRequest;
import org.museframework.bian.bankdrafts.dto.ExchangeBearerDocumentCreationandRegistrationTaskResponse;
import org.museframework.bian.bankdrafts.dto.ExecuteBearerDocumentCreationandRegistrationTaskRequest;
import org.museframework.bian.bankdrafts.dto.ExecuteBearerDocumentCreationandRegistrationTaskResponse;
import org.museframework.bian.bankdrafts.dto.InitiateBearerDocumentCreationandRegistrationTaskRequest;
import org.museframework.bian.bankdrafts.dto.InitiateBearerDocumentCreationandRegistrationTaskResponse;
import org.museframework.bian.bankdrafts.dto.NotifyBearerDocumentCreationandRegistrationTaskRequest;
import org.museframework.bian.bankdrafts.dto.NotifyBearerDocumentCreationandRegistrationTaskResponse;
import org.museframework.bian.bankdrafts.dto.RequestBearerDocumentCreationandRegistrationTaskRequest;
import org.museframework.bian.bankdrafts.dto.RequestBearerDocumentCreationandRegistrationTaskResponse;
import org.museframework.bian.bankdrafts.dto.RetrieveBearerDocumentCreationandRegistrationTaskRequest;
import org.museframework.bian.bankdrafts.dto.RetrieveBearerDocumentCreationandRegistrationTaskResponse;
import org.museframework.bian.bankdrafts.dto.UpdateBearerDocumentCreationandRegistrationTaskRequest;
import org.museframework.bian.bankdrafts.dto.UpdateBearerDocumentCreationandRegistrationTaskResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The Customer Payment Task is a discrete action or task that is required in the execution of the Customer Payment Task")
@GenericDomain(name="BankDrafts", group="BearerDocumentCreationandRegistrationTask")
public interface BqBearerDocumentCreationandRegistrationTask {
    @GenericDtxEndpoint
    @Description("Exchange Bearer Document Creation and Registration Task")
    ExchangeBearerDocumentCreationandRegistrationTaskResponse exchangeBearerDocumentCreationandRegistrationTask(ExchangeBearerDocumentCreationandRegistrationTaskRequest req);

    @GenericDtxEndpoint
    @Description("Execute Bearer Document Creation and Registration Task")
    ExecuteBearerDocumentCreationandRegistrationTaskResponse executeBearerDocumentCreationandRegistrationTask(ExecuteBearerDocumentCreationandRegistrationTaskRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Bearer Document Creation and Registration Task")
    InitiateBearerDocumentCreationandRegistrationTaskResponse initiateBearerDocumentCreationandRegistrationTask(InitiateBearerDocumentCreationandRegistrationTaskRequest req);

    @Description("Notify Bearer Document Creation and Registration Task")
    NotifyBearerDocumentCreationandRegistrationTaskResponse notifyBearerDocumentCreationandRegistrationTask(NotifyBearerDocumentCreationandRegistrationTaskRequest req);

    @GenericDtxEndpoint
    @Description("Request Bearer Document Creation and Registration Task")
    RequestBearerDocumentCreationandRegistrationTaskResponse requestBearerDocumentCreationandRegistrationTask(RequestBearerDocumentCreationandRegistrationTaskRequest req);

    @Description("Retrieve Bearer Document Creation and Registration Task")
    RetrieveBearerDocumentCreationandRegistrationTaskResponse retrieveBearerDocumentCreationandRegistrationTask(RetrieveBearerDocumentCreationandRegistrationTaskRequest req);

    @GenericDtxEndpoint
    @Description("Update Bearer Document Creation and Registration Task")
    UpdateBearerDocumentCreationandRegistrationTaskResponse updateBearerDocumentCreationandRegistrationTask(UpdateBearerDocumentCreationandRegistrationTaskRequest req);
}