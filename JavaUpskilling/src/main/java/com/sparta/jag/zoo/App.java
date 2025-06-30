package com.sparta.jag.zoo;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        ZooKeeper Dunstan = new ZooKeeper(LocalDate.of(2022,11,2),11,"Dunstan", "Lion Enclosure");
        System.out.println(Dunstan.feedAnimals());
        System.out.println(Dunstan.speak());

    }
}
