package org.museframework.bian.casmanandaccser;

import org.museframework.bian.casmanandaccser.dto.InitiateAccountLienRequest;
import org.museframework.bian.casmanandaccser.dto.InitiateAccountLienResponse;
import org.museframework.bian.casmanandaccser.dto.RetrieveAccountLienRequest;
import org.museframework.bian.casmanandaccser.dto.RetrieveAccountLienResponse;
import org.museframework.bian.casmanandaccser.dto.UpdateAccountLienRequest;
import org.museframework.bian.casmanandaccser.dto.UpdateAccountLienResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CashManagementAndAccountServices", group="AccountLien")
public interface BqAccountLien {
    @GenericDtxEndpoint
    @Description("InBQ Set up an account lien")
    InitiateAccountLienResponse initiateAccountLien(InitiateAccountLienRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of an existing account lien")
    UpdateAccountLienResponse updateAccountLien(UpdateAccountLienRequest req);

    @Description("ReBQ Retrieve details about an active account lien")
    RetrieveAccountLienResponse retrieveAccountLien(RetrieveAccountLienRequest req);
}