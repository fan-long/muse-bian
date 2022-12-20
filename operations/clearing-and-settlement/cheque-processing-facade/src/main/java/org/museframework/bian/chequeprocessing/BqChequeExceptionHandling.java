package org.museframework.bian.chequeprocessing;

import org.museframework.bian.chequeprocessing.dto.RetrieveChequeExceptionHandlingRequest;
import org.museframework.bian.chequeprocessing.dto.RetrieveChequeExceptionHandlingResponse;
import org.museframework.bian.chequeprocessing.dto.UpdateChequeExceptionHandlingRequest;
import org.museframework.bian.chequeprocessing.dto.UpdateChequeExceptionHandlingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility  within Cheque Processing.  Example: Operate the bank's internal intranet facility.")
@GenericDomain(name="ChequeProcessing", group="ChequeExceptionHandling")
public interface BqChequeExceptionHandling {
    @Description("Retrieve details about Cancelled Cheque Handling")
    RetrieveChequeExceptionHandlingResponse retrieveChequeExceptionHandling(RetrieveChequeExceptionHandlingRequest req);

    @GenericDtxEndpoint
    @Description("Update details of Cancelled Cheque Handling")
    UpdateChequeExceptionHandlingResponse updateChequeExceptionHandling(UpdateChequeExceptionHandlingRequest req);
}