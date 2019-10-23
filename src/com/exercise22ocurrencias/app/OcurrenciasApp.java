package com.exercise22ocurrencias.app;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class OcurrenciasApp {

	public static void main(String[] args) 
	{
		//Constant declaration
		final int ELEMENTS=10;
		
		//Variable declaration
		
		//Objects declaration
		//Scanner input = new Scanner(System.in);
		Random numbers =  new Random(System.nanoTime());
		HashMap<Integer,Integer> miHash = new HashMap<Integer,Integer>();
		int[] miArray = new int[ELEMENTS];
		
		//
		for(int i=0; i<ELEMENTS; i++)
		{
			miArray[i] = numbers.nextInt(5);
		}
		
		//Process
		for(int element:miArray)
		{
			if(miHash.containsKey(element))
			{
				miHash.put(element,miHash.get(element)+1);
			}
			miHash.putIfAbsent(element, 1);
		}
		
		System.out.println(miHash);
		
		for(int i : miArray)
		{
			System.out.println(" "+i);
		}
		
		//input.close();
	}

}
