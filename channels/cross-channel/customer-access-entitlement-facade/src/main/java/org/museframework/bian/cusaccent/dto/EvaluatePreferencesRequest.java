package org.museframework.bian.cusaccent.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class EvaluatePreferencesRequest {
    @MetaField
    private String customeraccessentitlementid;

    @MetaField
    private String preferencesid;

    @MetaField(ref=true)
    private org.museframework.bian.cusaccent.dto.bq.Preferences preferences;

    public void setCustomeraccessentitlementid(String customeraccessentitlementid) {
        this.customeraccessentitlementid = customeraccessentitlementid;
    }

    public String getCustomeraccessentitlementid() {
        return customeraccessentitlementid;
    }

    public void setPreferencesid(String preferencesid) {
        this.preferencesid = preferencesid;
    }

    public String getPreferencesid() {
        return preferencesid;
    }

    public void setPreferences(org.museframework.bian.cusaccent.dto.bq.Preferences preferences) {
        this.preferences = preferences;
    }

    public org.museframework.bian.cusaccent.dto.bq.Preferences getPreferences() {
        return preferences;
    }
}