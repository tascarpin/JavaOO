package exercíciosPropostos.sintaxe;

public class FibonacciDesafio {

	public static void main (String[] args)
	  {
	    int a = 0, i = 1;

	    while (i <= 100)
	    {
	      System.out.print (a + " " + i + " ");
	      a += i;
	      i += a;
	    }
	    System.out.println ("");
	  }

}
