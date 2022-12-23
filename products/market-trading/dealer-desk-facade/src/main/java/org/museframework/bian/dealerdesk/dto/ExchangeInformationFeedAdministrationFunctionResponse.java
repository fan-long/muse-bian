package org.museframework.bian.dealerdesk.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeInformationFeedAdministrationFunctionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.dealerdesk.dto.bq.InformationFeedAdministrationFunction informationFeedAdministrationFunction;

    public void setInformationFeedAdministrationFunction(org.museframework.bian.dealerdesk.dto.bq.InformationFeedAdministrationFunction informationFeedAdministrationFunction) {
        this.informationFeedAdministrationFunction = informationFeedAdministrationFunction;
    }

    public org.museframework.bian.dealerdesk.dto.bq.InformationFeedAdministrationFunction getInformationFeedAdministrationFunction() {
        return informationFeedAdministrationFunction;
    }
}