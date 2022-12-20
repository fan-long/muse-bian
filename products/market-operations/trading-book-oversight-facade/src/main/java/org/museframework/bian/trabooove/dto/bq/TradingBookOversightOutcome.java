/*The Trading Book Risk Mitigation Duty is a specific role or responsibility that is one aspect of Trading Book Risk Mitigation Duty*/
package org.museframework.bian.trabooove.dto.bq;

public class TradingBookOversightOutcome {
    /**/
    private org.museframework.bian.classes.Analysis tradingBookOversightPerformanceAnalysis;

    /**/
    private org.museframework.bian.classes.Analysis tradingBookOversightActivityAnalysis;

    /**/
    private org.museframework.bian.classes.Plan tradingBookOversightCharter;

    /**/
    private org.museframework.bian.classes.Project tradingBookOversightProject;

    public void setTradingBookOversightPerformanceAnalysis(org.museframework.bian.classes.Analysis tradingBookOversightPerformanceAnalysis) {
        this.tradingBookOversightPerformanceAnalysis = tradingBookOversightPerformanceAnalysis;
    }

    public org.museframework.bian.classes.Analysis getTradingBookOversightPerformanceAnalysis() {
        return tradingBookOversightPerformanceAnalysis;
    }

    public void setTradingBookOversightActivityAnalysis(org.museframework.bian.classes.Analysis tradingBookOversightActivityAnalysis) {
        this.tradingBookOversightActivityAnalysis = tradingBookOversightActivityAnalysis;
    }

    public org.museframework.bian.classes.Analysis getTradingBookOversightActivityAnalysis() {
        return tradingBookOversightActivityAnalysis;
    }

    public void setTradingBookOversightCharter(org.museframework.bian.classes.Plan tradingBookOversightCharter) {
        this.tradingBookOversightCharter = tradingBookOversightCharter;
    }

    public org.museframework.bian.classes.Plan getTradingBookOversightCharter() {
        return tradingBookOversightCharter;
    }

    public void setTradingBookOversightProject(org.museframework.bian.classes.Project tradingBookOversightProject) {
        this.tradingBookOversightProject = tradingBookOversightProject;
    }

    public org.museframework.bian.classes.Project getTradingBookOversightProject() {
        return tradingBookOversightProject;
    }
}