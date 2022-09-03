
public class Class {

	//public static void main(String[] args) {
	/*int i = 1, j = 10; 
	do 
	{
	    if(i > j) 
	    {
	        break; 
	    } 
	    j--; 
	} while (++i < 5); 
	System.out.println("i = " + i + " and j = " + j);*/
		
		    public static void main(String[] args) throws IOException {
		        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		        int N = Integer.parseInt(bufferedReader.readLine().trim());
		        for(int i = 1; i <= 10; i++){

		            int result = N * i;

		            if(i>=1||i<=10){
		                    System.out.println(N + " x " + i + " = " + result);
		                }
		        }
		        bufferedReader.close();
		    }
		}
	}

}
