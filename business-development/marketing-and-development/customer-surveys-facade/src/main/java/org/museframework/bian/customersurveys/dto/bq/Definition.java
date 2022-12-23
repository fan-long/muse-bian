/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.customersurveys.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Definition {
    /*The type of work task (e.g. research survey context, refine/trial questionnaire, develop supporting materials)*/
    @MetaField
    private String customerSurveyDesignWorkTaskType;

    /*Description of the survey development task performed*/
    @MetaField
    private String customerSurveyDesignWorkTaskDescription;

    /*File of consolidated notes, forms and documents for the work task*/
    @MetaField
    private String customerSurveyDesignWorkTaskWorkProducts;

    /*Details of the outcome or result of the work task - specifically developed materials to be used in survey execution*/
    @MetaField
    private String customerSurveyDesignWorkTaskResult;

    public void setCustomerSurveyDesignWorkTaskType(String customerSurveyDesignWorkTaskType) {
        this.customerSurveyDesignWorkTaskType = customerSurveyDesignWorkTaskType;
    }

    public String getCustomerSurveyDesignWorkTaskType() {
        return customerSurveyDesignWorkTaskType;
    }

    public void setCustomerSurveyDesignWorkTaskDescription(String customerSurveyDesignWorkTaskDescription) {
        this.customerSurveyDesignWorkTaskDescription = customerSurveyDesignWorkTaskDescription;
    }

    public String getCustomerSurveyDesignWorkTaskDescription() {
        return customerSurveyDesignWorkTaskDescription;
    }

    public void setCustomerSurveyDesignWorkTaskWorkProducts(String customerSurveyDesignWorkTaskWorkProducts) {
        this.customerSurveyDesignWorkTaskWorkProducts = customerSurveyDesignWorkTaskWorkProducts;
    }

    public String getCustomerSurveyDesignWorkTaskWorkProducts() {
        return customerSurveyDesignWorkTaskWorkProducts;
    }

    public void setCustomerSurveyDesignWorkTaskResult(String customerSurveyDesignWorkTaskResult) {
        this.customerSurveyDesignWorkTaskResult = customerSurveyDesignWorkTaskResult;
    }

    public String getCustomerSurveyDesignWorkTaskResult() {
        return customerSurveyDesignWorkTaskResult;
    }
}