package org.museframework.bian.invporman.dto;

public class RetrieveTrackResponse {
    private org.museframework.bian.invporman.dto.bq.Track track;

    public void setTrack(org.museframework.bian.invporman.dto.bq.Track track) {
        this.track = track;
    }

    public org.museframework.bian.invporman.dto.bq.Track getTrack() {
        return track;
    }
}