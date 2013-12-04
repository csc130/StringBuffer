
public class StringBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1 = new StringBuffer("TANES");
		StringBuffer s2 = new StringBuffer("TANES");
		StringBuffer s3;
		
		System.out.println(s1);
		System.out.println(s2);
		
	//	s3 =s1.replace(0,4, "P");
		System.out.println(s1);
		//System.out.println(s3);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
	  public static String ugly(String foo, String bar) {
		     StringBuffer buffer = new StringBuffer();
		     buffer.append (foo);
		     buffer.append (" ");
		     buffer.append (bar);
		     return buffer.toString();
		   }

}
