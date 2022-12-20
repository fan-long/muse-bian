package org.museframework.bian.atmnetope.dto;

public class ControlNetworkOperationRequest {
    private String atmnetworkoperationsid;

    private String networkoperationid;

    private org.museframework.bian.atmnetope.dto.bq.NetworkOperation networkOperation;

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

    public void setNetworkOperation(org.museframework.bian.atmnetope.dto.bq.NetworkOperation networkOperation) {
        this.networkOperation = networkOperation;
    }

    public org.museframework.bian.atmnetope.dto.bq.NetworkOperation getNetworkOperation() {
        return networkOperation;
    }
}