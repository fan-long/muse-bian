package org.museframework.bian.chequeprocessing;

import org.museframework.bian.chequeprocessing.dto.RetrieveChequeExtractionRequest;
import org.museframework.bian.chequeprocessing.dto.RetrieveChequeExtractionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility  within Cheque Processing.  Example: Operate the bank's internal intranet facility.")
@GenericDomain(name="ChequeProcessing", group="ChequeExtraction")
public interface BqChequeExtraction {
    @Description("ReBQ Retrieve details about any aspect of Cheque Extraction")
    RetrieveChequeExtractionResponse retrieveChequeExtraction(RetrieveChequeExtractionRequest req);
}