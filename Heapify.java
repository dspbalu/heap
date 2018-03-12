import java.util.*;
public class Heapify {
// 16 14 10 8 7 9 3 2 4 1

    public static int[] Arr = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
	public static ArrayList<Integer> arr=new ArrayList<Integer>();
   
	public static void extractMax(){
	if(arr.size()!=0)
	System.out.println(arr.get(0));
	else
	System.out.println("heap is empty");
	}
	
	public static int parent(int i){
		return (i - 1)/ 2;
	}	

	public static void extractMin(){
	if(arr.size()!=0){
	int min=arr.get(arr.size()/2);
	for(int i=(arr.size()/2)+1;i<arr.size();i++){
	int compare=arr.get(i);
	if(min>compare)
	min=compare;
	}
	System.out.println(min);
	}
	else
	System.out.println("heap is empty");
	}

	public static void makeheap(){
        for(int i=arr.size()/2;i>=0;i--)
	heapMax(i);
	}
	
	public static void printheap(){
	for(int i:arr)
		System.out.println(i);
	}
	
	public static void deleteEle(int a){
	if(arr.contains(a))
	arr.remove(new Integer(a));
	makeheap();
	}

	public static void insert(int x){
	arr.add(x);
	}
	
	public static void heapMax(int i) {
        int largest;
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        if (((left < arr.size()) && (arr.get(left) > arr.get(i)) )) {
            largest = left;
        } else {
            largest = i;
        }

        if (((right < arr.size()) && (arr.get(right) > arr.get(largest)))) {
            largest = right;
        }
        if (largest != i) {
            swap(i, largest);
            heapMax(largest);
        }
    }

    public static void swap(int i, int largest) {
        int t = arr.get(i);
        arr.set(i,arr.get(largest));
        arr.set(largest,t);
    }
	public static void main(String[] args) {
        int kk;
	insert(4);
	insert(1);
	insert(3);
	insert(2);
	insert(16);
	insert(9);
	insert(10);
	insert(14);
	insert(8);
	insert(7);
	insert(-7);
	insert(0);
	insert(20);
	makeheap();
	printheap();
	deleteEle(10);
	System.out.println();
	printheap();
	System.out.println();
	System.out.println();
	extractMax();
	extractMin();
        }
	
}