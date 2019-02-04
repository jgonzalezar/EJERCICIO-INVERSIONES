/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgonzalezar
 */
public class DividendStock extends Stock{
    protected int dividends;

    public DividendStock(int dividends, int totalShares, String symbol, double totalCost, double currentPrice) {
        super(totalShares, symbol, totalCost, currentPrice);
        this.dividends = dividends;
    }
    
    @Override
    public double getMarketValue() {
        return this.totalCost*this.currentPrice;
    }

}
