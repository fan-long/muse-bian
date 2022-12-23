package org.museframework.bian.documentdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateDocumentVerificationPropertiesRequest {
    @MetaField
    private String documentdirectoryid;

    @MetaField
    private String documentverificationpropertiesid;

    @MetaField(ref=true)
    private org.museframework.bian.documentdirectory.dto.bq.DocumentVerificationProperties documentVerificationProperties;

    public void setDocumentdirectoryid(String documentdirectoryid) {
        this.documentdirectoryid = documentdirectoryid;
    }

    public String getDocumentdirectoryid() {
        return documentdirectoryid;
    }

    public void setDocumentverificationpropertiesid(String documentverificationpropertiesid) {
        this.documentverificationpropertiesid = documentverificationpropertiesid;
    }

    public String getDocumentverificationpropertiesid() {
        return documentverificationpropertiesid;
    }

    public void setDocumentVerificationProperties(org.museframework.bian.documentdirectory.dto.bq.DocumentVerificationProperties documentVerificationProperties) {
        this.documentVerificationProperties = documentVerificationProperties;
    }

    public org.museframework.bian.documentdirectory.dto.bq.DocumentVerificationProperties getDocumentVerificationProperties() {
        return documentVerificationProperties;
    }
}