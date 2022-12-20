package org.museframework.bian.conandsupagr.dto;

public class RetrieveLegalTermRequest {
    private String contractorandsupplieragreementid;

    private String legaltermid;

    public void setContractorandsupplieragreementid(String contractorandsupplieragreementid) {
        this.contractorandsupplieragreementid = contractorandsupplieragreementid;
    }

    public String getContractorandsupplieragreementid() {
        return contractorandsupplieragreementid;
    }

    public void setLegaltermid(String legaltermid) {
        this.legaltermid = legaltermid;
    }

    public String getLegaltermid() {
        return legaltermid;
    }
}