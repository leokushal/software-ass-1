 public static void main(String[] args) {

    List<Double> list = Arrays.asList(2.3, 5.6,  6.03, 9.1);
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
                    Dicot.add((double) 1);
                } else {
                    Dicot.add((double) 0);
                }
            
               