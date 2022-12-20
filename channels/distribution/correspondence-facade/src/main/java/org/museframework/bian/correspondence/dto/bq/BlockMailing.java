/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.correspondence.dto.bq;

public class BlockMailing {
    /*Used to track receipt and return of the individual messages making up the block mail*/
    private String blockmailingRecord;

    public void setBlockmailingRecord(String blockmailingRecord) {
        this.blockmailingRecord = blockmailingRecord;
    }

    public String getBlockmailingRecord() {
        return blockmailingRecord;
    }
}