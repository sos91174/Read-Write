package Utility;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class EasyReadTxt {
    public static void main(String [] argv) throws IOException {

        FileReader fr = new FileReader("D:\\java.txt");

        BufferedReader br = new BufferedReader(fr);

        while (br.ready()) {

            System.out.println(br.readLine());

        }

        fr.close();

    }

}

