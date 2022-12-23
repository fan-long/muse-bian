/*A collection of terms (within some jurisdiction) that can be selected and configured to define a contract /agreement

Examples: Required disclosures*/
package org.museframework.bian.salproagr.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class RegulatoryTerms {
    /*The applicable regulatory authority*/
    @MetaField
    private String regulatoryAuthority;

    /*Reference to any regulatory requirements*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object applicableRegulationReference;

    /*Explanation or interpretation of the regulation as applied*/
    @MetaField
    private String applicableRegulationInterpretation;

    public void setRegulatoryAuthority(String regulatoryAuthority) {
        this.regulatoryAuthority = regulatoryAuthority;
    }

    public String getRegulatoryAuthority() {
        return regulatoryAuthority;
    }

    public void setApplicableRegulationReference(org.museframework.bian.classes.Object applicableRegulationReference) {
        this.applicableRegulationReference = applicableRegulationReference;
    }

    public org.museframework.bian.classes.Object getApplicableRegulationReference() {
        return applicableRegulationReference;
    }

    public void setApplicableRegulationInterpretation(String applicableRegulationInterpretation) {
        this.applicableRegulationInterpretation = applicableRegulationInterpretation;
    }

    public String getApplicableRegulationInterpretation() {
        return applicableRegulationInterpretation;
    }
}