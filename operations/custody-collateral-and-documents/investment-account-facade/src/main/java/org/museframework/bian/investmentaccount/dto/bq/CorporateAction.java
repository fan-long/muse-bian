/*The product features/services available with a financical facility*/
package org.museframework.bian.investmentaccount.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.CorporateAction
@MetaDto
public class CorporateAction {
    /*The type of corporate action that can be applied*/
    @MetaField(0)
    private String corporateActionType;

    /*The processing schedule for applying the type of corporate action to the investment account*/
    @MetaField(0)
    private String corporateActionApplicationSchedule;

    /*The instrument type that the corporate action impacts (will be one that the investment account tracks)*/
    @MetaField(0)
    private String corporateActionInstrumentType;

    /*Details of the transaction and its impact on the securities holding in the investment account*/
    @MetaField(0)
    private String corporateActionTransaction;

    /*The type of corporate action applied to the securities holdings*/
    @MetaField(0)
    private String corporateActionTransactionType;

    /*Details describing the purpose and impact of processing the action*/
    @MetaField(0)
    private String corporateActionTransactionDescription;

    /*File of consolidated notes, forms and documents for the corporate action*/
    @MetaField(0)
    private String corporateActionWorkProducts;

    /*Reference to associated documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*The outcome of applying the action to the account (can be simple confirmation)*/
    @MetaField(0)
    private String corporateActionTransactionResult;

    /*The date and time the corporate action was processed to the account*/
    @MetaField(0)
    private String corporateActionTransactionDate;

    public void setCorporateActionType(String corporateActionType) {
        this.corporateActionType = corporateActionType;
    }

    public String getCorporateActionType() {
        return corporateActionType;
    }

    public void setCorporateActionApplicationSchedule(String corporateActionApplicationSchedule) {
        this.corporateActionApplicationSchedule = corporateActionApplicationSchedule;
    }

    public String getCorporateActionApplicationSchedule() {
        return corporateActionApplicationSchedule;
    }

    public void setCorporateActionInstrumentType(String corporateActionInstrumentType) {
        this.corporateActionInstrumentType = corporateActionInstrumentType;
    }

    public String getCorporateActionInstrumentType() {
        return corporateActionInstrumentType;
    }

    public void setCorporateActionTransaction(String corporateActionTransaction) {
        this.corporateActionTransaction = corporateActionTransaction;
    }

    public String getCorporateActionTransaction() {
        return corporateActionTransaction;
    }

    public void setCorporateActionTransactionType(String corporateActionTransactionType) {
        this.corporateActionTransactionType = corporateActionTransactionType;
    }

    public String getCorporateActionTransactionType() {
        return corporateActionTransactionType;
    }

    public void setCorporateActionTransactionDescription(String corporateActionTransactionDescription) {
        this.corporateActionTransactionDescription = corporateActionTransactionDescription;
    }

    public String getCorporateActionTransactionDescription() {
        return corporateActionTransactionDescription;
    }

    public void setCorporateActionWorkProducts(String corporateActionWorkProducts) {
        this.corporateActionWorkProducts = corporateActionWorkProducts;
    }

    public String getCorporateActionWorkProducts() {
        return corporateActionWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setCorporateActionTransactionResult(String corporateActionTransactionResult) {
        this.corporateActionTransactionResult = corporateActionTransactionResult;
    }

    public String getCorporateActionTransactionResult() {
        return corporateActionTransactionResult;
    }

    public void setCorporateActionTransactionDate(String corporateActionTransactionDate) {
        this.corporateActionTransactionDate = corporateActionTransactionDate;
    }

    public String getCorporateActionTransactionDate() {
        return corporateActionTransactionDate;
    }
}