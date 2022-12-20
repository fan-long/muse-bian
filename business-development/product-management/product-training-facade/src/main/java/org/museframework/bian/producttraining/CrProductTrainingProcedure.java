package org.museframework.bian.producttraining;

import org.museframework.bian.producttraining.dto.ControlProductTrainingProcedureRequest;
import org.museframework.bian.producttraining.dto.ControlProductTrainingProcedureResponse;
import org.museframework.bian.producttraining.dto.ExchangeProductTrainingProcedureRequest;
import org.museframework.bian.producttraining.dto.ExchangeProductTrainingProcedureResponse;
import org.museframework.bian.producttraining.dto.ExecuteProductTrainingProcedureRequest;
import org.museframework.bian.producttraining.dto.ExecuteProductTrainingProcedureResponse;
import org.museframework.bian.producttraining.dto.InitiateProductTrainingProcedureRequest;
import org.museframework.bian.producttraining.dto.InitiateProductTrainingProcedureResponse;
import org.museframework.bian.producttraining.dto.RequestProductTrainingProcedureRequest;
import org.museframework.bian.producttraining.dto.RequestProductTrainingProcedureResponse;
import org.museframework.bian.producttraining.dto.RetrieveProductTrainingProcedureRequest;
import org.museframework.bian.producttraining.dto.RetrieveProductTrainingProcedureResponse;
import org.museframework.bian.producttraining.dto.UpdateProductTrainingProcedureRequest;
import org.museframework.bian.producttraining.dto.UpdateProductTrainingProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Product Training.  Example: Process the evaluation and completion of customer offers.")
@GenericDomain(name="ProductTraining", group="ProductTrainingProcedure")
public interface CrProductTrainingProcedure {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Product Training Procedure")
    ControlProductTrainingProcedureResponse controlProductTrainingProcedure(ControlProductTrainingProcedureRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Product Training Procedure processing")
    ExchangeProductTrainingProcedureResponse exchangeProductTrainingProcedure(ExchangeProductTrainingProcedureRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Product Training Procedure")
    ExecuteProductTrainingProcedureResponse executeProductTrainingProcedure(ExecuteProductTrainingProcedureRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Product Training Procedure")
    InitiateProductTrainingProcedureResponse initiateProductTrainingProcedure(InitiateProductTrainingProcedureRequest req);

    @Description("ReCR Retrieve details about any aspect of Product Training Procedure")
    RetrieveProductTrainingProcedureResponse retrieveProductTrainingProcedure(RetrieveProductTrainingProcedureRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Product Training Procedure")
    RequestProductTrainingProcedureResponse requestProductTrainingProcedure(RequestProductTrainingProcedureRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Product Training Procedure")
    UpdateProductTrainingProcedureResponse updateProductTrainingProcedure(UpdateProductTrainingProcedureRequest req);
}