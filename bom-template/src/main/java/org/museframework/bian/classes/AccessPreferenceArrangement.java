/*A term (arrangement) which specifies the preference on the access/usage of channel or device. */
package org.museframework.bian.classes;

public class AccessPreferenceArrangement {
    /*The type of preference (e.g. for correspondence)*/
    private String accessPreferenceType;

    /*Details the specific device or channel with the preference*/
    private String preferencedChannelDevice;

    /*The types of product and service to which this preference applies*/
    private String productServiceType;

    /*Details the preference (e.g. no paper correspondence, no solicitations)*/
    private String accessPreferenceDescription;

    public void setAccessPreferenceType(String accessPreferenceType) {
        this.accessPreferenceType = accessPreferenceType;
    }

    public String getAccessPreferenceType() {
        return accessPreferenceType;
    }

    public void setPreferencedChannelDevice(String preferencedChannelDevice) {
        this.preferencedChannelDevice = preferencedChannelDevice;
    }

    public String getPreferencedChannelDevice() {
        return preferencedChannelDevice;
    }

    public void setProductServiceType(String productServiceType) {
        this.productServiceType = productServiceType;
    }

    public String getProductServiceType() {
        return productServiceType;
    }

    public void setAccessPreferenceDescription(String accessPreferenceDescription) {
        this.accessPreferenceDescription = accessPreferenceDescription;
    }

    public String getAccessPreferenceDescription() {
        return accessPreferenceDescription;
    }
}