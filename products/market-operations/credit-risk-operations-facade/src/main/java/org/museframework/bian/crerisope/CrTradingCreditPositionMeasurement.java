package org.museframework.bian.crerisope;

import org.museframework.bian.crerisope.dto.ControlTradingCreditPositionMeasurementRequest;
import org.museframework.bian.crerisope.dto.ControlTradingCreditPositionMeasurementResponse;
import org.museframework.bian.crerisope.dto.EvaluateTradingCreditPositionMeasurementRequest;
import org.museframework.bian.crerisope.dto.EvaluateTradingCreditPositionMeasurementResponse;
import org.museframework.bian.crerisope.dto.ExecuteTradingCreditPositionMeasurementRequest;
import org.museframework.bian.crerisope.dto.ExecuteTradingCreditPositionMeasurementResponse;
import org.museframework.bian.crerisope.dto.NotifyTradingCreditPositionMeasurementRequest;
import org.museframework.bian.crerisope.dto.NotifyTradingCreditPositionMeasurementResponse;
import org.museframework.bian.crerisope.dto.RequestTradingCreditPositionMeasurementRequest;
import org.museframework.bian.crerisope.dto.RequestTradingCreditPositionMeasurementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Monitor and define the status/rating of some entity within Credit Risk Operations. ")
@GenericDomain(name="CreditRiskOperations", group="TradingCreditPositionMeasurement")
public interface CrTradingCreditPositionMeasurement {
    @GenericDtxEndpoint
    @Description("Control Trading Credit Position Measurement")
    ControlTradingCreditPositionMeasurementResponse controlTradingCreditPositionMeasurement(ControlTradingCreditPositionMeasurementRequest req);

    @GenericDtxEndpoint
    @Description("Evaluate Trading Credit Position Measurement")
    EvaluateTradingCreditPositionMeasurementResponse evaluateTradingCreditPositionMeasurement(EvaluateTradingCreditPositionMeasurementRequest req);

    @GenericDtxEndpoint
    @Description("Execute Trading Credit Position Measurement")
    ExecuteTradingCreditPositionMeasurementResponse executeTradingCreditPositionMeasurement(ExecuteTradingCreditPositionMeasurementRequest req);

    @Description("Notify Trading Credit Position Measurement")
    NotifyTradingCreditPositionMeasurementResponse notifyTradingCreditPositionMeasurement(NotifyTradingCreditPositionMeasurementRequest req);

    @GenericDtxEndpoint
    @Description("Request Trading Credit Position Measurement")
    RequestTradingCreditPositionMeasurementResponse requestTradingCreditPositionMeasurement(RequestTradingCreditPositionMeasurementRequest req);
}