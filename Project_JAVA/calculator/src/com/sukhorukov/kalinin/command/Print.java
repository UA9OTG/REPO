package com.sukhorukov.kalinin.command;

import com.sukhorukov.kalinin.Command;

import java.util.Enumeration;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Вячеслав
 * Date: 14.09.13
 * Time: 1:44
 * To change this template use File | Settings | File Templates.
 */
public class Print implements Command {
    public void exec (Stack<Double> st, double N) {
        if (st.empty()){
            System.out.println("Стек пуст!");}
        else {
        Double L;
        L=0.;
        Stack stb = new Stack();
        while (!st.empty()) {
            L=st.peek();
            System.out.println(L);
            stb.push(new Double (L));
            st.pop();
        }
//        st.
        while (!stb.empty()) {
            L= (Double) stb.pop();
            st.push(L); }
        }
    }
}

