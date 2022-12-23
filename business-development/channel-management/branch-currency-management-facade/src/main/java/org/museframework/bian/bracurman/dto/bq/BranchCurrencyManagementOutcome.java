/*Set of rules for the purpose of deciding if or if not something is applicable

Examples: Staff assignment, Facility allocation.*/
package org.museframework.bian.bracurman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class BranchCurrencyManagementOutcome {
    /**/
    @MetaField
    private String branchCurrencyManagementAllocation;

    /**/
    @MetaField
    private String branchCurrencyManagementWorkProduct;

    public void setBranchCurrencyManagementAllocation(String branchCurrencyManagementAllocation) {
        this.branchCurrencyManagementAllocation = branchCurrencyManagementAllocation;
    }

    public String getBranchCurrencyManagementAllocation() {
        return branchCurrencyManagementAllocation;
    }

    public void setBranchCurrencyManagementWorkProduct(String branchCurrencyManagementWorkProduct) {
        this.branchCurrencyManagementWorkProduct = branchCurrencyManagementWorkProduct;
    }

    public String getBranchCurrencyManagementWorkProduct() {
        return branchCurrencyManagementWorkProduct;
    }
}