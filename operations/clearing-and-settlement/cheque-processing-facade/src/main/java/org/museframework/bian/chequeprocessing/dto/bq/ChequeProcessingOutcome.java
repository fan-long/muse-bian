/*Operate equipment and/or a largely automated facility  within Cheque Processing. 
Example: Operate the bank's internal intranet facility.*/
package org.museframework.bian.chequeprocessing.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ChequeProcessingOutcome {
    /**/
    @MetaField(0)
    private String chequeProcessingIncident;

    /**/
    @MetaField(0)
    private String chequeProcessingProvision;

    public void setChequeProcessingIncident(String chequeProcessingIncident) {
        this.chequeProcessingIncident = chequeProcessingIncident;
    }

    public String getChequeProcessingIncident() {
        return chequeProcessingIncident;
    }

    public void setChequeProcessingProvision(String chequeProcessingProvision) {
        this.chequeProcessingProvision = chequeProcessingProvision;
    }

    public String getChequeProcessingProvision() {
        return chequeProcessingProvision;
    }
}