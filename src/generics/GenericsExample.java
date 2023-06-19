package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
	
	public static void main(String[] args) {
		
		Integer integerNumber = 50;
		List<Integer> list = new ArrayList<>();
		List<String> stringList = new ArrayList<>();
		Printer<Integer> integerPrinter = new Printer<>();
		
		integerPrinter.Print(integerNumber);
		integerPrinter.printer();
		
		stringList.add("Hello");
		stringList.add("World!");
		printList(stringList);
		
		list.add(50);
		list.add(58);
		printList(list);
		
	}
	
	public static void printList(List<?> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println("");
	}

}
