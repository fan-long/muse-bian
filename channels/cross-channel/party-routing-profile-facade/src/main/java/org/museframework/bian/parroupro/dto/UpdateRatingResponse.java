package org.museframework.bian.parroupro.dto;

public class UpdateRatingResponse {
    private org.museframework.bian.parroupro.dto.bq.Rating rating;

    public void setRating(org.museframework.bian.parroupro.dto.bq.Rating rating) {
        this.rating = rating;
    }

    public org.museframework.bian.parroupro.dto.bq.Rating getRating() {
        return rating;
    }
}