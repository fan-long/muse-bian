package org.museframework.bian.salesproduct;

import org.museframework.bian.salesproduct.dto.EvaluateOperationalTermRequest;
import org.museframework.bian.salesproduct.dto.EvaluateOperationalTermResponse;
import org.museframework.bian.salesproduct.dto.RetrieveOperationalTermRequest;
import org.museframework.bian.salesproduct.dto.RetrieveOperationalTermResponse;
import org.museframework.bian.salesproduct.dto.UpdateOperationalTermRequest;
import org.museframework.bian.salesproduct.dto.UpdateOperationalTermResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of terms (within some jurisdiction) that can be selected and configured to define a contract /agreement  Examples: Required disclosures")
@GenericDomain(name="SalesProduct", group="OperationalTerm")
public interface BqOperationalTerm {
    @GenericDtxEndpoint
    @Description("EvBQ Set up specific operational arrangements under the agreement")
    EvaluateOperationalTermResponse evaluateOperationalTerm(EvaluateOperationalTermRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of an operational term arrangement")
    UpdateOperationalTermResponse updateOperationalTerm(UpdateOperationalTermRequest req);

    @Description("ReBQ Retrieve details about an individual arrangement")
    RetrieveOperationalTermResponse retrieveOperationalTerm(RetrieveOperationalTermRequest req);
}