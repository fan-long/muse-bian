package org.museframework.bian.regulatoryreporting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureEnquiriesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.regulatoryreporting.dto.bq.Enquiries enquiries;

    public void setEnquiries(org.museframework.bian.regulatoryreporting.dto.bq.Enquiries enquiries) {
        this.enquiries = enquiries;
    }

    public org.museframework.bian.regulatoryreporting.dto.bq.Enquiries getEnquiries() {
        return enquiries;
    }
}