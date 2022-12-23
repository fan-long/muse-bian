package org.museframework.bian.concenope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrievePeakLoadRequest {
    @MetaField
    private String contactcenteroperationsid;

    @MetaField
    private String peakloadid;

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
}