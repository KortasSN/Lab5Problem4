package com.josh;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.*;
//import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String osArch = System.getProperty("os.arch");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        String fileSeparator = System.getProperty("file.separator");

        File f = new File(userHome + fileSeparator + "testtext.txt");
        //System.out.println(fileSeparator);


        System.out.println(osName + " " + osVersion + " " + osArch + " " + userName);
        FileWriter writer = new FileWriter(f);
        //writer.write(f);
        writer.close();
    }
}

