package ua.ithillel.oop;

import java.util.Arrays;

public class PList<ElemType> {
    private final int STEP = 8;
    private int _size = 0;
    private Object[] items = new Object[STEP];

    public ElemType get(int index){
        return (ElemType) items[index];
    }

    public void set(int index, ElemType value){
        items[index]=value;
    }

    public int size(){
        return _size;
    }

    public void add(ElemType point){
        if(_size>=items.length) {
            items = Arrays.copyOf(items, items.length + STEP);
        }
        items[_size] = point;
        _size++;
    }





}
