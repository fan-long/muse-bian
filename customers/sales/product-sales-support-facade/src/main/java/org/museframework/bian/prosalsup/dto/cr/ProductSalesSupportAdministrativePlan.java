/*Handle and assign the day to day activities, capture time, costs and income for an operational unit within Product Sales Support. */
package org.museframework.bian.prosalsup.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.ProductSalesSupportAdministrativePlan
@MetaDto
public class ProductSalesSupportAdministrativePlan {
    /*A Classification value that distinguishes between Budgets within Product Sales Support Administrative Plan according to the type of resource and/or activity that is budgetted*/
    @MetaField(0)
    private String productSalesSupportAdministrativePlanBudgetType;

    /*Amount of budget which is arranged whitin Product Sales Support Administrative Plan*/
    @MetaField(0)
    private String productSalesSupportAdministrativePlanBudget;

    /*The set of administrative responsibilities defined in Product Sales Support Administrative Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement productSalesSupportAdministrativePlanDuty;

    /*Party who is involved in Product Sales Support Administrative Plan*/
    @MetaField(0)
    private String productSalesSupportAdministrativePlanAssociatedParty;

    /*Balance of budget which is arranged whitin Product Sales Support Administrative Plan*/
    @MetaField(0)
    private String productSalesSupportAdministrativePlanBudgetBalance;

    /*The subject matter of Product Sales Support Administrative Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productSalesSupportAdministrativePlanSubjectMatter;

    /*The type of Product Sales Support Administrative Plan*/
    @MetaField(0)
    private String productSalesSupportAdministrativePlanType;

    /*An unique reference to an item or an occurrence of Product Sales Support Administrative Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Plan productSalesSupportAdministrativePlanReference;

    /*Documentation of Product Sales Support Administrative Plan*/
    @MetaField(0)
    private String productSalesSupportAdministrativePlanDescription;

    public void setProductSalesSupportAdministrativePlanBudgetType(String productSalesSupportAdministrativePlanBudgetType) {
        this.productSalesSupportAdministrativePlanBudgetType = productSalesSupportAdministrativePlanBudgetType;
    }

    public String getProductSalesSupportAdministrativePlanBudgetType() {
        return productSalesSupportAdministrativePlanBudgetType;
    }

    public void setProductSalesSupportAdministrativePlanBudget(String productSalesSupportAdministrativePlanBudget) {
        this.productSalesSupportAdministrativePlanBudget = productSalesSupportAdministrativePlanBudget;
    }

    public String getProductSalesSupportAdministrativePlanBudget() {
        return productSalesSupportAdministrativePlanBudget;
    }

    public void setProductSalesSupportAdministrativePlanDuty(org.museframework.bian.classes.Arrangement productSalesSupportAdministrativePlanDuty) {
        this.productSalesSupportAdministrativePlanDuty = productSalesSupportAdministrativePlanDuty;
    }

    public org.museframework.bian.classes.Arrangement getProductSalesSupportAdministrativePlanDuty() {
        return productSalesSupportAdministrativePlanDuty;
    }

    public void setProductSalesSupportAdministrativePlanAssociatedParty(String productSalesSupportAdministrativePlanAssociatedParty) {
        this.productSalesSupportAdministrativePlanAssociatedParty = productSalesSupportAdministrativePlanAssociatedParty;
    }

    public String getProductSalesSupportAdministrativePlanAssociatedParty() {
        return productSalesSupportAdministrativePlanAssociatedParty;
    }

    public void setProductSalesSupportAdministrativePlanBudgetBalance(String productSalesSupportAdministrativePlanBudgetBalance) {
        this.productSalesSupportAdministrativePlanBudgetBalance = productSalesSupportAdministrativePlanBudgetBalance;
    }

    public String getProductSalesSupportAdministrativePlanBudgetBalance() {
        return productSalesSupportAdministrativePlanBudgetBalance;
    }

    public void setProductSalesSupportAdministrativePlanSubjectMatter(org.museframework.bian.classes.Object productSalesSupportAdministrativePlanSubjectMatter) {
        this.productSalesSupportAdministrativePlanSubjectMatter = productSalesSupportAdministrativePlanSubjectMatter;
    }

    public org.museframework.bian.classes.Object getProductSalesSupportAdministrativePlanSubjectMatter() {
        return productSalesSupportAdministrativePlanSubjectMatter;
    }

    public void setProductSalesSupportAdministrativePlanType(String productSalesSupportAdministrativePlanType) {
        this.productSalesSupportAdministrativePlanType = productSalesSupportAdministrativePlanType;
    }

    public String getProductSalesSupportAdministrativePlanType() {
        return productSalesSupportAdministrativePlanType;
    }

    public void setProductSalesSupportAdministrativePlanReference(org.museframework.bian.classes.Plan productSalesSupportAdministrativePlanReference) {
        this.productSalesSupportAdministrativePlanReference = productSalesSupportAdministrativePlanReference;
    }

    public org.museframework.bian.classes.Plan getProductSalesSupportAdministrativePlanReference() {
        return productSalesSupportAdministrativePlanReference;
    }

    public void setProductSalesSupportAdministrativePlanDescription(String productSalesSupportAdministrativePlanDescription) {
        this.productSalesSupportAdministrativePlanDescription = productSalesSupportAdministrativePlanDescription;
    }

    public String getProductSalesSupportAdministrativePlanDescription() {
        return productSalesSupportAdministrativePlanDescription;
    }
}