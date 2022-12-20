package org.museframework.bian.bracurdis;

import org.museframework.bian.bracurdis.dto.ControlCashDistributionProcedureRequest;
import org.museframework.bian.bracurdis.dto.ControlCashDistributionProcedureResponse;
import org.museframework.bian.bracurdis.dto.ExchangeCashDistributionProcedureRequest;
import org.museframework.bian.bracurdis.dto.ExchangeCashDistributionProcedureResponse;
import org.museframework.bian.bracurdis.dto.ExecuteCashDistributionProcedureRequest;
import org.museframework.bian.bracurdis.dto.ExecuteCashDistributionProcedureResponse;
import org.museframework.bian.bracurdis.dto.InitiateCashDistributionProcedureRequest;
import org.museframework.bian.bracurdis.dto.InitiateCashDistributionProcedureResponse;
import org.museframework.bian.bracurdis.dto.RequestCashDistributionProcedureRequest;
import org.museframework.bian.bracurdis.dto.RequestCashDistributionProcedureResponse;
import org.museframework.bian.bracurdis.dto.RetrieveCashDistributionProcedureRequest;
import org.museframework.bian.bracurdis.dto.RetrieveCashDistributionProcedureResponse;
import org.museframework.bian.bracurdis.dto.UpdateCashDistributionProcedureRequest;
import org.museframework.bian.bracurdis.dto.UpdateCashDistributionProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Branch Currency Distribution.  Example: Process the evaluation and completion of customer offers.")
@GenericDomain(name="BranchCurrencyDistribution", group="CashDistributionProcedure")
public interface CrCashDistributionProcedure {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Cash Distribution Procedure")
    ControlCashDistributionProcedureResponse controlCashDistributionProcedure(ControlCashDistributionProcedureRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Cash Distribution Procedure processing")
    ExchangeCashDistributionProcedureResponse exchangeCashDistributionProcedure(ExchangeCashDistributionProcedureRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Cash Distribution Procedure")
    ExecuteCashDistributionProcedureResponse executeCashDistributionProcedure(ExecuteCashDistributionProcedureRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Cash Distribution Procedure")
    InitiateCashDistributionProcedureResponse initiateCashDistributionProcedure(InitiateCashDistributionProcedureRequest req);

    @Description("ReCR Retrieve details about any aspect of Cash Distribution Procedure")
    RetrieveCashDistributionProcedureResponse retrieveCashDistributionProcedure(RetrieveCashDistributionProcedureRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Cash Distribution Procedure")
    RequestCashDistributionProcedureResponse requestCashDistributionProcedure(RequestCashDistributionProcedureRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Cash Distribution Procedure")
    UpdateCashDistributionProcedureResponse updateCashDistributionProcedure(UpdateCashDistributionProcedureRequest req);
}