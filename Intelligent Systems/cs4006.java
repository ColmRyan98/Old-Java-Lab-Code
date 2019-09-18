
/** GROUP MEMBERS:
* 		Colm Ryan 				17203376
* 		Frank Kelly Shackleton 	17199233
* 		Naichuan Zhang 			18111521
*/

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class cs4006 {
	
	static final int NUM = 9;
	
	static boolean FLAG;
	static String[] startStrs;
	static String[] endStrs;
	static int[] start_1d = new int[NUM];
	static int[] end_1d = new int[NUM];
	static int[] current_1d = new int[NUM];
	static int[] temp;
	
	/*
ALL POSSIBLE MOVES FROM EACH SQUARE
0    1    2
3    4    5
6    7    8

0 -    1 or 3
1 - 0, 4 or 2
2 - 1 or 5
3 - 0, 4 or 6
4 - 3, 1, 7 or 5
5 - 2, 4 or 8
6 - 3 or 7
7 - 6, 4 or 8
8 - 7 or 5
*/
	
	public static void main(String [] args) {
		
		current_1d = start_1d;
		
		enterState(startStrs, start_1d, "START STATE");
		
		enterState(endStrs, end_1d, "END STATE");
		
		System.out.println("START STATE: ");
		matrixPrint(start_1d);
		
		System.out.println("END STATE: ");
		matrixPrint(end_1d);
		
		System.out.println("POSSIBLE MOVEMENTS: ");
		moveCheck(start_1d);
		
	}
	
	public static void matrixPrint(int[] states)
	{
		for (int j = 0; j < states.length; j++)
		{
				System.out.print(states[j] + " ");
				if((j+1)%3 == 0) {System.out.println();}
		}
		
		System.out.println();
	}
	
	public static int find(int[] states, int target)
	{
		int found = -1;
		for(int p = 0; p < states.length; p++)
		{
			found = states[p];
			if(found == target) return p;
		}
		return 0;
	}
	
	public static int[] swap(int[] states, int first, int second)
	{
		/*
		*/
		//System.out.println(first + ", " + second);
		int posF = 0;
		int tempInt = 0;
		int posS = 0;
		/*for(int i = 0; i < states.length; i++)
		{
			if(states[i] == first)
			{
				posF = i;
				System.out.println(i);
			}
		}
		for (int i = 0; i < states.length; i++)
		{
			if(states[i] == second)
			{
				posS = i;
				System.out.println(i);
			}
		}
		
		if(posF >= 0 && posS >= 0)
		{
			tempInt = states[posF];
			states[posF] = states[posS];
			states[posS] = tempInt;
		}
		*/

		tempInt = states[first];
		states[first] = states[second];
		states[second] = tempInt;
		return states;
	}
	
	public static void moveCheck(int[] states)
	{
		int letter = 0;
		int n = find(states, 0);
		if (n-1 >= 0 && (n-1)%3 != 2)
		{
			System.out.println(letterChoose(letter) + " " + states[n-1] + " to the east");
			//matrixPrint(swap(current_1d,n,n-1));
			//System.out.println(current_1d[n] + "," + current_1d[n-1]);
			swap(current_1d,n,n-1);
			System.out.println("The h value of this move is " + hTotal(swap(current_1d,n,n-1)));
			swap(current_1d,n,n-1);
			letter++;
		}
		if (n+1 < states.length)
		{
			if ((n+1)%3 != 0)
			{
			System.out.println(letterChoose(letter) + " " + states[n+1] + " to the west");
			//matrixPrint(swap(current_1d,n,n+1));
			//System.out.println(current_1d[n] + "," + current_1d[n+1]);
			swap(current_1d,n,n+1);
			System.out.println("The h value of this move is " + hTotal(swap(current_1d,n,n+1)));
			swap(current_1d,n,n+1);
			letter++;
			}
		}
		if (n-3 >= 0)
		{
			System.out.println(letterChoose(letter) + " " + states[n-3] + " to the south");
			//matrixPrint(swap(current_1d,n,n-3));
			//System.out.println(current_1d[n] + "," + current_1d[n-3]);
			swap(current_1d,n,n-3);
			System.out.println("The h value of this move is " + hTotal(swap(current_1d,n,n-3)));
			swap(current_1d,n,n-3);
			letter++;
		}
		if (n+3 < states.length)
		{
			System.out.println(letterChoose(letter) + " " + states[n+3] + " to the north");
			//matrixPrint(swap(current_1d,n,n+3));
			//System.out.println(current_1d[n] + "," + current_1d[n+3]);
			swap(current_1d,n,n+3);
			System.out.println("The h value of this move is " + hTotal(swap(current_1d,n,n+3)));
			swap(current_1d,n,n+3);
			letter++;
		}
	}
	

	/*
	1 2 3
	0 7 6
	4 5 8

	1 2 3 
	4 5 6
	7 8 0
	*/
	public static int h(int[] states,int p)
	{
		int tempC = find(states,p);
		int tempE = find(end_1d,p);
		int hNum = 0;
		if((tempC/3)-(tempE/3) < 0)
		{
			hNum = ((tempC/3)-(tempE/3))*(-1);
		}
		else
		{
			hNum = (tempC/3)-(tempE/3);
		}
		if((tempC%3)-(tempE%3) < 0) {
		
			hNum += ((tempC%3)-(tempE%3))*(-1);
		}
		else 
		{
			hNum += (tempC%3)-(tempE%3);
		}

		//System.out.println("num " + p + ", moves away " + hNum);
		return hNum;
	}
	
	public static int hTotal(int[] states)
	{
		int hTotal = 0;
		for(int o = 0; o < states.length; o++)
		{
			if (states[o] != 0)
			{
				hTotal += h(states,states[o]);
			}
		}
		return hTotal;
	}
	
	public static String letterChoose(int i)
	{
		switch(i)
		{
			case 0:
				return "a)";
			case 1:
				return "b)";
			case 2:
				return "c)";
			case 3:
				return "d)";
			default:
				return "How did you break this?";	
		}
	}
	
	public static void enterState(String[] stateStrs, int[] states, String mark) {
		
		FLAG = true;
		
		while (FLAG) {
			
			String str = JOptionPane.showInputDialog("Please enter 9 integers between 0-8 as the " + mark + ": ");
			
			if (!str.equals("")) {
				
				stateStrs = str.split(" ");
				
				if (checkIfIntegers(stateStrs)) {
					
					
					temp = new int[stateStrs.length];
					
					for (int i = 0; i < temp.length; i++)
						temp[i] = Integer.parseInt(stateStrs[i]);
				
					if (temp.length != NUM) {
						JOptionPane.showMessageDialog(null, "9 Integers Required\nPlease Retry!", "Error", JOptionPane.ERROR_MESSAGE);
						temp = null;
					}
					else if (!isUnique(temp)) {
						JOptionPane.showMessageDialog(null, "Duplicate Numbers Exist\nPlease Retry!", "Error", JOptionPane.ERROR_MESSAGE);
						temp = null;
					}
					else if (!isInRange(temp)) {
						JOptionPane.showMessageDialog(null, "Out of Range\nPlease Retry!", "Error", JOptionPane.ERROR_MESSAGE);
						temp = null;
					}
					else {
						for (int i = 0; i < states.length; i++)
							states[i] = temp[i];
						FLAG = false;
					}
				}
				
				else
					JOptionPane.showMessageDialog(null, "Integers Required\nPlease Retry!", "Error", JOptionPane.ERROR_MESSAGE);
			}
			
			else
				JOptionPane.showMessageDialog(null, "Please enter something!", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public static boolean isUnique(int[] states) {
		
		for (int i = 0; i < states.length - 1; i++) {
			
			for (int j = i + 1; j < states.length; j++) {
				
				if (states[i] == states[j])
					return false;
			}
		}
		
		return true;
	}
	
	public static boolean isInRange(int[] states) {
		
		for (int i = 0; i < states.length; i++) {
			
			if (states[i] > NUM - 1)
				return false;
		}
		
		return true;
	}
	
	public static boolean checkIfIntegers(String[] s) {
		
		for (int i = 0; i < s.length; i++)
			
			if (!isInteger(s[i]))
				return false;
		
		return true;
	}
	
	public static boolean isInteger(String s) {
		
		boolean isValidInteger = false;
		
		try {
			Integer.parseInt(s);
			isValidInteger = true;
		} catch (NumberFormatException ex) {}
 
      return isValidInteger;
   }
}