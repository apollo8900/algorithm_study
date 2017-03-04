package com.algospot.MERCY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        try {
			System.setIn(new FileInputStream("D:\\eclipse\\workspace\\algorithm_study\\src\\com\\algospot\\MERCY\\input.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        
        for(int test_case = 1; test_case <= T; test_case++)
        {
            System.out.println("Hello Algospot!");
        }
        sc.close();
    }
}