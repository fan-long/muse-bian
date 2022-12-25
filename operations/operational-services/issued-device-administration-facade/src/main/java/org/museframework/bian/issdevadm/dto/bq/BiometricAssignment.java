/**/
package org.museframework.bian.issdevadm.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class BiometricAssignment {
    /*Type of biometric record being used (e.g. face, fingerprint, signature)*/
    @MetaField(0)
    private String biometricType;

    /*The stored biometric value possibly in suitably encrypted form*/
    @MetaField(0)
    private String biometricRegisteredDetail;

    public void setBiometricType(String biometricType) {
        this.biometricType = biometricType;
    }

    public String getBiometricType() {
        return biometricType;
    }

    public void setBiometricRegisteredDetail(String biometricRegisteredDetail) {
        this.biometricRegisteredDetail = biometricRegisteredDetail;
    }

    public String getBiometricRegisteredDetail() {
        return biometricRegisteredDetail;
    }
}