package pl.mazurmarcin.javastart.zadania.tablice_i_sterowanie;

public class FizzBuzz {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			if (i % 15 == 0)
				System.out.println(i + " FizzBuzz");
			else if (i % 3 == 0)
				System.out.println(i + " Fizz");
			else if (i % 5 == 0)
				System.out.println(i + " Buzz");

		}

	}

}
