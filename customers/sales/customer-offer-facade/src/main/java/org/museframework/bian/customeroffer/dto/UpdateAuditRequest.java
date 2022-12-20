package org.museframework.bian.customeroffer.dto;

public class UpdateAuditRequest {
    private String customerofferid;

    private String auditid;

    private org.museframework.bian.customeroffer.dto.bq.Audit audit;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setAuditid(String auditid) {
        this.auditid = auditid;
    }

    public String getAuditid() {
        return auditid;
    }

    public void setAudit(org.museframework.bian.customeroffer.dto.bq.Audit audit) {
        this.audit = audit;
    }

    public org.museframework.bian.customeroffer.dto.bq.Audit getAudit() {
        return audit;
    }
}