/*A request to execute a Market Analysis Algorithm*/
package org.museframework.bian.classes;

public class MarketAnalysisAlgorthmRequest {
    /*Content of the request*/
    private String marketAnalysisAlgorithmRequestDetails;

    public void setMarketAnalysisAlgorithmRequestDetails(String marketAnalysisAlgorithmRequestDetails) {
        this.marketAnalysisAlgorithmRequestDetails = marketAnalysisAlgorithmRequestDetails;
    }

    public String getMarketAnalysisAlgorithmRequestDetails() {
        return marketAnalysisAlgorithmRequestDetails;
    }
}