package com.algospot.WEEKLYCALENDAR;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        try {
			System.setIn(new FileInputStream("D:\\eclipse\\workspace\\algorithm_study\\src\\com\\algospot\\WEEKLYCALENDAR\\input.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        //System.out.println("testcase : " + T);
        String[] arr_week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] arr_month_end = {31,31,28,31,30,31,30,31,31,30,31,30,31,31};
        
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int int_month = sc.nextInt();
            int int_day = sc.nextInt();
            String str_week = sc.next();
           	
           	int pos = 0;
           	for(int i=0; i<arr_week.length; i++) {
           		if(str_week.equals(arr_week[i])) {
           			pos = i;
           		}
           	}
           	//System.out.println(int_month+" "+int_day+" "+str_week+" / "+arr_month_end[int_month] +" / "+pos);
           	
           	int[] arr_answer= {0,0,0,0,0,0,0};
           	arr_answer[pos] = int_day;
           	
           	if(pos==0) {
           		for(int i=1; i<7; i++){
           			//System.out.println(i +"/"+(int_day + i)+"/"+arr_month_end[int_month]);
           			if((int_day + i) > arr_month_end[int_month]) {
           				arr_answer[i] = (int_day+i)-arr_month_end[int_month];
           			} else {
           				arr_answer[i] = int_day+i;
           			}
           		}
           	} else if(pos==6) {
           		for(int i=0; i<6; i++){
           			//System.out.println(i +"/"+(int_day-6+i)+"/"+arr_month_end[int_month]);
           			if((int_day-6+i) <= 0) {
           				arr_answer[i] = (int_day-6+i)+arr_month_end[int_month-1];
           			} else {
           				arr_answer[i] = int_day-6+i;
           			}
           		}
           	} else {
           		for(int i=0; i<pos; i++){
           			//System.out.println(i +"/"+(int_day-pos+i)+"/"+arr_month_end[int_month-1]);
           			if((int_day-pos+i) <= 0) {
           				arr_answer[i] = (int_day-pos+i)+arr_month_end[int_month-1];
           			} else {
           				arr_answer[i] = int_day-pos+i;
           			}
           		}
           		
           		for(int i=pos+1; i<7; i++){
           			//System.out.println(i +"/"+(int_day+i-pos)+"/"+arr_month_end[int_month]);
           			if((int_day+i-pos) > arr_month_end[int_month]) {
           				arr_answer[i] = (int_day+i-pos)-arr_month_end[int_month];
           			} else {
           				arr_answer[i] = int_day+i-pos;
           			}
           		}

           	}
           	
           	String answer = "";
           	for(int i=0; i<arr_answer.length; i++){
           		answer = answer + " " + arr_answer[i];
           	}
           	System.out.println(answer.trim());
           	
        }
        sc.close();
    }
}
