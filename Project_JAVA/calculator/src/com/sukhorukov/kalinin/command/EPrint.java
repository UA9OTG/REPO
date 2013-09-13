package com.sukhorukov.kalinin.command;

import com.sukhorukov.kalinin.Command;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Вячеслав
 * Date: 14.09.13
 * Time: 3:26
 * To change this template use File | Settings | File Templates.
 */
public class EPrint implements Command {
    public void exec (Stack<Double> st, double N)
    {
     while (!st.empty())
     {
         System.out.println(st.pop());
     }
        System.out.println("Стек очищен!");
    }
}
