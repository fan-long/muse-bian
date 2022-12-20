/**/
package org.museframework.bian.enumerations;

public enum Corporateactiontypevalues {
    
/*Dividend payment where holders can keep cash or have the cash reinvested in the market by the issuer into additional shares in the issuing company. To be distinguished from DVOP as the company invests the dividend in the market rather than creating new share capital in exchange for the dividend.*/
	Dividendreinvestment,
    
/*Funds related event in which the income (for example accumulation units) that accrues during an accounting period is retained within the fund instead of being paid away to investors. The retained income is nonetheless deemed to have been distributed to investors for tax purposes.*/
	Accumulation,
    
/*Trading in the security has commenced or security has been re-activated after a suspension in trading.*/
	Activetradingstatus,
    
/*Meeting Annual general meeting.*/
	Annualgeneralmeeting,
    
/*Combination of different security types to create a unit. Units are usually comprised of warrants and bonds or warrants and equities. Securities may be combined at the request of the security holder or based on market convention.*/
	Attachment,
    
/*Legal status of a company unable to pay creditors. Bankruptcy usually involves a formal court ruling. Securities may become valueless.*/
	Bankruptcy,
    
/*Failure by the company to perform obligations defined as default events under the bond agreement and that have not been remedied.*/
	Bonddefault,
    
/*Bonus or capitalisation issue. Security holders receive additional assets free of payment from the issuer, in proportion to their holding.*/
	Bonusissue,
    
/*Call or exercise on nil paid securities or intermediate securities resulting from an intermediate securities distribution (RHDI). This code is used for the second event, when an intermediate securities' issue (rights/coupons) is composed of two events, the first event being the distribution of intermediate securities.*/
	Callonintermediatesecurities,
    
/*Corporate event pays shareholders an amount in cash issued from the capital account. There is no reduction to the face value of a single share (or the share has no par value). The number of circulating shares remains unchanged.*/
	Capitaldistribution,
    
/*Event is the distribution of profits resulting from the sale of securities. Shareholders of mutual funds, unit trusts, or SICAVs are recipients of capital gains distributions and are often reinvested in additional shares of the fund.*/
	Capitalgainsdistribution,
    
/*Increase of the current principal of a debt instrument without increasing the nominal value. It normally arises from the incorporation of due but unpaid interest into the principal. This is commonly done by increasing the pool factor value, for example, capitalisation, and negative amortisation.*/
	Capitalisation,
    
/*Distribution to shareholders of cash resulting from the selling of non-eligible securities, for example, in the frame of a depositary receipt program.*/
	Cashdistributionfromnoneligiblesecuritiessales,
    
/*Distribution of cash to shareholders, in proportion to their equity holding. Ordinary dividends are recurring and regular. Shareholder must take cash and may be offered a choice of currency.*/
	Cashdividend,
    
/*Information regarding a change further described in the corporate action details.*/
	Change,
    
/*Situation where interested parties seek restitution for financial loss. The security holder may be offered the opportunity to join a class action proceeding and would need to respond with an instruction.*/
	Classactionproposedsettlement,
    
/*Company option may be granted by the company, allowing the holder to take up shares at some future date(s) at a pre arranged price in the company. A company may not grant options which enable the holder to take up unissued shares at a time which is five or more years from the date of the grant. Option holders are not members of a company. They are contingent creditors of a company and hence may, in some instances, be entitled to vote on and be bound by a scheme of arrangement between the creditors and the company. As many options have multiple exercise periods a company option will either lapse or carry on to the next expiry date.*/
	Companyoption,
    
/*Procedure that aims to obtain consent of holder to a proposal by the issuer or a third party without convening a meeting. For example, consent to change the terms of a bond.*/
	Consent,
    
/*Conversion of securities (generally convertible bonds or preferred shares) into another form of securities (usually common shares) at a pre-stated price/ratio.*/
	Conversion,
    
/*Coupon stripping is the process whereby interest coupons for future payment dates are separated from the security corpus that entitles the holder to the principal repayment.*/
	Couponstripping,
    
/*Announcement of a meeting at a Court.*/
	Courtmeeting,
    
/*Occurrence of credit derivative for which the issuer of one or several underlying securities is unable to fulfill its financial obligations (as defined in terms and conditions).*/
	Creditevent,
    
/*Reduction of face value of a single share or the value of fund assets. The number of circulating shares/units remains unchanged. This event may include a cash payout to holders.*/
	Decreaseinvalue,
    
/*Separation of components that comprise a security, for example, usually units comprised of warrants and bond or warrants and equity. Units may be broken up at the request of the security holder or based on market convention.*/
	Detachment,
    
/*Requirement for holders or beneficial owners to disclose their name, location and holdings of any issue to the issuer.*/
	Disclosure,
    
/*Distribution of a dividend to shareholders with a choice of benefit to receive. Shareholders may choose to receive shares or cash. To be distinguished from DRIP as the company creates new share capital in exchange for the dividend rather than investing the dividend in the market.*/
	Dividendoption,
    
/*Securities are redeemed in part before the scheduled final maturity date. It is done without any pool factor reduction. The redemption is reflected in a debit of the face amount (FAMT). Drawing is distinct from partial call since drawn bonds are chosen by lottery. Therefore, not every holder is affected in the same way.*/
	Drawing,
    
/*Action by a party wishing to acquire a security. Holders of the security are invited to make an offer to sell, within a specific price range. The acquiring party will buy from the holder with lowest offer.*/
	Dutchauction,
    
/*This includes drawing, partial and full call, put.*/
	Earlyredemption,
    
/*Exchange of holdings for other securities and/or cash. The exchange can be either mandatory or voluntary involving the exchange of outstanding securities for different securities and/or cash. For example "exchange offer", "capital reorganisation" or "funds separation".*/
	Exchange,
    
/*Event is an option for the shareholders to exchange their securities for other securities and/or cash. Exchange options are mentioned in the terms and conditions of a security and are valid during the whole lifetime of a security.*/
	Exchangeoption,
    
/*Extraordinary or Special General Meeting. Extraordinary or special general meeting.*/
	Extraordinarygeneralmeeting,
    
/*Redemption of an entire issue outstanding of securities, for example, bonds, preferred equity, funds, by the issuer or its agent, for example, asset manager, at final maturity.*/
	Finalmaturity,
    
/*Redemption of an entire issue outstanding of securities, for example, bonds, preferred equity, funds, by the issuer or its agent, for example, asset manager, before final maturity.*/
	Fullcall,
    
/*Increase in the face value of a single security. The number of circulating securities remains unchanged.*/
	Increaseinvalue,
    
/*Information provided by the issuer having no accounting/financial impact on the holder.*/
	Information,
    
/*Instalment towards the purchase of equity capital, subject to an agreement between an issuer and a purchaser.*/
	Instalmentcall,
    
/*Interest payment distributed to holders of an interest bearing asset.*/
	Interestpayment,
    
/*Event which consists of two components, the decrease of the amortized value of a pool factor security and an interest payment.*/
	Interestpaymentwithprincipal,
    
/*Distribution of intermediate securities that gives the holder the right to take part in a future event.*/
	Intermediatesecuritiesdistribution,
    
/*Distribution of cash, assets or both. Debt may be paid in order of priority based on preferred claims to assets specified by the security.*/
	Liquidationdividend,
    
/*As stipulated in the security's Terms and Conditions, the issuer or the holder may prolong the maturity date of a security. After extension, the security details may differ from the original issue. An issuer initiated extension may be subject to holder's approval.*/
	Maturityextension,
    
/*Exchange of outstanding securities, initiated by the issuer which may include options, as the result of two or more companies combining assets, that is, an external, third party company. Cash payments may accompany share exchange.*/
	Merger,
    
/*Event is a name change. The issuing company changes its name. The event shows the change from old name to new name and may involve surrendering physical shares with the old name to the registrar.*/
	Namechange,
    
/*Offers that are not supervised or regulated by an official entity and being offered by a party, for example a broker, usually at a discount price, for example broker offer, mini-tender, mini odd lot offer or third party offer.*/
	Nonofficialoffer,
    
/*Non-US beneficial owner certification requirement for exchange of temporary to permanent notes.*/
	Nonustefradcertification,
    
/*Sale or purchase of odd-lots to/from the issuing company, initiated either by the holder of the security or through an offer made by the issuer.*/
	Oddlotsalepurchase,
    
/*Ordinary general meeting.*/
	Ordinarygeneralmeeting,
    
/*Other event, use only when no other event type applies, for example, a new event type.*/
	Otherevent,
    
/*Occurs when securities with different characteristics, for example, shares with different entitlements to dividend or voting rights, become identical in all respects, for example, pari-passu or assimilation. May be scheduled in advance, for example, shares resulting from a bonus may become fungible after a pre-set period of time, or may result from outside events, for example, merger, reorganisation, issue of supplementary tranches.*/
	Paripassu,
    
/*Securities are redeemed in part before their scheduled final maturity date. It is done without any pool factor reduction. The redemption is reflected in a debit of the face amount (FAMT).*/
	Partialredemptionwithoutpoolfactorreduction,
    
/*Securities are redeemed in part before their scheduled final maturity date. The redemption is reflected in a pool factor reduction. No movement of securities occurs.*/
	Partialredemptionwithpoolfactorreduction,
    
/*Interest payment, in any kind except cash, distributed to holders of an interest bearing asset.*/
	Payinkind,
    
/*Changes in the state of incorporation for US companies and changes in the place of incorporation for foreign companies. Where shares need to be registered following the incorporation change, the holder(s) may have to elect the registrar.*/
	Placeofincorporation,
    
/*Also called partial defeasance. Issuer has money set aside to redeem a portion of an issue and the indenture states that the securities could be called earlier than the stated maturity.*/
	Prefunding,
    
/*Form of open or public offer where, due to a limited amount of securities available, priority is given to existing shareholders.*/
	Priorityissue,
    
/*Early redemption of a security at the election of the holder subject to the terms and condition of the issue with no reduction in nominal value.*/
	Putredemption,
    
/*Event by which the unit (currency and/or nominal) of a security is restated, for example, nominal/par value of security in a national currency is restated in another currency.*/
	Redenomination,
    
/*Purchase and sale of remarketed preferred equities/bonds through the negotiation of interest rate between the issuers and the holders.*/
	Remarketing,
    
/*Purchase and sale of remarketed preferred equities/bonds through the negotiation of interest rate between the issuers and the holders.*/
	Remarketingagreement,
    
/*Repurchase offer / issuer bid / reverse rights. Offer to existing holders by the issuing company to repurchase its own securities. The objective of the offer is to reduce the number of outstanding securities.*/
	Repurchaseoffer,
    
/*Decrease in a company's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split. Equity price and nominal value are increased accordingly.*/
	Reversestocksplit,
    
/*Offer to holders of a security to subscribe for additional securities via the distribution of an intermediate security. Both processes are included in the same event.*/
	Rightsissue,
    
/*Dividend or interest paid in the form of scrip.*/
	Scripdividend,
    
/*Ordinary or annual or extraordinary or special general meeting.*/
	Securitiesholdersmeeting,
    
/*Corporate event pays shareholders an amount in cash issued from the shares premium reserve. It is similar to a dividend but with different tax implications.*/
	Sharespremiumdividend,
    
/*Modification of the smallest negotiable unit of shares in order to obtain a new negotiable unit.*/
	Smallestnegotiableunit,
    
/*Distribution of securities issued by another company. The distributed securities may either be of a newly created or of an existing company. For example, spin-off, demerger, unbundling, divestment.*/
	Spinoff,
    
/*Dividend paid to shareholders in the form of equities of the issuing corporation.*/
	Stockdividend,
    
/*Increase in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split. Equity price and nominal value are reduced accordingly.*/
	Stocksplit,
    
/*Ability for security holders to purchase (additional or new) securities at a certain price, in proportion to their holding.*/
	Subscription,
    
/*Taxable component on non-distributed proceeds, for example, Australian deemed income or US 871m income regulation.*/
	Taxonnondistributedproceeds,
    
/*Event related to tax reclaim activities.*/
	Taxreclaim,
    
/*Offer made to holders by a third party, requesting them to sell (tender) or exchange their securities.*/
	Tender,
    
/*Security is no longer able to comply with the listing requirements of a stock exchange and is removed from official board quotation.*/
	Tradingstatusdelisted,
    
/*Trading in the security has been suspended.*/
	Tradingstatussuspended,
    
/*Option offered to holders to buy (call warrant) or to sell (put warrant) a specific amount of stock, cash, or commodity, at a predetermined price, during a predetermined period of time (which usually corresponds to the life of the issue).*/
	Warrantexercise,
    
/*Certification process for withholding tax reduction or exemption based on the tax status of the holder.*/
	Withholdingtaxreliefcertification,
    
/*Booking out of valueless securities.*/
	Worthless;
}