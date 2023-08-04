package immu;

public class Encap2 {
	public static void main(String[] args) {
		Encap1 e1=new Encap1(1, "Mujahid"," Lead", 300000);
		Encap1 e2=new Encap1(2, "Imran"," Developer Lead", 400000);
		Encap1 e3=new Encap1(3, "Masthan"," Manager Lead", 50000);
		det(e1);
		e1.setSal(200);
		det(e1);
		det(e2);
		det(e3);
		
	}
	public static void det(Encap1 e)
	{
		System.out.println("Employee Id :"+e.getId());
		System.out.println("Employee Name :"+e.getName());
		System.out.println("Employee DEsignation :"+e.getJob());
		System.out.println("Employee Salary :"+e.getSal());
		e.work();
		System.out.println("=============================================================================");
	}
}
