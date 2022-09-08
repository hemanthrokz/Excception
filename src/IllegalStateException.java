
public class IllegalStateException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread();
		t.start();
		t.start();
	}

}
