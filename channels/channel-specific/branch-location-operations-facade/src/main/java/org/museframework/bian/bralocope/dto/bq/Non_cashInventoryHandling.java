/*The Non-cash Inventory Handling is an activity that is performed as one aspect of carrying out the Branch Location Administration Plan
*/
package org.museframework.bian.bralocope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Non_cashInventoryHandling {
    /*The required status/situation before the routine can be undertaken*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for performing the routine*/
    @MetaField
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in completing the routine*/
    @MetaField
    private String schedule;

    /*The <BQ> specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Branch Location Administrative Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Plan branchLocationAdministrativePlanReference;

    /*Reference to the Non-cash Inventory Handling*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.PlannedAction non_cashInventoryHandlingReference;

    /*The type of Non-cash Inventory Handling*/
    @MetaField
    private String non_cashInventoryHandlingType;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setBusinessUnitEmployeeReference(String businessUnitEmployeeReference) {
        this.businessUnitEmployeeReference = businessUnitEmployeeReference;
    }

    public String getBusinessUnitEmployeeReference() {
        return businessUnitEmployeeReference;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setPostconditions(org.museframework.bian.classes.Condition postconditions) {
        this.postconditions = postconditions;
    }

    public org.museframework.bian.classes.Condition getPostconditions() {
        return postconditions;
    }

    public void setBranchLocationAdministrativePlanReference(org.museframework.bian.classes.Plan branchLocationAdministrativePlanReference) {
        this.branchLocationAdministrativePlanReference = branchLocationAdministrativePlanReference;
    }

    public org.museframework.bian.classes.Plan getBranchLocationAdministrativePlanReference() {
        return branchLocationAdministrativePlanReference;
    }

    public void setNon_cashInventoryHandlingReference(org.museframework.bian.classes.PlannedAction non_cashInventoryHandlingReference) {
        this.non_cashInventoryHandlingReference = non_cashInventoryHandlingReference;
    }

    public org.museframework.bian.classes.PlannedAction getNon_cashInventoryHandlingReference() {
        return non_cashInventoryHandlingReference;
    }

    public void setNon_cashInventoryHandlingType(String non_cashInventoryHandlingType) {
        this.non_cashInventoryHandlingType = non_cashInventoryHandlingType;
    }

    public String getNon_cashInventoryHandlingType() {
        return non_cashInventoryHandlingType;
    }
}