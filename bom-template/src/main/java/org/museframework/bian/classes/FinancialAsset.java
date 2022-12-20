/*A financial asset is an asset whose value comes from a contractual claim. These assets are frequently traded. 
https://www.accountingtools.com/articles/2017/5/9/financial-asset*/
package org.museframework.bian.classes;

public class FinancialAsset {
    /**/
    private String financialAssetType;

    public void setFinancialAssetType(String financialAssetType) {
        this.financialAssetType = financialAssetType;
    }

    public String getFinancialAssetType() {
        return financialAssetType;
    }
}