/*Set of rules for the purpose of deciding if or if not something is applicable

Examples: Staff assignment, Facility allocation.*/
package org.museframework.bian.bracurman.dto.bq;

public class BranchCurrencyManagementOutcome {
    /**/
    private String branchCurrencyManagementAllocation;

    /**/
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