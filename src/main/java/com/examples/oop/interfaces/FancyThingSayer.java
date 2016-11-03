package com.examples.oop.interfaces;

public class FancyThingSayer implements Sayer{

    private String thingToSay;

    public FancyThingSayer(String thingToSay) throws Exception {
        this.checkThingToSayIsValid(thingToSay);
        this.thingToSay = thingToSay;
    }

    public FancyThingSayer() {
        this.thingToSay = "default";
    }

    public void sayThing() {
        System.out.println("*** " + this.thingToSay + " ***");
    }

    public String getThingToSay() {
        return this.thingToSay;
    }

    public void setThingToSay(String newThingToSay) throws Exception{
        this.checkThingToSayIsValid(newThingToSay);
        this.thingToSay = newThingToSay;
    }

    private void checkThingToSayIsValid(String thingToSay) throws Exception {
        if(thingToSay == null)
            throw new Exception("newThingToSay cannot be null");
        if(thingToSay.length() == 0)
            throw new Exception("newThingToSay cannot be empty");
    }
}
