package com.example.demo.inspection2;

import com.example.demo.inspection2.domain.StrategyConstant;
import com.example.demo.inspection2.domain.WxBalance;
import com.example.demo.inspection2.domain.WxTrade;
import com.example.demo.inspection2.solver.Deduction;

import java.math.BigDecimal;

/**
 * 策略模式：指对象具有特定行为，但是在不同场景下，具有不同的实现算法，实质是面向对象的继承与多态
 * 代理模式：给某一个对象提供一个代理对象，并由这个代理对象控制对原对象得引用
 *
 */
public class DeductionFacade {

    //扣款
    public static void deduct(WxBalance wxBalance, WxTrade wxTrade) {
        StrategyConstant strate = getStrate(wxBalance, wxTrade);
        Deduction deduction = StrategyFactory.getDeduction(strate);
        deduction.exec(wxBalance,wxTrade);
    }

    //获取扣款策略 --- 直接new Object() 和 工厂类去生成没啥区别
    private static  StrategyConstant getStrate(WxBalance wxBalance,WxTrade wxTrade) {
        if (wxBalance.getBalance().compareTo(wxTrade.getTradeAmount()) < 0) {
            return StrategyConstant.IdCardDeduction;
        }else {
            return StrategyConstant.BalanceDeduction;
        }
    }

    public static void main(String[] args) {
        WxTrade wxTrade = new WxTrade();
        wxTrade.setTradeAmount(new BigDecimal("1000"));
        WxBalance wxBlance = new WxBalance();
        wxBlance.setBalance(new BigDecimal("9999"));
        DeductionFacade.deduct(wxBlance,wxTrade);
        System.out.println(wxTrade.getUserAmount());

    }

}
