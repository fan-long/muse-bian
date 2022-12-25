/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.cardauthorization.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Authorization {
    /*The required status/situation before the test can be applied*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the testing performed*/
    @MetaField(0)
    private String schedule;

    /*The test version employed*/
    @MetaField(0)
    private String versionNumber;

    /*The <BQ> specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to the Credit Card Authorization Assessment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Assessment creditCardAuthorizationAssessmentReference;

    /*Reference to Authorization*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Test authorizationReference;

    /*The type of Authorization*/
    @MetaField(0)
    private String authorizationType;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setCreditCardAuthorizationAssessmentReference(org.museframework.bian.classes.Assessment creditCardAuthorizationAssessmentReference) {
        this.creditCardAuthorizationAssessmentReference = creditCardAuthorizationAssessmentReference;
    }

    public org.museframework.bian.classes.Assessment getCreditCardAuthorizationAssessmentReference() {
        return creditCardAuthorizationAssessmentReference;
    }

    public void setAuthorizationReference(org.museframework.bian.classes.Test authorizationReference) {
        this.authorizationReference = authorizationReference;
    }

    public org.museframework.bian.classes.Test getAuthorizationReference() {
        return authorizationReference;
    }

    public void setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
    }

    public String getAuthorizationType() {
        return authorizationType;
    }
}