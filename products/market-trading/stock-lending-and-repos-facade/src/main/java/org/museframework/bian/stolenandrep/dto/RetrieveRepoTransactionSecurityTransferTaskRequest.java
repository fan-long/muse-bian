package org.museframework.bian.stolenandrep.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveRepoTransactionSecurityTransferTaskRequest {
    @MetaField
    private String stocklendingandreposid;

    @MetaField
    private String repotransactionsecuritytransfertaskid;

    public void setStocklendingandreposid(String stocklendingandreposid) {
        this.stocklendingandreposid = stocklendingandreposid;
    }

    public String getStocklendingandreposid() {
        return stocklendingandreposid;
    }

    public void setRepotransactionsecuritytransfertaskid(String repotransactionsecuritytransfertaskid) {
        this.repotransactionsecuritytransfertaskid = repotransactionsecuritytransfertaskid;
    }

    public String getRepotransactionsecuritytransfertaskid() {
        return repotransactionsecuritytransfertaskid;
    }
}