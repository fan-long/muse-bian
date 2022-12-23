package org.museframework.bian.stolenandrep.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyRepoTransactionCashTransferTaskRequest {
    @MetaField
    private String stocklendingandreposid;

    @MetaField
    private String repotransactioncashtransfertaskid;

    public void setStocklendingandreposid(String stocklendingandreposid) {
        this.stocklendingandreposid = stocklendingandreposid;
    }

    public String getStocklendingandreposid() {
        return stocklendingandreposid;
    }

    public void setRepotransactioncashtransfertaskid(String repotransactioncashtransfertaskid) {
        this.repotransactioncashtransfertaskid = repotransactioncashtransfertaskid;
    }

    public String getRepotransactioncashtransfertaskid() {
        return repotransactioncashtransfertaskid;
    }
}