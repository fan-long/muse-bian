package org.museframework.bian.fininsrefdatman.dto;

public class ExecuteOptionInstrumentpropertyRequest {
    private String financialinstrumentreferencedatamanagementid;

    private String optioninstrumentpropertyid;

    private org.museframework.bian.fininsrefdatman.dto.bq.OptionInstrumentproperty optionInstrumentproperty;

    public void setFinancialinstrumentreferencedatamanagementid(String financialinstrumentreferencedatamanagementid) {
        this.financialinstrumentreferencedatamanagementid = financialinstrumentreferencedatamanagementid;
    }

    public String getFinancialinstrumentreferencedatamanagementid() {
        return financialinstrumentreferencedatamanagementid;
    }

    public void setOptioninstrumentpropertyid(String optioninstrumentpropertyid) {
        this.optioninstrumentpropertyid = optioninstrumentpropertyid;
    }

    public String getOptioninstrumentpropertyid() {
        return optioninstrumentpropertyid;
    }

    public void setOptionInstrumentproperty(org.museframework.bian.fininsrefdatman.dto.bq.OptionInstrumentproperty optionInstrumentproperty) {
        this.optionInstrumentproperty = optionInstrumentproperty;
    }

    public org.museframework.bian.fininsrefdatman.dto.bq.OptionInstrumentproperty getOptionInstrumentproperty() {
        return optionInstrumentproperty;
    }
}