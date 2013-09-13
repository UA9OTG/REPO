package com.sukhorukov.kalinin;

import java.util.Map;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Вячеслав
 * Date: 07.09.13
 * Time: 15:14
 * To change this template use File | Settings | File Templates.
 */
public interface Command {
    void exec (Stack <Double> st, double N);
}
