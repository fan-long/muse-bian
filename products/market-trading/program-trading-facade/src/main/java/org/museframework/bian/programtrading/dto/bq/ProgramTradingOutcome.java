/*An operational service or function supported within the Program Traded Portfolio Maintenance Function for doing Program Traded Portfolio Maintenance Function*/
package org.museframework.bian.programtrading.dto.bq;

public class ProgramTradingOutcome {
    /**/
    private org.museframework.bian.classes.Event programTradingIncident;

    /**/
    private String programTradingProvision;

    public void setProgramTradingIncident(org.museframework.bian.classes.Event programTradingIncident) {
        this.programTradingIncident = programTradingIncident;
    }

    public org.museframework.bian.classes.Event getProgramTradingIncident() {
        return programTradingIncident;
    }

    public void setProgramTradingProvision(String programTradingProvision) {
        this.programTradingProvision = programTradingProvision;
    }

    public String getProgramTradingProvision() {
        return programTradingProvision;
    }
}