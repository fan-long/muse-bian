package org.museframework.bian.poiofser;

import org.museframework.bian.poiofser.dto.ExecuteCashPositionRequest;
import org.museframework.bian.poiofser.dto.ExecuteCashPositionResponse;
import org.museframework.bian.poiofser.dto.RetrieveCashPositionRequest;
import org.museframework.bian.poiofser.dto.RetrieveCashPositionResponse;
import org.museframework.bian.poiofser.dto.UpdateCashPositionRequest;
import org.museframework.bian.poiofser.dto.UpdateCashPositionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="PointofService", group="CashPosition")
public interface BqCashPosition {
    @GenericDtxEndpoint
    @Description("UpBQ Update the cash position")
    UpdateCashPositionResponse updateCashPosition(UpdateCashPositionRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute transactions against the cash position")
    ExecuteCashPositionResponse executeCashPosition(ExecuteCashPositionRequest req);

    @Description("ReBQ Retrieve details about the cash inventory")
    RetrieveCashPositionResponse retrieveCashPosition(RetrieveCashPositionRequest req);
}