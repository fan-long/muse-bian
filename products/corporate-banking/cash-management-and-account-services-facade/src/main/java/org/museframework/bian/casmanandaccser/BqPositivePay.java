package org.museframework.bian.casmanandaccser;

import org.museframework.bian.casmanandaccser.dto.ExchangePositivePayRequest;
import org.museframework.bian.casmanandaccser.dto.ExchangePositivePayResponse;
import org.museframework.bian.casmanandaccser.dto.RetrievePositivePayRequest;
import org.museframework.bian.casmanandaccser.dto.RetrievePositivePayResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CashManagementAndAccountServices", group="PositivePay")
public interface BqPositivePay {
    @GenericDtxEndpoint
    @Description("ExBQ Submit a check register report that the bank uses to check submitted checks")
    ExchangePositivePayResponse exchangePositivePay(ExchangePositivePayRequest req);

    @Description("ReBQ Retrieve details about positive pay check processing")
    RetrievePositivePayResponse retrievePositivePay(RetrievePositivePayRequest req);
}