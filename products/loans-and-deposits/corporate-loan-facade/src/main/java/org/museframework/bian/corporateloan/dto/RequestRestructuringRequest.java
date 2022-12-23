package org.museframework.bian.corporateloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestRestructuringRequest {
    @MetaField
    private String corporateloanid;

    @MetaField
    private String restructuringid;

    @MetaField(ref=true)
    private org.museframework.bian.corporateloan.dto.bq.Restructuring restructuring;

    public void setCorporateloanid(String corporateloanid) {
        this.corporateloanid = corporateloanid;
    }

    public String getCorporateloanid() {
        return corporateloanid;
    }

    public void setRestructuringid(String restructuringid) {
        this.restructuringid = restructuringid;
    }

    public String getRestructuringid() {
        return restructuringid;
    }

    public void setRestructuring(org.museframework.bian.corporateloan.dto.bq.Restructuring restructuring) {
        this.restructuring = restructuring;
    }

    public org.museframework.bian.corporateloan.dto.bq.Restructuring getRestructuring() {
        return restructuring;
    }
}