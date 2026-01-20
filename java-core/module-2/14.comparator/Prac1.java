/*
Q. Online Order Processing System
Each Order has:
	int orderId
	String customerName
	double orderAmount
	int itemCount
	long orderTime

Write a Java program to sort orders using Comparator based on:
	Higher orderAmount first
	If amount same → fewer itemCount first
	If itemCount same → earlier orderTime first
	If orderTime same → customerName in ascending order
	If customerName same → orderId in ascending order
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Order{
	int orderId;
	String customerName;
	double orderAmount;
	int itemCount;
	long orderTime;
	public Order(int orderId, String customerName, double orderAmount, int itemCount, long orderTime) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.orderAmount = orderAmount;
		this.itemCount = itemCount;
		this.orderTime = orderTime;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerName=" + customerName + ", orderAmount=" + orderAmount + ", itemCount=" + itemCount + ", orderTime=" + orderTime + "]";
	}
}

class SortByOrderAmount implements Comparator<Order>{

	@Override
	public int compare(Order o1, Order o2) {
		return Double.compare(o2.orderAmount, o1.orderAmount);
	}
}

class SortByItemCount implements Comparator<Order>{

	@Override
	public int compare(Order o1, Order o2) {
		return Integer.compare(o1.itemCount, o2.itemCount);
	}
}

class SortByOrderTime implements Comparator<Order>{

	@Override
	public int compare(Order o1, Order o2) {
		return Long.compare(o1.orderTime, o2.orderTime);
	}
}

class SortByCustomerName implements Comparator<Order>{

	@Override
	public int compare(Order o1, Order o2) {
		return o1.customerName.compareTo(o2.customerName);
	}
}

class SortByOrderId implements Comparator<Order>{

	@Override
	public int compare(Order o1, Order o2) {
		return Integer.compare(o1.orderId, o2.orderId);
	}
}

public class Prac1 {
	public static void main(String[] args) {
		
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order(1, "Murali", 75.5, 2, 1234567890));
		orders.add(new Order(2, "Aditya", 85.5, 3, 1234567891));
		orders.add(new Order(3, "Vishnu", 80.5, 4, 1234567892));
		orders.add(new Order(4, "Pramod", 90.5, 5, 1234567893));
		orders.add(new Order(5, "Suraj", 55.5, 6, 1234567894));
		System.out.println(orders);
		Collections.sort(orders);
		System.out.println("\n--Sorted by orderAmount--");
		for (Order o : orders) {
			System.out.println(o);
		}
		System.out.println("\n--Sorted by itemCount--");
		Collections.sort(orders,new SortByItemCount());
		for (Order o : orders) {
			System.out.println(o);
		}
		System.out.println("\n--Sorted by orderTime--");
		Collections.sort(orders, new SortByOrderTime());
		for (Order o : orders) {
			System.out.println(o);
		}
		System.out.println("\n--Sorted by customerName--");
		Collections.sort(orders, new SortByCustomerName());
		for (Order o : orders) {
			System.out.println(o);
		}
		System.out.println("\n--Sorted by orderId--");
		Collections.sort(orders, new SortByOrderId());
		for (Order o : orders) {
			System.out.println(o);
		}
	}
}