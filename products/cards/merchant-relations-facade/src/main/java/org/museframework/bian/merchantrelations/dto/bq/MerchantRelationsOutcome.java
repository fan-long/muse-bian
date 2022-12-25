/*Covers the legal considerations of the agreement*/
package org.museframework.bian.merchantrelations.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MerchantRelationsOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement merchantRelationsAgreement;

    /**/
    @MetaField(0)
    private String merchantRelationsWorkProduct;

    public void setMerchantRelationsAgreement(org.museframework.bian.classes.Agreement merchantRelationsAgreement) {
        this.merchantRelationsAgreement = merchantRelationsAgreement;
    }

    public org.museframework.bian.classes.Agreement getMerchantRelationsAgreement() {
        return merchantRelationsAgreement;
    }

    public void setMerchantRelationsWorkProduct(String merchantRelationsWorkProduct) {
        this.merchantRelationsWorkProduct = merchantRelationsWorkProduct;
    }

    public String getMerchantRelationsWorkProduct() {
        return merchantRelationsWorkProduct;
    }
}