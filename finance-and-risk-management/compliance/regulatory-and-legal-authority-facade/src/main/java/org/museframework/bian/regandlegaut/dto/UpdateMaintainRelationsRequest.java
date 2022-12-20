package org.museframework.bian.regandlegaut.dto;

public class UpdateMaintainRelationsRequest {
    private String regulatoryandlegalauthorityid;

    private String maintainrelationsid;

    private org.museframework.bian.regandlegaut.dto.bq.MaintainRelations maintainRelations;

    public void setRegulatoryandlegalauthorityid(String regulatoryandlegalauthorityid) {
        this.regulatoryandlegalauthorityid = regulatoryandlegalauthorityid;
    }

    public String getRegulatoryandlegalauthorityid() {
        return regulatoryandlegalauthorityid;
    }

    public void setMaintainrelationsid(String maintainrelationsid) {
        this.maintainrelationsid = maintainrelationsid;
    }

    public String getMaintainrelationsid() {
        return maintainrelationsid;
    }

    public void setMaintainRelations(org.museframework.bian.regandlegaut.dto.bq.MaintainRelations maintainRelations) {
        this.maintainRelations = maintainRelations;
    }

    public org.museframework.bian.regandlegaut.dto.bq.MaintainRelations getMaintainRelations() {
        return maintainRelations;
    }
}