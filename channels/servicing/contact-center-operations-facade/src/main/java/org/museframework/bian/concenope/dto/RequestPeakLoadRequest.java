package org.museframework.bian.concenope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestPeakLoadRequest {
    @MetaField
    private String contactcenteroperationsid;

    @MetaField
    private String peakloadid;

    @MetaField(ref=true)
    private org.museframework.bian.concenope.dto.bq.PeakLoad peakLoad;

    public void setContactcenteroperationsid(String contactcenteroperationsid) {
        this.contactcenteroperationsid = contactcenteroperationsid;
    }

    public String getContactcenteroperationsid() {
        return contactcenteroperationsid;
    }

    public void setPeakloadid(String peakloadid) {
        this.peakloadid = peakloadid;
    }

    public String getPeakloadid() {
        return peakloadid;
    }

    public void setPeakLoad(org.museframework.bian.concenope.dto.bq.PeakLoad peakLoad) {
        this.peakLoad = peakLoad;
    }

    public org.museframework.bian.concenope.dto.bq.PeakLoad getPeakLoad() {
        return peakLoad;
    }
}