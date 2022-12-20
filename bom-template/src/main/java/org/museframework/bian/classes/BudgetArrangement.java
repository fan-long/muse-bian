/*An arrangement which is specifying an estimate of costs, revenues, and resources over a specified period, reflecting a reading of future financial conditions and goals. (adapted from Business Dictionary)

Read more: http://www.businessdictionary.com/definition/budget.html


A budget is an estimation of revenue and expenses over a specified future period of time and is utilized by governments, businesses, and individuals.
A budget is basically a financial plan for a defined period, normally a year that is known to greatly enhance the success of any financial undertaking. (Investopedia)

https://www.investopedia.com/terms/b/budget.asp*/
package org.museframework.bian.classes;

public class BudgetArrangement {
    /*A Classification value that specifies the type of Budget*/
    private String budgetType;

    /**/
    private String budgetAmount;

    public void setBudgetType(String budgetType) {
        this.budgetType = budgetType;
    }

    public String getBudgetType() {
        return budgetType;
    }

    public void setBudgetAmount(String budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public String getBudgetAmount() {
        return budgetAmount;
    }
}