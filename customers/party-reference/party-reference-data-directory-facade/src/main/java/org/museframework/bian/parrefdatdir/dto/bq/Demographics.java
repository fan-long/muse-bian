/*"An assertion or statement with regard to a concept, a characteristic.

Examples: Product pricing rules, Customer reference details

A descriptor can be atomic or composed."
Prospect Management*/
package org.museframework.bian.parrefdatdir.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Demographics {
    /*A bank defined classification of the socio-economic rating and prospect*/
    @MetaField(0)
    private String socio_EconomicClassification;

    /*Where needed to ensure the bank's handling of the relationship follows legal and regulatory requirements*/
    @MetaField(0)
    private String ethnicityReligion;

    /*Reference to the customer's employer (company name)*/
    @MetaField(0)
    private String employment;

    /*Details of the customer's employment history (e.g. employer, dates, job position, salary)*/
    @MetaField(0)
    private String employmentHistory;

    /*Customer's education (e.g. academic institutions attended, duration, qualifications and certifications)*/
    @MetaField(0)
    private String educationHistory;

    /*Description of any known constraints on servicing the customer (sight, hearing, religious considerations)*/
    @MetaField(0)
    private String servicingConstraints;

    public void setSocio_EconomicClassification(String socio_EconomicClassification) {
        this.socio_EconomicClassification = socio_EconomicClassification;
    }

    public String getSocio_EconomicClassification() {
        return socio_EconomicClassification;
    }

    public void setEthnicityReligion(String ethnicityReligion) {
        this.ethnicityReligion = ethnicityReligion;
    }

    public String getEthnicityReligion() {
        return ethnicityReligion;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmploymentHistory(String employmentHistory) {
        this.employmentHistory = employmentHistory;
    }

    public String getEmploymentHistory() {
        return employmentHistory;
    }

    public void setEducationHistory(String educationHistory) {
        this.educationHistory = educationHistory;
    }

    public String getEducationHistory() {
        return educationHistory;
    }

    public void setServicingConstraints(String servicingConstraints) {
        this.servicingConstraints = servicingConstraints;
    }

    public String getServicingConstraints() {
        return servicingConstraints;
    }
}