package argument_01;
// Instance method  (Argument). The variable is present inside the class and outside the method is called instance method .
public class Data {
	
	int a;
	float c;
	double d;
	  char ch;
	  boolean e;
	String s;
	int o;
	public void test(int b,float g, double o) {
		a=b; 
		c=g;
		d=o; 
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
	};
	
	//char(static)(object)
	public static void login(char r) {
		Data v=new Data();
		       v.ch=r; 	
		System.out.println(v.ch);
	};
	
	//boolean(instance)
	public void mark(boolean n) {
		e=n;
		System.out.println(e);	
	};
	
	//String(instance)
	  public void support(String i) {
    	s=i;
    	System.out.println(s);
    };

    
    public static void test(int f) {
    	Data v=new Data();
    	v.o=f;
    	System.out.println(v.o);
    	
    	
    	
    	
    };
    //Ans(main)
	public static void main(String[] args) {
		
		Data v=new Data();//object
		v.test(22,22.5f,45);
		login('k');
		v.mark(true);
		v.support("house");
		test(55);
		
		
	}

}
