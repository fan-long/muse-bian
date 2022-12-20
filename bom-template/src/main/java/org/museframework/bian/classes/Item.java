/*A tangible and intangible thing.*/
package org.museframework.bian.classes;

public class Item {
    /**/
    private String itemType;

    /**/
    private String itemDescription;

    /**/
    private String itemLocation;

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemLocation(String itemLocation) {
        this.itemLocation = itemLocation;
    }

    public String getItemLocation() {
        return itemLocation;
    }
}