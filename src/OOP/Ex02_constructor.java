package OOP;
class Data_1 {
	int value;
	
	// automatic generation from compiler
	// Data_1() {}
}

class Data_2 {
	int value;
	
	// make default constructor in Data_2 
	// Data_2() {} // to solve the compiler error in main class
	
	Data_2(int x) { // constructor with parameter
		value = x;
	}
}
public class Ex02_constructor {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
//		Data_2 d2 = new Data_2(); // compile error - constructor Data_2() is undefined
	}
}
