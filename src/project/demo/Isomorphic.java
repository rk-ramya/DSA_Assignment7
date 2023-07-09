package project.demo;
import java.io.*;
import java.util.*;

class Isomorphic {

	static boolean areIsomorphic(String str1, String str2)
	{

		HashMap<Character, Character> countChars= new HashMap();
		char c = 'a';
		for (int i = 0; i < str1.length(); i++) {
			if (countChars.containsKey(str1.charAt(i))) {
				c = countChars.get(str1.charAt(i));
				if (c != str2.charAt(i))
					return false;
			}
			else if (!countChars.containsValue(
						str2.charAt(i))) {
				countChars.put(str1.charAt(i),
							str2.charAt(i));
			}
			else {
				return false;
			}
		}
		return true;
	}

	
	public static void main(String[] args)
	{

		String str1 = "egg";
		String str2 = "add";

	
		if (str1.length() == str2.length()
			&& areIsomorphic(str1, str2))
			System.out.println("Strings are Isomorphic");
		else
			System.out.println("Strings are not Isomorphic");
	}
}


