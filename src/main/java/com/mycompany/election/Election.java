/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.election;

/**
 *
 * @author ANUJ
 */
import java.util.Scanner;
public class Election 
{
     public static void main(String[] args)
{
            int[]count = new int[6];
            char choice, c;
            System.out.println("Please select one of the options provided below");
            System.out.println("1------> Start election");
            System.out.println("2------> Postpone election");
            Scanner myObj3 = new Scanner(System.in);
            int choice3 = myObj3.nextInt();
            try
            {
             switch(choice3)
             {
                 case 1:
                 outer:      for(int i=0;i<100;i++)
                             {
                              System.out.println("Please choose one of the option provided");
                              System.out.println("1------>continue");
                              System.out.println("2------>Completed");
                              Scanner myObj = new Scanner(System.in);
                              int choice2 = myObj.nextInt();
                              try
                              {
                               switch(choice2)
                               {
                                case 1:      System.out.println("Please select one of the options provided below to cast your vote");
                                             System.out.println("Ballot number   Name");
                                             System.out.println("      1         Mahesh");
                                             System.out.println("      2         Suresh");
                                             System.out.println("      3         Rakesh");
                                             System.out.println("      4         Mayank");
                                             System.out.println("      5         Deepak");
                                             try
                                             {
                                              switch(choice = (char) System.in.read())
                                              {
                                               case '1': System.out.println("Vote given to Mahesh");
                                                         count[0]=++count[0];
                                                         continue outer;
                                               case '2': System.out.println("Vote given to Suresh");
                                                         count[1]=++count[1];
                                                         continue outer;
                                               case '3': System.out.println("Vote given to Rakesh");
                                                         count[2]=++count[2];
                                                         continue outer;
                                               case '4': System.out.println("Vote given to Mayank");
                                                         count[3]=++count[3];
                                                         continue outer;
                                               case '5': System.out.println("Vote given to Deepak");
                                                         count[4]=++count[4];
                                                         continue outer;  
                                               default:  System.out.println("Invalid choice(IC)");
                                                         count[5]=++count[5];
                                                         continue outer;
                                               }
                                              }
                                            catch (Exception e)
                                            {
                                             System.out.println("I/O Error");
                                            } 
                                             break;
                          
                                case 2:      System.out.println("Votes received by Mahesh are "+count[0]);
                                             System.out.println("Votes received by Suresh are "+count[1]);
                                             System.out.println("Votes received by Rakesh are "+count[2]);
                                             System.out.println("Votes received by Mayank are "+count[3]);
                                             System.out.println("Votes received by Deepak are "+count[4]);
                                             System.out.println("Spoilt ballots are "+count[5]);
                                             break outer;
                    
                                default:     System.out.println("Invalid choice(IC2)");
                                             break;
                               }
                              }
                              catch(Exception e)
                              {
                               System.out.println("I/O Error");
                              }
                             } 
                             break;
                             
                 case 2:     System.out.println("Elections are postponed");
                          
                 
                 default: System.out.println("Invalid choice(IC3)");
                }
            }
            catch(Exception e)
            {
             System.out.println("I/O Error");
            }
}   
}

