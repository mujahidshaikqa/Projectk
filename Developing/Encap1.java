package immu;

public class Encap1 {
	private int id;
	private String name;
	private String job;
	private int sal;

	public Encap1(int id, String name, String job, int sal) {
		this.id = id;
		this.name = name;
		this.job = job;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		if(sal>this.sal)
		this.sal = sal;
	}
	
	 void work()
	{
		System.out.println(name+" is working as "+job);
	}

}
