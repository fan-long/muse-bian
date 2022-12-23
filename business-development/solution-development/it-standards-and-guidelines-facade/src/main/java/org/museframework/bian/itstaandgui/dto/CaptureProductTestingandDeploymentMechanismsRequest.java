package org.museframework.bian.itstaandgui.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureProductTestingandDeploymentMechanismsRequest {
    @MetaField
    private String itstandardsandguidelinesid;

    @MetaField
    private String producttestinganddeploymentmechanismsid;

    @MetaField(ref=true)
    private org.museframework.bian.itstaandgui.dto.bq.ProductTestingandDeploymentMechanisms productTestingandDeploymentMechanisms;

    public void setItstandardsandguidelinesid(String itstandardsandguidelinesid) {
        this.itstandardsandguidelinesid = itstandardsandguidelinesid;
    }

    public String getItstandardsandguidelinesid() {
        return itstandardsandguidelinesid;
    }

    public void setProducttestinganddeploymentmechanismsid(String producttestinganddeploymentmechanismsid) {
        this.producttestinganddeploymentmechanismsid = producttestinganddeploymentmechanismsid;
    }

    public String getProducttestinganddeploymentmechanismsid() {
        return producttestinganddeploymentmechanismsid;
    }

    public void setProductTestingandDeploymentMechanisms(org.museframework.bian.itstaandgui.dto.bq.ProductTestingandDeploymentMechanisms productTestingandDeploymentMechanisms) {
        this.productTestingandDeploymentMechanisms = productTestingandDeploymentMechanisms;
    }

    public org.museframework.bian.itstaandgui.dto.bq.ProductTestingandDeploymentMechanisms getProductTestingandDeploymentMechanisms() {
        return productTestingandDeploymentMechanisms;
    }
}