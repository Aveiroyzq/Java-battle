import java.util.Stack ;
public class StackDemo{
	public static void main(String args[]){
		Stack<String> s = new Stack<String>() ;
		s.push("A") ;	// »Î’ª
		s.push("B") ;	// »Î’ª
		s.push("C") ;	// »Î’ª
		System.out.print(s.pop() + "°¢") ;
		System.out.print(s.pop() + "°¢") ;
		System.out.println(s.pop() + "°¢") ;
		System.out.println(s.pop()) ;
	}
};