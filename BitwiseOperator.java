class BitwiseOperator{
	public static void main(String[] args){
		
		// and operator (&)
		// or operator (|)
		// xor (^)
		// not (~)
		// left shift (<<)
		// right shift (>>)
		// unsigned right shift (>>>)
		
		int andOp = 5 & 4; 
		 System.out.println(Integer.toBinaryString(5));
		 System.out.println(Integer.toBinaryString(4));
		 System.out.println(andOp);
		 
		int orOp = 5 | 4;
		 System.out.println(Integer.toBinaryString(5));
		 System.out.println(Integer.toBinaryString(4));
		 System.out.println(orOp);
		 
		int xorOp = 5 ^ 4;
		 System.out.println(Integer.toBinaryString(5));
		 System.out.println(Integer.toBinaryString(4));
		 System.out.println(xorOp);
		 
		int Op = 6;
		 System.out.println(Integer.toBinaryString(Op));
		 System.out.println(~Op);
		 System.out.println(Integer.toBinaryString(~Op));
		 
		int a = 5;
		 System.out.println(Integer.toBinaryString(a));    
		int leftShift = a << 1;
		 System.out.println(leftShift);
		 System.out.println(Integer.toBinaryString(leftShift));
		 
		int rightShift = a >> 1;
		 System.out.println(rightShift);
		 System.out.println(Integer.toBinaryString(rightShift));
		 
		int unsignedRightShift = a >>> 1;
		 System.out.println(unsignedRightShift);
		 System.out.println(Integer.toBinaryString(unsignedRightShift));
		
	}
}
