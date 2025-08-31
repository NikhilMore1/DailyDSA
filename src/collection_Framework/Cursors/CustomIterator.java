package collection_Framework.Cursors;
interface Iterator<E>{
    public boolean hasNext();
    public E next();
    public void remove();
}
public class CustomIterator<E>{
    private E[] arr;
    int size = 0;
    private final int Default = 10;
    CustomIterator(){
        this.arr = (E[]) new Object[Default];
    }
    public MyIterator<E> iterator(){
        return new MyIterator<>();
    }
    class MyIterator<E> implements Iterator<E>{
        private int pointer = 0;
        @Override
        public boolean hasNext() {
            if (pointer<size){
                return true;
            }
            return false;
        }

        @Override
        public E next() {
            if (!hasNext()){
                throw new MyException("NoSuchElementException");
            }
            return (E) arr[pointer++];
        }

        @Override
        public void remove() {

        }
    }

    @Override
    public String toString(){
        if(size == 0){
            return "[]";
        }
        String data = "[ ";
        String data1 = "";
        for (int i = 0;i<size-1;i++){
            data = data+arr[i]+" ,";
        }
        data = data+arr[size-1];
        return data+" ]";
    }

    public void add(E data){
        if (isFull()){
            resize();
        }
        arr[size++] = data;
    }
    public boolean isFull(){
        if (size >= arr.length){
            return true;
        }
        return false;
    }
    public void resize(){
        E[] temp = (E[]) new Object[(int)(arr.length*1.5)];
        for (int i = 0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public static void main(String[] args) {
        CustomIterator<Integer> arr = new CustomIterator<>();
        arr.add(100);
        arr.add(200);
        arr.add(300);
        arr.add(400);
        CustomIterator.MyIterator iterator = arr.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
