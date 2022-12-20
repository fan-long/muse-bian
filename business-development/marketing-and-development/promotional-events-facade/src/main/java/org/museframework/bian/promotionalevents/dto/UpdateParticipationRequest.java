package org.museframework.bian.promotionalevents.dto;

public class UpdateParticipationRequest {
    private String promotionaleventsid;

    private String participationid;

    private org.museframework.bian.promotionalevents.dto.bq.Participation participation;

    public void setPromotionaleventsid(String promotionaleventsid) {
        this.promotionaleventsid = promotionaleventsid;
    }

    public String getPromotionaleventsid() {
        return promotionaleventsid;
    }

    public void setParticipationid(String participationid) {
        this.participationid = participationid;
    }

    public String getParticipationid() {
        return participationid;
    }

    public void setParticipation(org.museframework.bian.promotionalevents.dto.bq.Participation participation) {
        this.participation = participation;
    }

    public org.museframework.bian.promotionalevents.dto.bq.Participation getParticipation() {
        return participation;
    }
}