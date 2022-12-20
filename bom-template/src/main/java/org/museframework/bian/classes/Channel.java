/*An interface through which parties can communicate or exchange goods or services.  

Comment: A channel can be internal or external.
Channel identifies the different delivery and communications mechanisms through which products, and services are made available to parties and by which the parties communicate with each other. 

Examples: Shop, a web shop, email, television screens in the shops, servicedesk, e-mail, phone,  …*/
package org.museframework.bian.classes;

public class Channel {
    /**/
    private String channelType;

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getChannelType() {
        return channelType;
    }
}