/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Correspondent Bank. */
package org.museframework.bian.corbanope.dto.cr;

public class CorrespondentBankOperatingSession {
    /*Reference to the bank arrangement (that will detail limits, fees, preferred payments mechanism)*/
    private org.museframework.bian.classes.Object correspondentBankFacilityReference;

    /*The correspondent bank arrangement (details agreed limits, fees, preferred payments mechanism, etc.)*/
    private String correspondentBankFacility;

    /*Details of the schedule for processing payments, clearing and settlement and reconciliations*/
    private String correspondentBankServicingSchedule;

    /*A reference to the bank calendar details for payment processing*/
    private String holidayTimezoneSchedule;

    /*Reference to associated vostro account (your money at our bank)*/
    private org.museframework.bian.classes.Object vostroAccountReference;

    /*Reference to associated nostro account (our money at your bank)*/
    private org.museframework.bian.classes.Object nostroMirrorAccountReference;

    public void setCorrespondentBankFacilityReference(org.museframework.bian.classes.Object correspondentBankFacilityReference) {
        this.correspondentBankFacilityReference = correspondentBankFacilityReference;
    }

    public org.museframework.bian.classes.Object getCorrespondentBankFacilityReference() {
        return correspondentBankFacilityReference;
    }

    public void setCorrespondentBankFacility(String correspondentBankFacility) {
        this.correspondentBankFacility = correspondentBankFacility;
    }

    public String getCorrespondentBankFacility() {
        return correspondentBankFacility;
    }

    public void setCorrespondentBankServicingSchedule(String correspondentBankServicingSchedule) {
        this.correspondentBankServicingSchedule = correspondentBankServicingSchedule;
    }

    public String getCorrespondentBankServicingSchedule() {
        return correspondentBankServicingSchedule;
    }

    public void setHolidayTimezoneSchedule(String holidayTimezoneSchedule) {
        this.holidayTimezoneSchedule = holidayTimezoneSchedule;
    }

    public String getHolidayTimezoneSchedule() {
        return holidayTimezoneSchedule;
    }

    public void setVostroAccountReference(org.museframework.bian.classes.Object vostroAccountReference) {
        this.vostroAccountReference = vostroAccountReference;
    }

    public org.museframework.bian.classes.Object getVostroAccountReference() {
        return vostroAccountReference;
    }

    public void setNostroMirrorAccountReference(org.museframework.bian.classes.Object nostroMirrorAccountReference) {
        this.nostroMirrorAccountReference = nostroMirrorAccountReference;
    }

    public org.museframework.bian.classes.Object getNostroMirrorAccountReference() {
        return nostroMirrorAccountReference;
    }
}