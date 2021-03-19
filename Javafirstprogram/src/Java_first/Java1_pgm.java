package Java_first;

public class Java1_pgm {

	public static void main(String[] args) {
		int a=1,b=3,c=5;
		final int memory=100;
		System.out.println("my first program");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(memory);
        for(int i=0;i<10;i++){
        System.out.println("loop is");
        System.out.println(i);
        }
        
        if(a<b)
        {
        	System.out.println("value is bigger");
        }
        else
        {
        	System.out.println("value is smaller");	
        }
        while(a<6)
        {
        	System.out.println(a);
          a++;
        }
        for(int i=0;i<10;i++)
        {
        	if(i==4){
        		break;
           }
             System.out.println(i);
        }
        
        String[] cars={"volvo","i10","i20","cheverale"};
        for(String i: cars){
        	System.out.println(i);
        }
	}
}
