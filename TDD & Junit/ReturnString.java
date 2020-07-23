import java.util.*;
public class ReturnString
{
public String find(String s)
{
ArrayList<Character> a=new ArrayList<>();
int idx0=0;
int idx1=0;
String r="";
	if(s.charAt(0)=='A')
    idx0=1;
    if(s.charAt(1)=='A')
    idx1=1;
if(idx0==0 && idx1==0)
	return s;
if(idx0==1 && idx1==1)
	return s.substring(2,s.length());
if(idx0==1)
	return s.substring(1,s.length());
if(idx1==1)
	r=s.substring(0,1)+s.substring(2,s.length());
	return r;

}
}