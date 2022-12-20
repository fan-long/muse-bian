package org.museframework.bian.productdirectory.dto;

public class RequestProductDirectoryEntryRequest {
    private String productdirectoryid;

    private org.museframework.bian.productdirectory.dto.cr.ProductDirectoryEntry productDirectoryEntry;

    public void setProductdirectoryid(String productdirectoryid) {
        this.productdirectoryid = productdirectoryid;
    }

    public String getProductdirectoryid() {
        return productdirectoryid;
    }

    public void setProductDirectoryEntry(org.museframework.bian.productdirectory.dto.cr.ProductDirectoryEntry productDirectoryEntry) {
        this.productDirectoryEntry = productDirectoryEntry;
    }

    public org.museframework.bian.productdirectory.dto.cr.ProductDirectoryEntry getProductDirectoryEntry() {
        return productDirectoryEntry;
    }
}