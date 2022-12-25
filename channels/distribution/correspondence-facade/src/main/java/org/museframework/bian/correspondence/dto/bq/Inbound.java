/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.correspondence.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Inbound {
    /*Reference to the inbound correspondence item*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object inboundCorrespondenceInstanceReference;

    /*The inbound correspondence message*/
    @MetaField(0)
    private String inboundCorrespondenceRecord;

    /*The interpreted type of correspondence (e.g. unsolicited message, product/service related, complaint)*/
    @MetaField(0)
    private String inboundCorrespondenceType_eDotgDotunsolicitedmessage_productservicerelated_complaint_;

    /*The inbound message content in whatever format appropriate*/
    @MetaField(0)
    private String inboundCorrespondenceContent;

    /*The identified source of inbound message (extracted from the content)*/
    @MetaField(0)
    private String inboundCorrespondenceAddressee;

    /*Matched bank customer (from reference details extracted from the content where possible)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object inboundCorrespondenceCustomerReference;

    /*Identified internal addressee (from reference details extracted from the content where possible)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object inboundCorrespondenceEmployeeBusinessUnitReference;

    /*Key dates used for tracking internal delivery (e.g. receipt date, internal distribution, receipt confirmation date, re-route date)*/
    @MetaField(0)
    private String dateType;

    /*The value of the date and time*/
    @MetaField(0)
    private String date;

    public void setInboundCorrespondenceInstanceReference(org.museframework.bian.classes.Object inboundCorrespondenceInstanceReference) {
        this.inboundCorrespondenceInstanceReference = inboundCorrespondenceInstanceReference;
    }

    public org.museframework.bian.classes.Object getInboundCorrespondenceInstanceReference() {
        return inboundCorrespondenceInstanceReference;
    }

    public void setInboundCorrespondenceRecord(String inboundCorrespondenceRecord) {
        this.inboundCorrespondenceRecord = inboundCorrespondenceRecord;
    }

    public String getInboundCorrespondenceRecord() {
        return inboundCorrespondenceRecord;
    }

    public void setInboundCorrespondenceType_eDotgDotunsolicitedmessage_productservicerelated_complaint_(String inboundCorrespondenceType_eDotgDotunsolicitedmessage_productservicerelated_complaint_) {
        this.inboundCorrespondenceType_eDotgDotunsolicitedmessage_productservicerelated_complaint_ = inboundCorrespondenceType_eDotgDotunsolicitedmessage_productservicerelated_complaint_;
    }

    public String getInboundCorrespondenceType_eDotgDotunsolicitedmessage_productservicerelated_complaint_() {
        return inboundCorrespondenceType_eDotgDotunsolicitedmessage_productservicerelated_complaint_;
    }

    public void setInboundCorrespondenceContent(String inboundCorrespondenceContent) {
        this.inboundCorrespondenceContent = inboundCorrespondenceContent;
    }

    public String getInboundCorrespondenceContent() {
        return inboundCorrespondenceContent;
    }

    public void setInboundCorrespondenceAddressee(String inboundCorrespondenceAddressee) {
        this.inboundCorrespondenceAddressee = inboundCorrespondenceAddressee;
    }

    public String getInboundCorrespondenceAddressee() {
        return inboundCorrespondenceAddressee;
    }

    public void setInboundCorrespondenceCustomerReference(org.museframework.bian.classes.Object inboundCorrespondenceCustomerReference) {
        this.inboundCorrespondenceCustomerReference = inboundCorrespondenceCustomerReference;
    }

    public org.museframework.bian.classes.Object getInboundCorrespondenceCustomerReference() {
        return inboundCorrespondenceCustomerReference;
    }

    public void setInboundCorrespondenceEmployeeBusinessUnitReference(org.museframework.bian.classes.Object inboundCorrespondenceEmployeeBusinessUnitReference) {
        this.inboundCorrespondenceEmployeeBusinessUnitReference = inboundCorrespondenceEmployeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getInboundCorrespondenceEmployeeBusinessUnitReference() {
        return inboundCorrespondenceEmployeeBusinessUnitReference;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}