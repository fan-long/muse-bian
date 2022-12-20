package org.museframework.bian.parrefdatdir.dto;

public class RetrieveAssociationsResponse {
    private org.museframework.bian.parrefdatdir.dto.bq.Associations associations;

    public void setAssociations(org.museframework.bian.parrefdatdir.dto.bq.Associations associations) {
        this.associations = associations;
    }

    public org.museframework.bian.parrefdatdir.dto.bq.Associations getAssociations() {
        return associations;
    }
}