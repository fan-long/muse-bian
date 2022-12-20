package org.museframework.bian.merandacqadv.dto;

public class RequestMergersAndAcquisitionAdviceRequest {
    private String mergersandacquisitionsadvisoryid;

    private org.museframework.bian.merandacqadv.dto.cr.MergersAndAcquisitionAdvice mergersAndAcquisitionAdvice;

    public void setMergersandacquisitionsadvisoryid(String mergersandacquisitionsadvisoryid) {
        this.mergersandacquisitionsadvisoryid = mergersandacquisitionsadvisoryid;
    }

    public String getMergersandacquisitionsadvisoryid() {
        return mergersandacquisitionsadvisoryid;
    }

    public void setMergersAndAcquisitionAdvice(org.museframework.bian.merandacqadv.dto.cr.MergersAndAcquisitionAdvice mergersAndAcquisitionAdvice) {
        this.mergersAndAcquisitionAdvice = mergersAndAcquisitionAdvice;
    }

    public org.museframework.bian.merandacqadv.dto.cr.MergersAndAcquisitionAdvice getMergersAndAcquisitionAdvice() {
        return mergersAndAcquisitionAdvice;
    }
}