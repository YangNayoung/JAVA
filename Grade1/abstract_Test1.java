abstract class Vehicle {
	String name;
	int price;

	abstract public String start(int x);
	abstract public int stop(String x);
	abstract public String take();
	}

	class bus extends Vehicle {
		public String start(int x) { 
			return "출발"; 
			}
		public int stop(String x) { 
			return 1; 
			} 
		public String take( ) { 
			return "버스";
			}
	}

	class abstract_Test1 {
		public static void main(String ar[]){
			bus b1=new bus();
			System.out.println(b1.take());
		}
	}