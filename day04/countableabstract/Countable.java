package countableabstract;

public abstract class Countable {
	private String name;
	private int num;
	
	abstract void count();
	
	public Countable(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNum() {
		return num;
	}
	
	public void fly() {}
	public void ripen() {}
	
}
