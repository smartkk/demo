package com.example.demo.inspection2.solver;

import com.example.demo.inspection2.domain.WxBalance;
import com.example.demo.inspection2.domain.WxTrade;

public class BalanceDeduction extends Deduction {
    @Override
    public boolean exec(WxBalance wxBalance, WxTrade wxTrade) {
        if (wxBalance.getBalance().compareTo(wxTrade.getTradeAmount()) >= 0) {
            wxTrade.setUserAmount(wxBalance.getBalance());
        }
        return true;
    }
}
