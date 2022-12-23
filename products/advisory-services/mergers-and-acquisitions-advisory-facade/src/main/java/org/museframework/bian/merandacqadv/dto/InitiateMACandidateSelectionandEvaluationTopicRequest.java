package org.museframework.bian.merandacqadv.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateMACandidateSelectionandEvaluationTopicRequest {
    @MetaField
    private String mergersandacquisitionsadvisoryid;

    @MetaField
    private String macandidateselectionandevaluationtopicid;

    @MetaField(ref=true)
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