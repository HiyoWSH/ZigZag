import java.util.*;
public class mainZig {

	public static String convert(String s,int rows){
		if(s.length()==0)
			return "";
		if(rows==1||s.length()<=rows)
			return s;
		ArrayList<char[]> arr=new ArrayList<char[]>();
		int x=0;
		boolean isup=false;
		char[] cs=s.toCharArray();
		char[] tempc=new char[rows];
		for(int i=0;i<cs.length;i++){

			System.out.println(String.valueOf(cs[i]));
			tempc[x]=cs[i];
			if(isup){
				if(x==0){
					x++;
					isup=false;
				}
				else{
				    arr.add(tempc);
				    tempc=new char[rows];
					x--;
				}
			}
			else{
				if(x==rows-1){
					arr.add(tempc);
					tempc=new char[rows];
					isup=true;
					x--;
				}
				else
					x++;
			}
		}
		System.out.println(tempc);
		if(!isup){
			arr.add(tempc);
		}
		StringBuffer ns=new StringBuffer();
		char a = 0;
		for(int i=0;i<rows;i++){
			for(char[] cc:arr)
			{
				//System.out.print(cc[i]);
				if(cc[i]!=a)
					ns.append(cc[i]);
			}
		}
		return ns.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char[] c=new char[3];
		//for(char k:c)
		System.out.print(convert("ABCDEF",3));
		//////////////////////////////////////////////////
		System.exit(0);
	}

}
