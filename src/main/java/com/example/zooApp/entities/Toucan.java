package com.example.zooApp.entities;

public class Toucan implements Birds {
        private int age;
        private String name;
        private double weight;

        public Toucan(int age, String name, double weight){
                this.age = age;
                this.name = name;
                this.weight = weight;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public double getWeight() {
                return weight;
        }

        public void setWeight(double weight) {
                this.weight = weight;
        }

        @Override
        public String birdSound() {
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

        @Override
        public String accept(Visitor visitor) {
                return visitor.visitToucan(this);
        }
}
