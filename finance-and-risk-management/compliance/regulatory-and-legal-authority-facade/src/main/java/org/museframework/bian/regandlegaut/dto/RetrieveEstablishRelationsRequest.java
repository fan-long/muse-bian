package org.museframework.bian.regandlegaut.dto;

public class RetrieveEstablishRelationsRequest {
    private String regulatoryandlegalauthorityid;

    private String establishrelationsid;

    public void setRegulatoryandlegalauthorityid(String regulatoryandlegalauthorityid) {
        this.regulatoryandlegalauthorityid = regulatoryandlegalauthorityid;
    }

    public String getRegulatoryandlegalauthorityid() {
        return regulatoryandlegalauthorityid;
    }

    public void setEstablishrelationsid(String establishrelationsid) {
        this.establishrelationsid = establishrelationsid;
    }

    public String getEstablishrelationsid() {
        return establishrelationsid;
    }
}