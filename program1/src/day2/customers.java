package day2; 

public class customers {

	public static void main(String[] args) {
		customerdetails e1 = new customerdetails();
		customerdetails e2 = new customerdetails();
		customerdetails e3 = new customerdetails();
		customerdetails e4 = new customerdetails();
		customerdetails e5 = new customerdetails();
		
		e1.setCid(121);
		e1.setCname("ragu");
		e1.setAddress("agaram");
		e1.setCity("villupuram");
		
		System.out.print(e1.getCid()+"  ");
		System.out.print(e1.getCname()+" "); 
		
		System.out.print(e1.getAddress()+" ");
		
		System.out.println(e1.getCity()+" ");
		
		e2.setCid(122);
		e2.setCname("murali");
		e2.setAddress("mundiyampakam");
		e2.setCity("villupuram");
		
		System.out.print(e2.getCid()+"  ");
		System.out.print(e2.getCname()+" "); 
		
		System.out.print(e2.getAddress()+" ");
		
		System.out.println(e2.getCity()+" ");
		
		e3.setCid(123);
		e3.setCname("ronaldo");
		e3.setAddress("kutroad");
		e3.setCity("villupuram");
		
		System.out.print(e3.getCid()+"  ");
		System.out.print(e3.getCname()+" "); 
		
		System.out.print(e3.getAddress()+" ");
		
		System.out.println(e3.getCity()+" ");
		
		e4.setCid(124);
		e4.setCname("neymar");
		e4.setAddress("vikkravandi");
		e4.setCity("villupuram");
		
		System.out.print(e4.getCid()+"  ");
		System.out.print(e4.getCname()+" "); 
		
		System.out.print(e4.getAddress()+" ");
		
		System.out.print(e4.getCity()+" ");
		
	}

}
