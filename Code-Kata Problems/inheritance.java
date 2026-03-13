class Parent {
	Parent() {
		System.out.println("Parent constructor called");
	}

	Parent(String msg) {
		System.out.println("Parent parameter constructor: " + msg);
	}
}

class Child extends Parent {
	Child() {
		super();
		System.out.println("Child constructor called");
	}

	Child(String msg) {
		super(
            

            
        );
		System.out.println("Child parameter constructor: " + msg);
	}
}

public class inheritance {
	public static void main(String[] args) {
		Child c1 = new Child();
		Child c2 = new Child("Hello from Child");
	}
}
