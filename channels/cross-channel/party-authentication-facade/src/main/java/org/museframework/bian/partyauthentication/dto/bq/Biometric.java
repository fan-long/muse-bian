/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.partyauthentication.dto.bq;

public class Biometric {
    /*The type of biometric record being used for authentication*/
    private String authenticationBiometricType;

    /*The biometric record submitted for authentication (e.g. face scan, fingerprint, signature)*/
    private String authenticationBiometricRecord;

    /*The registered customer biometric record reference - maintained as an issued device instance*/
    private org.museframework.bian.classes.Object registeredBiometricInstanceReference;

    /*The result of the biometric check*/
    private String biometricTestResult;

    public void setAuthenticationBiometricType(String authenticationBiometricType) {
        this.authenticationBiometricType = authenticationBiometricType;
    }

    public String getAuthenticationBiometricType() {
        return authenticationBiometricType;
    }

    public void setAuthenticationBiometricRecord(String authenticationBiometricRecord) {
        this.authenticationBiometricRecord = authenticationBiometricRecord;
    }

    public String getAuthenticationBiometricRecord() {
        return authenticationBiometricRecord;
    }

    public void setRegisteredBiometricInstanceReference(org.museframework.bian.classes.Object registeredBiometricInstanceReference) {
        this.registeredBiometricInstanceReference = registeredBiometricInstanceReference;
    }

    public org.museframework.bian.classes.Object getRegisteredBiometricInstanceReference() {
        return registeredBiometricInstanceReference;
    }

    public void setBiometricTestResult(String biometricTestResult) {
        this.biometricTestResult = biometricTestResult;
    }

    public String getBiometricTestResult() {
        return biometricTestResult;
    }
}