/**
 * 
 * My Java Application 
 * @author Paulo Saraiva 
 */
public class App {
	
	/**
	 * Application main
	 * @param args - Application arguments
	 */
	public static void main(String[] args){
		
		for(int i = 0 ; i < args.length ; i++){
			/*
			//Print Hello
			if(i == 0) System.out.print(args[0]);
			else System.out.print(" " + args[i]);
			*/
			
			System.out.print((i==0) ? args[0] : " " + args[i]);
		}
		
		
	}
	
}
