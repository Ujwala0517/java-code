package finalkeyword;
 class A {// final keyword  used in class
	void m1() {
			System.out.println("A-m1");
		}
	}
	class B extends A {// final will not allow extends the class
		void m1() {

			System.out.println("B-m1");
		}
	}
public class finalClass {
		    public static void main(String[] args) {
			 A a = new B();
			 a.m1();
		}
		}

