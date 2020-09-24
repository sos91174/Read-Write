package Utility;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTxt {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		//寫入檔案
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("D:\\java.txt");//檔案文件要放在哪個位置
			fw.write("測試一下把檔案寫進去"); //要寫入的資料內容
		}catch (IOException e) {
			System.out.println(e.toString());
		}finally {
			try {
				fw.flush();
				fw.close();//要記得關閉檔案
			}catch (IOException e) {
				System.out.println(e.toString());
			}
		}
		
		

	}

}
