/*The Document Update History Properties properties that represent a discrete aspect of the Document Update History Properties*/
package org.museframework.bian.documentdirectory.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class DocumentDirectoryOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.DirectoryEntry documentDirectoryEntry;

    /**/
    @MetaField
    private String documentDirectoryWorkProduct;

    public void setDocumentDirectoryEntry(org.museframework.bian.classes.DirectoryEntry documentDirectoryEntry) {
        this.documentDirectoryEntry = documentDirectoryEntry;
    }

    public org.museframework.bian.classes.DirectoryEntry getDocumentDirectoryEntry() {
        return documentDirectoryEntry;
    }

    public void setDocumentDirectoryWorkProduct(String documentDirectoryWorkProduct) {
        this.documentDirectoryWorkProduct = documentDirectoryWorkProduct;
    }

    public String getDocumentDirectoryWorkProduct() {
        return documentDirectoryWorkProduct;
    }
}