package org.museframework.bian.promotionalevents.dto;

public class RetrieveParticipationResponse {
    private org.museframework.bian.promotionalevents.dto.bq.Participation participation;

    public void setParticipation(org.museframework.bian.promotionalevents.dto.bq.Participation participation) {
        this.participation = participation;
    }

    public org.museframework.bian.promotionalevents.dto.bq.Participation getParticipation() {
        return participation;
    }
}