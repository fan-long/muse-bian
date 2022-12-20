/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.sessiondialogue.dto.bq;

public class Sales {
    /*A description of the type of product of interest (e.g. lending or deposit products)*/
    private String productandServiceType;

    /*A description of the selected product's features and options desired*/
    private String productandServiceProperties;

    /*The result of the sales attempt (can be an identified lead/opportunity registered for future action or may lead to the invocation of Customer Offer within this dialogue. It may also provide insights into the customer's preferences)*/
    private String salesTaskResult;

    public void setProductandServiceType(String productandServiceType) {
        this.productandServiceType = productandServiceType;
    }

    public String getProductandServiceType() {
        return productandServiceType;
    }

    public void setProductandServiceProperties(String productandServiceProperties) {
        this.productandServiceProperties = productandServiceProperties;
    }

    public String getProductandServiceProperties() {
        return productandServiceProperties;
    }

    public void setSalesTaskResult(String salesTaskResult) {
        this.salesTaskResult = salesTaskResult;
    }

    public String getSalesTaskResult() {
        return salesTaskResult;
    }
}