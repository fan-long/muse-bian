package org.museframework.bian.delacchan;

import org.museframework.bian.delacchan.dto.InitiateDelinquentAccountProcedureRequest;
import org.museframework.bian.delacchan.dto.InitiateDelinquentAccountProcedureResponse;
import org.museframework.bian.delacchan.dto.RetrieveDelinquentAccountProcedureRequest;
import org.museframework.bian.delacchan.dto.RetrieveDelinquentAccountProcedureResponse;
import org.museframework.bian.delacchan.dto.UpdateDelinquentAccountProcedureRequest;
import org.museframework.bian.delacchan.dto.UpdateDelinquentAccountProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Delinquent Account Handling. ")
@GenericDomain(name="DelinquentAccountHandling", group="DelinquentAccountProcedure")
public interface CrDelinquentAccountProcedure {
    @GenericDtxEndpoint
    @Description("InCR Initiate delinquent account processing")
    InitiateDelinquentAccountProcedureResponse initiateDelinquentAccountProcedure(InitiateDelinquentAccountProcedureRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of delinquent account processing")
    UpdateDelinquentAccountProcedureResponse updateDelinquentAccountProcedure(UpdateDelinquentAccountProcedureRequest req);

    @Description("ReCR Retrieve details about a delinquent account procedure")
    RetrieveDelinquentAccountProcedureResponse retrieveDelinquentAccountProcedure(RetrieveDelinquentAccountProcedureRequest req);
}