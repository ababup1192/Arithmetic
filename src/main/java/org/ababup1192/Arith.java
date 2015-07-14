package org.ababup1192;

public class Arith {

    /**
     * ２つの数の掛け算を行う。
     *
     * @param x 1つ目の数
     * @param y ２つ目の数
     * @return ２つの数の積
     */
    public static int multiple(int x, int y) {
        return x * y;
    }

    /**
     * ２つの数の割り算を行う。
     *
     * @param x １つ目の数
     * @param y 2つ目の数
     * @return ２つの数の和
     */
    public static int divide(int x, int y) {
        if(y == 0){
            return 0;
        }else {
            return x / y;
        }
    }


}
