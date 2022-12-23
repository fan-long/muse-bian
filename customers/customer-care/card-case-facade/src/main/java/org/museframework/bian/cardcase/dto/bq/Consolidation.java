/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cardcase.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Consolidation {
    /*Reference to the card transaction for the consolidation*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object consolidationCardTransactionRecordReference;

    /*The record of a specific verification task*/
    @MetaField
    private String consolidationTaskRecord;

    /*The instruction message to the merchant to provide card transaction related paperwork, includes issued device details, transaction identification information and the retrieval reason*/
    @MetaField
    private String consolidationInstruction;

    /*Reference to the document request messages sent to the merchant*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object correspondenceReference;

    /*Reference to documents obtained*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Work documentation, forms and schedules produced and referenced during the analysis*/
    @MetaField
    private String consolidationTaskWorkProducts;

    /*The outcome of the consolidation workstep*/
    @MetaField
    private String consolidationTaskResult;

    public void setConsolidationCardTransactionRecordReference(org.museframework.bian.classes.Object consolidationCardTransactionRecordReference) {
        this.consolidationCardTransactionRecordReference = consolidationCardTransactionRecordReference;
    }

    public org.museframework.bian.classes.Object getConsolidationCardTransactionRecordReference() {
        return consolidationCardTransactionRecordReference;
    }

    public void setConsolidationTaskRecord(String consolidationTaskRecord) {
        this.consolidationTaskRecord = consolidationTaskRecord;
    }

    public String getConsolidationTaskRecord() {
        return consolidationTaskRecord;
    }

    public void setConsolidationInstruction(String consolidationInstruction) {
        this.consolidationInstruction = consolidationInstruction;
    }

    public String getConsolidationInstruction() {
        return consolidationInstruction;
    }

    public void setCorrespondenceReference(org.museframework.bian.classes.Object correspondenceReference) {
        this.correspondenceReference = correspondenceReference;
    }

    public org.museframework.bian.classes.Object getCorrespondenceReference() {
        return correspondenceReference;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setConsolidationTaskWorkProducts(String consolidationTaskWorkProducts) {
        this.consolidationTaskWorkProducts = consolidationTaskWorkProducts;
    }

    public String getConsolidationTaskWorkProducts() {
        return consolidationTaskWorkProducts;
    }

    public void setConsolidationTaskResult(String consolidationTaskResult) {
        this.consolidationTaskResult = consolidationTaskResult;
    }

    public String getConsolidationTaskResult() {
        return consolidationTaskResult;
    }
}