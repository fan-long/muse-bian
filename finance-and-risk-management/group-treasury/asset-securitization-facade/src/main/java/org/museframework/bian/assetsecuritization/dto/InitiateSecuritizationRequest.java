package org.museframework.bian.assetsecuritization.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateSecuritizationRequest {
    @MetaField
    private String assetsecuritizationid;

    @MetaField
    private String securitizationid;

    @MetaField(ref=true)
    private org.museframework.bian.assetsecuritization.dto.bq.Securitization securitization;

    public void setAssetsecuritizationid(String assetsecuritizationid) {
        this.assetsecuritizationid = assetsecuritizationid;
    }

    public String getAssetsecuritizationid() {
        return assetsecuritizationid;
    }

    public void setSecuritizationid(String securitizationid) {
        this.securitizationid = securitizationid;
    }

    public String getSecuritizationid() {
        return securitizationid;
    }

    public void setSecuritization(org.museframework.bian.assetsecuritization.dto.bq.Securitization securitization) {
        this.securitization = securitization;
    }

    public org.museframework.bian.assetsecuritization.dto.bq.Securitization getSecuritization() {
        return securitization;
    }
}