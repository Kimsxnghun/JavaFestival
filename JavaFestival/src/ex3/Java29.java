package ex3;

public class Java29 {
	public static void main(String[] agrs) {
		
		String[] names = {"Queen", "Tod", "Kim"};
		System.out.println(findKim(names));
	}

	private static String findKim(String[] names) {
		
		int where = 0;
		
		for(int i=0; i<names.length; i++) 
		{
			if(names[i].equals("Kim"))
			{
				where = i;
			}
		}
		
		return "�輭���� " + (where+1) + "�� �ִ�.";
	}
	

}
