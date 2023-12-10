package ProjectOne;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class CharacterBattle {
        public static void main(String [] args) {



            Scanner console = new Scanner((System.in));
            Random RANDOM = new Random();
            int PLAYER1WINS = 0, PLAYER2WINS = 0;
            System.out.println("Enter odd an odd number of rounds");
            int num = Integer.parseInt(console.nextLine());
            //int x;
            for (int x = 1; x <= num; x++) {
                System.out.printf(" ROUND %d:%n", x);
                System.out.println("PLAYER 1: CHOOSE YOUR CHARACTER AND ENTER STATS\n");
                System.out.println("CHARACTER SELECTION: Naruto, Sasuke, Sakura, Kakashi, Minato, Madara\n");
                System.out.println("ENTER YOUR NAME");
                String NameP1 = console.nextLine();
                System.out.println("ENTER HP");
                int HPP1 = Integer.parseInt(console.nextLine());
                System.out.println("Enter MOVE NAME: ");
                String MOVEP1 = console.nextLine();
                System.out.println("ENTER MOVES POWER");
                int POWERP1 = Integer.parseInt(console.nextLine());
                System.out.println("ENTER ATTACK SPEED");
                int ATTACKP1 = Integer.parseInt(console.nextLine());

                System.out.printf("PLAYER 2: CHOOSE YOUR CHARACTER AND ENTER STATS\n", x);
                System.out.println("CHARACTER SELECTION: Naruto, Sasuke, Sakura, Kakashi, Minato, Madara\n");
                System.out.println("ENTER YOUR NAME");

                String NameP2 = console.nextLine();
                System.out.println("ENTER HP");
                int HPP2 = Integer.parseInt(console.nextLine());
                System.out.println("Enter MOVE NAME: ");
                String MOVEP2 = console.nextLine();
                System.out.println("ENTER MOVES POWER");
                int POWERP2 = Integer.parseInt(console.nextLine());
                System.out.println("ENTER ATTACK SPEED");
                int ATTACKP2 = Integer.parseInt(console.nextLine());

                while (HPP1 > 0 && HPP2 > 0) {
                    if (ATTACKP1 > ATTACKP2) {
                        HPP2 -= POWERP1;
                        if (HPP2 < 0) {
                            System.out.printf("Player 1 %s is winner of this round\n", NameP1);
                            PLAYER1WINS++;

                        }
                        HPP1 -= POWERP2;
                        if (HPP1 < 0) {
                            System.out.printf("Player 2 %s is winner of this round\n", NameP2);
                            PLAYER2WINS++;
                        }
                    } else if (ATTACKP2 > ATTACKP1)
                    {
                        HPP1 -= POWERP2;
                    if (HPP1 < 0) {
                        System.out.printf("Player 2 %s is winner of this round\n", NameP2);
                        PLAYER2WINS++;

                    }
                    HPP1 -= POWERP2;
                    if (HPP2 < 0) {
                        System.out.printf("Player 1 %s is winner of this round\n", NameP1);
                        PLAYER1WINS++;
                    }
                }else{
                                int NUMBER = RANDOM.nextInt(2);
                                if (num == 1) {
                                    HPP2 -= POWERP1;
                                    if (HPP2 < 0) {
                                        System.out.printf("Player 1 %s  is the winner of this round\n", NameP1);
                                        PLAYER1WINS++;
                                    }
                                    HPP1 -= POWERP2;
                                    if (HPP1 < 0) {
                                        System.out.printf("Player 2 %s  is the winner of this round\n", NameP2);
                                        PLAYER2WINS++;
                                    }
                                } else {
                                    HPP1 -= HPP1 - POWERP2;
                                    if (HPP1 < 0) {
                                        System.out.printf("Player 2 %s  is the winner of this round\n", NameP2);
                                        PLAYER2WINS++;
                                    }
                                    HPP2 -=  POWERP1;
                                    if (HPP2 < 0) {
                                        System.out.printf("Player 1 %s is the winner if this round\n", NameP1);
                                        PLAYER1WINS++;
                                    }
                                }
                            }
                        }if (PLAYER1WINS > PLAYER2WINS) {
                    System.out.println("PLAYER 1 HAS TAKEN OVER AND DOMINATED. WINNERRRRRR!!!!");
                } else if (PLAYER2WINS > PLAYER1WINS) {
                    System.out.println("PLAYER 2 HAS TAKEN OVER AND DOMINATED. WINNERRRRRR!!!!");
                } else {
                    System.out.println(" IT'S A TIE BRO!!!");
                }

                        System.out.println("\n wins");
                        System.out.println("PLAYER  1 WINS" + PLAYER1WINS);
                        System.out.println("PLAYER  2 WINS" + PLAYER2WINS);
                        System.out.println();
                        //  int subtraction = (-POWER);
                        // System.out.printf("%d - %d  = %d%n", numOne, numTwo, subtraction);

                    }
                    System.out.println("\n FINAL SCORE:");
                    System.out.println("PLAYER 1 WINS:" + PLAYER1WINS);
                    System.out.println("PLAYER 2 WINS:" + PLAYER2WINS);


               console.close();
                }


            }



