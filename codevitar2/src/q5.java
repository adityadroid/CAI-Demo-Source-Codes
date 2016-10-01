import java.util.Scanner;



public class q5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner bucky = new Scanner(System.in);
		String EncryptedPwd = bucky.nextLine();
		String key = bucky.nextLine();
		if(key.length()!=10)
		{
			System.out.print("-1");
		}
		
		String[][] keyList = new String[2][key.length()];
		for(int i =0;i<key.length();i++)
		{
			keyList[0][i]= String.valueOf(key.charAt(i));
			keyList[1][i]= String.valueOf(i);
			
		}
		
		
		int charA = Integer.parseInt(String.valueOf(EncryptedPwd.charAt(EncryptedPwd.length()-1)));
		
		String[] splittedElements = EncryptedPwd.split("\\||");
		String[] firstPart = splittedElements[0].split("\\|");
		String[] secondPart = splittedElements[1].split("");
		System.out.println(splittedElements[0]);
//		for(int i =0;i< splittedElements.length;i++)
//		{
//			
	//		System.out.println(splittedElements[i]);
		//}
//		for(int i =0;i< firstPart.length;i++)
//		{
//			
//			System.out.println(firstPart[i]);
//		}
//		for(int i =0;i< secondPart.length;i++)
//		{
//			
//			System.out.println(secondPart[i]);
//		}
		
		
		//System.out.print(charA);
	}

}
