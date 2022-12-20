/*Systematic examination and verification of a firm's books of account, transaction records, other relevant documents, and physical inspection of inventory by qualified accountants (called auditors) . BusinessDictionary

An examination and verification of a company's financial and accounting records and supporting documents by a professional, such as a Certified Public Accountant. (Read more: http://www.investorwords.com/324/audit.html#ixzz5tAeSPyMC)


The term audit usually refers to a financial statement audit. A financial audit is an objective examination and evaluation of the financial statements of an organization to make sure that the financial records are a fair and accurate representation of the transactions they claim to represent. The audit can be conducted internally by employees of the organization or externally by an outside Certified Public Accountant (CPA) firm. (Investopedia)*/
package org.museframework.bian.classes;

public class Audit {
    /**/
    private String auditType;

    public void setAuditType(String auditType) {
        this.auditType = auditType;
    }

    public String getAuditType() {
        return auditType;
    }
}