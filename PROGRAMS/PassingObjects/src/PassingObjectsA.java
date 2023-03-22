
public class PassingObjectsA {
	void display(PassingObjectsB obj2) {
		System.out.println("This is from B but from A because the object has been passed from B.");
		obj2.display();
	}

}
