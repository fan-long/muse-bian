package org.museframework.bian.collections;

import org.museframework.bian.collections.dto.ExchangeDebtFactoringRequest;
import org.museframework.bian.collections.dto.ExchangeDebtFactoringResponse;
import org.museframework.bian.collections.dto.InitiateDebtFactoringRequest;
import org.museframework.bian.collections.dto.InitiateDebtFactoringResponse;
import org.museframework.bian.collections.dto.RetrieveDebtFactoringRequest;
import org.museframework.bian.collections.dto.RetrieveDebtFactoringResponse;
import org.museframework.bian.collections.dto.UpdateDebtFactoringRequest;
import org.museframework.bian.collections.dto.UpdateDebtFactoringResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Collections.  Example: Process the evaluation and completion of customer offers.")
@GenericDomain(name="Collections", group="DebtFactoring")
public interface BqDebtFactoring {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Debt Factoring processing")
    ExchangeDebtFactoringResponse exchangeDebtFactoring(ExchangeDebtFactoringRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Debt Factoring")
    InitiateDebtFactoringResponse initiateDebtFactoring(InitiateDebtFactoringRequest req);

    @Description("ReBQ Retrieve details about any aspect of Debt Factoring")
    RetrieveDebtFactoringResponse retrieveDebtFactoring(RetrieveDebtFactoringRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Debt Factoring")
    UpdateDebtFactoringResponse updateDebtFactoring(UpdateDebtFactoringRequest req);
}