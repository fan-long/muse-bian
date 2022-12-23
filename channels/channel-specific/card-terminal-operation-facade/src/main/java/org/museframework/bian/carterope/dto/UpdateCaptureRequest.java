package org.museframework.bian.carterope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCaptureRequest {
    @MetaField
    private String cardterminaloperationid;

    @MetaField
    private String captureid;

    @MetaField(ref=true)
    private org.museframework.bian.carterope.dto.bq.Capture capture;

    public void setCardterminaloperationid(String cardterminaloperationid) {
        this.cardterminaloperationid = cardterminaloperationid;
    }

    public String getCardterminaloperationid() {
        return cardterminaloperationid;
    }

    public void setCaptureid(String captureid) {
        this.captureid = captureid;
    }

    public String getCaptureid() {
        return captureid;
    }

    public void setCapture(org.museframework.bian.carterope.dto.bq.Capture capture) {
        this.capture = capture;
    }

    public org.museframework.bian.carterope.dto.bq.Capture getCapture() {
        return capture;
    }
}