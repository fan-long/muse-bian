package org.museframework.bian.legentdir.dto;

public class RetrieveAssociationsResponse {
    private org.museframework.bian.legentdir.dto.bq.Associations associations;

    public void setAssociations(org.museframework.bian.legentdir.dto.bq.Associations associations) {
        this.associations = associations;
    }

    public org.museframework.bian.legentdir.dto.bq.Associations getAssociations() {
        return associations;
    }
}