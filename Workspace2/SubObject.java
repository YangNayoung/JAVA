	class SuperObject {
		protected String name;
		public void paint() {
			draw();
		}
		public void draw() {
			System.out.println(name);
		}
	}
	public class SubObject extends SuperObject{
		protected String name;
		public void draw() {
			name = "sub";
			super.name = "super";
			super.draw();
			System.out.println(name);
		}
	public static void main(String[] agrs) {
		SubObject b = new SubObject();
		b.paint();
	}
	}
	
