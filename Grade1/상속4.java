class Person10
{
	  name;
	 addr;
	 tel;
������

	public void setName(String _name)	
	public void setAddr(String _addr)	
	public void setTel(String _tel)	
	public String getName()	
	public String getAddr()
	public String getTel()	
	
}

class Customer extends Person10
{
	 customNum;//����ȣ
	 mileage;//���ϸ���
	public Customer(String _name, String _addr, String _tel, String _customNum, int _mileage) {
		
	}
	
}
public class extend_Test2
{
	public static void main(String[] args) {
		Customer c1 = new Customer("Tom", "101-412", "#82-622-8909", "10249304", 100);
		
		}
}