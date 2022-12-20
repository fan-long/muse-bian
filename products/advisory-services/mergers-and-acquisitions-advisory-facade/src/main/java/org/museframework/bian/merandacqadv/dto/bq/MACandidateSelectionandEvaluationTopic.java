/*The M&A Candidate Selection and Evaluation Topic advice is one specific topic that can be included in providing M&A Candidate Selection and Evaluation Topic*/
package org.museframework.bian.merandacqadv.dto.bq;

public class MACandidateSelectionandEvaluationTopic {
    /*Reference to M&A Candidate Selection and Evaluation Topic*/
    private org.museframework.bian.classes.Object mergersAndAcquisitionAdviceReference;

    /*Reference to M&A Candidate Selection and Evaluation Topic*/
    private org.museframework.bian.classes.Object MACandidateSelectionandEvaluationTopicReference;

    /*The type of M&A Candidate Selection and Evaluation Topic*/
    private String MACandidateSelectionandEvaluationTopicType;

    /*The M&A Candidate Selection and Evaluation Topic specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The operating unit/employee responsible for providing the advice/recommendation*/
    private String businessUnitEmployeeReference;

    /*The completion status once the advice/recommendation has been provided*/
    private org.museframework.bian.classes.Condition postconditions;

    /*The required status/situation before the advice/recommendation can be provided*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in providing the advice/recommendation*/
    private String schedule;

    public void setMergersAndAcquisitionAdviceReference(org.museframework.bian.classes.Object mergersAndAcquisitionAdviceReference) {
        this.mergersAndAcquisitionAdviceReference = mergersAndAcquisitionAdviceReference;
    }

    public org.museframework.bian.classes.Object getMergersAndAcquisitionAdviceReference() {
        return mergersAndAcquisitionAdviceReference;
    }

    public void setMACandidateSelectionandEvaluationTopicReference(org.museframework.bian.classes.Object MACandidateSelectionandEvaluationTopicReference) {
        this.MACandidateSelectionandEvaluationTopicReference = MACandidateSelectionandEvaluationTopicReference;
    }

    public org.museframework.bian.classes.Object getMACandidateSelectionandEvaluationTopicReference() {
        return MACandidateSelectionandEvaluationTopicReference;
    }

    public void setMACandidateSelectionandEvaluationTopicType(String MACandidateSelectionandEvaluationTopicType) {
        this.MACandidateSelectionandEvaluationTopicType = MACandidateSelectionandEvaluationTopicType;
    }

    public String getMACandidateSelectionandEvaluationTopicType() {
        return MACandidateSelectionandEvaluationTopicType;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setBusinessUnitEmployeeReference(String businessUnitEmployeeReference) {
        this.businessUnitEmployeeReference = businessUnitEmployeeReference;
    }

    public String getBusinessUnitEmployeeReference() {
        return businessUnitEmployeeReference;
    }

    public void setPostconditions(org.museframework.bian.classes.Condition postconditions) {
        this.postconditions = postconditions;
    }

    public org.museframework.bian.classes.Condition getPostconditions() {
        return postconditions;
    }

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
}