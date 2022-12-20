/*The Strategic Funding Topic advice is one specific topic that can be included in providing Strategic Funding Topic*/
package org.museframework.bian.corporatefinance.dto.bq;

public class CorporateFinanceOutcome {
    /**/
    private org.museframework.bian.classes.Project corporateFinanceProject;

    /**/
    private String corporateFinanceWorkProduct;

    /**/
    private org.museframework.bian.classes.Analysis corporateFinanceWorkforceAnalysis;

    public void setCorporateFinanceProject(org.museframework.bian.classes.Project corporateFinanceProject) {
        this.corporateFinanceProject = corporateFinanceProject;
    }

    public org.museframework.bian.classes.Project getCorporateFinanceProject() {
        return corporateFinanceProject;
    }

    public void setCorporateFinanceWorkProduct(String corporateFinanceWorkProduct) {
        this.corporateFinanceWorkProduct = corporateFinanceWorkProduct;
    }

    public String getCorporateFinanceWorkProduct() {
        return corporateFinanceWorkProduct;
    }

    public void setCorporateFinanceWorkforceAnalysis(org.museframework.bian.classes.Analysis corporateFinanceWorkforceAnalysis) {
        this.corporateFinanceWorkforceAnalysis = corporateFinanceWorkforceAnalysis;
    }

    public org.museframework.bian.classes.Analysis getCorporateFinanceWorkforceAnalysis() {
        return corporateFinanceWorkforceAnalysis;
    }
}