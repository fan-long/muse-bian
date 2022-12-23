package org.museframework.bian.stolenandrep.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ControlRepoTransactionRequest {
    @MetaField
    private String stocklendingandreposid;

    @MetaField(ref=true)
    private org.museframework.bian.stolenandrep.dto.cr.RepoTransaction repoTransaction;

    public void setStocklendingandreposid(String stocklendingandreposid) {
        this.stocklendingandreposid = stocklendingandreposid;
    }

    public String getStocklendingandreposid() {
        return stocklendingandreposid;
    }

    public void setRepoTransaction(org.museframework.bian.stolenandrep.dto.cr.RepoTransaction repoTransaction) {
        this.repoTransaction = repoTransaction;
    }

    public org.museframework.bian.stolenandrep.dto.cr.RepoTransaction getRepoTransaction() {
        return repoTransaction;
    }
}