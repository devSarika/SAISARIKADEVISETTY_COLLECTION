package com.epam.collectionframework.list;

import java.util.*;
import java.io.*;
public class App 
{
    public static void main( String[] args )
    {
    	CustomCollection myList=new CustomCollection();

    	char y='y';

    	 while(y=='y')
    	 {
    		 System.out.println("Enter an operation to be performed\n ");
    		 System.out.println("1)Adding Element\n2)Removing Element\n3)Printing the list\n4)Fetching Element\n");
    		 Scanner inp=new Scanner(System.in);
    		 int opr=inp.nextInt();
    		 switch(opr)
    		 {
    		 case 1:System.out.println("Enter the element to be added\n ");
    		 Object ele=inp.next();
    		  myList.add(ele);
    		  break;
    		 case 2:System.out.println("Enter the index where you want to delete the element\n");
    		 int idx=inp.nextInt();
    		 myList.remove(idx);
    		 break;
    		 case 3: myList.print();break;
    		 case 4:System.out.println("Enter the index from where you want to fetch the element\n ");
    		 int fet=inp.nextInt();
    		 myList.fetch(fet);
            }
    		 System.out.println("Do you want to continue?\nEnter y for yes");
    		 y=inp.next().charAt(0); 
        }
    }
}
