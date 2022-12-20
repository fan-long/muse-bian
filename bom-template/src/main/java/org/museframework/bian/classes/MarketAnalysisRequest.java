/*Request to perform a Market Analysis*/
package org.museframework.bian.classes;

public class MarketAnalysisRequest {
    /*Details of the request*/
    private String marketAnalysisRequestDetails;

    public void setMarketAnalysisRequestDetails(String marketAnalysisRequestDetails) {
        this.marketAnalysisRequestDetails = marketAnalysisRequestDetails;
    }

    public String getMarketAnalysisRequestDetails() {
        return marketAnalysisRequestDetails;
    }
}