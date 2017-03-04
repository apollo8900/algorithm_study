package com.algospot.ENCRYPT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        try {
			System.setIn(new FileInputStream("D:\\eclipse\\workspace\\algorithm_study\\src\\com\\algospot\\ENCRYPT\\input.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        //System.out.println("testcase : " + T);
        
        for(int test_case = 1; test_case <= T; test_case++)
        {
            String plain_str = sc.next();
            char[] char_str = plain_str.toCharArray();
            String even_str ="";
            String odd_str ="";
            
            for (int i = 0; i < char_str.length; i++) {
            	if (i%2 == 0) {
            		even_str += Character.toString(char_str[i]);
            	} else {
            		odd_str += Character.toString(char_str[i]);
            	}
                
            }
            //System.out.println("str_even : " + even_str);
            //System.out.println("str_odd : " + odd_str);
            String encrypt_str = even_str+odd_str;
           	System.out.println(encrypt_str);
        }
        sc.close();
    }
}
