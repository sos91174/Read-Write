package Utility;

import java.io.FileWriter;
import java.io.IOException;

public class EasyWriteTxt {
	public static void main(String [] argv) throws IOException {
			
				FileWriter fw = new FileWriter("D:\\java.txt");
				
				fw.write("test6666棒棒棒棒棒");
				
				fw.flush();
				
				fw.close();
			
			    }
			
			}
