/*Monitor and define the status/rating of some entity within Credit Risk Operations. */
package org.museframework.bian.crerisope.dto.cr;

public class TradingCreditPositionMeasurement {
    /*A Classification value that distinguishes between states according to the type of business services and/or type of concern defined within Trading Credit Position Measurement*/
    private String tradingCreditPositionMeasurementParameterType;

    /*A selected optional business service as subject matter of Trading Credit Position Measurement*/
    private org.museframework.bian.classes.BusinessService tradingCreditPositionMeasurementSelectedOption;

    /*The type of Trading Credit Position Measurement*/
    private String tradingCreditPositionMeasurementType;

    /*An unique reference to an item or an occurrence of Trading Credit Position Measurement*/
    private org.museframework.bian.classes.Object tradingCreditPositionMeasurementReference;

    /*Documentation of Trading Credit Position Measurement*/
    private String tradingCreditPositionMeasurementDescription;

    /*Timetable to monitor Trading Credit Position Measurement*/
    private String tradingCreditPositionMeasurementSchedule;

    /*The status of Trading Credit Position Measurement*/
    private String tradingCreditPositionMeasurementStatus;

    /*Reference to the log of (usage) ativities/events  of Trading Credit Position Measurement*/
    private org.museframework.bian.classes.Log tradingCreditPositionMeasurementUsageLog;

    /*Reference to the log of (update) ativities/events of Trading Credit Position Measurement*/
    private org.museframework.bian.classes.Log tradingCreditPositionMeasurementUpdateLog;

    /*Reference to the customer who is involved in Trading Credit Position Measurement*/
    private String tradingCreditPositionMeasurementCustomerReference;

    /*Reference to the product which is the subject matter of Trading Credit Position Measurement*/
    private org.museframework.bian.classes.BankingProduct tradingCreditPositionMeasurementProductReference;

    /*The configuration of Trading Credit Position Measurement*/
    private String tradingCreditPositionMeasurementServiceConfiguration;

    /*Reference to Tresholds and Limits for monitoring Trading Credit Position Measurement*/
    private org.museframework.bian.classes.LimitArrangement tradingCreditPositionMeasurementServiceConfigurationTresholdsandLimits;

    /*Reference to Notification Arrangements for monitoring Trading Credit Position Measurement*/
    private org.museframework.bian.classes.Arrangement tradingCreditPositionMeasurementServiceConfigurationNotificationArrangements;

    public void setTradingCreditPositionMeasurementParameterType(String tradingCreditPositionMeasurementParameterType) {
        this.tradingCreditPositionMeasurementParameterType = tradingCreditPositionMeasurementParameterType;
    }

    public String getTradingCreditPositionMeasurementParameterType() {
        return tradingCreditPositionMeasurementParameterType;
    }

    public void setTradingCreditPositionMeasurementSelectedOption(org.museframework.bian.classes.BusinessService tradingCreditPositionMeasurementSelectedOption) {
        this.tradingCreditPositionMeasurementSelectedOption = tradingCreditPositionMeasurementSelectedOption;
    }

    public org.museframework.bian.classes.BusinessService getTradingCreditPositionMeasurementSelectedOption() {
        return tradingCreditPositionMeasurementSelectedOption;
    }

    public void setTradingCreditPositionMeasurementType(String tradingCreditPositionMeasurementType) {
        this.tradingCreditPositionMeasurementType = tradingCreditPositionMeasurementType;
    }

    public String getTradingCreditPositionMeasurementType() {
        return tradingCreditPositionMeasurementType;
    }

    public void setTradingCreditPositionMeasurementReference(org.museframework.bian.classes.Object tradingCreditPositionMeasurementReference) {
        this.tradingCreditPositionMeasurementReference = tradingCreditPositionMeasurementReference;
    }

    public org.museframework.bian.classes.Object getTradingCreditPositionMeasurementReference() {
        return tradingCreditPositionMeasurementReference;
    }

    public void setTradingCreditPositionMeasurementDescription(String tradingCreditPositionMeasurementDescription) {
        this.tradingCreditPositionMeasurementDescription = tradingCreditPositionMeasurementDescription;
    }

