package project.demo;

import java.util.*;
public class StringBackspace {
 public static void main(String[] args) {
  String s = "a#c", t = "a#c";
  s=s.replaceAll("#", "");
  t=t.replaceAll("#", "");
  if(s.equalsIgnoreCase(t))
	  System.out.println("true");
  else
	  System.out.println("false");


}
}
