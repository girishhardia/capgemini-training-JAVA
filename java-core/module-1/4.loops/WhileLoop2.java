class WhileLoop2{
	public static void main(String[] args) {
		char i = 'A';
		while(i<='M'){
			System.out.print(i);
			i++;
			System.out.print(" ");
		}
		System.out.println("");
		i='x';
		while(i>='m'){
			System.out.print(i);
			i--;
			System.out.print(" ");
		}
	}
}