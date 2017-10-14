/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaredbgreat.arcade.util.math;

/**
 *
 * @author jared
 */
public class Bits {
    
    public static int setBit(int in, int bit) {
        return in | (1 << (bit - 1));
    }
    
    public static long setBit(long in, int bit) {
        return in | (1 << (bit - 1));
    }
    
    
    public static boolean checkBit(int in, int bit) {
        return ((in >> (bit - 1)) & 1) == 1;
    }
    
    
    public static boolean checkBit(long in, int bit) {
        return ((in >> (bit - 1)) & 1) == 1;
    }
    
    
    
    
}
