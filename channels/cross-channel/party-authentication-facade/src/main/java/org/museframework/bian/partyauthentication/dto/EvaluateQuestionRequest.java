package org.museframework.bian.partyauthentication.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class EvaluateQuestionRequest {
    @MetaField
    private String partyauthenticationid;

    @MetaField
    private String questionid;

    @MetaField(ref=true)
    private org.museframework.bian.partyauthentication.dto.bq.Question question;

    public void setPartyauthenticationid(String partyauthenticationid) {
        this.partyauthenticationid = partyauthenticationid;
    }

    public String getPartyauthenticationid() {
        return partyauthenticationid;
    }

    public void setQuestionid(String questionid) {
        this.questionid = questionid;
    }

    public String getQuestionid() {
        return questionid;
    }

    public void setQuestion(org.museframework.bian.partyauthentication.dto.bq.Question question) {
        this.question = question;
    }

    public org.museframework.bian.partyauthentication.dto.bq.Question getQuestion() {
        return question;
    }
}