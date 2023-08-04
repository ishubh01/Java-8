package MethodRefrencePractise;

import java.util.Random;
import java.util.function.Supplier;

public class DemoSupplierApplication {

	static String name = "Jaynam Sanghvi";

	public static Integer randomNumbers() {
		int random = new Random().nextInt(100);
		if (random < 40)
			return 40;
		return random;
	}

	public static void main(String[] args) {
// TODO Auto-generated method stub

		Supplier<Boolean> boolresult = () -> name.length() == 10;
		Supplier<String> supplier = () -> name.toUpperCase();
		System.out.println(boolresult.get());
		System.out.println(supplier.get());
		Supplier<Integer> supp = DemoSupplierApplication::randomNumbers;
		System.out.println(supp.get());
	}

}
