/*The Counterparty Entity Reference property properties that represent a discrete aspect of the Counterparty Entity Reference property*/
package org.museframework.bian.counterpartyadministration.dto.bq;

public class CounterpartyAdministrationOutcome {
    /**/
    private org.museframework.bian.classes.DirectoryEntry counterpartyAdministrationEntry;

    /**/
    private String counterpartyAdministrationWorkProduct;

    public void setCounterpartyAdministrationEntry(org.museframework.bian.classes.DirectoryEntry counterpartyAdministrationEntry) {
        this.counterpartyAdministrationEntry = counterpartyAdministrationEntry;
    }

    public org.museframework.bian.classes.DirectoryEntry getCounterpartyAdministrationEntry() {
        return counterpartyAdministrationEntry;
    }

    public void setCounterpartyAdministrationWorkProduct(String counterpartyAdministrationWorkProduct) {
        this.counterpartyAdministrationWorkProduct = counterpartyAdministrationWorkProduct;
    }

    public String getCounterpartyAdministrationWorkProduct() {
        return counterpartyAdministrationWorkProduct;
    }
}