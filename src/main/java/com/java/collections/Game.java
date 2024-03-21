package com.java.collections;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        char[][] field = new char[][] {
                new char[]{'$','$','&'},
                new char[]{'&','$','%'},
                new char[]{'&','&','%'}
        };
        boolean game = false;
        Scanner scanner = new Scanner(System.in);

        while (!game) {
            System.out.println("Do you move :");

            char value = scanner.nextLine().charAt(0);

            String x = scanner.nextLine();

            String y = scanner.nextLine();

            field[Integer.parseInt(x)][Integer.parseInt(y)] = value;

            Arrays.stream(field).forEach(System.out::println);

            game = isGame(field);
        }

        System.out.println("End Game");
        Arrays.stream(field).forEach(System.out::println);
        scanner.close();

    }

    private static boolean isGame(char[][] field) {
        // XXX
        // ---
        // ---
        if (field[0][0] == field[0][1] && field[0][1] == field[0][2]) {
            return true;
        }

        // ---
        // XXX
        // ---
        if (field[1][0] == field[1][1] && field[1][1] == field[1][2]) {
            return true;
        }

        // ---
        // ---
        // XXX
        if (field[2][0] == field[2][1] && field[2][1] == field[2][2]) {
            return true;
        }

        // X--
        // X--
        // X--
        if (field[0][0] == field[1][0] && field[1][0] == field[2][0]) {
            return true;
        }

        // -X-
        // -X-
        // -X-
        if (field[0][1] == field[1][1] && field[1][1] == field[2][1]) {
            return true;
        }

        // --X
        // --X
        // --X
        if (field[0][2] == field[1][2] && field[1][2] == field[2][2]) {
            return true;
        }

        // --X
        // -X-
        // X--
        if (field[0][2] == field[1][1] && field[1][1] == field[2][0]) {
            return true;
        }

        // X--
        // -X-
        // --X
        if (field[0][0] == field[1][1] && field[1][1] == field[2][2]) {
            return true;
        }
        return false;
    }
}
