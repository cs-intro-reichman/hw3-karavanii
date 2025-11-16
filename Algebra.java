// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		if (x2>0) {
				for(;x2 > 0;x2--){
			x1++;
		}	
		return x1;
	}else if (x1>0){
		for(;x1>0;x1--){
			x2++;
		}
		return x2;
	}else{
		for(;x2<0;x2++){
			x1--;
		}
		return x1;
	}
	
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		if (x2>0) {
				for(;x2 > 0;x2--){
			x1--;
		}	
		return x1;
	}else if (x1>0){
		for(;x1>0;x1--){
			x2--;
		}
		return x2;
	}else{
		for(;x2<0;x2++){
			x1++;
		}
		return x1;
	}
		
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int num = 0;
		if (x1>0) {
			for(;x1>0;x1--){
			num = plus(num, x2);
			}
			return num;
		}else if (x2>0) {
			for(;x2>0;x2--){
				num = plus(num,x1);
			}
			return num;
		}else{
			for (; x1 < 0; x1++) {
            num = plus(num, x2); 
        }
		return minus(0, num);
		}
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int num =1;
		for(;n>0;n--){
			num = times(num, x);
		}
		return num;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		if (x1 ==0) {
			return 0;
		}
		if (x1>0 && x2 >0) {
			int count =0;
			while (x1>=x2) {
				x1 =minus(x1, x2);
				count++;
			}
			return count;
		}
		else if(x1>=0){
			x2 = times(minus(1,2), x2);
			int count =0;
			while (x1>=x2) {
				x1 =minus(x1, x2);
				count++;
			}
			return times(count, minus(1,2));
		}else if(x2>0){
			int count =0;
			x1 = times(x1, minus(1,2));
			while (x1>=x2) {
				x1 = minus(x1, x2);
				count++;
			}
			return times(minus(1,2), count);
		}else{
			x1 = times(minus(1,2), x1);
			x2 = times(minus(1,2), x2);
			int count =0;
			while (x1>=x2) {
				x1 = minus(x1, x2);
				count++;
			}
			return count;

		}
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		if (x1 ==0) {
			return 0;
		}
		if (x1>0 && x2 >0) {
		//	int count =0;
			while (x1>=x2) {
				x1 = minus(x1, x2);
		//		count++;
			}
			return x1;
		//	return count;
		}
		else if(x1>=0){
			x2 = times(minus(1,2), x2);
		//	int count =0;
			while (x1>=x2) {
				x1 =minus(x1, x2);
		//		count++;
			}
			return x1;
		}else if(x2>0){
		//	int count =0;
			x1 = times(x1, minus(1,2));
			while (x1>=x2) {
				x1 = minus(x1, x2);
		//		count++;
			}
			return x1;
		}else{
			x1 = times(-1, x1);
			x2 = times(-1, x2);
		//	int count =0;
			while (x1>=x2) {
				x1 =minus(x1, x2);
		//		count++;
			}
			return x1;
		//	return count;

		}
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		int i=0;
		while (times(i, i) != x) {
			i++;
		}
		return i;
	}	  	  
}