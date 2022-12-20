/*A systematic examination and evaluation of Market data*/
package org.museframework.bian.classes;

public class MarketAnalysis {
    /*Reference to the market Viewpoint used in the analysis*/
    private String marketAnalysisViewpointReference;

    /*Definition of the Analysis work method*/
    private String marketAnalysisSpecification;

    /*Guidance on usage and interpretation of the analysis*/
    private String marketAnalysisGuidance;

    /*Reference to the Market Analysis Algorithm used 

can be many*/
    private String marketAnalysisAlgorithmReference;

    public void setMarketAnalysisViewpointReference(String marketAnalysisViewpointReference) {
        this.marketAnalysisViewpointReference = marketAnalysisViewpointReference;
    }

    public String getMarketAnalysisViewpointReference() {
        return marketAnalysisViewpointReference;
    }

    public void setMarketAnalysisSpecification(String marketAnalysisSpecification) {
        this.marketAnalysisSpecification = marketAnalysisSpecification;
    }

    public String getMarketAnalysisSpecification() {
        return marketAnalysisSpecification;
    }

    public void setMarketAnalysisGuidance(String marketAnalysisGuidance) {
        this.marketAnalysisGuidance = marketAnalysisGuidance;
    }

    public String getMarketAnalysisGuidance() {
        return marketAnalysisGuidance;
    }

    public void setMarketAnalysisAlgorithmReference(String marketAnalysisAlgorithmReference) {
        this.marketAnalysisAlgorithmReference = marketAnalysisAlgorithmReference;
    }

    public String getMarketAnalysisAlgorithmReference() {
        return marketAnalysisAlgorithmReference;
    }
}