class Switch_Test1 {
	public static void main(String ar[]) {

	int a=10 , b= 20;
    char c='*';

   switch (c) {
   case '+': System.out.println( a + b );
   break;
   case '-' : System.out.println( a - b );
   break;
   case '*': System.out.println( a * b );
   break;
   case '/' : System.out.println( a / b );
   break;
   default: System.out.println("연산자가 아닙니다.");
}
}
}