/*A collection of one or more deliverables that may be further defined in terms of an approach to be followed to create them

Examples: Functional module specification*/
package org.museframework.bian.systemdevelopment.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TestingSpecification {
    /*Details the testing tasks and deliverables of system development project*/
    @MetaField
    private String testingSpecificationTaskDefinition;

    /*Collection of design and development work products used in the testing of the developed system*/
    @MetaField
    private String testingSpecificationTaskWorkProducts;

    /*Reference to associated project documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*The testing specification and results as a suitably structured and formatted document*/
    @MetaField
    private String systemTestingSpecification;

    public void setTestingSpecificationTaskDefinition(String testingSpecificationTaskDefinition) {
        this.testingSpecificationTaskDefinition = testingSpecificationTaskDefinition;
    }

    public String getTestingSpecificationTaskDefinition() {
        return testingSpecificationTaskDefinition;
    }

    public void setTestingSpecificationTaskWorkProducts(String testingSpecificationTaskWorkProducts) {
        this.testingSpecificationTaskWorkProducts = testingSpecificationTaskWorkProducts;
    }

    public String getTestingSpecificationTaskWorkProducts() {
        return testingSpecificationTaskWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setSystemTestingSpecification(String systemTestingSpecification) {
        this.systemTestingSpecification = systemTestingSpecification;
    }

    public String getSystemTestingSpecification() {
        return systemTestingSpecification;
    }
}