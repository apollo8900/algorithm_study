package com.algospot.XHAENEUNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        try {
			System.setIn(new FileInputStream("D:\\eclipse\\workspace\\algorithm_study\\src\\com\\algospot\\XHAENEUNG\\input2.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        //System.out.println("testcase : " + T);
        
        int[] arr_num = {0,1,2,3,4,5,6,7,8,9,10};
        String[] arr_str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        
        for(int test_case = 1; test_case <= T; test_case++)
        {
            String str_A = sc.next();
            String str_oper = sc.next();
            String str_B = sc.next();
            String str_eq = sc.next();
            String str_res = sc.next();
            
            int num_A=0, num_B=0, num_res=0;
            for(int i=0; i<arr_str.length; i++) {
            	if(arr_str[i].equals(str_A)) {
            		num_A = arr_num[i];
            	}
            	if(arr_str[i].equals(str_B)) {
            		num_B = arr_num[i];
            	}
            }
            
            if(str_oper.equals("+")) {
            	num_res = num_A + num_B;
            	//System.out.println("real oper : " + num_A +"+"+num_B+"="+num_res);
            } else if(str_oper.equals("-")) {
            	num_res = num_A - num_B;
            	//System.out.println("real oper : " + num_A +"-"+num_B+"="+num_res);
            } else if(str_oper.equals("*")) { 
            	num_res = num_A * num_B;
            	//System.out.println("real oper : " + num_A +"*"+num_B+"="+num_res);
            } else {}
            
            //System.out.println("oper : " + str_A + str_oper+str_B+str_eq+str_res + " / " + num_res);
            
            String str_res2 = "";
            if(0>num_res || 10<num_res) {
            	System.out.println("No");
            } else {
	            for(int i=0; i<arr_num.length; i++) {
	            	if(arr_num[i] == num_res) {
	            		str_res2 = arr_str[i];
	            	}
	            	if(arr_str[i] == str_B) {
	            		str_res2 = arr_str[i];
	            	}
	            }
	
	            boolean answer = true;
	            for(int i=0; i<str_res2.length(); i++) {
	            	//System.out.println(str_res.indexOf(str_res2.charAt(i)));
	            	if(str_res.indexOf(str_res2.charAt(i)) < 0) {
	            		answer = false;
	            	}
	            }
	
	            if (answer) {
	            	System.out.println("Yes");
	            } else {
	            	System.out.println("No");
	            }
            }
        }
        sc.close();
    }
}
