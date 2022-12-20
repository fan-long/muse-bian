/*The Trading Counterparty Credit Limit Indicator is one integral indicator that can be included in Trading Counterparty Credit Limit Indicator monitoring */
package org.museframework.bian.crerisope.dto.bq;

public class TradingCounterpartyCreditLimitIndicator {
    /*Reference to Trading Counterparty Credit Limit Indicator*/
    private org.museframework.bian.classes.Object tradingCreditPositionMeasurementReference;

    /*Reference to Trading Counterparty Credit Limit Indicator*/
    private org.museframework.bian.classes.Object tradingCounterpartyCreditLimitIndicatorReference;

    /*The type of Trading Counterparty Credit Limit Indicator*/
    private String tradingCounterpartyCreditLimitIndicatorType;

    /*The Trading Counterparty Credit Limit Indicator specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The operating unit/employee responsible for monitoring Trading Counterparty Credit Limit Indicator by applying the Trading Counterparty Credit Limit Indicator indicator*/
    private String businessUnitEmployeeReference;

    /*The completion status once Trading Counterparty Credit Limit Indicator has been monitored by applying the Trading Counterparty Credit Limit Indicator indicator*/
    private org.museframework.bian.classes.Condition postconditions;

    /*The required status/situation before Trading Counterparty Credit Limit Indicator can be monitored by applying the Trading Counterparty Credit Limit Indicator indicator*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in monitoring Trading Counterparty Credit Limit Indicator by applying the Trading Counterparty Credit Limit Indicator indicator*/
    private String schedule;

    public void setTradingCreditPositionMeasurementReference(org.museframework.bian.classes.Object tradingCreditPositionMeasurementReference) {
        this.tradingCreditPositionMeasurementReference = tradingCreditPositionMeasurementReference;
    }

    public org.museframework.bian.classes.Object getTradingCreditPositionMeasurementReference() {
        return tradingCreditPositionMeasurementReference;
    }

    public void setTradingCounterpartyCreditLimitIndicatorReference(org.museframework.bian.classes.Object tradingCounterpartyCreditLimitIndicatorReference) {
        this.tradingCounterpartyCreditLimitIndicatorReference = tradingCounterpartyCreditLimitIndicatorReference;
    }

    public org.museframework.bian.classes.Object getTradingCounterpartyCreditLimitIndicatorReference() {
        return tradingCounterpartyCreditLimitIndicatorReference;
    }

    public void setTradingCounterpartyCreditLimitIndicatorType(String tradingCounterpartyCreditLimitIndicatorType) {
        this.tradingCounterpartyCreditLimitIndicatorType = tradingCounterpartyCreditLimitIndicatorType;
    }

    public String getTradingCounterpartyCreditLimitIndicatorType() {
        return tradingCounterpartyCreditLimitIndicatorType;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setBusinessUnitEmployeeReference(String businessUnitEmployeeReference) {
        this.businessUnitEmployeeReference = businessUnitEmployeeReference;
    }

    public String getBusinessUnitEmployeeReference() {
        return businessUnitEmployeeReference;
    }

    public void setPostconditions(org.museframework.bian.classes.Condition postconditions) {
        this.postconditions = postconditions;
    }

    public org.museframework.bian.classes.Condition getPostconditions() {
        return postconditions;
    }

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }
}