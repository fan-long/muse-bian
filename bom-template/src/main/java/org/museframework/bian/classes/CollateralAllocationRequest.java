/*An instruction to request the allocation of collateral asset*/
package org.museframework.bian.classes;

public class CollateralAllocationRequest {
    /*Classification Value classifying an allocation/assignment instruction according to a more detailed specification of the allocation" 

examples are: earmark, future allocation, to be applied, recall, valuation to a subject matter.*/
    private String allocationType;

    public void setAllocationType(String allocationType) {
        this.allocationType = allocationType;
    }

    public String getAllocationType() {
        return allocationType;
    }
}