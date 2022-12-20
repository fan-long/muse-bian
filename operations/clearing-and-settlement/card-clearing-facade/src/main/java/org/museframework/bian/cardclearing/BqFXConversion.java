package org.museframework.bian.cardclearing;

import org.museframework.bian.cardclearing.dto.RetrieveFXConversionRequest;
import org.museframework.bian.cardclearing.dto.RetrieveFXConversionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CardClearing", group="FXConversion")
public interface BqFXConversion {
    @Description("ReBQ Retrieve details about card transaction FX conversion|")
    RetrieveFXConversionResponse retrieveFXConversion(RetrieveFXConversionRequest req);
}