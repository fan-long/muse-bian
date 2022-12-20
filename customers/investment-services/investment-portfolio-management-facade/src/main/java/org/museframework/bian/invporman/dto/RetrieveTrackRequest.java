package org.museframework.bian.invporman.dto;

public class RetrieveTrackRequest {
    private String investmentportfoliomanagementid;

    private String trackid;

    public void setInvestmentportfoliomanagementid(String investmentportfoliomanagementid) {
        this.investmentportfoliomanagementid = investmentportfoliomanagementid;
    }

    public String getInvestmentportfoliomanagementid() {
        return investmentportfoliomanagementid;
    }

    public void setTrackid(String trackid) {
        this.trackid = trackid;
    }

    public String getTrackid() {
        return trackid;
    }
}