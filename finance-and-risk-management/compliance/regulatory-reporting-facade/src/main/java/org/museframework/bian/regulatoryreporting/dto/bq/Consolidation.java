/*A collection of one or more clerical routines that are to be followed to administer the operational unit/function

Examples: Time-sheet recording*/
package org.museframework.bian.regulatoryreporting.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Consolidation {
    /*Description of the source content required for a report type*/
    @MetaField
    private String regulatoryReportTypeContentRequirements;

    /*Reference to the source of production information being assembled*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object sourceBusinessUnitEmployeeReference;

    /*Reference to the source service or product for content if appropriate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object sourceProductandServiceReference;

    /*Reference to the bank customer that is subject of the source content if appropriate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object sourceCustomerReference;

    /*The possibly extensive collection of production transaction records assembled for reporting*/
    @MetaField
    private String sourceTransactionRecords;

    public void setRegulatoryReportTypeContentRequirements(String regulatoryReportTypeContentRequirements) {
        this.regulatoryReportTypeContentRequirements = regulatoryReportTypeContentRequirements;
    }

    public String getRegulatoryReportTypeContentRequirements() {
        return regulatoryReportTypeContentRequirements;
    }

    public void setSourceBusinessUnitEmployeeReference(org.museframework.bian.classes.Object sourceBusinessUnitEmployeeReference) {
        this.sourceBusinessUnitEmployeeReference = sourceBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getSourceBusinessUnitEmployeeReference() {
        return sourceBusinessUnitEmployeeReference;
    }

    public void setSourceProductandServiceReference(org.museframework.bian.classes.Object sourceProductandServiceReference) {
        this.sourceProductandServiceReference = sourceProductandServiceReference;
    }

    public org.museframework.bian.classes.Object getSourceProductandServiceReference() {
        return sourceProductandServiceReference;
    }

    public void setSourceCustomerReference(org.museframework.bian.classes.Object sourceCustomerReference) {
        this.sourceCustomerReference = sourceCustomerReference;
    }

    public org.museframework.bian.classes.Object getSourceCustomerReference() {
        return sourceCustomerReference;
    }

    public void setSourceTransactionRecords(String sourceTransactionRecords) {
        this.sourceTransactionRecords = sourceTransactionRecords;
    }

    public String getSourceTransactionRecords() {
        return sourceTransactionRecords;
    }
}