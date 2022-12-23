/*Monitor and define the status/rating of some entity within Issued Device Tracking. */
package org.museframework.bian.issdevtra.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class IssuedDeviceState {
    /*Reference to the external information feed service supplier (IP) providing device status reports*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object informationFeedProviderReference;

    /*Reference to the issued device, include its status as maintained by administration*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object issuedDeviceAllocationInstanceReference;

    /*Is the status of the issued device that is updated*/
    @MetaField
    private String issuedDeviceAllocationStatus;

    public void setInformationFeedProviderReference(org.museframework.bian.classes.Object informationFeedProviderReference) {
        this.informationFeedProviderReference = informationFeedProviderReference;
    }

    public org.museframework.bian.classes.Object getInformationFeedProviderReference() {
        return informationFeedProviderReference;
    }

    public void setIssuedDeviceAllocationInstanceReference(org.museframework.bian.classes.Object issuedDeviceAllocationInstanceReference) {
        this.issuedDeviceAllocationInstanceReference = issuedDeviceAllocationInstanceReference;
    }

    public org.museframework.bian.classes.Object getIssuedDeviceAllocationInstanceReference() {
        return issuedDeviceAllocationInstanceReference;
    }

    public void setIssuedDeviceAllocationStatus(String issuedDeviceAllocationStatus) {
        this.issuedDeviceAllocationStatus = issuedDeviceAllocationStatus;
    }

    public String getIssuedDeviceAllocationStatus() {
        return issuedDeviceAllocationStatus;
    }
}