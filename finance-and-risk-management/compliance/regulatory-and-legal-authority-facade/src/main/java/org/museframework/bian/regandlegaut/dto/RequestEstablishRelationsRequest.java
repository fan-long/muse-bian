package org.museframework.bian.regandlegaut.dto;

public class RequestEstablishRelationsRequest {
    private String regulatoryandlegalauthorityid;

    private String establishrelationsid;

    private org.museframework.bian.regandlegaut.dto.bq.EstablishRelations establishRelations;

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

    public void setEstablishRelations(org.museframework.bian.regandlegaut.dto.bq.EstablishRelations establishRelations) {
        this.establishRelations = establishRelations;
    }

    public org.museframework.bian.regandlegaut.dto.bq.EstablishRelations getEstablishRelations() {
        return establishRelations;
    }
}