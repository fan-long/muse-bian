package org.museframework.bian.partyauthentication.dto;

public class RetrieveQuestionResponse {
    private org.museframework.bian.partyauthentication.dto.bq.Question question;

    public void setQuestion(org.museframework.bian.partyauthentication.dto.bq.Question question) {
        this.question = question;
    }

    public org.museframework.bian.partyauthentication.dto.bq.Question getQuestion() {
        return question;
    }
}