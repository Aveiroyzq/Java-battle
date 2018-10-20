enum Color implements Print{
	RED{
		public String getColor(){
			return "ºìÉ«" ;
		}
	},GREEN{
		public String getColor(){
			return "ÂÌÉ«" ;
		}
	},BLUE{
		public String getColor(){
			return "À¶É«" ;
		}
	} ;
	public abstract String getColor() ;
}
public class AbstractMethodEnum{
	public static void main(String args[]){
		for(Color c:Color.values()){
			System.out.print(c.getColor() + "¡¢") ;
		}
	}
};