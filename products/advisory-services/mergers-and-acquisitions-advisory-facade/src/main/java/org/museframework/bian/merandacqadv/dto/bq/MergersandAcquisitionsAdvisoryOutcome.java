/*The M&A Candidate Selection and Evaluation Topic advice is one specific topic that can be included in providing M&A Candidate Selection and Evaluation Topic*/
package org.museframework.bian.merandacqadv.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MergersandAcquisitionsAdvisoryOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Project mergersandAcquisitionsAdvisoryProject;

    /**/
    @MetaField
    private String mergersandAcquisitionsAdvisoryWorkProduct;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Analysis mergersandAcquisitionsAdvisoryWorkforceAnalysis;

    public void setMergersandAcquisitionsAdvisoryProject(org.museframework.bian.classes.Project mergersandAcquisitionsAdvisoryProject) {
        this.mergersandAcquisitionsAdvisoryProject = mergersandAcquisitionsAdvisoryProject;
    }

    public org.museframework.bian.classes.Project getMergersandAcquisitionsAdvisoryProject() {
        return mergersandAcquisitionsAdvisoryProject;
    }

    public void setMergersandAcquisitionsAdvisoryWorkProduct(String mergersandAcquisitionsAdvisoryWorkProduct) {
        this.mergersandAcquisitionsAdvisoryWorkProduct = mergersandAcquisitionsAdvisoryWorkProduct;
    }

    public String getMergersandAcquisitionsAdvisoryWorkProduct() {
        return mergersandAcquisitionsAdvisoryWorkProduct;
    }

    public void setMergersandAcquisitionsAdvisoryWorkforceAnalysis(org.museframework.bian.classes.Analysis mergersandAcquisitionsAdvisoryWorkforceAnalysis) {
        this.mergersandAcquisitionsAdvisoryWorkforceAnalysis = mergersandAcquisitionsAdvisoryWorkforceAnalysis;
    }

    public org.museframework.bian.classes.Analysis getMergersandAcquisitionsAdvisoryWorkforceAnalysis() {
        return mergersandAcquisitionsAdvisoryWorkforceAnalysis;
    }
}