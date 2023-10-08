package com.Kalle.game;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Welcome to Kalle's dice game of doom");
                System.out.println("How many players will play(1 to 4)?");

                int players = sc.nextInt();

                for (int i = 0; i < players; i++) {
                        int playerNumber = i + 1;
                        System.out.println("Name of player " + playerNumber + ":");

                        String player = sc.next();
                }


                System.out.println("How many dices to roll(1-5)?");
                int dices = sc.nextInt();
                int minValue =1;
                int maxValue = 6;

                for (int i = 0; i < players; i++) {
                        int playerNumber = i + 1;
                        System.out.println("Player " + playerNumber + " type 'Roll' to roll your dices:");
                        String player = sc.next();
                        int randomOne = (int)Math.floor(Math.random() * (maxValue - minValue +1) + minValue);
                        int randomTwo = (int)Math.floor(Math.random() * (maxValue - minValue +1) + minValue);
                        int randomThree = (int)Math.floor(Math.random() * (maxValue - minValue +1) + minValue);
                        int randomFour = (int)Math.floor(Math.random() * (maxValue - minValue +1) + minValue);
                        int randomFive = (int)Math.floor(Math.random() * (maxValue - minValue +1) + minValue);
                        System.out.println("Rolls:");
                        switch (dices) {
                                case 1:
                                        System.out.println(randomOne);
                                        System.out.println("Total:");
                                        int totalOne = randomOne;
                                        System.out.println(totalOne);
                                        break;
                                case 2:
                                        System.out.println(randomOne);
                                        System.out.println(randomTwo);
                                        System.out.println("Total:");
                                        int totalTwo = randomOne + randomTwo;
                                        System.out.println(totalTwo);
                                        break;
                                case 3:
                                        System.out.println(randomOne);
                                        System.out.println(randomTwo);
                                        System.out.println(randomThree);
                                        System.out.println("Total");
                                        int totalThree = randomOne + randomTwo + randomThree;
                                        System.out.println(totalThree);
                                        break;
                                case 4:
                                        System.out.println(randomOne);
                                        System.out.println(randomTwo);
                                        System.out.println(randomThree);
                                        System.out.println(randomFour);
                                        System.out.println("Total:");
                                        int totalFour = randomOne + randomTwo + randomThree + randomFour;
                                        System.out.println(totalFour);
                                        break;
                                case 5:
                                        System.out.println(randomOne);
                                        System.out.println(randomTwo);
                                        System.out.println(randomThree);
                                        System.out.println(randomFour);
                                        System.out.println(randomFive);
                                        System.out.println("Total:");
                                        int totalFive = randomOne + randomTwo +randomThree + randomFour + randomFive;
                                        System.out.println(totalFive);
                                        break;

                        }

                }
                }


        }
