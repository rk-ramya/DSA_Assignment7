package project.demo;

public class StringSum {
	    public String StringsSum(String str1, String str2) {
	        str1 = new StringBuilder(str1).reverse().toString();
	        str2 = new StringBuilder(str2).reverse().toString();
	        String result = "";
	        int carry = 0;
	        for (int i = 0; i < str1.length() || i < str2.length(); i ++) {
	            int c1 = 0;
	            int c2 = 0;
	            if (i < str1.length()) {
	                c1 = str1.charAt(i) - '0';
	            }
	            if (i < str2.length()) {
	                c2 = str2.charAt(i) - '0';
	            }
	            int sum = c1 + c2 + carry;
	            int digit = sum % 10;
	            carry = sum / 10;
	            result = digit + result;
	        }
	        if (carry != 0) {
	            result = carry + result;
	        }
	        return result;
	    }
	}