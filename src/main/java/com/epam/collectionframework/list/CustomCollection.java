package com.epam.collectionframework.list;
import java.io.*;
import java.util.*;

public class CustomCollection {
 
	private Object[] cusList =new Object[10];
	private int count=0;
	
	//List is being initialized with 10 elements at the time of creation
	CustomCollection()
	{
		for( count=0;count<10;count++)
		{
			cusList[count]=count;
		}
	}
	public void add(Object obj) {
		if(count==cusList.length)
		{
			createNewList();
		}
		cusList[count]=obj;
		count++;
	}
	public void remove(int idx)
	{
		try {
			Object[] newcusList=new Object[count];
			
			
			for(int i=0;i<idx;i++)
			{
				newcusList[i]=cusList[i];
			}
			for(int i=idx+1;i<count;i++)
			{
				newcusList[i-1]=cusList[i];
			}
			cusList=newcusList;
			count--;
		}
		catch(Exception e)
		{
			System.out.println("Exception caught"+e);
			
		}
		
			
		
		
		
	}
	public void print()
	{
	  System.out.println("Elements in the List are");
	  for(int i=0;i<count;i++)
	  {
		  System.out.println(cusList[i]+" ");
	  }
	}
	public void fetch(int idx)
	{
		try {
			System.out.println("Element at"+idx+"is "+cusList[idx]);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception caught"+e);
			
		}
		
	
			
	}
	public void createNewList() {
		int newCapacity=cusList.length*2;
		Object[] newcusList=new Object[newCapacity];
		for(int i=0;i<cusList.length;i++)
		{
			newcusList[i]=cusList[i];
		}
		cusList=newcusList;
	}
}
