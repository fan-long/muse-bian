package org.museframework.bian.corporatetreasury.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateSecuritizationRequest {
    @MetaField
    private String corporatetreasuryid;

    @MetaField
    private String securitizationid;

    @MetaField(ref=true)
    private org.museframework.bian.corporatetreasury.dto.bq.Securitization securitization;

    public void setCorporatetreasuryid(String corporatetreasuryid) {
        this.corporatetreasuryid = corporatetreasuryid;
    }

    public String getCorporatetreasuryid() {
        return corporatetreasuryid;
    }

    public void setSecuritizationid(String securitizationid) {
        this.securitizationid = securitizationid;
    }

    public String getSecuritizationid() {
        return securitizationid;
    }

    public void setSecuritization(org.museframework.bian.corporatetreasury.dto.bq.Securitization securitization) {
        this.securitization = securitization;
    }

    public org.museframework.bian.corporatetreasury.dto.bq.Securitization getSecuritization() {
        return securitization;
    }
}