/*An action for the purpose of maintaining the value of an object.*/
package org.museframework.bian.classes;

public class ObjectMaintenance {
    /*An identifier that allows to uniquely refer to an instance of a maintenance on the object.
*/
    private String maintenanceIdentifier;

    /*Record of the maintenance done.*/
    private String maintenanceRecord;

    /*reference to the type of maintenance related to the object.

This can be object maintenance, but also insurance maintenance, or security mitigations, etc.*/
    private String maintenanceType;

    /*External identifier assigned by a maintenance service provider to refer to an instance of Maintenance.*/
    private String maintenanceServiceReference;

    public void setMaintenanceIdentifier(String maintenanceIdentifier) {
        this.maintenanceIdentifier = maintenanceIdentifier;
    }

    public String getMaintenanceIdentifier() {
        return maintenanceIdentifier;
    }

    public void setMaintenanceRecord(String maintenanceRecord) {
        this.maintenanceRecord = maintenanceRecord;
    }

    public String getMaintenanceRecord() {
        return maintenanceRecord;
    }

    public void setMaintenanceType(String maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    public String getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceServiceReference(String maintenanceServiceReference) {
        this.maintenanceServiceReference = maintenanceServiceReference;
    }

    public String getMaintenanceServiceReference() {
        return maintenanceServiceReference;
    }
}