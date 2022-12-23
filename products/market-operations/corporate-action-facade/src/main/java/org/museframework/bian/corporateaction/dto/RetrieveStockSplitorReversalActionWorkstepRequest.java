package org.museframework.bian.corporateaction.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveStockSplitorReversalActionWorkstepRequest {
    @MetaField
    private String corporateactionid;

    @MetaField
    private String stocksplitorreversalactionworkstepid;

    public void setCorporateactionid(String corporateactionid) {
        this.corporateactionid = corporateactionid;
    }

    public String getCorporateactionid() {
        return corporateactionid;
    }

    public void setStocksplitorreversalactionworkstepid(String stocksplitorreversalactionworkstepid) {
        this.stocksplitorreversalactionworkstepid = stocksplitorreversalactionworkstepid;
    }

    public String getStocksplitorreversalactionworkstepid() {
        return stocksplitorreversalactionworkstepid;
    }
}