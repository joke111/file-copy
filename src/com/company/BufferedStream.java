package com.company;

import java.io.*;

public class BufferedStream {

    public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			try (InputStream inputStream = new BufferedInputStream(new FileInputStream("/Users/joke/Downloads/hello.txt"));
				OutputStream outputStream = new BufferedOutputStream(new FileOutputStream("/Users/joke/Downloads/xxxx" + i + ".xlsx"))) {
				int data;
				while ((data = inputStream.read()) != -1) {

					outputStream.write(data);
				}
			}
		}
		long end = System.currentTimeMillis();

		System.out.println(end - start);
	}
}
