/**
 * 
 */
package com.girish.library.model;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library obj  = new Library();
		
		obj.addBook(1, "abc", "You", 1999, 210);
		obj.addBook(2, "abd", "You", 1998, 290);
		obj.addBook(3, "abr", "Me", 1986, 200);
		obj.findBookByAuthor("Me");
		System.out.println(obj.findLatestBooks(1995));
		System.out.println(obj.findBooksByComplexCriteria(1995,200,"You"));
		

	}

}
