package me.magurmach.experiments;

import com.google.common.base.Preconditions;

/**
 * Created by sheikahm on 1/23/17.
 */

public class TestClass {

    public TestClass(String str) {
        Preconditions.checkNotNull(str);
        if (str == null) {
            System.out.println("Test fail");
        } else {
            System.out.println("Okay with " + str);
        }
    }

}
