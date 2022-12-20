/*A request to analize the product portfolio for example a specialist/ad-hoc request*/
package org.museframework.bian.classes;

public class ProductPortfolioAnalysisRequest {
    /**/
    private String productPortfolioAnalysisRequestIdentification;

    public void setProductPortfolioAnalysisRequestIdentification(String productPortfolioAnalysisRequestIdentification) {
        this.productPortfolioAnalysisRequestIdentification = productPortfolioAnalysisRequestIdentification;
    }

    public String getProductPortfolioAnalysisRequestIdentification() {
        return productPortfolioAnalysisRequestIdentification;
    }
}