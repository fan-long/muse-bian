package org.museframework.bian.merandacqadv.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeMergersAndAcquisitionAdviceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.merandacqadv.dto.cr.MergersAndAcquisitionAdvice mergersAndAcquisitionAdvice;

    public void setMergersAndAcquisitionAdvice(org.museframework.bian.merandacqadv.dto.cr.MergersAndAcquisitionAdvice mergersAndAcquisitionAdvice) {
        this.mergersAndAcquisitionAdvice = mergersAndAcquisitionAdvice;
    }

    public org.museframework.bian.merandacqadv.dto.cr.MergersAndAcquisitionAdvice getMergersAndAcquisitionAdvice() {
        return mergersAndAcquisitionAdvice;
    }
}