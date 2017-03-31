package com.company;

/**
 * Created by ridita on 3/30/17.
 */
public class EndUp {

    public String endUp(String str) {

        if (str.length() < 3) {
            return str.toUpperCase();
        } else if (str.length() >= 3) {
            return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
        } else {
            return "";
        }
    }

}
