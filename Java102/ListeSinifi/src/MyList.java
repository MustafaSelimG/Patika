import java.util.Arrays;

public class MyList<T> {
    private int length=10;
    public int size=0;

    private int[] array;

    public void MyList() {
        array = new int[getLength()];
        for (int i = 0; i < array.length; i++) {
            array[i]=0;
        }
    }

    public void MyList(int capacity) {
        array = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            array[i]=0;
        }
    }

    public void add(int data){
        int temp=getSize();
        array[temp] = data;
        temp++;
        setSize(temp);
        if (getLength() < temp+4){
            setArray(increaseSize(array));
            setLength(length*2);
        }
    }

    public int get(int index){
        if (array[index]!=0){
            int temp = (int) array[index];
            return temp;
        }
        else {
            return 0;
        }
    }

    public static int[] increaseSize(int[] array){
        int[] newArray = new int[array.length*2];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i]=0;
        }
        for(int i = 0; i < array.length; i++)
        {
            newArray[i] = array[i];
        }

        return newArray;
    }


    public void remove(int index){
        array[index]=0;
        for (int i = index; i < array.length; i++) {
            array[index]=array[index+1];
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public Object set(int index, int data){
        if(array.length>index){
            array[index]= data;
            return true;
        }
        else {
            return null;
        }
    }

    public int getSize(){
        return this.size;
    }

    public int getCapacity(){
        return array.length;
    }


    public String toString(){
        return Arrays.toString(array);
    }

    public int[] getArray() {
        return array;
    }

    public int indexOf(int data){
        int index=-1;
        for (int i = array.length-1; i >= 0; i--) {
            if (array[i]==data) {
                index=i;
            }
        }
        return index;
    }

    public int lastIndexOf(int data){
        int index=-1;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==data) {
                index=i;
            }
        }
        return index;
    }

    public boolean isEmpty(){
        if (getSize()!=0){
            return false;
        }
        else {
            return true;
        }
    }

    public void clear(){
        for (int i = 0; i < array.length; i++) {
            array[i]=0;
        }
        setSize(0);
    }

    public int[] toArray(){
        int[] arr = new int[getCapacity()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=array[i];
        }
        return arr;
    }

    public int[] sublist(int start, int finish){
        int[] subList = new int[finish-start+1];
        int index=0;
        for (int i = start; i <= finish; i++) {
            subList[index]=array[i];
            index++;
        }
        return subList;
    }

    public boolean contains(int number){
        boolean isContains=false;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==number){
                isContains=true;
            }
        }
        return isContains;
    }





}
