/**/
package org.museframework.bian.enumerations;

public enum Investmentfundinvolvementtypevalues {
    
/*Legal entity that sets up a fund, appoints agents, decides and implements an investment strategy. That is, selects portfolio investments in accordance with the objectives and strategy in the fund's prospectus, and places orders to effect or liquidate selected investments in accordance with net flow of capital into or out of the fund. Also called fund promoter or fund sponsor.*/
	FundManager,
    
/*Party that keeps accounting records of available assets and liabilities of a fund. It calculates dealing prices, the net asset value (NAV) of the fund, and may provide fund performance and tax data. Can be sub-contracted by the fund administrator.*/
	FundAccountant,
    
/*Party in charge of financial accounting, net asset value (NAV) calculation, management and performance fee calculation. Can also be in charge of orders centralisation and registration.*/
	FundAdministator,
    
/*Principal entity appointed by the fund to which orders should be submitted.*/
	FundOrderDesk,
    
/*Party that helps hedge funds to refine their strategy. May also introduce partners such as fund of funds, pension funds, insurance companies and family offices.*/
	PlacementAgent,
    
/*Party appointed by a fund management company. It updates records of investor accounts to reflect the daily investor purchases, redemptions, switches, transfers, and re-registrations. It ensures the timely settlement of transactions, and may provide tax information to the investor and/or to its intermediaries. It may calculate, collect, and rebate commissions. It prepares and distributes confirmations reflecting transactions, resulting in unit or cash account movements to the investor or the investor's intermediary. It responds to inquiries concerning account status, and processes the income distribution.*/
	TransferAgent,
    
/*Party in charge of examining and verifying a fund's financial and accounting records as well as supporting documents.*/
	Auditor,
    
/*Grantor role in the hedge funds industry.*/
	Grantor,
    
/*Entity that creates a trust or contributes assets to the trust.*/
	Settlor;
}