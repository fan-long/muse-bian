package org.museframework.bian.partyauthentication.dto;

public class EvaluateQuestionRequest {
    private String partyauthenticationid;

    private String questionid;

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