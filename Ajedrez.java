import java.util.*;

class Ajedrez{
	public static int contador(int r1,int c1,int r2,int c2){
		HashMap<Integer, Integer> visitados = new HashMap<>();
		Queue<Integer> saltos = new LinkedList<>();

		visitados.put(r1*8+c1, 0);
		saltos.add(r1*8+c1);
		
		while (saltos.size() > 0){
			int actual = saltos.remove();
		    int r = actual/8;
		    int c = actual%8;

		    if(r==r2 && c==c2){
				return visitados.get(actual);
			}

		    int nuevo=0;

		    if(r-2>=0 && c+1<=7){
		    	nuevo = (r-2)*8 + (c+1);
		    	if(!visitados.containsKey(nuevo)){
		    		visitados.put(nuevo,visitados.get(actual)+1);
		    		saltos.add(nuevo);
		    	}
		    }
		    if(r-1>=0 && c+2<=7){
		    	nuevo = (r-1)*8 + (c+2);
		    	if(!visitados.containsKey(nuevo)){
		    		visitados.put(nuevo,visitados.get(actual)+1);
		    		saltos.add(nuevo);
		    	}
		    }
		    if(r+1<=7 && c+2<=7){
		    	nuevo = (r+1)*8 + (c+2);
		    	if(!visitados.containsKey(nuevo)){
		    		visitados.put(nuevo,visitados.get(actual)+1);
		    		saltos.add(nuevo);
		    	}
		    }
		    if(r+2<=7 && c+1<=7){
		    	nuevo = (r+2)*8 + (c+1);
		    	if(!visitados.containsKey(nuevo)){
		    		visitados.put(nuevo,visitados.get(actual)+1);
		    		saltos.add(nuevo);
		    	}
		    }
		    if(r+2<=7 && c-1>=0){
		    	nuevo = (r+2)*8 + (c-1);
		    	if(!visitados.containsKey(nuevo)){
		    		visitados.put(nuevo,visitados.get(actual)+1);
		    		saltos.add(nuevo);
		    	}
		    }
		    if(r+1<=7 && c-2>=0){
		    	nuevo = (r+1)*8 + (c-2);
		    	if(!visitados.containsKey(nuevo)){
		    		visitados.put(nuevo,visitados.get(actual)+1);
		    		saltos.add(nuevo);
		    	}
		    }
		    if(r-1>=0 && c-2>=0){
		    	nuevo = (r-1)*8 + (c-2);
		    	if(!visitados.containsKey(nuevo)){
		    		visitados.put(nuevo,visitados.get(actual)+1);
		    		saltos.add(nuevo);
		    	}
		    }

		    if(r-2>=0 && c-1>=0){
		    	nuevo = (r-2)*8 + (c-1);
		    	if(!visitados.containsKey(nuevo)){
		    		visitados.put(nuevo,visitados.get(actual)+1);
		    		saltos.add(nuevo);
		    	}
		    }
		}
		return 0;
	}

	public static void main(String[] args) {
	    Scanner stdin = new Scanner (System.in);     
    	int t = stdin.nextInt();

	    for(int test=0; test<t; test++)	{	
	    	int r1 = stdin.nextInt();	
	    	int c1 = stdin.nextInt();
	    	int r2 = stdin.nextInt();	
	    	int c2 = stdin.nextInt();
	    	System.out.println(contador(r1,c1,r2,c2));
    	}
  	}
}