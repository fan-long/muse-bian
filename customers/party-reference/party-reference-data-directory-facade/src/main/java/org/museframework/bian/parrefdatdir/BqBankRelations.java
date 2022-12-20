package org.museframework.bian.parrefdatdir;

import org.museframework.bian.parrefdatdir.dto.RetrieveBankRelationsRequest;
import org.museframework.bian.parrefdatdir.dto.RetrieveBankRelationsResponse;
import org.museframework.bian.parrefdatdir.dto.UpdateBankRelationsRequest;
import org.museframework.bian.parrefdatdir.dto.UpdateBankRelationsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed. Prospect Management")
@GenericDomain(name="PartyReferenceDataDirectory", group="BankRelations")
public interface BqBankRelations {
    @GenericDtxEndpoint
    @Description("UpBQ Update details about a customer's bank relations entry for the customer")
    UpdateBankRelationsResponse updateBankRelations(UpdateBankRelationsRequest req);

    @Description("ReBQ Retrieve details about customer bank relations entries in the directory")
    RetrieveBankRelationsResponse retrieveBankRelations(RetrieveBankRelationsRequest req);
}