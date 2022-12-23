package org.museframework.bian.secposkee.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureSecuritiesTransactionCaptureRequest {
    @MetaField
    private String securitiespositionkeepingid;

    @MetaField
    private String securitiestransactioncaptureid;

    @MetaField(ref=true)
    private org.museframework.bian.secposkee.dto.bq.SecuritiesTransactionCapture securitiesTransactionCapture;

    public void setSecuritiespositionkeepingid(String securitiespositionkeepingid) {
        this.securitiespositionkeepingid = securitiespositionkeepingid;
    }

    public String getSecuritiespositionkeepingid() {
        return securitiespositionkeepingid;
    }

    public void setSecuritiestransactioncaptureid(String securitiestransactioncaptureid) {
        this.securitiestransactioncaptureid = securitiestransactioncaptureid;
    }

    public String getSecuritiestransactioncaptureid() {
        return securitiestransactioncaptureid;
    }

    public void setSecuritiesTransactionCapture(org.museframework.bian.secposkee.dto.bq.SecuritiesTransactionCapture securitiesTransactionCapture) {
        this.securitiesTransactionCapture = securitiesTransactionCapture;
    }

    public org.museframework.bian.secposkee.dto.bq.SecuritiesTransactionCapture getSecuritiesTransactionCapture() {
        return securitiesTransactionCapture;
    }
}