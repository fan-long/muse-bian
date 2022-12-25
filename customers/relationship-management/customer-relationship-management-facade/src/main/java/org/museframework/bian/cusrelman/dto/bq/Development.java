/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.cusrelman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Development {
    /*A specific task undertaken to develop the relationship*/
    @MetaField(0)
    private String relationshipDevelopmentTask;

    /*The type of relationship development activity (e.g. sales, product explanation, financial advice)*/
    @MetaField(0)
    private String customerDevelopmentTaskType;

    /*A description of the task, including any intelligence gathered and follow up actions agreed*/
    @MetaField(0)
    private String customerDevelopmentTaskDescription;

    /*A plan outlining longer term relationship goals and performance/profitability both target and actual*/
    @MetaField(0)
    private String customerRelationshipDevelopmentPlan;

    /*Reference to relationship managers and product specialists linked to the plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Work documentation, forms and schedules produced and referenced during the task*/
    @MetaField(0)
    private String customerDevelopmentWorkProduct;

    /*The outcomes of customer development activity*/
    @MetaField(0)
    private String customerDevelopmentTaskResult;

    public void setRelationshipDevelopmentTask(String relationshipDevelopmentTask) {
        this.relationshipDevelopmentTask = relationshipDevelopmentTask;
    }

    public String getRelationshipDevelopmentTask() {
        return relationshipDevelopmentTask;
    }

    public void setCustomerDevelopmentTaskType(String customerDevelopmentTaskType) {
        this.customerDevelopmentTaskType = customerDevelopmentTaskType;
    }

    public String getCustomerDevelopmentTaskType() {
        return customerDevelopmentTaskType;
    }

    public void setCustomerDevelopmentTaskDescription(String customerDevelopmentTaskDescription) {
        this.customerDevelopmentTaskDescription = customerDevelopmentTaskDescription;
    }

    public String getCustomerDevelopmentTaskDescription() {
        return customerDevelopmentTaskDescription;
    }

    public void setCustomerRelationshipDevelopmentPlan(String customerRelationshipDevelopmentPlan) {
        this.customerRelationshipDevelopmentPlan = customerRelationshipDevelopmentPlan;
    }

    public String getCustomerRelationshipDevelopmentPlan() {
        return customerRelationshipDevelopmentPlan;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setCustomerDevelopmentWorkProduct(String customerDevelopmentWorkProduct) {
        this.customerDevelopmentWorkProduct = customerDevelopmentWorkProduct;
    }

    public String getCustomerDevelopmentWorkProduct() {
        return customerDevelopmentWorkProduct;
    }

    public void setCustomerDevelopmentTaskResult(String customerDevelopmentTaskResult) {
        this.customerDevelopmentTaskResult = customerDevelopmentTaskResult;
    }

    public String getCustomerDevelopmentTaskResult() {
        return customerDevelopmentTaskResult;
    }
}