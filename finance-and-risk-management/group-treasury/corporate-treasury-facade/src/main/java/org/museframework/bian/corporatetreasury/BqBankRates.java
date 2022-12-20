package org.museframework.bian.corporatetreasury;

import org.museframework.bian.corporatetreasury.dto.RetrieveBankRatesRequest;
import org.museframework.bian.corporatetreasury.dto.RetrieveBankRatesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more responsibilities or tasks under management  Examples: Relationship development, Troubleshooting")
@GenericDomain(name="CorporateTreasury", group="BankRates")
public interface BqBankRates {
    @Description("ReBQ Retrieve bank rate table and details")
    RetrieveBankRatesResponse retrieveBankRates(RetrieveBankRatesRequest req);
}