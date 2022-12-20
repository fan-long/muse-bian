/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.brandmanagement.dto.bq;

public class BrandAdvice extends org.museframework.bian.classes.BrandAdvice {
    /*The type of work task (e.g. assess brand exposure, incorporate brand in design)*/
    private String brandAdviceWorkTaskType;

    /*The make-up of the advice task performed, includes schedule of meetings/working sessions and provision of guidance materials*/
    private String brandAdviceWorkTask;

    /*File of consolidated notes, evaluations and recommendations for the work task*/
    private String brandAdviceWorkTaskWorkProducts;

    /*Details of the outcome or result of the work task - capturing any use of brand that might requires tracking*/
    private String brandAdviceWorkTaskResult;

    /*The date-time associated with the delivery of brand advice task*/
    private String brandAdviceWorkTaskDate_Time;

    public void setBrandAdviceWorkTaskType(String brandAdviceWorkTaskType) {
        this.brandAdviceWorkTaskType = brandAdviceWorkTaskType;
    }

    public String getBrandAdviceWorkTaskType() {
        return brandAdviceWorkTaskType;
    }

    public void setBrandAdviceWorkTask(String brandAdviceWorkTask) {
        this.brandAdviceWorkTask = brandAdviceWorkTask;
    }

    public String getBrandAdviceWorkTask() {
        return brandAdviceWorkTask;
    }

    public void setBrandAdviceWorkTaskWorkProducts(String brandAdviceWorkTaskWorkProducts) {
        this.brandAdviceWorkTaskWorkProducts = brandAdviceWorkTaskWorkProducts;
    }

    public String getBrandAdviceWorkTaskWorkProducts() {
        return brandAdviceWorkTaskWorkProducts;
    }

    public void setBrandAdviceWorkTaskResult(String brandAdviceWorkTaskResult) {
        this.brandAdviceWorkTaskResult = brandAdviceWorkTaskResult;
    }

    public String getBrandAdviceWorkTaskResult() {
        return brandAdviceWorkTaskResult;
    }

    public void setBrandAdviceWorkTaskDate_Time(String brandAdviceWorkTaskDate_Time) {
        this.brandAdviceWorkTaskDate_Time = brandAdviceWorkTaskDate_Time;
    }

    public String getBrandAdviceWorkTaskDate_Time() {
        return brandAdviceWorkTaskDate_Time;
    }
}