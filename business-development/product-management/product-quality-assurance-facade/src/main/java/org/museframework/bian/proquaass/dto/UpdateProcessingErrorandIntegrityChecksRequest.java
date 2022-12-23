package org.museframework.bian.proquaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateProcessingErrorandIntegrityChecksRequest {
    @MetaField
    private String productqualityassuranceid;

    @MetaField
    private String processingerrorandintegritychecksid;

    @MetaField(ref=true)
    private org.museframework.bian.proquaass.dto.bq.ProcessingErrorandIntegrityChecks processingErrorandIntegrityChecks;

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

    public void setProcessingErrorandIntegrityChecks(org.museframework.bian.proquaass.dto.bq.ProcessingErrorandIntegrityChecks processingErrorandIntegrityChecks) {
        this.processingErrorandIntegrityChecks = processingErrorandIntegrityChecks;
    }

    public org.museframework.bian.proquaass.dto.bq.ProcessingErrorandIntegrityChecks getProcessingErrorandIntegrityChecks() {
        return processingErrorandIntegrityChecks;
    }
}