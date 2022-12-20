/*Capture and maintain reference information about some type of entitity within Product Directory.*/
package org.museframework.bian.productdirectory.dto.cr;

public class ProductDirectoryEntry extends org.museframework.bian.classes.ProductDirectoryEntry {
    /*The current version of the product referenced in the directory*/
    private String productVersion;

    /*Any configuration settings for the directory entry (e.g. generally available, provisional)*/
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