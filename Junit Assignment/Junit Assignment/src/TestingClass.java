
public class TestingClass {

	public int leftshift(int i)
	{
		i = i >> 1;
		return i;
	}
	
	public int rightshift(int i)
	{
		i = i << 1;
		return i;
	}
	
	public int absolute(int i)
	{
		i = Math.abs(i);
		return i;
	}
	
	public int factorial(int i)
	{
		if(i<0)
		{
			throw new ArithmeticException();
		}
		int n = 1;
		for(int j=1; j<i; j++)
		{
			n += n*j;
		}
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
