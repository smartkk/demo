package com.example.demo.inspection2;

import com.example.demo.inspection2.domain.StrategyConstant;
import com.example.demo.inspection2.solver.Deduction;

/**
 * 根据策略对象生产对应的类，通过工厂类避免策略对象暴露
 */
public class StrategyFactory {

    public static Deduction getDeduction(StrategyConstant constant){
        Deduction deduction = null;
        try{
            deduction = (Deduction) Class.forName(constant.getType()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return deduction;
    }

}
