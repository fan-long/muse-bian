package org.museframework.bian.merandacqadv.dto;

public class ExecuteMACandidateSelectionandEvaluationTopicRequest {
    private String mergersandacquisitionsadvisoryid;

    private String macandidateselectionandevaluationtopicid;

    private org.museframework.bian.merandacqadv.dto.bq.MACandidateSelectionandEvaluationTopic mACandidateSelectionandEvaluationTopic;

    public void setMergersandacquisitionsadvisoryid(String mergersandacquisitionsadvisoryid) {
        this.mergersandacquisitionsadvisoryid = mergersandacquisitionsadvisoryid;
    }

    public String getMergersandacquisitionsadvisoryid() {
        return mergersandacquisitionsadvisoryid;
    }

    public void setMacandidateselectionandevaluationtopicid(String macandidateselectionandevaluationtopicid) {
        this.macandidateselectionandevaluationtopicid = macandidateselectionandevaluationtopicid;
    }

    public String getMacandidateselectionandevaluationtopicid() {
        return macandidateselectionandevaluationtopicid;
    }

    public void setmACandidateSelectionandEvaluationTopic(org.museframework.bian.merandacqadv.dto.bq.MACandidateSelectionandEvaluationTopic mACandidateSelectionandEvaluationTopic) {
        this.mACandidateSelectionandEvaluationTopic = mACandidateSelectionandEvaluationTopic;
    }

    public org.museframework.bian.merandacqadv.dto.bq.MACandidateSelectionandEvaluationTopic getmACandidateSelectionandEvaluationTopic() {
        return mACandidateSelectionandEvaluationTopic;
    }
}