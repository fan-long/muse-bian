package org.museframework.bian.proquaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProcessingErrorandIntegrityChecksRequest {
    @MetaField
    private String productqualityassuranceid;

    @MetaField
    private String processingerrorandintegritychecksid;

    public void setProductqualityassuranceid(String productqualityassuranceid) {
        this.productqualityassuranceid = productqualityassuranceid;
    }

    public String getProductqualityassuranceid() {
        return productqualityassuranceid;
    }

    public void setProcessingerrorandintegritychecksid(String processingerrorandintegritychecksid) {
        this.processingerrorandintegritychecksid = processingerrorandintegritychecksid;
    }

    public String getProcessingerrorandintegritychecksid() {
        return processingerrorandintegritychecksid;
    }
}