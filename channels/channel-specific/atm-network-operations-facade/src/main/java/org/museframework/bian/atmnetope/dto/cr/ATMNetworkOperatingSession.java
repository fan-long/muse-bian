/*Operate equipment and/or a largely automated facility  within ATM Network Operations. 
Example: Operate the bank's internal intranet facility.*/
package org.museframework.bian.atmnetope.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ATMNetworkOperatingSession {
    /*The timetable of ATMNetwork Operating Session*/
    @MetaField(0)
    private String ATMNetworkOperatingSessionSchedule;

    /*The status of ATMNetwork Operating Session*/
    @MetaField(0)
    private String ATMNetworkOperatingSessionStatus;

    /*Reference to the log of (usage) ativities/events  of ATMNetwork Operating Session*/
    @MetaField(0)
    private String ATMNetworkOperatingSessionUsageLog;

    /*Reference to the party who is involved in ATMNetwork Operating Session*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object ATMNetworkOperatingSessionReference;

    /*Reference to the party who provides the services of ATMNetwork Operating Session */
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object ATMNetworkOperatingSessionServiceProviderReference;

    /*A Classification value that distinguishes between the type of operations within ATMNetwork Operating Session */
    @MetaField(0)
    private String ATMNetworkOperatingSessionType;

    /*The schedule according to which the service provider will operate the ATMNetwork Operating Session*/
    @MetaField(0)
    private String ATMNetworkOperatingSessionServiceProviderSchedule;

    /*A Classification value that distinguishes between the type of services within ATMNetwork Operating Session */
    @MetaField(0)
    private String ATMNetworkOperatingSessionServiceType;

    /*The configuration of ATMNetwork Operating Session*/
    @MetaField(0)
    private String ATMNetworkOperatingSessionServiceConfiguration;

    public void setATMNetworkOperatingSessionSchedule(String ATMNetworkOperatingSessionSchedule) {
        this.ATMNetworkOperatingSessionSchedule = ATMNetworkOperatingSessionSchedule;
    }

    public String getATMNetworkOperatingSessionSchedule() {
        return ATMNetworkOperatingSessionSchedule;
    }

    public void setATMNetworkOperatingSessionStatus(String ATMNetworkOperatingSessionStatus) {
        this.ATMNetworkOperatingSessionStatus = ATMNetworkOperatingSessionStatus;
    }

    public String getATMNetworkOperatingSessionStatus() {
        return ATMNetworkOperatingSessionStatus;
    }

    public void setATMNetworkOperatingSessionUsageLog(String ATMNetworkOperatingSessionUsageLog) {
        this.ATMNetworkOperatingSessionUsageLog = ATMNetworkOperatingSessionUsageLog;
    }

    public String getATMNetworkOperatingSessionUsageLog() {
        return ATMNetworkOperatingSessionUsageLog;
    }

    public void setATMNetworkOperatingSessionReference(org.museframework.bian.classes.Object ATMNetworkOperatingSessionReference) {
        this.ATMNetworkOperatingSessionReference = ATMNetworkOperatingSessionReference;
    }

    public org.museframework.bian.classes.Object getATMNetworkOperatingSessionReference() {
        return ATMNetworkOperatingSessionReference;
    }

    public void setATMNetworkOperatingSessionServiceProviderReference(org.museframework.bian.classes.Object ATMNetworkOperatingSessionServiceProviderReference) {
        this.ATMNetworkOperatingSessionServiceProviderReference = ATMNetworkOperatingSessionServiceProviderReference;
    }

    public org.museframework.bian.classes.Object getATMNetworkOperatingSessionServiceProviderReference() {
        return ATMNetworkOperatingSessionServiceProviderReference;
    }

    public void setATMNetworkOperatingSessionType(String ATMNetworkOperatingSessionType) {
        this.ATMNetworkOperatingSessionType = ATMNetworkOperatingSessionType;
    }

    public String getATMNetworkOperatingSessionType() {
        return ATMNetworkOperatingSessionType;
    }

    public void setATMNetworkOperatingSessionServiceProviderSchedule(String ATMNetworkOperatingSessionServiceProviderSchedule) {
        this.ATMNetworkOperatingSessionServiceProviderSchedule = ATMNetworkOperatingSessionServiceProviderSchedule;
    }

    public String getATMNetworkOperatingSessionServiceProviderSchedule() {
        return ATMNetworkOperatingSessionServiceProviderSchedule;
    }

    public void setATMNetworkOperatingSessionServiceType(String ATMNetworkOperatingSessionServiceType) {
        this.ATMNetworkOperatingSessionServiceType = ATMNetworkOperatingSessionServiceType;
    }

    public String getATMNetworkOperatingSessionServiceType() {
        return ATMNetworkOperatingSessionServiceType;
    }

    public void setATMNetworkOperatingSessionServiceConfiguration(String ATMNetworkOperatingSessionServiceConfiguration) {
        this.ATMNetworkOperatingSessionServiceConfiguration = ATMNetworkOperatingSessionServiceConfiguration;
    }

    public String getATMNetworkOperatingSessionServiceConfiguration() {
        return ATMNetworkOperatingSessionServiceConfiguration;
    }
}