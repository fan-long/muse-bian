/*An arrangement within the Service Provider Agreement
*/
package org.museframework.bian.classes;

public class ServiceProviderArrangement {
    /**/
    private org.museframework.bian.enumerations.Serviceproviderarrangementtypevalues serviceProviderArrangementType;

    public void setServiceProviderArrangementType(org.museframework.bian.enumerations.Serviceproviderarrangementtypevalues serviceProviderArrangementType) {
        this.serviceProviderArrangementType = serviceProviderArrangementType;
    }

    public org.museframework.bian.enumerations.Serviceproviderarrangementtypevalues getServiceProviderArrangementType() {
        return serviceProviderArrangementType;
    }
}