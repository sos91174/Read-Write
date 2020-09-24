package Utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadTxt {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("D://java.txt");
		} catch (FileNotFoundException e) {
			// TODO 自動產生的 catch 區塊
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		try {
			while (br.ready()) {
				System.out.println(br.readLine());
			}
		} catch (IOException e) {
			// TODO 自動產生的 catch 區塊
			e.printStackTrace();
		}
		try {
			fr.close();
		} catch (IOException e) {
			// TODO 自動產生的 catch 區塊
			e.printStackTrace();
		}
	}

}
