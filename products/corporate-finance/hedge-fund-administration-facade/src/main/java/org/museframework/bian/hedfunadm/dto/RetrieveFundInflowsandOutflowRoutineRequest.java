package org.museframework.bian.hedfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFundInflowsandOutflowRoutineRequest {
    @MetaField
    private String hedgefundadministrationid;

    @MetaField
    private String fundinflowsandoutflowroutineid;

    public void setHedgefundadministrationid(String hedgefundadministrationid) {
        this.hedgefundadministrationid = hedgefundadministrationid;
    }

    public String getHedgefundadministrationid() {
        return hedgefundadministrationid;
    }

    public void setFundinflowsandoutflowroutineid(String fundinflowsandoutflowroutineid) {
        this.fundinflowsandoutflowroutineid = fundinflowsandoutflowroutineid;
    }

    public String getFundinflowsandoutflowroutineid() {
        return fundinflowsandoutflowroutineid;
    }
}