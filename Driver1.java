/*
 * Driver1.java
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

import java.io.*;
public class Driver1 {
		
	public static void main (String[] args) {
		BufferedReader bfr=new BufferedReader(
			new InputStreamReader(System.in));
	String carName=bfr.readLine();
	int fuelCapacity=Integer.parseInt(bfr.read());
	int distance=Integer.parseInt(bfr.readLine());
		car Car=new car(fuelCapacity,carName);
		car.drive(distance);
	}
		
	
}
