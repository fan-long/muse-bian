package org.museframework.bian.corporateaction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateSecurityMergersandAcquisitionActionWorkstepRequest {
    @MetaField
    private String corporateactionid;

    @MetaField
    private String securitymergersandacquisitionactionworkstepid;

    @MetaField(ref=true)
    private org.museframework.bian.corporateaction.dto.bq.SecurityMergersandAcquisitionActionWorkstep securityMergersandAcquisitionActionWorkstep;

    public void setCorporateactionid(String corporateactionid) {
        this.corporateactionid = corporateactionid;
    }

    public String getCorporateactionid() {
        return corporateactionid;
    }

    public void setSecuritymergersandacquisitionactionworkstepid(String securitymergersandacquisitionactionworkstepid) {
        this.securitymergersandacquisitionactionworkstepid = securitymergersandacquisitionactionworkstepid;
    }

    public String getSecuritymergersandacquisitionactionworkstepid() {
        return securitymergersandacquisitionactionworkstepid;
    }

    public void setSecurityMergersandAcquisitionActionWorkstep(org.museframework.bian.corporateaction.dto.bq.SecurityMergersandAcquisitionActionWorkstep securityMergersandAcquisitionActionWorkstep) {
        this.securityMergersandAcquisitionActionWorkstep = securityMergersandAcquisitionActionWorkstep;
    }

    public org.museframework.bian.corporateaction.dto.bq.SecurityMergersandAcquisitionActionWorkstep getSecurityMergersandAcquisitionActionWorkstep() {
        return securityMergersandAcquisitionActionWorkstep;
    }
}