public class SwitchDemo02{
	// ���һ����������Ĺ���
	public static void main(String args[]){
		int x = 3 ;
		int y = 6 ;
		char oper = '*' ;
		switch(oper){
			case '+':{	// ִ�мӷ�����
				System.out.println("x + y = " + (x + y )) ;
			}
			case '-':{	// ִ�м�������
				System.out.println("x - y = " + (x - y )) ;
			}
			case '*':{	// ִ�г˷�����
				System.out.println("x * y = " + (x * y )) ;
			}
			case '/':{	// ִ�г�������
				System.out.println("x / y = " + (x / y )) ;
			}
			default:{
				System.out.println("δ֪�Ĳ�����") ;
			}
		}
	}
};