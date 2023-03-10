/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.cardauthorization.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class StandIn {
    /*Refers to the file where lost/stolen card details are maintained. This is a file accessed using external service access*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object negativeFileReference;

    /*The result of the stand in authorization check*/
    @MetaField(0)
    private String cardAccountStandInAuthorizationResult;

    public void setNegativeFileReference(org.museframework.bian.classes.Object negativeFileReference) {
        this.negativeFileReference = negativeFileReference;
    }

    public org.museframework.bian.classes.Object getNegativeFileReference() {
        return negativeFileReference;
    }

    public void setCardAccountStandInAuthorizationResult(String cardAccountStandInAuthorizationResult) {
        this.cardAccountStandInAuthorizationResult = cardAccountStandInAuthorizationResult;
    }

    public String getCardAccountStandInAuthorizationResult() {
        return cardAccountStandInAuthorizationResult;
    }
}