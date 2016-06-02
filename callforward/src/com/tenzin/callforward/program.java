/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.callforward;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("put your coin");
            int x = input.nextInt();

            if (x == 1) {
                System.out.print("you can talk for = " + x);
                System.out.println("min");
            } else if (x == 2) {
                System.out.print("you can talk for = " + x);
                System.out.println("min");
            } 
            else if(x==3)
            {
                System.out.print("you can talk for = " + x);
                System.out.println("min");
            }
            else if(x==4)
            {
                System.out.print("you can talk for = " + x);
                System.out.println("min");
            }else 
                System.exit(0);
            
                System.out.println("do you want to talk more?[Y/N]");
                String choice=input.next();
                if(choice.equalsIgnoreCase("n"))
                   System.exit(0);
                
                }

            }

        }
