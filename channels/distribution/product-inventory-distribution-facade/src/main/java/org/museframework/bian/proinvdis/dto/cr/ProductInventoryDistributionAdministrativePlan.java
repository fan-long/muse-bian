/*Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Product Inventory Distribution. 
Example: Administer the time reporting and billing for the specialist sales support team.*/
package org.museframework.bian.proinvdis.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductInventoryDistributionAdministrativePlan extends org.museframework.bian.classes.ProductInventoryDistributionAdministrativePlan {
    /*A Classification value that distinguishes between Budgets within Product Inventory Distribution AdministrativePlan according to the type of resource and/or activity that is budgetted*/
    @MetaField
    private String productInventoryDistributionAdministrativePlanBudgetType;

    /*An estimate of costs, revenues, and resources  over a specified period which is defined for Product Inventory Distribution AdministrativePlan*/
    @MetaField
    private String productInventoryDistributionAdministrativePlanBudget;

    /*The allocation of someone or something which is specified for Product Inventory Distribution AdministrativePlan*/
    @MetaField
    private String productInventoryDistributionAdministrativePlanAssignment;

    /*A plan that defines clerical support for ProductInventoryDistribution*/
    @MetaField
    private String productInventoryDistributionAdministrativePlanPlan;

    /*Party who is involved in  Product Inventory Distribution AdministrativePlan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInventoryDistributionAdministrativePlanReference;

    public void setProductInventoryDistributionAdministrativePlanBudgetType(String productInventoryDistributionAdministrativePlanBudgetType) {
        this.productInventoryDistributionAdministrativePlanBudgetType = productInventoryDistributionAdministrativePlanBudgetType;
    }

    public String getProductInventoryDistributionAdministrativePlanBudgetType() {
        return productInventoryDistributionAdministrativePlanBudgetType;
    }

    public void setProductInventoryDistributionAdministrativePlanBudget(String productInventoryDistributionAdministrativePlanBudget) {
        this.productInventoryDistributionAdministrativePlanBudget = productInventoryDistributionAdministrativePlanBudget;
    }

    public String getProductInventoryDistributionAdministrativePlanBudget() {
        return productInventoryDistributionAdministrativePlanBudget;
    }

    public void setProductInventoryDistributionAdministrativePlanAssignment(String productInventoryDistributionAdministrativePlanAssignment) {
        this.productInventoryDistributionAdministrativePlanAssignment = productInventoryDistributionAdministrativePlanAssignment;
    }

    public String getProductInventoryDistributionAdministrativePlanAssignment() {
        return productInventoryDistributionAdministrativePlanAssignment;
    }

    public void setProductInventoryDistributionAdministrativePlanPlan(String productInventoryDistributionAdministrativePlanPlan) {
        this.productInventoryDistributionAdministrativePlanPlan = productInventoryDistributionAdministrativePlanPlan;
    }

    public String getProductInventoryDistributionAdministrativePlanPlan() {
        return productInventoryDistributionAdministrativePlanPlan;
    }

    public void setProductInventoryDistributionAdministrativePlanReference(org.museframework.bian.classes.Object productInventoryDistributionAdministrativePlanReference) {
        this.productInventoryDistributionAdministrativePlanReference = productInventoryDistributionAdministrativePlanReference;
    }

    public org.museframework.bian.classes.Object getProductInventoryDistributionAdministrativePlanReference() {
        return productInventoryDistributionAdministrativePlanReference;
    }
}