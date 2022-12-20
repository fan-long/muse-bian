package org.museframework.bian.brandmanagement.dto;

public class UpdateBrandAdviceResponse {
    private org.museframework.bian.brandmanagement.dto.bq.BrandAdvice brandAdvice;

    public void setBrandAdvice(org.museframework.bian.brandmanagement.dto.bq.BrandAdvice brandAdvice) {
        this.brandAdvice = brandAdvice;
    }

    public org.museframework.bian.brandmanagement.dto.bq.BrandAdvice getBrandAdvice() {
        return brandAdvice;
    }
}