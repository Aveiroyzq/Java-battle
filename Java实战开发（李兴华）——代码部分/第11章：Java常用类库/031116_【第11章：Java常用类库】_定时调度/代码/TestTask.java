import java.util.Timer ;
public class TestTask{
	public static void main(String args[]){
		Timer t = new Timer() ;	// 建立Timer类对象
		MyTask mytask = new MyTask() ;	// 定义任务
		t.schedule(mytask,1000,2000) ;	// 设置任务的执行，1秒后开始，每2秒重复
	}
};