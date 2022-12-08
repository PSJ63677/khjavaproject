package com.kh.day12.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_IOStream {
	public void fileCopy() {
		// 이미지 파일 복사
		// C:\\img\\zzz.jpeg → D:\\zzz.jpeg
		// 바이트기반 입력스트림
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\img\\zzz.jpeg");
			os = new FileOutputStream("D:\\zzz.jpeg");
			byte [] readBytes = new byte[100];
			int readByteNo;
			while((readByteNo = is.read(readBytes)) != -1) {	// 파일 읽기 성공
				os.write(readBytes, 0, readByteNo);
			}
			System.out.println("복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void memoFileMake() {
		/*
		 * 저장할 파일명 입력 : khtext.txt
		 * 'khtext.txt' 파일에 저장될 내용 입력 :
		 * 종료는 exit
		 * 1 : 1111
		 * 2 : text input
		 * 3 : good
		 * 4 : gogogo
		 * 5 : exit
		 * 파일 저장 완료 (exit는 제외하고 저장)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일명 입력 : ");
		String fileName = sc.next();
		
		Writer writer = null;
		exit :
		try {
			writer = new FileWriter("src/iostream/"+fileName);
			System.out.println("'" + fileName + "' 파일에 저장될 내용 입력");
			System.out.println("종료는 exit");
			sc.nextLine();
			// for(int i = 1; i <= 10; i++)		// 정해진 횟수만 입력받는 제한이 생겨서 부적절함
			int i = 1;
			while(true) {
				System.out.print(i + " : ");
				String input = sc.nextLine();
				if("exit".equals(input)) break;
				writer.write(input + "\n");
				i++;
			} 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {			
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
