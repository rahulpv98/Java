/*
 * MyFavourites.java
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


public class MyFavourites extends ParentFavourites implements Favourites {
	
	public void favouriteFruit(){
			super.parentFavouriteMovie();
			System.out.println("Watermelon");
		
	}
	public void favouriteIceCream(){
			super.parentFavouriteSubject();
			System.out.println("Chocolate icecream");
		}
	public void favouriteMovie(){
			System.out.println("Interstellar");
		}
	public void favouriteSubject(){
			System.out.println("Maths");
		}
	
	public static void main(String args[]){
			MyFavourites fav=new MyFavourites();
			fav.favouriteFruit();
			MyFavourites fv=new MyFavourites();
			fv.favouriteIceCream();
	}
}

