/*A system to trade a basket of stocks in large volumes by machines using the programs or algorithms. 

Program trading refers to the use of computer-generated algorithms to trade a basket of stocks in large volumes and sometimes with great frequency.
https://www.investopedia.com/terms/p/programtrading.asp#:~:text=Program%20trading%20refers%20to%20the,generate%20the%20trades%2C%20not%20humans.

Program trading, also known as system trading, is done by machines using the programs or algorithms by the set strategies to effectively and efficiently trade in the market without human intervention.
https://www.wallstreetmojo.com/program-trading/*/
package org.museframework.bian.classes;

public class ProgramTrading {
    /**/
    private org.museframework.bian.enumerations.Programtradingtypevalues programTradingType;

    public void setProgramTradingType(org.museframework.bian.enumerations.Programtradingtypevalues programTradingType) {
        this.programTradingType = programTradingType;
    }

    public org.museframework.bian.enumerations.Programtradingtypevalues getProgramTradingType() {
        return programTradingType;
    }
}