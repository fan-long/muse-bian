/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Collections. 
Example: Process the evaluation and completion of customer offers.*/
package org.museframework.bian.collections.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CollectionsOutcome {
    /**/
    @MetaField
    private String collectionsWorkProduct;

    /**/
    @MetaField
    private String collectionsProcedure;

    public void setCollectionsWorkProduct(String collectionsWorkProduct) {
        this.collectionsWorkProduct = collectionsWorkProduct;
    }

    public String getCollectionsWorkProduct() {
        return collectionsWorkProduct;
    }

    public void setCollectionsProcedure(String collectionsProcedure) {
        this.collectionsProcedure = collectionsProcedure;
    }

    public String getCollectionsProcedure() {
        return collectionsProcedure;
    }
}