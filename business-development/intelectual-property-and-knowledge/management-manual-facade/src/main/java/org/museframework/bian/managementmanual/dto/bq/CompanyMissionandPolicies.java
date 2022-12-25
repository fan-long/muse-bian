/*Create and maintain a design for a procedure, product/service model or other such entity  within Management Manual. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.managementmanual.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CompanyMissionandPolicies {
    /*The required status/situation before the specification aspect can be defined*/
    @MetaField(0)
    private String companyMissionandPoliciesPreconditions;

    /*The schedule and timing of the definition and update/revisions of the specification aspect*/
    @MetaField(0)
    private String companyMissionandPoliciesSpecificationSchedule;

    /*The current version, and version history as appropriate for the specification aspect*/
    @MetaField(0)
    private String companyMissionandPoliciesVersionNumber;

    /*The Management Manual Specification specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService companyMissionandPolicies;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String companyMissionandPoliciesServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String companyMissionandPoliciesServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String companyMissionandPoliciesServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String companyMissionandPoliciesServiceWorkProduct;

    /**/
    @MetaField(0)
    private String companyMissionandPoliciesServiceName;

    public void setCompanyMissionandPoliciesPreconditions(String companyMissionandPoliciesPreconditions) {
        this.companyMissionandPoliciesPreconditions = companyMissionandPoliciesPreconditions;
    }

    public String getCompanyMissionandPoliciesPreconditions() {
        return companyMissionandPoliciesPreconditions;
    }

    public void setCompanyMissionandPoliciesSpecificationSchedule(String companyMissionandPoliciesSpecificationSchedule) {
        this.companyMissionandPoliciesSpecificationSchedule = companyMissionandPoliciesSpecificationSchedule;
    }

    public String getCompanyMissionandPoliciesSpecificationSchedule() {
        return companyMissionandPoliciesSpecificationSchedule;
    }

    public void setCompanyMissionandPoliciesVersionNumber(String companyMissionandPoliciesVersionNumber) {
        this.companyMissionandPoliciesVersionNumber = companyMissionandPoliciesVersionNumber;
    }

    public String getCompanyMissionandPoliciesVersionNumber() {
        return companyMissionandPoliciesVersionNumber;
    }

    public void setCompanyMissionandPolicies(org.museframework.bian.classes.BusinessService companyMissionandPolicies) {
        this.companyMissionandPolicies = companyMissionandPolicies;
    }

    public org.museframework.bian.classes.BusinessService getCompanyMissionandPolicies() {
        return companyMissionandPolicies;
    }

    public void setCompanyMissionandPoliciesServiceType(String companyMissionandPoliciesServiceType) {
        this.companyMissionandPoliciesServiceType = companyMissionandPoliciesServiceType;
    }

    public String getCompanyMissionandPoliciesServiceType() {
        return companyMissionandPoliciesServiceType;
    }

    public void setCompanyMissionandPoliciesServiceDescription(String companyMissionandPoliciesServiceDescription) {
        this.companyMissionandPoliciesServiceDescription = companyMissionandPoliciesServiceDescription;
    }

    public String getCompanyMissionandPoliciesServiceDescription() {
        return companyMissionandPoliciesServiceDescription;
    }

    public void setCompanyMissionandPoliciesServiceInputsandOuputs(String companyMissionandPoliciesServiceInputsandOuputs) {
        this.companyMissionandPoliciesServiceInputsandOuputs = companyMissionandPoliciesServiceInputsandOuputs;
    }

    public String getCompanyMissionandPoliciesServiceInputsandOuputs() {
        return companyMissionandPoliciesServiceInputsandOuputs;
    }

    public void setCompanyMissionandPoliciesServiceWorkProduct(String companyMissionandPoliciesServiceWorkProduct) {
        this.companyMissionandPoliciesServiceWorkProduct = companyMissionandPoliciesServiceWorkProduct;
    }

    public String getCompanyMissionandPoliciesServiceWorkProduct() {
        return companyMissionandPoliciesServiceWorkProduct;
    }

    public void setCompanyMissionandPoliciesServiceName(String companyMissionandPoliciesServiceName) {
        this.companyMissionandPoliciesServiceName = companyMissionandPoliciesServiceName;
    }

    public String getCompanyMissionandPoliciesServiceName() {
        return companyMissionandPoliciesServiceName;
    }
}