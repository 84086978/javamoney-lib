package org.javamoney.calc.securities;

import javax.money.MonetaryAmount;

/**
 * <img src="http://www.financeformulas.net/formulaimages/PreferredStock1.gif" />
 * <p> The formula shown is for a simple straight preferred stock that does not have additional features, such as those found in convertible, retractable, and callable preferred stocks.
 * A preferred stock is a type of stock that provides dividends prior to any dividend paid to common stocks. Apart from having preference for dividend payouts, preferred stocks generally will have preference of asset allocation upon insolvency of the company, compared to common stocks. Because of these preferences, preferred stock is generally considered to be more secure than common stock and similar to a debt financial instrument, i.e., a bond. Despite the similarities, bonds do have preference for the same reasons and are generally considered more secure, ceteris paribus.
 * The formula for the present value of a preferred stock uses the perpetuity formula. A perpetuity is a type of annuity that pays periodic payments infinitely. As previously stated, preferred stocks in most circumstances receive their dividends prior to any dividends paid to common stocks and the dividends tend to be fixed. With this, its value can be calculated using the perpetuity formula.
 *
 * @author Manuela Grindei
 * @see http://www.financeformulas.net/Preferred_Stock.html
 */
public class PreferredStock {

    /**
     * Private constructor.
     */
    private PreferredStock() {
    }

    /**
     * Calculates the preferred stock.
     *
     * @param dividend     the dividend
     * @param discountRate the discount rate
     * @return the preferred stock
     */
    public static MonetaryAmount calculate(MonetaryAmount dividend, double discountRate) {
        return dividend.divide(discountRate);
    }
}
