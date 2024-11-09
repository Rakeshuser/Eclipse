package org.test;

import java.util.Scanner;

import org.checkerframework.checker.units.qual.s;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String op="";
		
		String next = scanner.next();
		String lowerCase = next.toLowerCase();
		
		for(int i=0; i<lowerCase.length();i++) {
			char c = lowerCase.charAt(i);
			
			if (c=='a'|| c=='e'||c=='i'||c=='o'||c=='u') {
				op=op+c;
			}
		}
		
	}

}
