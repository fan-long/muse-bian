package org.museframework.bian.currentaccount;

import org.museframework.bian.currentaccount.dto.InitiateAccountLienRequest;
import org.museframework.bian.currentaccount.dto.InitiateAccountLienResponse;
import org.museframework.bian.currentaccount.dto.RetrieveAccountLienRequest;
import org.museframework.bian.currentaccount.dto.RetrieveAccountLienResponse;
import org.museframework.bian.currentaccount.dto.UpdateAccountLienRequest;
import org.museframework.bian.currentaccount.dto.UpdateAccountLienResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CurrentAccount", group="AccountLien")
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