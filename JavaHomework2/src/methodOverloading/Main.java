package methodOverloading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourOperations fourOperations = new FourOperations();
		System.out.println(fourOperations.additional(2,3));
		fourOperations.additional(2, 3,5);
	}

}
