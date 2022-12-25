/*Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Leasing Item Administration. 
Example: Administer the time reporting and billing for the specialist sales support team.*/
package org.museframework.bian.leaiteadm.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.LeasingItemAdministrativePlan
@MetaDto
public class LeasingItemAdministrativePlan {
    /*A Classification value that distinguishes between Budgets within Leasing Item Administrative Plan according to the type of resource and/or activity that is budgetted*/
    @MetaField(0)
    private String leasingItemAdministrativePlanBudgetType;

    /*An estimate of costs, revenues, and resources  over a specified period which is defined for Leasing Item Administrative Plan*/
    @MetaField(0)
    private String leasingItemAdministrativePlanBudget;

    /*The allocation of someone or something which is specified for Leasing Item Administrative Plan*/
    @MetaField(0)
    private String leasingItemAdministrativePlanAssignment;

    /*A plan that defines clerical support for LeasingItem*/
    @MetaField(0)
    private String leasingItemAdministrativePlan;

    /*Party who is involved in  Leasing Item Administrative Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object leasingItemAdministrativePlanReference;

    public void setLeasingItemAdministrativePlanBudgetType(String leasingItemAdministrativePlanBudgetType) {
        this.leasingItemAdministrativePlanBudgetType = leasingItemAdministrativePlanBudgetType;
    }

    public String getLeasingItemAdministrativePlanBudgetType() {
        return leasingItemAdministrativePlanBudgetType;
    }

    public void setLeasingItemAdministrativePlanBudget(String leasingItemAdministrativePlanBudget) {
        this.leasingItemAdministrativePlanBudget = leasingItemAdministrativePlanBudget;
    }

    public String getLeasingItemAdministrativePlanBudget() {
        return leasingItemAdministrativePlanBudget;
    }

    public void setLeasingItemAdministrativePlanAssignment(String leasingItemAdministrativePlanAssignment) {
        this.leasingItemAdministrativePlanAssignment = leasingItemAdministrativePlanAssignment;
    }

    public String getLeasingItemAdministrativePlanAssignment() {
        return leasingItemAdministrativePlanAssignment;
    }

    public void setLeasingItemAdministrativePlan(String leasingItemAdministrativePlan) {
        this.leasingItemAdministrativePlan = leasingItemAdministrativePlan;
    }

    public String getLeasingItemAdministrativePlan() {
        return leasingItemAdministrativePlan;
    }

    public void setLeasingItemAdministrativePlanReference(org.museframework.bian.classes.Object leasingItemAdministrativePlanReference) {
        this.leasingItemAdministrativePlanReference = leasingItemAdministrativePlanReference;
    }

    public org.museframework.bian.classes.Object getLeasingItemAdministrativePlanReference() {
        return leasingItemAdministrativePlanReference;
    }
}