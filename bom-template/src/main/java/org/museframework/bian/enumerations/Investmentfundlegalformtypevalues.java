/*The legal form of a Fund.*/
package org.museframework.bian.enumerations;

public enum Investmentfundlegalformtypevalues {
    
/*The fund is constituted under the law of contract. Contractual fund issue units and investors are called unitholders. The fund is run by a management company which may or may not delegate to third agents certain investment and/or administration tasks. ISO20022*/
	Contractual,
    
/*The fund is constituted under the trust law. Whereby an independant person (a trustee) holds the assets of the investment fund for the benefit of the underlying investors. The trustee is placed under the fiduciary responsibility to ensure that the fund is managed in accordance with its investment policy and objectives. ISO20022*/
	Trust,
    
/*The fund is constituted as a company. It issues shares and the investors are the shareholders. The fund is run by a management company which may or may not delegate to third agens certain investment and/or administration tasks. ISO20022*/
	Corporate;
}