package org.museframework.bian.assetsecuritization.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteAssetSecuritizationTransactionRequest {
    @MetaField
    private String assetsecuritizationid;

    @MetaField(ref=true)
    private org.museframework.bian.assetsecuritization.dto.cr.AssetSecuritizationTransaction assetSecuritizationTransaction;

    public void setAssetsecuritizationid(String assetsecuritizationid) {
        this.assetsecuritizationid = assetsecuritizationid;
    }

    public String getAssetsecuritizationid() {
        return assetsecuritizationid;
    }

    public void setAssetSecuritizationTransaction(org.museframework.bian.assetsecuritization.dto.cr.AssetSecuritizationTransaction assetSecuritizationTransaction) {
        this.assetSecuritizationTransaction = assetSecuritizationTransaction;
    }

    public org.museframework.bian.assetsecuritization.dto.cr.AssetSecuritizationTransaction getAssetSecuritizationTransaction() {
        return assetSecuritizationTransaction;
    }
}