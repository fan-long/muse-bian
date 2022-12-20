package org.museframework.bian.itstaandgui.dto;

public class UpdateProductTestingandDeploymentMechanismsRequest {
    private String itstandardsandguidelinesid;

    private String producttestinganddeploymentmechanismsid;

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