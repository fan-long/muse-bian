/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.infproope.dto.bq;

public class InformationProviderOperationOutcome {
    /**/
    private org.museframework.bian.classes.Event informationProviderOperationIncident;

    /**/
    private String informationProviderOperationProvision;

    public void setInformationProviderOperationIncident(org.museframework.bian.classes.Event informationProviderOperationIncident) {
        this.informationProviderOperationIncident = informationProviderOperationIncident;
    }

    public org.museframework.bian.classes.Event getInformationProviderOperationIncident() {
        return informationProviderOperationIncident;
    }

    public void setInformationProviderOperationProvision(String informationProviderOperationProvision) {
        this.informationProviderOperationProvision = informationProviderOperationProvision;
    }

    public String getInformationProviderOperationProvision() {
        return informationProviderOperationProvision;
    }
}