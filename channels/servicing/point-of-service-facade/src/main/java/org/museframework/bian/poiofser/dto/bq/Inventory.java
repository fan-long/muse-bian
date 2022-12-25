/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.poiofser.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Inventory {
    /*The type of non-cash inventory (e.g. documents/forms, brochures)*/
    @MetaField(0)
    private String servicingInventoryType;

    /*Used to track inventory holdings at the position*/
    @MetaField(0)
    private String servicingPositionInventoryRecord;

    /*Details of the transfer of inventory (e.g. documents issued)*/
    @MetaField(0)
    private String servicingInventoryTransactionRecord;

    public void setServicingInventoryType(String servicingInventoryType) {
        this.servicingInventoryType = servicingInventoryType;
    }

    public String getServicingInventoryType() {
        return servicingInventoryType;
    }

    public void setServicingPositionInventoryRecord(String servicingPositionInventoryRecord) {
        this.servicingPositionInventoryRecord = servicingPositionInventoryRecord;
    }

    public String getServicingPositionInventoryRecord() {
        return servicingPositionInventoryRecord;
    }

    public void setServicingInventoryTransactionRecord(String servicingInventoryTransactionRecord) {
        this.servicingInventoryTransactionRecord = servicingInventoryTransactionRecord;
    }

    public String getServicingInventoryTransactionRecord() {
        return servicingInventoryTransactionRecord;
    }
}