package org.museframework.bian.marinfman.dto;

public class RetrieveImprovementResponse {
    private org.museframework.bian.marinfman.dto.bq.Improvement improvement;

    public void setImprovement(org.museframework.bian.marinfman.dto.bq.Improvement improvement) {
        this.improvement = improvement;
    }

    public org.museframework.bian.marinfman.dto.bq.Improvement getImprovement() {
        return improvement;
    }
}