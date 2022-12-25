/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.promotionalevents.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Participation {
    /*Reference to the promotional event execution*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object promotionalEventParticipationInstanceReference;

    /*The make-up of the sponsorship arrangements for participation in the event*/
    @MetaField(0)
    private String promotionalEventSponsorshipBudget;

    /*Reference to the business unit responsible for coordinating with the promotional event*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*The schedule for participation in the event*/
    @MetaField(0)
    private String promotionalEventExecutionSchedule;

    /*The result/impact of the overall promotional event  (can refer to any detected up-tick in brand awareness and sales)*/
    @MetaField(0)
    private String promotionalEventResult;

    public void setPromotionalEventParticipationInstanceReference(org.museframework.bian.classes.Object promotionalEventParticipationInstanceReference) {
        this.promotionalEventParticipationInstanceReference = promotionalEventParticipationInstanceReference;
    }

    public org.museframework.bian.classes.Object getPromotionalEventParticipationInstanceReference() {
        return promotionalEventParticipationInstanceReference;
    }

    public void setPromotionalEventSponsorshipBudget(String promotionalEventSponsorshipBudget) {
        this.promotionalEventSponsorshipBudget = promotionalEventSponsorshipBudget;
    }

    public String getPromotionalEventSponsorshipBudget() {
        return promotionalEventSponsorshipBudget;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setPromotionalEventExecutionSchedule(String promotionalEventExecutionSchedule) {
        this.promotionalEventExecutionSchedule = promotionalEventExecutionSchedule;
    }

    public String getPromotionalEventExecutionSchedule() {
        return promotionalEventExecutionSchedule;
    }

    public void setPromotionalEventResult(String promotionalEventResult) {
        this.promotionalEventResult = promotionalEventResult;
    }

    public String getPromotionalEventResult() {
        return promotionalEventResult;
    }
}