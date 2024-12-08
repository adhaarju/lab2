package letmethrow;

public class throwdemo {
	public void amigood(int number) throws ArithmeticException, ClassNotFoundException {
		if (number == 9) {
			throw new ArithmeticException(" you have guessed correct");
		} else {
			throw new ClassNotFoundException("this is random example");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throwdemo obj = new throwdemo();
		try {
			obj.amigood(9);
		} catch (ArithmeticException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
