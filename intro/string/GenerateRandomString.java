package com.clouway.intro.string;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Penio
 * Date: 15-10-11
 * Time: 10:44
 * To change this template use File | Settings | File Templates.
 */
public class GenerateRandomString {

    private static final String charlist =
            "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public String getAlphaNumeric(int len) {
        StringBuffer sb = new StringBuffer(len);
        Random r=new Random();
        for (int i=0;  i<len;  i++) {
            int ndx = (int)(Math.random()*charlist.length());
            sb.append(charlist.charAt(ndx));
        }
        return sb.toString();
    }
}