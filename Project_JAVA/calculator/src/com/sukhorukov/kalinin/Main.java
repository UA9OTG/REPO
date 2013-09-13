package com.sukhorukov.kalinin;

import com.sukhorukov.kalinin.command.Print;
import com.sukhorukov.kalinin.command.Push;
import com.sukhorukov.kalinin.command.EPrint;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Вячеслав
 * Date: 07.09.13
 * Time: 15:16
 * To change this template use File | Settings | File Templates.
 */
public class Main
{
  public static void main (String[] args)  throws IOException
  {
      double N;
      String s;
      int i;
      Map<String,Command> mapCmd = new HashMap<String, Command>();
      mapCmd.put("EPRINT",new EPrint());
      mapCmd.put("PRINT",new Print());
      mapCmd.put("PUSH",new Push());
      Stack <Double> st = new Stack<Double>();
      Scanner scan = new Scanner(System.in);
      System.out.println("Введите команду:");
      String comm = null;
          while (true) {
          comm = scan.nextLine();
              if (comm.equals("EXIT")) {break;}
              if (comm.indexOf(" ")!=-1)
              {
              String[] str = comm.split(" ");
          N = Double.parseDouble(str[1]);
          mapCmd.get(str[0]).exec(st,N);
              System.out.println(st.peek());

              continue; }
              if (comm.length()==0){
                  System.out.println("Введите правильную команду:");}
              else {
              mapCmd.get(comm).exec(st,0.);
              }
              }



  }
  }

