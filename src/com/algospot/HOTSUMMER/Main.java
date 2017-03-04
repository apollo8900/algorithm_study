package com.algospot.HOTSUMMER;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        try {
			System.setIn(new FileInputStream("D:\\eclipse\\workspace\\algorithm_study\\src\\com\\algospot\\HOTSUMMER\\input.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        //System.out.println("testcase : " + T);
        
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int total_w = sc.nextInt();
            //System.out.println("total_w : " + total_w);
            
            int used_w = 0;
            for(int i=0; i<9; i++) {
            	int time_w = sc.nextInt();
            	//System.out.println("time_w : " + time_w);
            	used_w = used_w + time_w;
            	//System.out.println("used_w : "+used_w);
            }  
            
            if (total_w >= used_w) {
            	System.out.println("YES");
            } else {
            	System.out.println("NO");
            }
        }
        sc.close();
    }
}
