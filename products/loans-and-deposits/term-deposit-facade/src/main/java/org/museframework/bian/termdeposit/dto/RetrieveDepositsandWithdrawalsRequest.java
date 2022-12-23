package org.museframework.bian.termdeposit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDepositsandWithdrawalsRequest {
    @MetaField
    private String termdepositid;

    @MetaField
    private String depositsandwithdrawalsid;

    public void setTermdepositid(String termdepositid) {
        this.termdepositid = termdepositid;
    }

    public String getTermdepositid() {
        return termdepositid;
    }

    public void setDepositsandwithdrawalsid(String depositsandwithdrawalsid) {
        this.depositsandwithdrawalsid = depositsandwithdrawalsid;
    }

    public String getDepositsandwithdrawalsid() {
        return depositsandwithdrawalsid;
    }
}