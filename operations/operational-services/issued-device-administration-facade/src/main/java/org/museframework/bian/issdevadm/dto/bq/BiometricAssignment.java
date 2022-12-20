/**/
package org.museframework.bian.issdevadm.dto.bq;

public class BiometricAssignment {
    /*Type of biometric record being used (e.g. face, fingerprint, signature)*/
    private String biometricType;

    /*The stored biometric value possibly in suitably encrypted form*/
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