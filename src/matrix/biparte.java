package matrix;


import java.util.*;

public class biparte {

    public static void main(String[] args) {

    List<Double> list = Arrays.asList(5.5, 12.5, 17.5, 9.5, 27.5);
    calculateAverage(list);
   
}
    
 
    private static double calculateAverage(List<Double> list) {
    	Double sum = (double) 0;
    	  if(!list.isEmpty()) {
    	    for (Double list1 : list) {
    	        sum += list1;
    	    }
    	    double average=  sum.doubleValue() / list.size();
    	   
    	    Iterator<Double> iter = list.iterator();
            List<Double> Dicot = new ArrayList<Double>();

            
            while (iter.hasNext()) {
               Double currElement = iter.next();
                if (currElement < average) {
                    Dicot.add((double) 0);
                } else {
                    Dicot.add((double) 1);
                }
            
               
    	    
    	  }
            System.out.println(Dicot);
    	}
		return sum;
    }
    
}
