package edu.fake.ucar;
import edu.fake.ucar.fakeIDVPackage.FakeIDVClass;

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

        // sure wish I could easily use the fakeHydra package :(

    }
}
