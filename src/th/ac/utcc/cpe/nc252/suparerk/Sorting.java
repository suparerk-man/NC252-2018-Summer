package th.ac.utcc.cpe.nc252.suparerk;

import java.util.Calendar;

public class Sorting {
	private int [] elements;
	private int eSize;
	
	// Constructor
	public Sorting(int size) {
		if(size > 0)
			this.elements = new int[size];
		else
			this.elements = new int[10];
		
		eSize = 0;
	}
	
	public void insert(int e) {
		this.elements[eSize] = e;
		eSize++;
	}
	
	public void show() {
		for(int i=0; i < eSize; i++) {
			System.out.print(this.elements[i] + " ");
		}
		System.out.println();
	}
	
	public void bubbleSort() {
		int out, in;
		
		for(out = eSize - 1; out > 0; out--) {
			for(in = 0; in < out; in++) {
				if(this.elements[in] > this.elements[in+1]) {
					this.swap(in, in+1);
				}
			}
		}
	}
	
	public void selectionSort() {
		
	}
	
	public void insertionSort() {
		
	}
	
	public void swap(int left, int right) {
		int temp = this.elements[left];
		this.elements[left] = this.elements[right];
		this.elements[right] = temp;
	}

	public static void main(String[] args) {
		int max = 100000;
		Sorting sortingAlgorithm = new Sorting(max);
		
		for(int i=0; i < max; i++) {
			int data = (int)(Math.random() * max);
			sortingAlgorithm.insert(data);
		}
		
		
		long before, after;
		Calendar cal0 = Calendar.getInstance();
		before = cal0.getTime().getTime();
		
		sortingAlgorithm.bubbleSort();
		Calendar cal1 = Calendar.getInstance();
		after = cal1.getTime().getTime();
		
		System.out.print("Time spent on Bubble Sort: " 
				+ (after - before));
		

	}

}
