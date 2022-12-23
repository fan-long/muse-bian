package org.museframework.bian.leaiteadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureRegistrationRequest {
    @MetaField
    private String leasingitemadministrationid;

    @MetaField
    private String registrationid;

    @MetaField(ref=true)
    private org.museframework.bian.leaiteadm.dto.bq.Registration registration;

    public void setLeasingitemadministrationid(String leasingitemadministrationid) {
        this.leasingitemadministrationid = leasingitemadministrationid;
    }

    public String getLeasingitemadministrationid() {
        return leasingitemadministrationid;
    }

    public void setRegistrationid(String registrationid) {
        this.registrationid = registrationid;
    }

    public String getRegistrationid() {
        return registrationid;
    }

    public void setRegistration(org.museframework.bian.leaiteadm.dto.bq.Registration registration) {
        this.registration = registration;
    }

    public org.museframework.bian.leaiteadm.dto.bq.Registration getRegistration() {
        return registration;
    }
}