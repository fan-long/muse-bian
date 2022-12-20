/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cardcollections.dto.bq;

public class Resolution {
    /*Details of the resolution decision*/
    private String cardCollectionsResolutionDecision;

    /*Work documentation, forms and schedules produced and referenced during the task*/
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