package org.museframework.bian.syndicatedloan.dto;

public class RequestStructuringResponse {
    private org.museframework.bian.syndicatedloan.dto.bq.Structuring structuring;

    public void setStructuring(org.museframework.bian.syndicatedloan.dto.bq.Structuring structuring) {
        this.structuring = structuring;
    }

    public org.museframework.bian.syndicatedloan.dto.bq.Structuring getStructuring() {
        return structuring;
    }
}