/*Handle and assign the day to day activities, capture time, costs and income for an operational unit within Market Information Management. 
*/
package org.museframework.bian.marinfman.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FinancialMarketInformationAdministrativePlan {
    /*Reference to the external sources of financial market information. Can be an ongoing service or some form of report*/
    @MetaField(0)
    private String financialMarketInformationService;

    /*The external agency/source of financial market information*/
    @MetaField(0)
    private String financialMarketInformationProvider;

    /*Defines the scope/content of the financial market information*/
    @MetaField(0)
    private String financialMarketinformationDescription;

    /*Defines the type of information service (e.g. a regular feed, periodic report)*/
    @MetaField(0)
    private String financialMarketInformationServiceType;

    /*Sets out the delivery schedule for content*/
    @MetaField(0)
    private String financialMarketInformationServiceSchedule;

    /*Reference to any agreement covering access to the external service*/
    @MetaField(0)
    private String financialMarketInformationServiceAgreement;

    /*Refers to the consolidated financial market information that is enhanced/improved by the bank for internal reference. This is a collection of different subject areas for which a bank perspective is maintained*/
    @MetaField(0)
    private String financialMarketInformationDatabase;

    /*Refers to a maintained subject area*/
    @MetaField(0)
    private String financialMarketInformationSubjectArea;

    /*A description of the information content of the subject area*/
    @MetaField(0)
    private String financialMarketInformationSubjectAreaDescription;

    /*A record of the update history of the content*/
    @MetaField(0)
    private String financialMarketInformationSubjectAreaUpdateHistory;

    /*The consolidated improved information, includes current and past historical records as necessary*/
    @MetaField(0)
    private String financialMarketInformationSubjectAreaRecord;

    public void setFinancialMarketInformationService(String financialMarketInformationService) {
        this.financialMarketInformationService = financialMarketInformationService;
    }

    public String getFinancialMarketInformationService() {
        return financialMarketInformationService;
    }

    public void setFinancialMarketInformationProvider(String financialMarketInformationProvider) {
        this.financialMarketInformationProvider = financialMarketInformationProvider;
    }

    public String getFinancialMarketInformationProvider() {
        return financialMarketInformationProvider;
    }

    public void setFinancialMarketinformationDescription(String financialMarketinformationDescription) {
        this.financialMarketinformationDescription = financialMarketinformationDescription;
    }

    public String getFinancialMarketinformationDescription() {
        return financialMarketinformationDescription;
    }

    public void setFinancialMarketInformationServiceType(String financialMarketInformationServiceType) {
        this.financialMarketInformationServiceType = financialMarketInformationServiceType;
    }

    public String getFinancialMarketInformationServiceType() {
        return financialMarketInformationServiceType;
    }

    public void setFinancialMarketInformationServiceSchedule(String financialMarketInformationServiceSchedule) {
        this.financialMarketInformationServiceSchedule = financialMarketInformationServiceSchedule;
    }

    public String getFinancialMarketInformationServiceSchedule() {
        return financialMarketInformationServiceSchedule;
    }

    public void setFinancialMarketInformationServiceAgreement(String financialMarketInformationServiceAgreement) {
        this.financialMarketInformationServiceAgreement = financialMarketInformationServiceAgreement;
    }

    public String getFinancialMarketInformationServiceAgreement() {
        return financialMarketInformationServiceAgreement;
    }

    public void setFinancialMarketInformationDatabase(String financialMarketInformationDatabase) {
        this.financialMarketInformationDatabase = financialMarketInformationDatabase;
    }

    public String getFinancialMarketInformationDatabase() {
        return financialMarketInformationDatabase;
    }

    public void setFinancialMarketInformationSubjectArea(String financialMarketInformationSubjectArea) {
        this.financialMarketInformationSubjectArea = financialMarketInformationSubjectArea;
    }

    public String getFinancialMarketInformationSubjectArea() {
        return financialMarketInformationSubjectArea;
    }

    public void setFinancialMarketInformationSubjectAreaDescription(String financialMarketInformationSubjectAreaDescription) {
        this.financialMarketInformationSubjectAreaDescription = financialMarketInformationSubjectAreaDescription;
    }

    public String getFinancialMarketInformationSubjectAreaDescription() {
        return financialMarketInformationSubjectAreaDescription;
    }

    public void setFinancialMarketInformationSubjectAreaUpdateHistory(String financialMarketInformationSubjectAreaUpdateHistory) {
        this.financialMarketInformationSubjectAreaUpdateHistory = financialMarketInformationSubjectAreaUpdateHistory;
    }

    public String getFinancialMarketInformationSubjectAreaUpdateHistory() {
        return financialMarketInformationSubjectAreaUpdateHistory;
    }

    public void setFinancialMarketInformationSubjectAreaRecord(String financialMarketInformationSubjectAreaRecord) {
        this.financialMarketInformationSubjectAreaRecord = financialMarketInformationSubjectAreaRecord;
    }

    public String getFinancialMarketInformationSubjectAreaRecord() {
        return financialMarketInformationSubjectAreaRecord;
    }
}