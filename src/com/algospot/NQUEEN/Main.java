package com.algospot.NQUEEN;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	static int solution_count = 0;
	static int chess_board_size = 0;
	static int[] queen_position;
	static int[] queen_check;

    public static void main(String[] args) {
    	
        try {
			System.setIn(new FileInputStream("D:\\eclipse\\workspace\\algorithm_study\\src\\com\\algospot\\NQUEEN\\input.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int test_case = 1; test_case <= T; test_case++) {
        	chess_board_size = sc.nextInt();
        	solution_count = 0;
        	queen_position = new int[chess_board_size];
        	queen_check = new int[chess_board_size];
        	
        	findSolution(0);
        	
        	System.out.println(solution_count);	
        }
        sc.close();
        
    }
    
    public static void findSolution(int n) {
    	if(n == chess_board_size) {
    		printSolution();
    	} else {
    		loop : for(int i=0; i<chess_board_size; i++) {
    			if(queen_check[i] == 1) {
    				continue loop;
    			} else {
    				// 대각선 방향 체크
    				for(int j=0; j<n; j++) {
    					if(Math.abs(n-j) == Math.abs(i-queen_position[j])) {
    						continue loop;
    					}
    				}
    				
        			queen_position[n] = i;
        			queen_check[i] = 1;
        			findSolution(n+1);
        			queen_check[i] = 0;
    			}
    		}
    	}
    }
    
    public static void printSolution() {
    	solution_count++;
    }
}
