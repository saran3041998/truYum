/**
 * 
 */
package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;

/**
 * @Created By Saranya 760862
 *
 */
public class CartDaoCollectionImplTest {

	/**
	 * @param args
	 * @throws CartEmptyException 
	 */
	public static void main(String[] args) throws CartEmptyException {
		// TODO Auto-generated method stub
		
		testAddCartItem();
		
		testRemoveCartItem();
		testGetAllCartItems();
	}
	 static void testAddCartItem() throws CartEmptyException
	{
		 CartDaoCollectionImpl cartDaoCollectionImpl = new CartDaoCollectionImpl();
	        CartDao cartDao = cartDaoCollectionImpl;
	        cartDao.addCartItem(2,4);
	        cartDao.addCartItem(2,3);
	        List<MenuItem> menuItemList = cartDao.getAllCartItems(2);
	        System.out.println("MenuItem list :" + menuItemList);


	}
	 static void testGetAllCartItems() throws CartEmptyException
	{
		 CartDaoCollectionImpl cartDaoCollectionImpl = new CartDaoCollectionImpl();
	     CartDao cartDao = cartDaoCollectionImpl;
	    
	     List<MenuItem> menuItemList = cartDao.getAllCartItems(2);
	     System.out.println("MenuItem list :" + menuItemList);


	}
	 static void testRemoveCartItem() throws CartEmptyException
	{
         CartDaoCollectionImpl cartDaoCollectionImpl = new CartDaoCollectionImpl();
         CartDao cartDao = cartDaoCollectionImpl;

try {
cartDao.removeCartItem(2, 4);
List<MenuItem> menuItemList = cartDao.getAllCartItems(2);
System.out.println("MenuItem list after removed:" + menuItemList);
}
catch(Exception e){
          throw new CartEmptyException("Cart is empty");
}


}


}
