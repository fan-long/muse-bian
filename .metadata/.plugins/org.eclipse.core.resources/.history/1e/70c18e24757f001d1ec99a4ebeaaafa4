/*Arrangement in which funds are transferred from one deposit account to another when a certain threshold is reached. 

Banking arrangement in which a checking (current) account balance above or below a certain amount is automatically transferred to and from an interest-bearing (savings or money market fund) account. The objective of a sweep account is to maximize the accountholder's interest earnings while covering all withdrawals. (Business Dictionary)

Sweep Account is a brokerage account whose cash balance is automatically transferred into an interest-bearing investment, such as a money market fund. (Investorwords)
*/
package org.museframework.bian.classes;

public class SweepArrangement {
    /*The type of sweep (e.g. periodic, threshold).*/
    private String sweepType;

    /*The way sweep transactions will be triggered and executed (on the "from side) or what the reaction should be (on the receive side)

e.g. buy securities when a sweep of the "petty cash" type is received on a securities account from a current account*/
    private String sweepModalitites;

    /*Reference to the account the funds are transferred to or from*/
    private String sweepCounterAccountReference;

    /*Timing and or triggers for initiating sweep transaction; */
    private String sweepSchedule;

    /*Permission to define a sweep arrangement to the target account.  */
    private String sweepMandate;

    /*Indication whether the savings account is source or target of the sweep arrangement*/
    private String sweepDirection;

    public void setSweepType(String sweepType) {
        this.sweepType = sweepType;
    }

    public String getSweepType() {
        return sweepType;
    }

    public void setSweepModalitites(String sweepModalitites) {
        this.sweepModalitites = sweepModalitites;
    }

    public String getSweepModalitites() {
        return sweepModalitites;
    }

    public void setSweepCounterAccountReference(String sweepCounterAccountReference) {
        this.sweepCounterAccountReference = sweepCounterAccountReference;
    }

    public String getSweepCounterAccountReference() {
        return sweepCounterAccountReference;
    }

    public void setSweepSchedule(String sweepSchedule) {
        this.sweepSchedule = sweepSchedule;
    }

    public String getSweepSchedule() {
        return sweepSchedule;
    }

    public void setSweepMandate(String sweepMandate) {
        this.sweepMandate = sweepMandate;
    }

    public String getSweepMandate() {
        return sweepMandate;
    }

    public void setSweepDirection(String sweepDirection) {
        this.sweepDirection = sweepDirection;
    }

    public String getSweepDirection() {
        return sweepDirection;
    }
}