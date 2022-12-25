/*The product features/services available with a financical facility*/
package org.museframework.bian.conadvser.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductGuidance {
    /*Reference to the consumer tax advisory service (used to access guidance materials)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productandServiceReference;

    /*A record of engaging a product specialist to liaise with the customer*/
    @MetaField(0)
    private String specialistSupportTask;

    /*Business unit and or employee reference for the product specialist engaged*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object specialistEmployeeBusinessUnitReference;

    /*General description of the product specialist advice provided*/
    @MetaField(0)
    private String specialistAdviceDescription;

    /*The service charge to be made to the customer for the specialist support*/
    @MetaField(0)
    private String specialistAdviceCharge;

    /*Summary recommendations arising from the advice that is added to the consolidated record*/
    @MetaField(0)
    private String productGuidanceAdviceResult;

    public void setProductandServiceReference(org.museframework.bian.classes.Object productandServiceReference) {
        this.productandServiceReference = productandServiceReference;
    }

    public org.museframework.bian.classes.Object getProductandServiceReference() {
        return productandServiceReference;
    }

    public void setSpecialistSupportTask(String specialistSupportTask) {
        this.specialistSupportTask = specialistSupportTask;
    }

    public String getSpecialistSupportTask() {
        return specialistSupportTask;
    }

    public void setSpecialistEmployeeBusinessUnitReference(org.museframework.bian.classes.Object specialistEmployeeBusinessUnitReference) {
        this.specialistEmployeeBusinessUnitReference = specialistEmployeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getSpecialistEmployeeBusinessUnitReference() {
        return specialistEmployeeBusinessUnitReference;
    }

    public void setSpecialistAdviceDescription(String specialistAdviceDescription) {
        this.specialistAdviceDescription = specialistAdviceDescription;
    }

    public String getSpecialistAdviceDescription() {
        return specialistAdviceDescription;
    }

    public void setSpecialistAdviceCharge(String specialistAdviceCharge) {
        this.specialistAdviceCharge = specialistAdviceCharge;
    }

    public String getSpecialistAdviceCharge() {
        return specialistAdviceCharge;
    }

    public void setProductGuidanceAdviceResult(String productGuidanceAdviceResult) {
        this.productGuidanceAdviceResult = productGuidanceAdviceResult;
    }

    public String getProductGuidanceAdviceResult() {
        return productGuidanceAdviceResult;
    }
}