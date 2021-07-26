package oops.vaiarbles;

public class Page {
	String heading = "Application ";

	public static void main(String[] args) {
		 
		
		Page aboutus = new Page();
		aboutus.heading="About US";
		aboutus.printPageHeading();
		 
		
		Page contact = new Page();
		contact.printPageHeading();
		
		Page service = new Page();
		service.heading="Service ";
		service.printPageHeading();
		
		Page management = new Page();
		management.printPageHeading();
	}

	public void printPageHeading() {
		System.out.println(heading + " Page Heading");
	}
}
