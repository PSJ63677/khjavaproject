package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String [] args) {
		InputStream is = null;
		
		// Unhandled exception type FileNotFoundException -> Checked Exception 
		// -> 반드시 try ~ catch 해줘야 하는 Exception
		try {
			is = new FileInputStream("src/iostream/inputStream.txt");
			int readByte;
			while(true) {
				readByte = is.read();
				if (readByte == -1) break;	// 없으면 그만 읽도록 (없을때 값 : -1)
				System.out.print((char)readByte);
			}
//			for(int i = 0; i < 5; i++ ) {	// 갯수가 늘어날때 마다 코드를 바꿔줘야 되서 좋지않다
//			readByte = is.read();
//			System.out.print((char)readByte);
//			}
		} catch(FileNotFoundException e) {
		 	e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
