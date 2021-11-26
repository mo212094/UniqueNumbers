package com.company;
import java.util.Scanner;
public class Main {

    private static String[] names = new String[10];

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    System.out.println("How many players?");
    int numOfPlayers = input.nextInt();

    for (int i = 1; i <= numOfPlayers; i++) {
        System.out.println("Player "+ i + " what place do you want?");
        int place = input.nextInt();
        boolean isPlaceFree = free(place);
        if (isPlaceFree){
            System.out.println("Name?");
            names[place] = input.nextLine();
        }else{
            System.out.println("That place is full sorry you lose");
        }
    }
    }
    public static boolean free(int place){
        if (names[place].equals("")) {
            return true;
        }else{
            return false;
        }
    }
}
