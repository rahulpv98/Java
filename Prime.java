/*
 * Prime.java
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

import java.util.*;
public class Prime {
	static int k=0;
	public static void main (String[] args) {
		System.out.println("Enter range");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		for(int i=1;i<=n;i++){
			k=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					k++;
					
				}
			}
		if(k<3){
			System.out.println(i);
		
			}
		}
		
	}
}

