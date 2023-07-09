package project.demo;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringReverse {
		public static void main(String[] args) {

			String str = "abcdefg";
			int i,k=4;
			String result="";

			for(i=0;i<str.length()-k;i+=k) {
				result += Arrays.asList(str.substring(i, i+k))
								.stream()							
								.map(s->new StringBuilder(s).reverse())
								.collect(Collectors.joining(""));
					
			}
			if(str.length()-i-k<k) {
				result+=Arrays.asList(str.substring(i))
						.stream()							
						.map(s->new StringBuilder(s).reverse())
						.collect(Collectors.joining(""));
				
			}
			System.out.println("Final result: "+result);
		}
	}

