package org.museframework.bian.corcuracc;

import org.museframework.bian.corcuracc.dto.InitiateAccountLienRequest;
import org.museframework.bian.corcuracc.dto.InitiateAccountLienResponse;
import org.museframework.bian.corcuracc.dto.RetrieveAccountLienRequest;
import org.museframework.bian.corcuracc.dto.RetrieveAccountLienResponse;
import org.museframework.bian.corcuracc.dto.UpdateAccountLienRequest;
import org.museframework.bian.corcuracc.dto.UpdateAccountLienResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CorporateCurrentAccount", group="AccountLien")
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