package com.sukhorukov.kalinin.command;

import com.sukhorukov.kalinin.Command;

import java.util.Map;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Вячеслав
 * Date: 07.09.13
 * Time: 15:16
 * To change this template use File | Settings | File Templates.
 */
public class Push implements Command{
    @Override
    public void exec(Stack<Double> st, double N) {

        st.push(new Double (N));
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
