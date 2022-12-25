/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.bracurdis.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class BranchCurrencyDistributionOutcome {
    /**/
    @MetaField(0)
    private String branchCurrencyDistributionWorkProduct;

    /**/
    @MetaField(0)
    private String branchCurrencyDistributionProcedure;

    public void setBranchCurrencyDistributionWorkProduct(String branchCurrencyDistributionWorkProduct) {
        this.branchCurrencyDistributionWorkProduct = branchCurrencyDistributionWorkProduct;
    }

    public String getBranchCurrencyDistributionWorkProduct() {
        return branchCurrencyDistributionWorkProduct;
    }

    public void setBranchCurrencyDistributionProcedure(String branchCurrencyDistributionProcedure) {
        this.branchCurrencyDistributionProcedure = branchCurrencyDistributionProcedure;
    }

    public String getBranchCurrencyDistributionProcedure() {
        return branchCurrencyDistributionProcedure;
    }
}