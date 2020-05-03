package OOPAbstract;

public abstract class Page {

	public Page() {
		System.out.println("Page default const...");
	}

	public Page(int i) {
		System.out.println("1 param const.." + i);
	}

	public abstract void header(String header);

	public abstract void title(String title);

	public void search() {
		System.out.println("Page -- search");
	}

	// can not create the object of abstract class
	// 0 to 100% abstraction (partial abstraction)
	// 0% - no abs methods

}
