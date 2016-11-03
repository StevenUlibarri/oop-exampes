package com.examples.oop;

import java.util.ArrayList;
import java.util.List;
import com.examples.oop.interfaces.*;

public class App
{
    public static void main( String[] args )
    {
        ThingSayer blahSayer;
        ThingSayer anotherSayer;
        FancyThingSayer fancyBlahSayer;

        List<Sayer> sayerList = new ArrayList<Sayer>();


        try {
            blahSayer = new ThingSayer("blah");
            anotherSayer = new ThingSayer("another");
            fancyBlahSayer = new FancyThingSayer("fancy blah");

            sayerList.add(blahSayer);
            sayerList.add(anotherSayer);
            sayerList.add(fancyBlahSayer);

            for(Sayer s : sayerList) {
                s.sayThing();
            }

        } catch(Exception e) {
            System.err.println(e.toString());
        }
    }
}
