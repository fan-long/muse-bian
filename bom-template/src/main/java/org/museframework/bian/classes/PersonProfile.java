/*Information to support Know Your Customer (KYC) processes. (ISO20022)*/
package org.museframework.bian.classes;

public class PersonProfile {
    /*Specifies if due diligence checks on the political exposure of the investor have been carried out and whether these checks are national or foreign. (A politically exposed person is someone who has been entrusted with a prominent public function, or an individual who is closely related to such a person.) ISO20022*/
    private String politicalExposureType;

    /**/
    private String politicalExposureDescription;

    /*Specifies the level of salary. (ISO20022)*/
    private String salaryRange;

    /*Indicates if the employment of the person has been terminated. (ISO20022)*/
    private String employeeTerminationIndicator;

    /*Indicates if the person has family medical insurance coverage available. (ISO20022)*/
    private String familyMedicalInsuranceIndicator;

    /**/
    private String profileType;

    /*Highest level of education attained.
*/
    private String educationLevel;

    /*Name of the occupation or job of a person. (ISO20022)
*/
    private String profession;

    public void setPoliticalExposureType(String politicalExposureType) {
        this.politicalExposureType = politicalExposureType;
    }

    public String getPoliticalExposureType() {
        return politicalExposureType;
    }

    public void setPoliticalExposureDescription(String politicalExposureDescription) {
        this.politicalExposureDescription = politicalExposureDescription;
    }

    public String getPoliticalExposureDescription() {
        return politicalExposureDescription;
    }

    public void setSalaryRange(String salaryRange) {
        this.salaryRange = salaryRange;
    }

    public String getSalaryRange() {
        return salaryRange;
    }

    public void setEmployeeTerminationIndicator(String employeeTerminationIndicator) {
        this.employeeTerminationIndicator = employeeTerminationIndicator;
    }

    public String getEmployeeTerminationIndicator() {
        return employeeTerminationIndicator;
    }

    public void setFamilyMedicalInsuranceIndicator(String familyMedicalInsuranceIndicator) {
        this.familyMedicalInsuranceIndicator = familyMedicalInsuranceIndicator;
    }

    public String getFamilyMedicalInsuranceIndicator() {
        return familyMedicalInsuranceIndicator;
    }

    public void setProfileType(String profileType) {
        this.profileType = profileType;
    }

    public String getProfileType() {
        return profileType;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }
}