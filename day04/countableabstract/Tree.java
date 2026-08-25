package countableabstract;

public class Tree extends Countable {
	
	public Tree(String name, int num) {
		super(name, num);
	}

	@Override
	void count() {
		System.out.println(getName() + "가 " + getNum() + "그루 있다.");
	}
	
	public void ripen() {
		System.out.println(getNum() + "그루 " + getName() + "에 열매가 잘 익었다.");
	}

}
