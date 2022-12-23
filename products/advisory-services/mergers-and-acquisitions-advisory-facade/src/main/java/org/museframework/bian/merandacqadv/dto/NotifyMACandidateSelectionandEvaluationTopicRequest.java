package org.museframework.bian.merandacqadv.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyMACandidateSelectionandEvaluationTopicRequest {
    @MetaField
    private String mergersandacquisitionsadvisoryid;

    @MetaField
    private String macandidateselectionandevaluationtopicid;

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
}