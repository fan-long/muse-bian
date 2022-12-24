/*Operate equipment and/or a largely automated facility  within Cheque Processing. 
Example: Operate the bank's internal intranet facility.*/
package org.museframework.bian.chequeprocessing.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.ChequeProcessingOperatingSession
@MetaDto
public class ChequeProcessingOperatingSession {
    /*The timetable of Cheque Processing Operating Session*/
    @MetaField
    private String chequeProcessingOperatingSessionSchedule;

    /*The status of Cheque Processing Operating Session*/
    @MetaField
    private String chequeProcessingOperatingSessionStatus;

    /*Reference to the log of (usage) ativities/events  of Cheque Processing Operating Session*/
    @MetaField
    private String chequeProcessingOperatingSessionUsageLog;

    /*Reference to the party who is involved in Cheque Processing Operating Session*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object chequeProcessingOperatingSessionReference;

    /*Reference to the party who provides the services of Cheque Processing Operating Session */
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object chequeProcessingOperatingSessionServiceProviderReference;

    /*A Classification value that distinguishes between the type of operations within Cheque Processing Operating Session */
    @MetaField
    private String chequeProcessingOperatingSessionType;

    /*The schedule according to which the service provider will operate the Cheque Processing Operating Session*/
    @MetaField
    private String chequeProcessingOperatingSessionServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services within Cheque Processing Operating Session */
    @MetaField
    private String chequeProcessingOperatingSessionServiceType;

    /*The configuration of Cheque Processing Operating Session*/
    @MetaField
    private String chequeProcessingOperatingSessionServiceConfiguration;

    public void setChequeProcessingOperatingSessionSchedule(String chequeProcessingOperatingSessionSchedule) {
        this.chequeProcessingOperatingSessionSchedule = chequeProcessingOperatingSessionSchedule;
    }

    public String getChequeProcessingOperatingSessionSchedule() {
        return chequeProcessingOperatingSessionSchedule;
    }

    public void setChequeProcessingOperatingSessionStatus(String chequeProcessingOperatingSessionStatus) {
        this.chequeProcessingOperatingSessionStatus = chequeProcessingOperatingSessionStatus;
    }

    public String getChequeProcessingOperatingSessionStatus() {
        return chequeProcessingOperatingSessionStatus;
    }

    public void setChequeProcessingOperatingSessionUsageLog(String chequeProcessingOperatingSessionUsageLog) {
        this.chequeProcessingOperatingSessionUsageLog = chequeProcessingOperatingSessionUsageLog;
    }

    public String getChequeProcessingOperatingSessionUsageLog() {
        return chequeProcessingOperatingSessionUsageLog;
    }

    public void setChequeProcessingOperatingSessionReference(org.museframework.bian.classes.Object chequeProcessingOperatingSessionReference) {
        this.chequeProcessingOperatingSessionReference = chequeProcessingOperatingSessionReference;
    }

    public org.museframework.bian.classes.Object getChequeProcessingOperatingSessionReference() {
        return chequeProcessingOperatingSessionReference;
    }

    public void setChequeProcessingOperatingSessionServiceProviderReference(org.museframework.bian.classes.Object chequeProcessingOperatingSessionServiceProviderReference) {
        this.chequeProcessingOperatingSessionServiceProviderReference = chequeProcessingOperatingSessionServiceProviderReference;
    }

    public org.museframework.bian.classes.Object getChequeProcessingOperatingSessionServiceProviderReference() {
        return chequeProcessingOperatingSessionServiceProviderReference;
    }

    public void setChequeProcessingOperatingSessionType(String chequeProcessingOperatingSessionType) {
        this.chequeProcessingOperatingSessionType = chequeProcessingOperatingSessionType;
    }

    public String getChequeProcessingOperatingSessionType() {
        return chequeProcessingOperatingSessionType;
    }

    public void setChequeProcessingOperatingSessionServiceProviderSchedule(String chequeProcessingOperatingSessionServiceProviderSchedule) {
        this.chequeProcessingOperatingSessionServiceProviderSchedule = chequeProcessingOperatingSessionServiceProviderSchedule;
    }

    public String getChequeProcessingOperatingSessionServiceProviderSchedule() {
        return chequeProcessingOperatingSessionServiceProviderSchedule;
    }

    public void setChequeProcessingOperatingSessionServiceType(String chequeProcessingOperatingSessionServiceType) {
        this.chequeProcessingOperatingSessionServiceType = chequeProcessingOperatingSessionServiceType;
    }

    public String getChequeProcessingOperatingSessionServiceType() {
        return chequeProcessingOperatingSessionServiceType;
    }

    public void setChequeProcessingOperatingSessionServiceConfiguration(String chequeProcessingOperatingSessionServiceConfiguration) {
        this.chequeProcessingOperatingSessionServiceConfiguration = chequeProcessingOperatingSessionServiceConfiguration;
    }

    public String getChequeProcessingOperatingSessionServiceConfiguration() {
        return chequeProcessingOperatingSessionServiceConfiguration;
    }
}