    public String getTradingCreditPositionMeasurementDescription() {
        return tradingCreditPositionMeasurementDescription;
    }

    public void setTradingCreditPositionMeasurementSchedule(String tradingCreditPositionMeasurementSchedule) {
        this.tradingCreditPositionMeasurementSchedule = tradingCreditPositionMeasurementSchedule;
    }

    public String getTradingCreditPositionMeasurementSchedule() {
        return tradingCreditPositionMeasurementSchedule;
    }

    public void setTradingCreditPositionMeasurementStatus(String tradingCreditPositionMeasurementStatus) {
        this.tradingCreditPositionMeasurementStatus = tradingCreditPositionMeasurementStatus;
    }

    public String getTradingCreditPositionMeasurementStatus() {
        return tradingCreditPositionMeasurementStatus;
    }

    public void setTradingCreditPositionMeasurementUsageLog(org.museframework.bian.classes.Log tradingCreditPositionMeasurementUsageLog) {
        this.tradingCreditPositionMeasurementUsageLog = tradingCreditPositionMeasurementUsageLog;
    }

    public org.museframework.bian.classes.Log getTradingCreditPositionMeasurementUsageLog() {
        return tradingCreditPositionMeasurementUsageLog;
    }

    public void setTradingCreditPositionMeasurementUpdateLog(org.museframework.bian.classes.Log tradingCreditPositionMeasurementUpdateLog) {
        this.tradingCreditPositionMeasurementUpdateLog = tradingCreditPositionMeasurementUpdateLog;
    }

    public org.museframework.bian.classes.Log getTradingCreditPositionMeasurementUpdateLog() {
        return tradingCreditPositionMeasurementUpdateLog;
    }

    public void setTradingCreditPositionMeasurementCustomerReference(String tradingCreditPositionMeasurementCustomerReference) {
        this.tradingCreditPositionMeasurementCustomerReference = tradingCreditPositionMeasurementCustomerReference;
    }

    public String getTradingCreditPositionMeasurementCustomerReference() {
        return tradingCreditPositionMeasurementCustomerReference;
    }

    public void setTradingCreditPositionMeasurementProductReference(org.museframework.bian.classes.BankingProduct tradingCreditPositionMeasurementProductReference) {
        this.tradingCreditPositionMeasurementProductReference = tradingCreditPositionMeasurementProductReference;
    }

    public org.museframework.bian.classes.BankingProduct getTradingCreditPositionMeasurementProductReference() {
        return tradingCreditPositionMeasurementProductReference;
    }

    public void setTradingCreditPositionMeasurementServiceConfiguration(String tradingCreditPositionMeasurementServiceConfiguration) {
        this.tradingCreditPositionMeasurementServiceConfiguration = tradingCreditPositionMeasurementServiceConfiguration;
    }

    public String getTradingCreditPositionMeasurementServiceConfiguration() {
        return tradingCreditPositionMeasurementServiceConfiguration;
    }

    public void setTradingCreditPositionMeasurementServiceConfigurationTresholdsandLimits(org.museframework.bian.classes.LimitArrangement tradingCreditPositionMeasurementServiceConfigurationTresholdsandLimits) {
        this.tradingCreditPositionMeasurementServiceConfigurationTresholdsandLimits = tradingCreditPositionMeasurementServiceConfigurationTresholdsandLimits;
    }

    public org.museframework.bian.classes.LimitArrangement getTradingCreditPositionMeasurementServiceConfigurationTresholdsandLimits() {
        return tradingCreditPositionMeasurementServiceConfigurationTresholdsandLimits;
    }

    public void setTradingCreditPositionMeasurementServiceConfigurationNotificationArrangements(org.museframework.bian.classes.Arrangement tradingCreditPositionMeasurementServiceConfigurationNotificationArrangements) {
        this.tradingCreditPositionMeasurementServiceConfigurationNotificationArrangements = tradingCreditPositionMeasurementServiceConfigurationNotificationArrangements;
    }

    public org.museframework.bian.classes.Arrangement getTradingCreditPositionMeasurementServiceConfigurationNotificationArrangements() {
        return tradingCreditPositionMeasurementServiceConfigurationNotificationArrangements;
    }
}