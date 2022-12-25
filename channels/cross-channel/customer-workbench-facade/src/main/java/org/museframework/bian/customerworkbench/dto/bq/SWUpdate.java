/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.customerworkbench.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class SWUpdate {
    /*The name of the bank application that is downloaded*/
    @MetaField(0)
    private String SWUpdateApplication;

    /*The version number downloaded*/
    @MetaField(0)
    private String SWUpdateVersion;

    /*The downloaded executable image*/
    @MetaField(0)
    private String SWUpdateImage;

    /*The date and time of the download*/
    @MetaField(0)
    private String date;

    public void setSWUpdateApplication(String SWUpdateApplication) {
        this.SWUpdateApplication = SWUpdateApplication;
    }

    public String getSWUpdateApplication() {
        return SWUpdateApplication;
    }

    public void setSWUpdateVersion(String SWUpdateVersion) {
        this.SWUpdateVersion = SWUpdateVersion;
    }

    public String getSWUpdateVersion() {
        return SWUpdateVersion;
    }

    public void setSWUpdateImage(String SWUpdateImage) {
        this.SWUpdateImage = SWUpdateImage;
    }

    public String getSWUpdateImage() {
        return SWUpdateImage;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}