/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.infproope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class InformationProviderOperationOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Event informationProviderOperationIncident;

    /**/
    @MetaField
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