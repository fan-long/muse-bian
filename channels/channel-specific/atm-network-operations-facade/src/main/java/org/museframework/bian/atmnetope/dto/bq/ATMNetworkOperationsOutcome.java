/*Operate equipment and/or a largely automated facility  within ATM Network Operations. 
Example: Operate the bank's internal intranet facility.*/
package org.museframework.bian.atmnetope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ATMNetworkOperationsOutcome {
    /**/
    @MetaField(0)
    private String ATMNetworkOperationsIncident;

    /**/
    @MetaField(0)
    private String ATMNetworkOperationsProvision;

    public void setATMNetworkOperationsIncident(String ATMNetworkOperationsIncident) {
        this.ATMNetworkOperationsIncident = ATMNetworkOperationsIncident;
    }

    public String getATMNetworkOperationsIncident() {
        return ATMNetworkOperationsIncident;
    }

    public void setATMNetworkOperationsProvision(String ATMNetworkOperationsProvision) {
        this.ATMNetworkOperationsProvision = ATMNetworkOperationsProvision;
    }

    public String getATMNetworkOperationsProvision() {
        return ATMNetworkOperationsProvision;
    }
}