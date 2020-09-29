package com.example.zooApp.entities;

public abstract class Mammal {
    //Behavioral pattern: Template
    private String placeOfBirth = null;
    private String name = null;
    private String description = null;

    public String greet(){
        //String present = presentYourself(); // always exactly the same
        //var noise = makeYourSpecialNoise(); // different depending on animal
        return presentYourself();
    }
    //A constructor
    public Mammal(String name, String placeOfBirth, String description)
    {
        this.placeOfBirth = placeOfBirth;
        this.name = name;
        this.description = description;
    }

    public String getPlaceOfBirth()
    {
        return placeOfBirth;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    //This are abstract methods which MUST be
    //implemented by the subclass.
    protected String presentYourself(){
        return("My name is "+ name + " and I am a "
                + this.getClass().getSimpleName().toLowerCase() +
                " ");
    }

    protected abstract String makeYourSpecialNoise();

}
