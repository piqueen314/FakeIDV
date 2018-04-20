package edu.fake.ucar;
import edu.fake.ucar.fakeIDVPackage.FakeIDVClass;
import edu.fake.ssec.FakeHydraGitSubModule.fakeHydra.FakeHydraClass1;

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


        // Yay! Now I can use the fakeHydra package :)
        FakeHydraClass1 fakeHydraClass1 = new FakeHydraClass1();
        double [][] data = {{10.0, 3.0, 7.0, 6.0}, {1.0, 12.0, 15.0, 2.0}, {3.0, 9.0, 11.0, 7.0}};
        double [] columnSums = fakeHydraClass1.columnSums(data);
        String colSimStrings = Arrays.toString(columnSums);
        System.out.print(colSimStrings);
    }
}
