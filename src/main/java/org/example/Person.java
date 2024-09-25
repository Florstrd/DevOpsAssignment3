package org.example;

import java.util.Objects;

public class Person {
    String name;
    public String[] getFriends(String name) {
        if (Objects.equals(name, "John")) {
            return johnFriends;
        }
        if (Objects.equals(name, "David")) {
            return davidFriends;
        }
        if (Objects.equals(name, "Pete")) {
            return peteFriends;
        }
        else return null;
    }

    String[] peteFriends = {"John", "Emily", "Michael", "Sarah", "David", "Jessica", "James", "Sophia", "Daniel", "Olivia"};
    String[] davidFriends = {"Liam", "Emma", "Noah", "Ava", "Elijah", "Isabella", "Lucas", "Mia", "Mason", "Amelia"};
    String[] johnFriends = {"Ethan", "Charlotte", "Benjamin", "Harper", "Henry", "Evelyn", "Alexander", "Abigail", "Jackson", "Luna"};




    public Person(String name) {
        name = this.name;
    }
}
