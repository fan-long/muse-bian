/*The Staff Availability Tracking Routine is an activity that is performed as one aspect of carrying out the Staff Availability Tracking Routine*/
package org.museframework.bian.prosalsup.dto.bq;

public class ProductSalesSupportOutcome {
    /**/
    private org.museframework.bian.classes.Analysis productSalesSupportPerformanceAnalysis;

    /**/
    private org.museframework.bian.classes.Analysis productSalesSupportActivityAnalysis;

    /**/
    private org.museframework.bian.classes.Plan productSalesSupportAdministrativePlan;

    /**/
    private org.museframework.bian.classes.Arrangement productSalesSupportAdministrationTask;

    public void setProductSalesSupportPerformanceAnalysis(org.museframework.bian.classes.Analysis productSalesSupportPerformanceAnalysis) {
        this.productSalesSupportPerformanceAnalysis = productSalesSupportPerformanceAnalysis;
    }

    public org.museframework.bian.classes.Analysis getProductSalesSupportPerformanceAnalysis() {
        return productSalesSupportPerformanceAnalysis;
    }

    public void setProductSalesSupportActivityAnalysis(org.museframework.bian.classes.Analysis productSalesSupportActivityAnalysis) {
        this.productSalesSupportActivityAnalysis = productSalesSupportActivityAnalysis;
    }

    public org.museframework.bian.classes.Analysis getProductSalesSupportActivityAnalysis() {
        return productSalesSupportActivityAnalysis;
    }

    public void setProductSalesSupportAdministrativePlan(org.museframework.bian.classes.Plan productSalesSupportAdministrativePlan) {
        this.productSalesSupportAdministrativePlan = productSalesSupportAdministrativePlan;
    }

    public org.museframework.bian.classes.Plan getProductSalesSupportAdministrativePlan() {
        return productSalesSupportAdministrativePlan;
    }

    public void setProductSalesSupportAdministrationTask(org.museframework.bian.classes.Arrangement productSalesSupportAdministrationTask) {
        this.productSalesSupportAdministrationTask = productSalesSupportAdministrationTask;
    }

    public org.museframework.bian.classes.Arrangement getProductSalesSupportAdministrationTask() {
        return productSalesSupportAdministrationTask;
    }
}