package org.museframework.bian.merandacqadv.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyMACandidateSelectionandEvaluationTopicResponse {
    @MetaField(ref=true)
    private org.museframework.bian.merandacqadv.dto.bq.MACandidateSelectionandEvaluationTopic mACandidateSelectionandEvaluationTopic;

    public void setmACandidateSelectionandEvaluationTopic(org.museframework.bian.merandacqadv.dto.bq.MACandidateSelectionandEvaluationTopic mACandidateSelectionandEvaluationTopic) {
        this.mACandidateSelectionandEvaluationTopic = mACandidateSelectionandEvaluationTopic;
    }

    public org.museframework.bian.merandacqadv.dto.bq.MACandidateSelectionandEvaluationTopic getmACandidateSelectionandEvaluationTopic() {
        return mACandidateSelectionandEvaluationTopic;
    }
}