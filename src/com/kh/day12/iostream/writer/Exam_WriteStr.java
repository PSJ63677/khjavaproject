package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteStr {
	public static void main(String [] args) {
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/iostream/filewriter.txt");
			String data = "오라클이 제일 쉬웠어요";
			writer.write(data);
			writer.flush();			// 버퍼 있을때 비워주기 위함, 지금은 없어서 작성 안해도 동작함
			System.out.println("쓰기 완료");
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
