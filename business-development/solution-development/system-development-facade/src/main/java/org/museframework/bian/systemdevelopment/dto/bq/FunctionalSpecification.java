/*A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them

Examples: Functional module specification*/
package org.museframework.bian.systemdevelopment.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FunctionalSpecification {
    /*Details the functional specification tasks and deliverables of system development project*/
    @MetaField
    private String functionalSpecificationTaskDefinition;

    /*Collection of design and development work products used in the definition of functional requirements*/
    @MetaField
    private String functionalSpecificationTaskWorkProducts;

    /*Reference to associated project documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*The functional specification as a suitably structured and formatted document*/
    @MetaField
    private String systemFunctionalSpecification;

    public void setFunctionalSpecificationTaskDefinition(String functionalSpecificationTaskDefinition) {
        this.functionalSpecificationTaskDefinition = functionalSpecificationTaskDefinition;
    }

    public String getFunctionalSpecificationTaskDefinition() {
        return functionalSpecificationTaskDefinition;
    }

    public void setFunctionalSpecificationTaskWorkProducts(String functionalSpecificationTaskWorkProducts) {
        this.functionalSpecificationTaskWorkProducts = functionalSpecificationTaskWorkProducts;
    }

    public String getFunctionalSpecificationTaskWorkProducts() {
        return functionalSpecificationTaskWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setSystemFunctionalSpecification(String systemFunctionalSpecification) {
        this.systemFunctionalSpecification = systemFunctionalSpecification;
    }

    public String getSystemFunctionalSpecification() {
        return systemFunctionalSpecification;
    }
}