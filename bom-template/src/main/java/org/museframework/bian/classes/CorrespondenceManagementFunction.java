/*Function used to manage the correspondence 
- to process and track delivery of outbound correspondence
- to handle outbound correspondence 
- to handle in-bound messages
- to generate a block or batch of messages
*/
package org.museframework.bian.classes;

public class CorrespondenceManagementFunction {
    /**/
    private String correspondenceManagementFunctionDateTime;

    public void setCorrespondenceManagementFunctionDateTime(String correspondenceManagementFunctionDateTime) {
        this.correspondenceManagementFunctionDateTime = correspondenceManagementFunctionDateTime;
    }

    public String getCorrespondenceManagementFunctionDateTime() {
        return correspondenceManagementFunctionDateTime;
    }
}