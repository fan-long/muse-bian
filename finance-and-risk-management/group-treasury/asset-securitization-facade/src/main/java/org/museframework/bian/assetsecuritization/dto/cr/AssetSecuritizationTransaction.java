/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Asset Securitization. 
Example: Execute a payment transaction.*/
package org.museframework.bian.assetsecuritization.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class AssetSecuritizationTransaction extends org.museframework.bian.classes.AssetSecuritizationTransaction {
    /*A Classification value that distinguishes between business service transaction within Asset Securitization Transaction*/
    @MetaField
    private String assetSecuritizationTransactionParameterType;

    /*A selected optional business service as subject matter of Asset Securitization Transaction*/
    @MetaField
    private String assetSecuritizationTransactionSelectedOption;

    /*The status of Asset Securitization Transaction*/
    @MetaField
    private String assetSecuritizationTransactionStatus;

    /*A Classification value that specifies type of business action for this  Asset Securitization Transaction*/
    @MetaField
    private String assetSecuritizationTransactionType;

    /*A Classification value that specifies type of transaction for this  Asset Securitization Transaction*/
    @MetaField
    private String assetSecuritizationTransactionTransactionType;

    /*Reference to Asset Securitization Transaction*/
    @MetaField
    private String assetSecuritizationTransactionTransaction;

    public void setAssetSecuritizationTransactionParameterType(String assetSecuritizationTransactionParameterType) {
        this.assetSecuritizationTransactionParameterType = assetSecuritizationTransactionParameterType;
    }

    public String getAssetSecuritizationTransactionParameterType() {
        return assetSecuritizationTransactionParameterType;
    }

    public void setAssetSecuritizationTransactionSelectedOption(String assetSecuritizationTransactionSelectedOption) {
        this.assetSecuritizationTransactionSelectedOption = assetSecuritizationTransactionSelectedOption;
    }

    public String getAssetSecuritizationTransactionSelectedOption() {
        return assetSecuritizationTransactionSelectedOption;
    }

    public void setAssetSecuritizationTransactionStatus(String assetSecuritizationTransactionStatus) {
        this.assetSecuritizationTransactionStatus = assetSecuritizationTransactionStatus;
    }

    public String getAssetSecuritizationTransactionStatus() {
        return assetSecuritizationTransactionStatus;
    }

    public void setAssetSecuritizationTransactionType(String assetSecuritizationTransactionType) {
        this.assetSecuritizationTransactionType = assetSecuritizationTransactionType;
    }

    public String getAssetSecuritizationTransactionType() {
        return assetSecuritizationTransactionType;
    }

    public void setAssetSecuritizationTransactionTransactionType(String assetSecuritizationTransactionTransactionType) {
        this.assetSecuritizationTransactionTransactionType = assetSecuritizationTransactionTransactionType;
    }

    public String getAssetSecuritizationTransactionTransactionType() {
        return assetSecuritizationTransactionTransactionType;
    }

    public void setAssetSecuritizationTransactionTransaction(String assetSecuritizationTransactionTransaction) {
        this.assetSecuritizationTransactionTransaction = assetSecuritizationTransactionTransaction;
    }

    public String getAssetSecuritizationTransactionTransaction() {
        return assetSecuritizationTransactionTransaction;
    }
}