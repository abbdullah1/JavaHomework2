package Methods;

public class Main {

	public static void main(String[] args) {
		numberFinding();
		numberFinding();
		numberFinding();
		numberFinding();
		numberFinding();
		
	}

	public static void numberFinding() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int sought = 6;
		boolean isThere = false;

		for (int number : numbers) {
			if (sought == number) {
				isThere = true;
				break;
			}
		}
		String message = "";
		if (isThere) {
			System.out.println("there is that number : " +sought);
			giveMessage(message);
		} else {
			System.out.println("there is not that number : " +sought);
		}

	}
	public static void giveMessage(String message) {
		System.out.println(message);
	}
}
