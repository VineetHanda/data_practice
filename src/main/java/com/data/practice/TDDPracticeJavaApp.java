package com.data.practice;

public class TDDPracticeJavaApp {

    public Boolean checkNumberInRange(Integer num) {
        boolean result = false;

        if(num != null) {
            if (num >= 0 && num <= 10) result = true;
        }
        else result = false;

        return result;
    }

}
