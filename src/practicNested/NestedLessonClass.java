package practicNested;

public class NestedLessonClass {

	// Parent class name: LearnNestedClass

		// Nested class: child class
	String fanName= "national";
	float  coast=3457.99f;
	boolean review=true;
	
	
	public static void main(String[] args) {
		NestedLessonClass.Home  akbar= new NestedLessonClass.Home();
		System.out.println(akbar.myHome);
		System.out.println(akbar.roomSize);
		System.out.println(akbar.myBthroom);
		
		
		Aeroplane pia= new 	Aeroplane ();
		
		System.out.println(pia.plane);
		System.out.println(pia.seatNum);
		System.out.println(pia.planePrice);
		
		}
	
	
	public static class Home{
		
	
		String myHome ="beautiful place to live";
		int roomSize=134;
		boolean myBthroom=true;
}

	public static class Aeroplane{
		
		String plane= "delta air line";
	    int    seatNum=120;
	    long   planePrice=34675432121l;
	    
		}
	
	public static class Resturent {
		
		public static void main(String[] args) {
			
			String dishName="chicken baryani with chicken booti";
			boolean foodTaste=true;
			float  foodPrice=23.89f;
			
			Hotel ht= new Hotel();
			
			System.out.println(ht.hotelName);
			System.out.println(ht.service);
			System.out.println(ht.price);
			
		}	
			
		}
		
		public static class Hotel{
		
		String hotelName="hilton";
		boolean service=true;
		int price=200;
		
		}
	
	public static class Car{
		
		char carSize='l';
		long  carPrice=34675353l;
		String carReview=" toyota is best car all over in world";
		
	}
	
	
	public static class Pizza{
		
		public static void main(String[] args) {
			
			Car toyota = new Car();
			System.out.println(toyota.carSize);
			System.out.println(toyota.carReview);
			System.out.println(toyota.carPrice);
			
		}
		
		}
	
	public static class Mobil{
		byte ram=127;
		 int phone=1287987;
		 short model=5651;
		 long serialNumber=5468389788888881586l;
		 float price=300888888888888888888.50f;
		 
		
		}
	
	public static class Tv{
		
		public static void main(String[] args) {
			Mobil tel = new Mobil();
					
				System.out.println(tel.ram);	
				System.out.println(tel.phone);	
				System.out.println(tel.model);	
				System.out.println(tel.price);	
				System.out.println(tel.serialNumber);	
					
					}
		
	}
	
      public static class Cricket{
		
		String game="cricket is very good game ";
		boolean like=true;
		int   player=11;
		
		public static void main(String[] args) {
			
			NestedLessonClass gen = new NestedLessonClass();
			System.out.println(gen.coast);
			System.out.println(gen.fanName);
			System.out.println(gen.review);
		}
		
	}
	
	
}

