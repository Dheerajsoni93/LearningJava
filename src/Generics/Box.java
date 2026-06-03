package Generics;

public class Box<T> {
    T item;

    public void setItems(T item){
        this.item = item;
    }

    public T getItems(){
        return this.item;
    }
}
