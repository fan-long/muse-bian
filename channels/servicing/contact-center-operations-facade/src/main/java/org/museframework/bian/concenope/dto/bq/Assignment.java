/*A collection of one or more clerical routines that are to be followed to administer the operational unit/function

Examples: Time-sheet recording*/
package org.museframework.bian.concenope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Assignment {
    /*Reference to the servicing representative*/
    @MetaField
    private String assignmentCustomerServicingRepresentative;

    /*Reference to the assigned servicing position/desk within the contact center*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object assignmentCustomerServicingPositionReference;

    /*Details any specific properties for the assigned servicing position (e.g. type of product/service covered, required qualifications/certifications/experience)*/
    @MetaField
    private String assignmentCustomerServicingPositionProfile;

    /*Planned and actual servicing activity at the position during the session (records inbound contact details and allows for pre-assigned servicing actions e.g. outbound customer contacts for issue resolution/sales)*/
    @MetaField
    private String assignmentCustomerServicingPositionSchedule;

    /*Reference to the customer contact record for customer interactions during the servicing session*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerContactSessionProcedureInstanceReference;

    public void setAssignmentCustomerServicingRepresentative(String assignmentCustomerServicingRepresentative) {
        this.assignmentCustomerServicingRepresentative = assignmentCustomerServicingRepresentative;
    }

    public String getAssignmentCustomerServicingRepresentative() {
        return assignmentCustomerServicingRepresentative;
    }

    public void setAssignmentCustomerServicingPositionReference(org.museframework.bian.classes.Object assignmentCustomerServicingPositionReference) {
        this.assignmentCustomerServicingPositionReference = assignmentCustomerServicingPositionReference;
    }

    public org.museframework.bian.classes.Object getAssignmentCustomerServicingPositionReference() {
        return assignmentCustomerServicingPositionReference;
    }

    public void setAssignmentCustomerServicingPositionProfile(String assignmentCustomerServicingPositionProfile) {
        this.assignmentCustomerServicingPositionProfile = assignmentCustomerServicingPositionProfile;
    }

    public String getAssignmentCustomerServicingPositionProfile() {
        return assignmentCustomerServicingPositionProfile;
    }

    public void setAssignmentCustomerServicingPositionSchedule(String assignmentCustomerServicingPositionSchedule) {
        this.assignmentCustomerServicingPositionSchedule = assignmentCustomerServicingPositionSchedule;
    }

    public String getAssignmentCustomerServicingPositionSchedule() {
        return assignmentCustomerServicingPositionSchedule;
    }

    public void setCustomerContactSessionProcedureInstanceReference(org.museframework.bian.classes.Object customerContactSessionProcedureInstanceReference) {
        this.customerContactSessionProcedureInstanceReference = customerContactSessionProcedureInstanceReference;
    }

    public org.museframework.bian.classes.Object getCustomerContactSessionProcedureInstanceReference() {
        return customerContactSessionProcedureInstanceReference;
    }
}