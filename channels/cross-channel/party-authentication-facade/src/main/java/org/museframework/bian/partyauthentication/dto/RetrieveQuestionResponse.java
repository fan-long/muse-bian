package org.museframework.bian.partyauthentication.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveQuestionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.partyauthentication.dto.bq.Question question;

    public void setQuestion(org.museframework.bian.partyauthentication.dto.bq.Question question) {
        this.question = question;
    }

    public org.museframework.bian.partyauthentication.dto.bq.Question getQuestion() {
        return question;
    }
}