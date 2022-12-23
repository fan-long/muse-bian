package org.museframework.bian.cardclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCaptureRequest {
    @MetaField
    private String cardclearingid;

    @MetaField
    private String captureid;

    @MetaField(ref=true)
    private org.museframework.bian.cardclearing.dto.bq.Capture capture;

    public void setCardclearingid(String cardclearingid) {
        this.cardclearingid = cardclearingid;
    }

    public String getCardclearingid() {
        return cardclearingid;
    }

    public void setCaptureid(String captureid) {
        this.captureid = captureid;
    }

    public String getCaptureid() {
        return captureid;
    }

    public void setCapture(org.museframework.bian.cardclearing.dto.bq.Capture capture) {
        this.capture = capture;
    }

    public org.museframework.bian.cardclearing.dto.bq.Capture getCapture() {
        return capture;
    }
}