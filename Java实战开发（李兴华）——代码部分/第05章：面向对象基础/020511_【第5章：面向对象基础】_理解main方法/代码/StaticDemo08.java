public class StaticDemo08{
	public static void main(String args[]){
		if(args.length!=3){		// ����Ĳ����������3���������
			System.out.println("����Ĳ������������������˳�~") ;
			System.exit(1) ;	// ֱ���˳��˳���
		}
		for(int i=0;i<args.length;i++){	// ѭ���������Ĳ���
			System.out.println("��"+(i+1)+"��������" + args[i]) ;
		}
	}
};