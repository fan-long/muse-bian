/*The Access Control Servicing Properties properties that represent a discrete aspect of the Access Control Servicing Properties*/
package org.museframework.bian.servicedirectory.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ServiceDirectoryOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.DirectoryEntry serviceDirectoryEntry;

    /**/
    @MetaField
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