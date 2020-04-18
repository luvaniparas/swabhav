class SubStringTest{
	public String SubString (String url,String sub) {
		 sub =url.substring (12);
		 System.out.println("Substring fetched : " + sub);
		 return(sub);
	}
}

class SplitTest{
	public void Split (String sub) {
		String sp[] = sub.split("\\?") ;
		for (String w : sp) {
            System.out.println("Splited values are :"+w); 
  		}
		if (sp[1].length() == 0) {
			sp[1] = null;
		}
		if (sp[sp.length-1].length()==0) {
			sp[sp.length-1] = null ;
		}
		System.out.println("Company name is :"+sp[0]);
		System.out.println("Developer name is :"+sp[sp.length-1]);
	}		
}

public class DemoUrl {

	public static void main(String[] args) {
		String url = "https://www.swabhavtechlabs.com?developer=paras" ;
		String sub = " " ;
		
		SubStringTest sb = new SubStringTest ( ) ;
		SplitTest st = new SplitTest ( ) ;
		
		sub = sb.SubString(url,sub);
		
		st.Split(sub);
	}

}
