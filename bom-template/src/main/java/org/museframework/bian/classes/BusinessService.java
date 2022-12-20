/*A business service supports business capabilities through an explicitly defined interface and is explicitly governed by an organization. TOGAF 9.2

A business service represents explicitly defined behavior that a business role, business actor, or business collaboration exposes to its environment. ArchiMate 3.1
*/
package org.museframework.bian.classes;

public class BusinessService {
    /**/
    private String businessServiceName;

    /**/
    private org.museframework.bian.enumerations.Businessservicetypevalues businessServiceType;

    /**/
    private String businessServiceDescription;

    public void setBusinessServiceName(String businessServiceName) {
        this.businessServiceName = businessServiceName;
    }

    public String getBusinessServiceName() {
        return businessServiceName;
    }

    public void setBusinessServiceType(org.museframework.bian.enumerations.Businessservicetypevalues businessServiceType) {
        this.businessServiceType = businessServiceType;
    }

    public org.museframework.bian.enumerations.Businessservicetypevalues getBusinessServiceType() {
        return businessServiceType;
    }

    public void setBusinessServiceDescription(String businessServiceDescription) {
        this.businessServiceDescription = businessServiceDescription;
    }

    public String getBusinessServiceDescription() {
        return businessServiceDescription;
    }
}