/*A brand is an identifying symbol, mark, logo, name, word, and/or sentence that companies use to distinguish their product from others (Investopedia)

https://www.investopedia.com/terms/b/brand.asp
*/
package org.museframework.bian.classes;

public class Brand {
    /**/
    private String brandDefinition;

    public void setBrandDefinition(String brandDefinition) {
        this.brandDefinition = brandDefinition;
    }

    public String getBrandDefinition() {
        return brandDefinition;
    }
}