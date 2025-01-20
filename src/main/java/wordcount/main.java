package wordcount;
//import org.apache.commons.lang3.StringUtils;

public class main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.print("hello \n");
		String words = "One Two Three Four";
		int countWords = words.split("\\s").length;
		//StringUtils.split(words,' ')
		System.out.println(countWords);
		return;
	}
}
