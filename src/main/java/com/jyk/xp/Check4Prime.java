package com.jyk.xp;

public class Check4Prime {
    static final int max = 1000;
    static final int min = 0;
    static int input = 0;

    public static void main(String[] args) {
        Check4Prime check4Prime = new Check4Prime();

        try {
            check4Prime.checkArgs(args);
        } catch (Exception e) {
            System.out.println("Usage: checkPrime x");
            System.out.println("              -- where 0<=x<=1000");
            System.exit(1);
        }

        if (check4Prime.primeCheck(input)) {
            System.out.println("Yippeee...."+input+"is a prime number");
        } else {
            System.out.println("Bummer...."+input+"is NOT a prime number");
        }
    }

    public boolean primeCheck (int num) {
        double sqroot = Math.sqrt(max);
        boolean primeBucket [] = new boolean[max+1];

        // 先全部设置为true
        for (int i=2 ; i<=max ; i++) {
            primeBucket[i] = true;

        }

        int j = 2;
        // 将所有的2或者2的倍数去掉
        for (int i=j+j; i<=max; i=i+j) {
            primeBucket[i] = false;
        }

        // 从3到sqroot部分寻找质数
        for (j = 3; j<sqroot ; j=j+2) {
            if (true == primeBucket[j]) {
                // 去掉3/4/5/6/7...的倍数
                for (int i=j+j; i<=max; i=i+j) {
                    primeBucket[i] = false;
                }
            }
        }

        if (primeBucket[num] == true) {
            return true;
        } else {
            return false;
        }
    }

    public void checkArgs(String[] args) throws Exception{
        if (args.length != 1) {
            throw new Exception();
        } else {
            Integer num = Integer.valueOf(args[0]);
            input = num.intValue();
            if (input < 0) {
                throw new Exception();
            }else if (input > max) {
                throw new Exception();
            }
        }
    }






}
