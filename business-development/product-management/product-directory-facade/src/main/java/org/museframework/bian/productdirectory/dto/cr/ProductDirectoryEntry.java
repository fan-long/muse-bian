/*Capture and maintain reference information about some type of entitity within Product Directory.*/
package org.museframework.bian.productdirectory.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.ProductDirectoryEntry
@MetaDto
public class ProductDirectoryEntry {
    /*The current version of the product referenced in the directory*/
    @MetaField(0)
    private String productVersion;

    /*Any configuration settings for the directory entry (e.g. generally available, provisional)*/
    @MetaField(0)
    private String productDirectoryEntryConfiguration;

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion;
    }

    public String getProductVersion() {
        return productVersion;
    }

    public void setProductDirectoryEntryConfiguration(String productDirectoryEntryConfiguration) {
        this.productDirectoryEntryConfiguration = productDirectoryEntryConfiguration;
    }

    public String getProductDirectoryEntryConfiguration() {
        return productDirectoryEntryConfiguration;
    }
}