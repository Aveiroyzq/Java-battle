import java.util.Scanner;

public class SwitchDemo01{
	// ���һ����������Ĺ���
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int x = 3 ;
		int y = 6 ;
		char oper = in.nextInt();
		switch(oper){
			case '+':{	// ִ�мӷ�����
				System.out.println("x + y = " + (x + y )) ;
				break ;
			}
			case '-':{	// ִ�м�������
				System.out.println("x - y = " + (x - y )) ;
				break ;
			}
			case '*':{	// ִ�г˷�����
				System.out.println("x * y = " + (x * y )) ;
				break ;
			}
			case '/':{	// ִ�г�������
				System.out.println("x / y = " + (x / y )) ;
				break ;
			}
			default:{
				System.out.println("δ֪�Ĳ�����") ;
				break ;
			}
		}
	}
};