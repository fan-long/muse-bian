package org.museframework.bian.partyauthentication.dto;

public class RetrieveQuestionRequest {
    private String partyauthenticationid;

    private String questionid;

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
}