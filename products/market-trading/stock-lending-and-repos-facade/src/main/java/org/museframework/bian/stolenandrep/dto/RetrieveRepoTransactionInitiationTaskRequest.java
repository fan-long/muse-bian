package org.museframework.bian.stolenandrep.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveRepoTransactionInitiationTaskRequest {
    @MetaField
    private String stocklendingandreposid;

    @MetaField
    private String repotransactioninitiationtaskid;

    public void setStocklendingandreposid(String stocklendingandreposid) {
        this.stocklendingandreposid = stocklendingandreposid;
    }

    public String getStocklendingandreposid() {
        return stocklendingandreposid;
    }

    public void setRepotransactioninitiationtaskid(String repotransactioninitiationtaskid) {
        this.repotransactioninitiationtaskid = repotransactioninitiationtaskid;
    }

    public String getRepotransactioninitiationtaskid() {
        return repotransactioninitiationtaskid;
    }
}