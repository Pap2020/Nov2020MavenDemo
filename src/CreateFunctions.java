
public class CreateFunctions {

	public static void main(String[] args)
	{
		CreateFunctions i = new CreateFunctions();
		
		System.out.println(i.loopMethod1(15,20));
	}
	
	
	//public  void loopMethod(int startcount, int endcount)
	//{
	//	for(i=startcount; i<=endcount; i++)
	//	{
	//		System.out.print(i);
		//}
	//}
	public  int loopMethod1(int startcount, int endcount){
		for(int i=startcount; i<=endcount; i++)
		{
			System.out.print(i);
			System.out.println();
		}
		return startcount-endcount;	
			
		}
		
}
	