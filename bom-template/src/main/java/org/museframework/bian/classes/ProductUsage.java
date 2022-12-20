/*The use of a product by a customer (in a specific customer relationship) over a specified time period.*/
package org.museframework.bian.classes;

public class ProductUsage {
    /**/
    private String productUsageDateTime;

    /*Usage volume/frequency for in-force product.*/
    private String productUsageVolume;

    /*An indicator specifying if the whether the customer has bought  the banking product or not. */
    private String productUsageIndicator;

    public void setProductUsageDateTime(String productUsageDateTime) {
        this.productUsageDateTime = productUsageDateTime;
    }

    public String getProductUsageDateTime() {
        return productUsageDateTime;
    }

    public void setProductUsageVolume(String productUsageVolume) {
        this.productUsageVolume = productUsageVolume;
    }

    public String getProductUsageVolume() {
        return productUsageVolume;
    }

    public void setProductUsageIndicator(String productUsageIndicator) {
        this.productUsageIndicator = productUsageIndicator;
    }

    public String getProductUsageIndicator() {
        return productUsageIndicator;
    }
}