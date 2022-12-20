/*The application of the Market Analysis Algorithm
*/
package org.museframework.bian.classes;

public class MarketAnalysisAlgorithmUsage {
    /*The party, process... that used the algorithm*/
    private String marketAnalysisAlgorithmUser;

    /*Reported consequences of the use of the market analysis algorithm

*/
    private String marketAnalysisAlgorithmImpact;

    public void setMarketAnalysisAlgorithmUser(String marketAnalysisAlgorithmUser) {
        this.marketAnalysisAlgorithmUser = marketAnalysisAlgorithmUser;
    }

    public String getMarketAnalysisAlgorithmUser() {
        return marketAnalysisAlgorithmUser;
    }

    public void setMarketAnalysisAlgorithmImpact(String marketAnalysisAlgorithmImpact) {
        this.marketAnalysisAlgorithmImpact = marketAnalysisAlgorithmImpact;
    }

    public String getMarketAnalysisAlgorithmImpact() {
        return marketAnalysisAlgorithmImpact;
    }
}