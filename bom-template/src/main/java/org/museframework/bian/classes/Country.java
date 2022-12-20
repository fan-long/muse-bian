/*Nation with its own government. ISO20022*/
package org.museframework.bian.classes;

public class Country {
    /*Regulatory authority of the country. (ISO20022)*/
    private String nationalRegulatoryAuthority;

    public void setNationalRegulatoryAuthority(String nationalRegulatoryAuthority) {
        this.nationalRegulatoryAuthority = nationalRegulatoryAuthority;
    }

    public String getNationalRegulatoryAuthority() {
        return nationalRegulatoryAuthority;
    }
}