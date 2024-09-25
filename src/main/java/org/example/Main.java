package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Write the name of the person: (Pete, David, John)");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        Person person = new Person(userInput);
        System.out.println(Arrays.toString(person.getFriends(userInput)));
    }
}