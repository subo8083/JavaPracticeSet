package evaluation;

public class Demo {
	
	public static void main(String[] args) {
		int a = 64;
		int b = 70;
		byte c = (byte)(a+b);//typecast (a+b) to byte
		System.out.println(c);
		}

}

//EXPLANATION


//since a is Integer and b is also Integer but here we are trying toconvert int values to byte that means
//from higher value to lower value (ie, explicit typecasting) and we know that byte have certain ranger from
// -128 to 127 and it makes a circle to the value that we will get after adding 64+70 is above 127 
// so it will give -122 as it again repeats from -128 to 127.