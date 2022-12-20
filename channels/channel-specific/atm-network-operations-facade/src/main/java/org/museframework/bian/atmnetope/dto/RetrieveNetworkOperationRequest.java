package org.museframework.bian.atmnetope.dto;

public class RetrieveNetworkOperationRequest {
    private String atmnetworkoperationsid;

    private String networkoperationid;

    public void setAtmnetworkoperationsid(String atmnetworkoperationsid) {
        this.atmnetworkoperationsid = atmnetworkoperationsid;
    }

    public String getAtmnetworkoperationsid() {
        return atmnetworkoperationsid;
    }

    public void setNetworkoperationid(String networkoperationid) {
        this.networkoperationid = networkoperationid;
    }

    public String getNetworkoperationid() {
        return networkoperationid;
    }
}