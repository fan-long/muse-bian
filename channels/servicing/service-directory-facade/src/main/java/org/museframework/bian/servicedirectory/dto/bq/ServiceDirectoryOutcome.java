/*The Access Control Servicing Properties properties that represent a discrete aspect of the Access Control Servicing Properties*/
package org.museframework.bian.servicedirectory.dto.bq;

public class ServiceDirectoryOutcome {
    /**/
    private org.museframework.bian.classes.DirectoryEntry serviceDirectoryEntry;

    /**/
    private String serviceDirectoryWorkProduct;

    public void setServiceDirectoryEntry(org.museframework.bian.classes.DirectoryEntry serviceDirectoryEntry) {
        this.serviceDirectoryEntry = serviceDirectoryEntry;
    }

    public org.museframework.bian.classes.DirectoryEntry getServiceDirectoryEntry() {
        return serviceDirectoryEntry;
    }

    public void setServiceDirectoryWorkProduct(String serviceDirectoryWorkProduct) {
        this.serviceDirectoryWorkProduct = serviceDirectoryWorkProduct;
    }

    public String getServiceDirectoryWorkProduct() {
        return serviceDirectoryWorkProduct;
    }
}