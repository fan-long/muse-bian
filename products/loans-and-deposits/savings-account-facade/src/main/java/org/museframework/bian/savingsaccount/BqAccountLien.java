package org.museframework.bian.savingsaccount;

import org.museframework.bian.savingsaccount.dto.InitiateAccountLienRequest;
import org.museframework.bian.savingsaccount.dto.InitiateAccountLienResponse;
import org.museframework.bian.savingsaccount.dto.RetrieveAccountLienRequest;
import org.museframework.bian.savingsaccount.dto.RetrieveAccountLienResponse;
import org.museframework.bian.savingsaccount.dto.UpdateAccountLienRequest;
import org.museframework.bian.savingsaccount.dto.UpdateAccountLienResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="SavingsAccount", group="AccountLien")
public interface BqAccountLien {
    @GenericDtxEndpoint
    @Description("InBQ Set up an account lien")
    InitiateAccountLienResponse initiateAccountLien(InitiateAccountLienRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of an existing account lien")
    UpdateAccountLienResponse updateAccountLien(UpdateAccountLienRequest req);

    @Description("ReBQ Retrieve details about an account lien")
    RetrieveAccountLienResponse retrieveAccountLien(RetrieveAccountLienRequest req);
}