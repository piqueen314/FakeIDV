package edu.fake.ucar;
import edu.fake.ucar.fakeIDVPackage.FakeIDVClass;


import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // use some of the fakeIDV classes
        FakeIDVClass fakeIDVClass = new FakeIDVClass();
        String IDVClassName = fakeIDVClass.getClassString();
        System.out.println(IDVClassName);


        // sure wish I could use the fakeHydra package :(

    }
}
