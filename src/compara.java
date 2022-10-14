import java.util.Scanner;

public class compara {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
    	
    	boolean retorno = false;
        Scanner sc = new Scanner(System.in);
        String[] seq = sc.nextLine().split(" ");
        for (int i = 0; i < seq.length; i++){
        	for (int j = i + 1; j < seq.length; j++) {
				
        		if(seq[i].equals(seq[j])){
        			retorno = true;
        			break;
        		}
			}
			
		}
        System.out.println(retorno);
    
    }   

}