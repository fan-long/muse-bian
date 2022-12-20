package org.museframework.bian.customerworkbench.dto;

public class InitiateSWUpdateResponse {
    private org.museframework.bian.customerworkbench.dto.bq.SWUpdate sWUpdate;

    public void setsWUpdate(org.museframework.bian.customerworkbench.dto.bq.SWUpdate sWUpdate) {
        this.sWUpdate = sWUpdate;
    }

    public org.museframework.bian.customerworkbench.dto.bq.SWUpdate getsWUpdate() {
        return sWUpdate;
    }
}