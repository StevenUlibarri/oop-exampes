package com.examples.oop.interfaces;

public class ThingSayer implements Sayer {

    private String thingToSay;

    public ThingSayer(String thingToSay) throws Exception {
        this.checkThingToSayIsValid(thingToSay);
        this.thingToSay = thingToSay;
    }

    public ThingSayer() {
        this.thingToSay = "default";
    }

    public void sayThing() {
        System.out.println(this.thingToSay);
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
