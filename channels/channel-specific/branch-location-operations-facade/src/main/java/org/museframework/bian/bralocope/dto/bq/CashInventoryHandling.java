/*The Non-cash Inventory Handling is an activity that is performed as one aspect of carrying out the Branch Location Administration Plan
*/
package org.museframework.bian.bralocope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CashInventoryHandling {
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

    /*Reference to the Branch Location Administrative Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Plan branchLocationAdministrationPlanReference;

    /*Reference to the Cash Inventory Handling*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.PlannedAction cashInventoryHandlingReference;

    /*The type of Cash Inventory Handling*/
    @MetaField
    private String cashInventoryHandlingType;

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

    public void setBranchLocationAdministrationPlanReference(org.museframework.bian.classes.Plan branchLocationAdministrationPlanReference) {
        this.branchLocationAdministrationPlanReference = branchLocationAdministrationPlanReference;
    }

    public org.museframework.bian.classes.Plan getBranchLocationAdministrationPlanReference() {
        return branchLocationAdministrationPlanReference;
    }

    public void setCashInventoryHandlingReference(org.museframework.bian.classes.PlannedAction cashInventoryHandlingReference) {
        this.cashInventoryHandlingReference = cashInventoryHandlingReference;
    }

    public org.museframework.bian.classes.PlannedAction getCashInventoryHandlingReference() {
        return cashInventoryHandlingReference;
    }

    public void setCashInventoryHandlingType(String cashInventoryHandlingType) {
        this.cashInventoryHandlingType = cashInventoryHandlingType;
    }

    public String getCashInventoryHandlingType() {
        return cashInventoryHandlingType;
    }
}