package finalkeyword;
 class C {
       void m1() {//final  keyword at method
		System.out.println("A-m1");
	}
 }

class D extends C{
        void m1(){ //we cannot override the method and get error

		System.out.println("B-m1");
	}
}
public class finalMethod {
 

	public void main(String[] args) {
	 C c = new D();
	 c.m1();
 }
}
