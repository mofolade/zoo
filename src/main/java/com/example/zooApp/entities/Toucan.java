package com.example.zooApp.entities;

public class Toucan implements Birds {

        @Override
        public String birdSound() {
                //"groomkk," "grunt," "grunnkkt,"
            return "Toucan: groomkk, grunt, grunnkkt";
        }

        @Override
        public String eat() {
                return"Eat: insects, small reptiles, and other bird's eggs.";
        }

        @Override
        public String eatReptiles() {
                return "Toucan eating small reptiles.";
        }
}
