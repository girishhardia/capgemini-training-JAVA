public class CopyConstructor{
	int id;
	String name;
	public CopyConstructor(int id, String name){
		this.id=id;
		this.name=name;
	}

	public CopyConstructor(CopyConstructor obj){
		this.id = obj.id;
		this.name = obj.name;
	}

	public static void main(String[] args) {
		System.out.println("main start");
		CopyConstructor ref1 = new CopyConstructor(1,"rohit");
        
	}
}