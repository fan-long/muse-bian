package org.museframework.bian.productportfolio.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProductPortfolioAnalysisRequest {
    @MetaField
    private String productportfolioid;

    public void setProductportfolioid(String productportfolioid) {
        this.productportfolioid = productportfolioid;
    }

    public String getProductportfolioid() {
        return productportfolioid;
    }
}