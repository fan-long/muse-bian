/*A Service Arrangment which is promosed and committed for Project Financing.

Project financing is a loan structure that relies primarily on the project's cash flow for repayment, with the project's assets, rights, and interests held as secondary collateral. 
https://www.investopedia.com/terms/p/projectfinance.asp
*/
package org.museframework.bian.classes;

public class ProjectFinanceArrangement {
    /**/
    private org.museframework.bian.enumerations.Projectfinancearrangementtypevalues projectFinanceArrangementType;

    public void setProjectFinanceArrangementType(org.museframework.bian.enumerations.Projectfinancearrangementtypevalues projectFinanceArrangementType) {
        this.projectFinanceArrangementType = projectFinanceArrangementType;
    }

    public org.museframework.bian.enumerations.Projectfinancearrangementtypevalues getProjectFinanceArrangementType() {
        return projectFinanceArrangementType;
    }
}