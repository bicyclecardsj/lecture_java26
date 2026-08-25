package countableabstract;

public class Bird extends Countable {
	
	public Bird(String name, int num) {
		super(name, num);
	}

	@Override
	void count() {
		System.out.println(getName() + "가 " + getNum() + "마리 있다.");
	}
	
	public void fly() {
		System.out.println(getNum() + "마리 " + getName() + "가 날아간다.");
	}
}
