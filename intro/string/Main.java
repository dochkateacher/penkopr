package com.clouway.intro.string;

/**
 * Created with IntelliJ IDEA.
 * User: Penio
 * Date: 15-10-11
 * Time: 10:49
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        GenerateRandomString grs = new GenerateRandomString();
        System.out.println(grs.getAlphaNumeric(10));
        System.out.println(grs.getAlphaNumeric(20));
    }
}
