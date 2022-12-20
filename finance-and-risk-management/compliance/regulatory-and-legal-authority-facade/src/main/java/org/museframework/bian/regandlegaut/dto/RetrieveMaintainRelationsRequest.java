package org.museframework.bian.regandlegaut.dto;

public class RetrieveMaintainRelationsRequest {
    private String regulatoryandlegalauthorityid;

    private String maintainrelationsid;

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
}