/*
 * BinarySearchExample.java
 * 
 * Copyright 2018 rahul p v <rahul p v@LAPTOP-OR0RK05T>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Arrays;

public class BinarySearchExample {
		public boolean binarySearch(int sortedArray[],
								 int left,
								 int right,
								 int key){
			while(left<=right){
				int mid=left+(right-left)/2;
				if(sortedArray[mid]==key){
					return true;
				}
				if(sortedArray[mid]<key){
					left=mid+1;
				}
				else{
					right=mid-1;
				}
			}
		
		return false;
	}
	
			
		
			
	public static void main (String[] args) {
		int[] unsortedArray=new int[10];
		for(int i=0;i<unsortedArray.length;i++){
			unsortedArray[i]=1+(int)(Math.random()*10);
		}
		System.out.println();
		System.out.println("Unsorted Array");
		for(int i=0;i<unsortedArray.length;i++){
			System.out.println(unsortedArray[i]+" ");
		}
		System.out.println();
		Arrays.sort(unsortedArray);   //unsorted->sorted
		for(int i=0;i<unsortedArray.length;i++){
			System.out.println(unsortedArray[i]+" ");
		}
		BinarySearchExample example=new BinarySearchExample();
		System.out.println(example.binarySearch(unsortedArray,0,9,5));
		
		
	}
}

