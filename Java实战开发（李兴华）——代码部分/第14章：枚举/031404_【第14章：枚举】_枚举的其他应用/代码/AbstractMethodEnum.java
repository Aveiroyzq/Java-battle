enum Color implements Print{
	RED{
		public String getColor(){
			return "��ɫ" ;
		}
	},GREEN{
		public String getColor(){
			return "��ɫ" ;
		}
	},BLUE{
		public String getColor(){
			return "��ɫ" ;
		}
	} ;
	public abstract String getColor() ;
}
public class AbstractMethodEnum{
	public static void main(String args[]){
		for(Color c:Color.values()){
			System.out.print(c.getColor() + "��") ;
		}
	}
};