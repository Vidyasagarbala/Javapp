package wordcount;
import dependency.dependency;
import Certificate_dependency.Cert;
//import org.apache.commons.lang3.StringUtils;

public class main 
{
	public static void main(String[] args) 
	{
		dependency d = new dependency();
		Cert c = new Cert();
		
		// TODO Auto-generated method stub
		System.out.print("hello \n");
		String words = "One Two Three Four";
		int countWords = words.split("\\s").length;
		//StringUtils.split(words,' ')
		System.out.println(countWords);
		d.getdata();
		c.getcert();
		//return;
	}
}
