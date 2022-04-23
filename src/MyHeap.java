public class MyHeap<T extends Comparable<T>> {
    private MyArrayList<T> list;
    public MyHeap(){
        list=new MyArrayList<>();
    }
    private void heapify(int index){
        int k=index;
        int lift=leftChildOf(k);
        while (lift<list.size()){
            int max=lift, r=lift+1;
            if(r< list.size()){
                if(list.get(r).compareTo(list.get(lift))>0){
                    max++;
                }
            }
            if(list.get(k).compareTo(list.get(max))<0){
                swap(k,max);
                k=max;
                lift=leftChildOf(k);
            }else break;
        }
    }

    private int leftChildOf(int index){return 2*index+1;}

    private void swap(int index1,int index2){
        list.swap(index1,index2);
    }
}