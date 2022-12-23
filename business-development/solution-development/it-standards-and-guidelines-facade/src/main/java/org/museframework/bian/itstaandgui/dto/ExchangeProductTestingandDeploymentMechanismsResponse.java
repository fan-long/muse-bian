package org.museframework.bian.itstaandgui.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeProductTestingandDeploymentMechanismsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.itstaandgui.dto.bq.ProductTestingandDeploymentMechanisms productTestingandDeploymentMechanisms;

    public void setProductTestingandDeploymentMechanisms(org.museframework.bian.itstaandgui.dto.bq.ProductTestingandDeploymentMechanisms productTestingandDeploymentMechanisms) {
        this.productTestingandDeploymentMechanisms = productTestingandDeploymentMechanisms;
    }

    public org.museframework.bian.itstaandgui.dto.bq.ProductTestingandDeploymentMechanisms getProductTestingandDeploymentMechanisms() {
        return productTestingandDeploymentMechanisms;
    }
}