public class SwitchDemo02{
	// 完成一个四则运算的功能
	public static void main(String args[]){
		int x = 3 ;
		int y = 6 ;
		char oper = '*' ;
		switch(oper){
			case '+':{	// 执行加法操作
				System.out.println("x + y = " + (x + y )) ;
			}
			case '-':{	// 执行减法操作
				System.out.println("x - y = " + (x - y )) ;
			}
			case '*':{	// 执行乘法操作
				System.out.println("x * y = " + (x * y )) ;
			}
			case '/':{	// 执行除法操作
				System.out.println("x / y = " + (x / y )) ;
			}
			default:{
				System.out.println("未知的操作！") ;
			}
		}
	}
};