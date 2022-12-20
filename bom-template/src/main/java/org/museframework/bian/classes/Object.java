/*A tangible or intangible thing that exist in reality.

examples:
a specific house, a specific golden ring, a patent, a brand, etc. 
*/
package org.museframework.bian.classes;

public class Object {
    /**/
    private String objectProperties;

    /**/
    private String objectDescription;

    public void setObjectProperties(String objectProperties) {
        this.objectProperties = objectProperties;
    }

    public String getObjectProperties() {
        return objectProperties;
    }

    public void setObjectDescription(String objectDescription) {
        this.objectDescription = objectDescription;
    }

    public String getObjectDescription() {
        return objectDescription;
    }
}