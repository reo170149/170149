//TestScanneer.java
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestScanner{
	public static void main(String[] args){
	try{
		//FILEを使う準備
		FileWriter fw = new FileWriter("data.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		String userData = "";
		//繰り返し:ユーザがデータを入力する

		while(true){
			System.out.print("input msg>");
			userData = new Scanner(System.in).nextLine();
			if(userData.equals("exit"))break;
			bw.write(userData+"\r\n");

		}
		bw.close();
	}catch(IOException e){
		System.out.println("file writing...failed.");
		}
	}
}