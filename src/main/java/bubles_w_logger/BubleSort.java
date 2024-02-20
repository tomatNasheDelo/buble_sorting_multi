package bubles_w_logger;

import java.util.logging.Logger;
import java.util.Arrays;

public class BubleSort {
	
	private static Logger logger = Logger.getLogger(BubleSort.class.getName());
	
public static void main(String[] args) {
		
		int[] testData = {10, 4, 43, 5, 4, 67, 12, 0, 99, 19};
		
		System.out.println(Arrays.toString(bubleSort(testData)));
	}
	
	public static int[] bubleSort(int[] array) {
		int a = 1;
		int c = 1;
		int b = 1;
		//int d = b++;
		boolean sorted = false;
		int temp;
		while(!sorted) {
			
			 logger.info("Method will begin");
			 logger.info("iteraziya while :"+a++);
			 logger.info("sorted do zahoda na for :"+sorted);
			sorted = true;
			for(int i = 0; i < array.length -1; i++) {
				logger.info("dlina massiva "+array.length);
				 logger.info("iteraziya for:"+b++);
				logger.info("=array[i] = "+array[i]+"array[i+1] ="+array[i+1]);
				logger.info(Arrays.toString(array));
				if(array[i] > array[i+1]) {
					 logger.info("iteraziya if:"+c++);
					logger.info("array[i] :"+array[i]+">"+"array[i+1] :"+array[i+1]);
					temp = array[i];
					array[i] = array[i+1];
				    array[i+1] = temp;
					logger.info("sorted v konze "+sorted);
					sorted = false;
					logger.info("sorted posle  "+sorted);
					logger.info("arrays posle :"+Arrays.toString(array));
				}
			}
		}
		logger.info("Method will end"+" sorted :"+sorted);
		logger.info("Vsego iterazij for"+b+" iterazij while :"+a+" iterazij if :"+c);
		   return array; 
	}

}
