/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Trading Book Oversight.*/
package org.museframework.bian.trabooove.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.TradingPositionManagementPlan
@MetaDto
public class TradingPositionManagementPlan {
    /*The type of Trading Position Management Plan*/
    @MetaField
    private String tradingPositionManagementPlanType;

    /*An unique reference to an item or an occurrence of Trading Position Management Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Plan tradingPositionManagementPlanReference;

    /*A Classification value that distinguishes between Budgets within Trading Position Management Plan according to the type of resource and/or activity that is budgetted*/
    @MetaField
    private String tradingPositionManagementPlanBudgetType;

    /*Amount of budget which is arranged whitin Trading Position Management Plan*/
    @MetaField
    private String tradingPositionManagementPlanBudget;

    /*The set of management responsibilities defined in Trading Position Management Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement tradingPositionManagementPlanDuty;

    /*Documentation of Trading Position Management Plan*/
    @MetaField
    private String tradingPositionManagementPlanDescription;

    /*Balance of budget which is arranged whitin Trading Position Management Plan*/
    @MetaField
    private String tradingPositionManagementPlanBudgetBalance;

    /*Party who is involved in Trading Position Management Plan*/
    @MetaField
    private String tradingPositionManagementPlanAssociatedParty;

    /*The subject matter of Trading Position Management Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object tradingPositionManagementPlanSubjectMatter;

    public void setTradingPositionManagementPlanType(String tradingPositionManagementPlanType) {
        this.tradingPositionManagementPlanType = tradingPositionManagementPlanType;
    }

    public String getTradingPositionManagementPlanType() {
        return tradingPositionManagementPlanType;
    }

    public void setTradingPositionManagementPlanReference(org.museframework.bian.classes.Plan tradingPositionManagementPlanReference) {
        this.tradingPositionManagementPlanReference = tradingPositionManagementPlanReference;
    }

    public org.museframework.bian.classes.Plan getTradingPositionManagementPlanReference() {
        return tradingPositionManagementPlanReference;
    }

    public void setTradingPositionManagementPlanBudgetType(String tradingPositionManagementPlanBudgetType) {
        this.tradingPositionManagementPlanBudgetType = tradingPositionManagementPlanBudgetType;
    }

    public String getTradingPositionManagementPlanBudgetType() {
        return tradingPositionManagementPlanBudgetType;
    }

    public void setTradingPositionManagementPlanBudget(String tradingPositionManagementPlanBudget) {
        this.tradingPositionManagementPlanBudget = tradingPositionManagementPlanBudget;
    }

    public String getTradingPositionManagementPlanBudget() {
        return tradingPositionManagementPlanBudget;
    }

    public void setTradingPositionManagementPlanDuty(org.museframework.bian.classes.Arrangement tradingPositionManagementPlanDuty) {
        this.tradingPositionManagementPlanDuty = tradingPositionManagementPlanDuty;
    }

    public org.museframework.bian.classes.Arrangement getTradingPositionManagementPlanDuty() {
        return tradingPositionManagementPlanDuty;
    }

    public void setTradingPositionManagementPlanDescription(String tradingPositionManagementPlanDescription) {
        this.tradingPositionManagementPlanDescription = tradingPositionManagementPlanDescription;
    }

    public String getTradingPositionManagementPlanDescription() {
        return tradingPositionManagementPlanDescription;
    }

    public void setTradingPositionManagementPlanBudgetBalance(String tradingPositionManagementPlanBudgetBalance) {
        this.tradingPositionManagementPlanBudgetBalance = tradingPositionManagementPlanBudgetBalance;
    }

    public String getTradingPositionManagementPlanBudgetBalance() {
        return tradingPositionManagementPlanBudgetBalance;
    }

    public void setTradingPositionManagementPlanAssociatedParty(String tradingPositionManagementPlanAssociatedParty) {
        this.tradingPositionManagementPlanAssociatedParty = tradingPositionManagementPlanAssociatedParty;
    }

    public String getTradingPositionManagementPlanAssociatedParty() {
        return tradingPositionManagementPlanAssociatedParty;
    }

    public void setTradingPositionManagementPlanSubjectMatter(org.museframework.bian.classes.Object tradingPositionManagementPlanSubjectMatter) {
        this.tradingPositionManagementPlanSubjectMatter = tradingPositionManagementPlanSubjectMatter;
    }

    public org.museframework.bian.classes.Object getTradingPositionManagementPlanSubjectMatter() {
        return tradingPositionManagementPlanSubjectMatter;
    }
}