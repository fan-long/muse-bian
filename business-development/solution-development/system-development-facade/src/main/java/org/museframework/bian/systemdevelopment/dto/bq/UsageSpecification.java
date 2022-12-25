/*A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them

Examples: Functional module specification*/
package org.museframework.bian.systemdevelopment.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class UsageSpecification {
    /*Details the usage guidelines specification tasks and deliverables of the system development project*/
    @MetaField(0)
    private String usageSpecificationTaskDefinition;

    /*Collection of design and development work products used in the definition of usage guidelines etc.*/
    @MetaField(0)
    private String usageSpecificationTaskWorkProducts;

    /*Reference to associated project documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*The usage guideline specification as a suitably structured and formatted document*/
    @MetaField(0)
    private String systemFunctionalSpecification;

    public void setUsageSpecificationTaskDefinition(String usageSpecificationTaskDefinition) {
        this.usageSpecificationTaskDefinition = usageSpecificationTaskDefinition;
    }

    public String getUsageSpecificationTaskDefinition() {
        return usageSpecificationTaskDefinition;
    }

    public void setUsageSpecificationTaskWorkProducts(String usageSpecificationTaskWorkProducts) {
        this.usageSpecificationTaskWorkProducts = usageSpecificationTaskWorkProducts;
    }

    public String getUsageSpecificationTaskWorkProducts() {
        return usageSpecificationTaskWorkProducts;
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