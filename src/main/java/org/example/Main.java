package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Write the name of the person: (Pete, David, John)");
            String userInput = input.nextLine();
            Person person = new Person(userInput);
            if (Objects.equals(userInput, "exit")) {
                return;
            }
            System.out.println(Arrays.toString(person.getFriends(userInput)));
            System.out.println("Write exit to exit");
        }


    }
}