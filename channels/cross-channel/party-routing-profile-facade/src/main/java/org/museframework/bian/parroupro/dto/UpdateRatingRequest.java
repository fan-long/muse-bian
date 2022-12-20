package org.museframework.bian.parroupro.dto;

public class UpdateRatingRequest {
    private String partyroutingprofileid;

    private String ratingid;

    private org.museframework.bian.parroupro.dto.bq.Rating rating;

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

    public void setRating(org.museframework.bian.parroupro.dto.bq.Rating rating) {
        this.rating = rating;
    }

    public org.museframework.bian.parroupro.dto.bq.Rating getRating() {
        return rating;
    }
}