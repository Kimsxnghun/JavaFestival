package ex3;

public class Java28_2 {
	public static void main(String[] args) {
		
		System.out.println(reverseStr("ZAbcdVefEg"));
		
	}
	
	public static String reverseStr(String str) {
		
		String[] arr = str.split("");
		char[] cArr = new char[arr.length];
		for(int i=0; i<cArr.length; i++) 
		{
			cArr[i]= arr[i].charAt(0);
		}
		
		
		for(int j=0; j<cArr.length; j++) 
		{
			int min=j;
			
			for(int i=j+1; i<cArr.length; i++) 
			{
				if(cArr[min]>cArr[i])
				{
					min = i;
				}
			}
			char temp = cArr[min];
			cArr[min] = cArr[j];
			cArr[j] = temp;
		}
		
		String change = "";
		
		for(char a : cArr)
		{
			change += Character.toString(a);
		}
		
		return change;

	}

}
