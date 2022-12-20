package org.museframework.bian.fininsrefdatman.dto;

public class UpdateWarrantInstrumentpropertyRequest {
    private String financialinstrumentreferencedatamanagementid;

    private String warrantinstrumentpropertyid;

    private org.museframework.bian.fininsrefdatman.dto.bq.WarrantInstrumentproperty warrantInstrumentproperty;

    public void setFinancialinstrumentreferencedatamanagementid(String financialinstrumentreferencedatamanagementid) {
        this.financialinstrumentreferencedatamanagementid = financialinstrumentreferencedatamanagementid;
    }

    public String getFinancialinstrumentreferencedatamanagementid() {
        return financialinstrumentreferencedatamanagementid;
    }

    public void setWarrantinstrumentpropertyid(String warrantinstrumentpropertyid) {
        this.warrantinstrumentpropertyid = warrantinstrumentpropertyid;
    }

    public String getWarrantinstrumentpropertyid() {
        return warrantinstrumentpropertyid;
    }

    public void setWarrantInstrumentproperty(org.museframework.bian.fininsrefdatman.dto.bq.WarrantInstrumentproperty warrantInstrumentproperty) {
        this.warrantInstrumentproperty = warrantInstrumentproperty;
    }

    public org.museframework.bian.fininsrefdatman.dto.bq.WarrantInstrumentproperty getWarrantInstrumentproperty() {
        return warrantInstrumentproperty;
    }
}