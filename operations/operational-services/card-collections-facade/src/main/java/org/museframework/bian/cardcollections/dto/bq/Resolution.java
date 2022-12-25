/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cardcollections.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Resolution {
    /*Details of the resolution decision*/
    @MetaField(0)
    private String cardCollectionsResolutionDecision;

    /*Work documentation, forms and schedules produced and referenced during the task*/
    @MetaField(0)
    private String cardCollectionsResolutionWorkProduct;

    public void setCardCollectionsResolutionDecision(String cardCollectionsResolutionDecision) {
        this.cardCollectionsResolutionDecision = cardCollectionsResolutionDecision;
    }

    public String getCardCollectionsResolutionDecision() {
        return cardCollectionsResolutionDecision;
    }

    public void setCardCollectionsResolutionWorkProduct(String cardCollectionsResolutionWorkProduct) {
        this.cardCollectionsResolutionWorkProduct = cardCollectionsResolutionWorkProduct;
    }

    public String getCardCollectionsResolutionWorkProduct() {
        return cardCollectionsResolutionWorkProduct;
    }
}