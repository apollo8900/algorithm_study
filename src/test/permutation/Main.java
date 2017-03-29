package test.permutation;

public class Main {
	static int N = 3;
	static int[] permutation_arr;
	static int[] used_arr;
    public static void main(String[] args) {
    	permutation_arr = new int[N];
    	used_arr = new int[N];
    	permutation(0);
    }
    
    public static void permutation(int n) {
    	if(n==N) {
    		printPermutation(); 
    		return;
    	} else {
    		for(int i=0; i<N; i++) {
    			if(used_arr[i] == 0) {
    				permutation_arr[n] = i+1;
    				used_arr[i] = 1;
    				permutation(n+1);
    				used_arr[i] = 0;
    			} else {
    				
    			}
    			 
    		}
    	} 
    	
    }
    
    public static void printPermutation() {
    	String tmp = "";
    	for(int i=0; i<permutation_arr.length ;i++) {
    		tmp += permutation_arr[i] + ",";
    	}
    	System.out.println(tmp);
    }
}