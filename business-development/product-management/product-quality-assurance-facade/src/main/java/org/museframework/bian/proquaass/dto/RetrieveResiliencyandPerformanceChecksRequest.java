package org.museframework.bian.proquaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveResiliencyandPerformanceChecksRequest {
    @MetaField
    private String productqualityassuranceid;

    @MetaField
    private String resiliencyandperformancechecksid;

    public void setProductqualityassuranceid(String productqualityassuranceid) {
        this.productqualityassuranceid = productqualityassuranceid;
    }

    public String getProductqualityassuranceid() {
        return productqualityassuranceid;
    }

    public void setResiliencyandperformancechecksid(String resiliencyandperformancechecksid) {
        this.resiliencyandperformancechecksid = resiliencyandperformancechecksid;
    }

    public String getResiliencyandperformancechecksid() {
        return resiliencyandperformancechecksid;
    }
}