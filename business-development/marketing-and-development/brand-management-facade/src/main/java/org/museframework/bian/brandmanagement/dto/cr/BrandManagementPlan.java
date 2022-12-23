/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Brand Management.*/
package org.museframework.bian.brandmanagement.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class BrandManagementPlan extends org.museframework.bian.classes.BrandManagementPlan {
    /*Definition of the brand, including how it is to be represented in different media and contexts*/
    @MetaField
    private String brandDefinition;

    /*An analysis of the brand value based on comparative market research*/
    @MetaField
    private String brandValueAssessment;

    /*An inventory of situations where the brand is incorporated or exposed in business development activity - these situations may require on-going exposure monitoring or assessment*/
    @MetaField
    private String brandUsage;

    /*Schedule of any brand development related activities, includes usage and exposure tracking and impact analysis activities*/
    @MetaField
    private String brandDevelopmentSchedule;

    public void setBrandDefinition(String brandDefinition) {
        this.brandDefinition = brandDefinition;
    }

    public String getBrandDefinition() {
        return brandDefinition;
    }

    public void setBrandValueAssessment(String brandValueAssessment) {
        this.brandValueAssessment = brandValueAssessment;
    }

    public String getBrandValueAssessment() {
        return brandValueAssessment;
    }

    public void setBrandUsage(String brandUsage) {
        this.brandUsage = brandUsage;
    }

    public String getBrandUsage() {
        return brandUsage;
    }

    public void setBrandDevelopmentSchedule(String brandDevelopmentSchedule) {
        this.brandDevelopmentSchedule = brandDevelopmentSchedule;
    }

    public String getBrandDevelopmentSchedule() {
        return brandDevelopmentSchedule;
    }
}