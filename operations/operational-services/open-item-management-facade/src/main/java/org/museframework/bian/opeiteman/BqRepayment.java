package org.museframework.bian.opeiteman;

import org.museframework.bian.opeiteman.dto.ExecuteRepaymentRequest;
import org.museframework.bian.opeiteman.dto.ExecuteRepaymentResponse;
import org.museframework.bian.opeiteman.dto.InitiateRepaymentRequest;
import org.museframework.bian.opeiteman.dto.InitiateRepaymentResponse;
import org.museframework.bian.opeiteman.dto.RetrieveRepaymentRequest;
import org.museframework.bian.opeiteman.dto.RetrieveRepaymentResponse;
import org.museframework.bian.opeiteman.dto.UpdateRepaymentRequest;
import org.museframework.bian.opeiteman.dto.UpdateRepaymentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="OpenItemManagement", group="Repayment")
public interface BqRepayment {
    @GenericDtxEndpoint
    @Description("InBQ Initiate repayment transaction against an open item")
    InitiateRepaymentResponse initiateRepayment(InitiateRepaymentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update repayment transaction details")
    UpdateRepaymentResponse updateRepayment(UpdateRepaymentRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated repayment task (e.g. trigger scheduled repayment)")
    ExecuteRepaymentResponse executeRepayment(ExecuteRepaymentRequest req);

    @Description("ReBQ retrieve details about a repayment transaction")
    RetrieveRepaymentResponse retrieveRepayment(RetrieveRepaymentRequest req);
}