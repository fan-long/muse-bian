package org.museframework.bian.itstaandgui.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProductTestingandDeploymentMechanismsRequest {
    @MetaField
    private String itstandardsandguidelinesid;

    @MetaField
    private String producttestinganddeploymentmechanismsid;

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
}