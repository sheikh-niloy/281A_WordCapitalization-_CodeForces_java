import java.util.*;
import java.io.*;

public class Start
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		char ch=str.charAt(0);
		if(Character.isLowerCase(ch)){
		    System.out.print(Character.toUpperCase(ch));
		    System.out.println(str.substring(1));
		}else{
		    System.out.println(str);
		}
	}
}