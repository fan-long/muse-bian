package org.museframework.bian.cusaccent.dto;

public class UpdatePreferencesResponse {
    private org.museframework.bian.cusaccent.dto.bq.Preferences preferences;

    public void setPreferences(org.museframework.bian.cusaccent.dto.bq.Preferences preferences) {
        this.preferences = preferences;
    }

    public org.museframework.bian.cusaccent.dto.bq.Preferences getPreferences() {
        return preferences;
    }
}