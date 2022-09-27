package Classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager=customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();   
	
	// value
		int number1 = 10;
		int number2 = 20;
		number2 = number1;
		number1 = 30;
		System.out.println(number2);// değer tipi olduğu için burada number 2 nin number1 in baştaki değerini alır ve sonra number1 değer alsada bu değişmez 
	
		int[] numbers1 = new int[]{1,2,3};// diziler referans tiptir bu yüzden numbers2 adlı dizi numbers1 in referansını alır yani onun yerine geçer . Bu nedenle sonradan numbers1 e bir değer atanırsa numbers2 nin yeni değeri de değişir
		int[] numbers2 = new int[]{4,5,6};
		numbers2 = numbers1;
		numbers1[0]=10;
		System.out.println(numbers2[0]);
	}

}

	
