package main;

import java.io.*;


public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		readInputFile();
		System.out.println("End World");
	}
	
	public static void readInputFile() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("input.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            in.close();
        } catch (IOException e) {
        	System.out.println(e);
        }
	}
	
	public static void outputFile() {
		
	}

}






