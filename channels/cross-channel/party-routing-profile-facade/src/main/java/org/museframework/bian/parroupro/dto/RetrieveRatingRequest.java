package org.museframework.bian.parroupro.dto;

public class RetrieveRatingRequest {
    private String partyroutingprofileid;

    private String ratingid;

    public void setPartyroutingprofileid(String partyroutingprofileid) {
        this.partyroutingprofileid = partyroutingprofileid;
    }

    public String getPartyroutingprofileid() {
        return partyroutingprofileid;
    }

    public void setRatingid(String ratingid) {
        this.ratingid = ratingid;
    }

    public String getRatingid() {
        return ratingid;
    }
}