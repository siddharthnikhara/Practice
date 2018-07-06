package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TwoDArrayPrint {
	
public static void twoDArrayPrint(Integer array[][]){
		
		//int array1[]=new int[array.length+1];

		int largest=0;
		int smallest=9;
		int max = array[0][0];
		Integer min=0;
		int sum=0;
		
		
		Integer[][] arrays = {{5, 1, 9,5},{7, 5, 3},{2,4,6,8}};
		
		
//		int sum=0;
//		for (int i=0;i<ary.length;i++)
//		{
//			TreeSet<Integer[]> set=new TreeSet();
//			List list=Arrays.asList(ary[i]);
//			set.addAll(list);
//			String  max=""+set.last();
//			String min=""+set.first();
//			int  minno=Integer.parseInt(min);
//			int  maxno=Integer.parseInt(max);
//			sum+=(maxno-minno);
//		}
//		
//		
//		System.out.println(sum);
		
//		int []ax=new int[array[0].length];
//		int []axx=new int[array[0].length];
//		
//		 for(int i=0;i<arrays.length;i++){
//			 List as=Arrays.asList(arrays[i]);
//			 Collections.sort(as);
//			// System.out.println(as.get(0));
//			  min=(Integer) as.get(0);
			
			// System.out.println(min+" "+"min in row");
			 
//			  for (int k=0;k<ax.length;i++) {
//				  ax[k]=min;
//				 
//				  System.out.println(ax[k]); 
//			  }
//		 }
		 
		 
		 
//		 for(int j=0;j<array.length;j++) {
//			 List ass=Arrays.asList(array[j]);
//			Collections.sort(ass);
//			 System.out.println(ass.l);
//		 }
		
//		int x=Integer.MIN_VALUE;
//		int arrayy1[]=new int[Integer.MIN_VALUE];
		//int [] result = new int[array.length];
//		  int min=array[0][0];
//		
//
//		  for(int i=0;i<array.length;i++){
//			   min = array[i][0];
//	       for(int j=0;j<array[i].length;j++){
//
//	           if(array[i][j]<min){
//	        	   min = array[i][j];
//	           }
//	          // result[i]=min;
//	           System.out.println(min); 
//	       } 
//
//	  
//  }
		  
		  
		  
//		  for ( int i=0; i < array.length; i++)
//		{
//			max=array[i][0];
//	  for(int j = 0; j < array[i].length; j++) {
//		
//			         if ( array[i][j] > max )
//		
//			             max = array[i][j];      
//			
//			     }
//			
//			     System.out.println(max+" "+"max in row");
//			
//			} 
			
//	     for (int i = 0; i < array.length; ++i) {
//	       for(int j = 0; j < array[i].length; ++j) {
//	           
//	        if(array[i][j]>largest){
//	        	largest=array[i][j];
//	        
//	       }
//	        
//	        if(smallest<=array[i][j]){
//	        	smallest=array[i][j];
//	        }
//	        	
//	        	
//	        	System.out.print(array[i][j]+" ");
//	        System.out.println(largest); 
//	        System.out.println(smallest);
//	        }
//	        System.out.println();
//	      
//	     }
		
		List l=new ArrayList(); 
		List l1=new ArrayList();
		
		  for ( int i=0; i < array.length; i++)
			{
				max=array[i][0];
		  for(int j = 0; j < array[i].length; j++) {
			
				         if ( array[i][j] > max )
			
				             max = array[i][j];      
				
				     }
				
		  
		  l.add(max);
		  
				     System.out.println(max+" "+"max in row");
				    
				}
	    System.out.println(l+"l");
		  
		  
		   for(int k=0;k<array.length;k++){
				 List as=Arrays.asList(array[k]);
				 Collections.sort(as);
				 System.out.println(as.get(0));
				  min=(Integer) as.get(0);
				  System.out.println(min+" "+"min in row");
				  l1.add(min);
		     } 
		   System.out.println(l1+"l1");
		   
		   
		  l1: for(int i=0;i<l.size();i++) {
			   
			 l2:  for(int j=i;j<l1.size();j++) {
				int a=(int) l.get(i);
				   int b=(int) l1.get(j);
				   int subtract=a-b;
				   //System.out.println(subtract);
				 sum+=subtract; 
				 System.out.println(sum);
				   break l2;
			//	int minus  =Math.subtractExact(l.get(i),l1.get(j));   
			   }
		  
		   }
		   System.out.println(sum+"sum");
	
}
	public static void main(String[] args) {
		
		// Integer[][] array = {{5, 1, 9,5},{7, 5, 3},{2,4,6,8}};
		 
		Integer[][] array= {{278,1689,250,1512,1792,1974,175,1639,235,1635,1690,1947,810,224,928,859},{160,50,55,81,68,130,145,21,211,136,119,78,174,155,149,72},{4284,185,4499,273,4750,4620,4779,4669,2333,231,416,1603,197,922,5149,2993},{120,124,104,1015,1467,110,299,320,1516,137,1473,132,1229,1329,1430,392},{257,234,3409,2914,2993,3291,368,284,259,3445,245,1400,3276,339,2207,233},{1259,78,811,99,2295,1628,3264,2616,116,3069,2622,1696,1457,1532,268,82},{868,619,139,522,168,872,176,160,1010,200,974,1008,1139,552,510,1083},{1982,224,3003,234,212,1293,1453,3359,326,3627,3276,3347,1438,2910,248,2512},{4964,527,5108,4742,4282,4561,4070,3540,196,228,3639,4848,152,1174,5005,202},{1381,1480,116,435,980,1022,155,1452,1372,121,128,869,1043,826,1398,137},{2067,2153,622,1479,2405,1134,2160,1057,819,99,106,1628,1538,108,112,1732},{4535,2729,4960,241,4372,3960,248,267,230,5083,827,1843,3488,4762,2294,3932},{3245,190,2249,2812,2620,2743,2209,465,139,2757,203,2832,2454,177,2799,2278},{1308,797,498,791,1312,99,1402,1332,521,1354,1339,101,367,1333,111,92},{149,4140,112,3748,148,815,4261,138,1422,2670,32,334,2029,4750,4472,2010},{114,605,94,136,96,167,553,395,164,159,284,104,530,551,544,18}};
		 twoDArrayPrint(array);
		 }

}
