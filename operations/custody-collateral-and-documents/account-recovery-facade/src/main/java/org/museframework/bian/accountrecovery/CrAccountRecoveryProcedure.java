package org.museframework.bian.accountrecovery;

import org.museframework.bian.accountrecovery.dto.InitiateAccountRecoveryProcedureRequest;
import org.museframework.bian.accountrecovery.dto.InitiateAccountRecoveryProcedureResponse;
import org.museframework.bian.accountrecovery.dto.RetrieveAccountRecoveryProcedureRequest;
import org.museframework.bian.accountrecovery.dto.RetrieveAccountRecoveryProcedureResponse;
import org.museframework.bian.accountrecovery.dto.UpdateAccountRecoveryProcedureRequest;
import org.museframework.bian.accountrecovery.dto.UpdateAccountRecoveryProcedureResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Account Recovery. ")
@GenericDomain(name="AccountRecovery", group="AccountRecoveryProcedure")
public interface CrAccountRecoveryProcedure {
    @GenericDtxEndpoint
    @Description("InCR Initiate the account recovery procedure")
    InitiateAccountRecoveryProcedureResponse initiateAccountRecoveryProcedure(InitiateAccountRecoveryProcedureRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of an active account recovery case")
    UpdateAccountRecoveryProcedureResponse updateAccountRecoveryProcedure(UpdateAccountRecoveryProcedureRequest req);

    @Description("ReCR Retrieve details about an active account recovery case")
    RetrieveAccountRecoveryProcedureResponse retrieveAccountRecoveryProcedure(RetrieveAccountRecoveryProcedureRequest req);
}