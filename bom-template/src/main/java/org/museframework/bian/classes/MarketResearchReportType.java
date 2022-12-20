/**/
package org.museframework.bian.classes;

public class MarketResearchReportType {
    /*Classification of a Market Research Report 

further classification within the report type" market research"*/
    private String marketResearchReportType;

    /*description of what can be expected from the content of a market research report of this type*/
    private String mrketResearchReportTypeDefinition;

    public void setMarketResearchReportType(String marketResearchReportType) {
        this.marketResearchReportType = marketResearchReportType;
    }

    public String getMarketResearchReportType() {
        return marketResearchReportType;
    }

    public void setMrketResearchReportTypeDefinition(String mrketResearchReportTypeDefinition) {
        this.mrketResearchReportTypeDefinition = mrketResearchReportTypeDefinition;
    }

    public String getMrketResearchReportTypeDefinition() {
        return mrketResearchReportTypeDefinition;
    }
}