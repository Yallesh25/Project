
public class Project {
	static int countDigits(int number) {
		if(number>=1 && number <=9)
			return 1;
		else if (number>=10 && number <=99)
			return 2;
		else if (number>=100 && number <=999)
			return 3;
		else
			return -1;
	}
	public static void main(String args[]) {
		System.out.print("Hello\n");
		int x=564;
		if(countDigits(x)!=-1)
			System.out.print(countDigits(x)+"digits");
		else
			System.out.print( "Multiple Digits  ");
	}
}
