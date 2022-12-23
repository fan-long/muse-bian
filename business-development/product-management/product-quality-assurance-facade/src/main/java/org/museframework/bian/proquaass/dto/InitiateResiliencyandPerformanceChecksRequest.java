package org.museframework.bian.proquaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateResiliencyandPerformanceChecksRequest {
    @MetaField
    private String productqualityassuranceid;

    @MetaField
    private String resiliencyandperformancechecksid;

    @MetaField(ref=true)
    private org.museframework.bian.proquaass.dto.bq.ResiliencyandPerformanceChecks resiliencyandPerformanceChecks;

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

    public void setResiliencyandPerformanceChecks(org.museframework.bian.proquaass.dto.bq.ResiliencyandPerformanceChecks resiliencyandPerformanceChecks) {
        this.resiliencyandPerformanceChecks = resiliencyandPerformanceChecks;
    }

    public org.museframework.bian.proquaass.dto.bq.ResiliencyandPerformanceChecks getResiliencyandPerformanceChecks() {
        return resiliencyandPerformanceChecks;
    }
}