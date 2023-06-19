package generics;

public class Printer<T> {
	
	T thingToPrint;
	
	public void Print(T thingToPrint) {
		this.thingToPrint = thingToPrint;
	}
	
	public void printer() {
		System.out.println(thingToPrint);
	}

}


