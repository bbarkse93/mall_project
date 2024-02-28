package com.example.mall._core.utils;

import java.text.DecimalFormat;

public class PriceUtils {

    public static String formatBalance(Integer balance){
        DecimalFormat df = new DecimalFormat("###,###");
        return df.format(balance);
    }

}
