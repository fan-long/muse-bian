/*Operate equipment and/or a largely automated facility  within Cheque Processing. 
Example: Operate the bank's internal intranet facility.*/
package org.museframework.bian.chequeprocessing.dto.bq;

public class ChequeProcessingOutcome {
    /**/
    private String chequeProcessingIncident;

    /**/
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