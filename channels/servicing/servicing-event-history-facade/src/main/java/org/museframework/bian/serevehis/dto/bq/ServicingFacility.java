/*A collection of the events/transactions recorded by the log

Examples: Customer life event, Servicing event*/
package org.museframework.bian.serevehis.dto.bq;

public class ServicingFacility {
    /*The type of service support facility engaged (e.g. commission tracking, on-line help, action logging)*/
    private String servicingFacilityType;

    /*Reference to any record generated from he use of the facility*/
    private org.museframework.bian.classes.Object servicingFacilityInstanceReference;

    public void setServicingFacilityType(String servicingFacilityType) {
        this.servicingFacilityType = servicingFacilityType;
    }

    public String getServicingFacilityType() {
        return servicingFacilityType;
    }

    public void setServicingFacilityInstanceReference(org.museframework.bian.classes.Object servicingFacilityInstanceReference) {
        this.servicingFacilityInstanceReference = servicingFacilityInstanceReference;
    }

    public org.museframework.bian.classes.Object getServicingFacilityInstanceReference() {
        return servicingFacilityInstanceReference;
    }
}