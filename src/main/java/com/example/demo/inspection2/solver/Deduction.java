package com.example.demo.inspection2.solver;

import com.example.demo.inspection2.domain.WxBalance;
import com.example.demo.inspection2.domain.WxTrade;

public abstract class Deduction {

    public abstract boolean exec(WxBalance wxBalance, WxTrade wxTrade);
}
