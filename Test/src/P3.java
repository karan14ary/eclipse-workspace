import java.io.*;
	import java.util.*;
public class P3 {
	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	           System.out.println(A.length()+B.length());
	     int res=(A.compareTo(B));
	        if (res>0){
	            System.out.println("Yes"+res);
	            
	        }
	        else if(res<0){
	            System.out.println("No"+res);
	        }
	        else {
	        	System.out.println("nnn"+res);
	        }
	        
	        String s1="";
	        for(int i=0;i<=A.length()-1;i++){
	        if(i==0){
	            int a=A.charAt(i)-32;
	            char c=(char)a;
	            s1+=c;
	        }
	     else{
	            s1+=A.charAt(i);
	        }
	        }
	        String s2="";
	            for(int i=0;i<=B.length()-1;i++){
	        if(i==0){
	            int a=B.charAt(i)-32;
	            char c=(char)a;
	            s2+=c;
	        }
	        else{
	            s2+=B.charAt(i);
	        }
	        }
	        System.out.println(s1+" "+s2);          
	       
	    }
	}

