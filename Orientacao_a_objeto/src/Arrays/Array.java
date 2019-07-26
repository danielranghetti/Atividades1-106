package Arrays;

import java.util.Arrays;
import java.util.Random;


public class Array {

	static Random gerar = new Random();
	
	public static void ImprimeArray(int[] array) {
		for(int i = 0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		}
	
	public static void PreencheArray(int[] array) {
		for(int i = 0;i<array.length;i++) {
			array[i] = gerar.nextInt();
		}
		}
	
	
	public static void main(String[] args) {
		
		int maior = 254810;
		double media = 0;
		int[] num =  new int[20];
		
		PreencheArray(num);
		Arrays.sort(num);
		ImprimeArray(num);
		
		for(int i = 0;i<num.length;i++) {
			media += num[i];
		}
		media /= num.length;
		System.out.println("A media �: "+ media + "\n");
		
		
		for(int i = 0;i<num.length;i++) {
			if(maior<num[i]) {
				maior = num[i];
			}
		}
		System.out.println("O maior numero �: "+maior+"\n");
		
	}

}
