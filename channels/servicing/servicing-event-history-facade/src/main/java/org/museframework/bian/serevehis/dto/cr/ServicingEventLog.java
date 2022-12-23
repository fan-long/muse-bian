/*Maintain a log of transactions or activity, typically a financial account/journal or a log of activity to support behavioral analysis within Servicing Event History. */
package org.museframework.bian.serevehis.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ServicingEventLog extends org.museframework.bian.classes.ServicingEventLog {
    /*The servicing position for the log (if the log is organized to track specific positions)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object servicingPositionReference;

    /*Employee/unit assigned to the servicing position (if the log is organized to track specific servicing reps that might work at different positions)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    public void setServicingPositionReference(org.museframework.bian.classes.Object servicingPositionReference) {
        this.servicingPositionReference = servicingPositionReference;
    }

    public org.museframework.bian.classes.Object getServicingPositionReference() {
        return servicingPositionReference;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }
}