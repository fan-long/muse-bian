package org.museframework.bian.chelocbox.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrievePaperCheckProcessingFulfillmentRequest {
    @MetaField
    private String chequelockboxid;

    @MetaField
    private String papercheckprocessingfulfillmentid;

    public void setChequelockboxid(String chequelockboxid) {
        this.chequelockboxid = chequelockboxid;
    }

    public String getChequelockboxid() {
        return chequelockboxid;
    }

    public void setPapercheckprocessingfulfillmentid(String papercheckprocessingfulfillmentid) {
        this.papercheckprocessingfulfillmentid = papercheckprocessingfulfillmentid;
    }

    public String getPapercheckprocessingfulfillmentid() {
        return papercheckprocessingfulfillmentid;
    }
}