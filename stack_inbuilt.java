import java.util.Stack;
public class Main
{
	public static void main(String[] args) {
	    Stack<Integer> s1=new Stack<>();
	    s1.push(1);
	     s1.push(2);
	      s1.push(5);
	       s1.push(4);
	        s1.push(3);
	        System.out.println(s1.peek());
	        System.out.println(s1);
	        System.out.println(s1.empty());
	        System.out.println(s1);
	        System.out.println(s1.empty());
	        
	        Iterator val= s1.iterator();
	        while(val.hasNext()){
	            Object s2=val.next();
	            System.out.print(s2+" ");
	        }
	        
	        
	}
}