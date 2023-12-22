package com.company.base.service.event;


import java.math.BigInteger;

public class BigSumService {
    public BigInteger sum(int a, int b) {
        var bigA = new BigInteger(String.valueOf(a));
        var bigB = new BigInteger(String.valueOf(b));
        return bigA.add(bigB);

    }

}