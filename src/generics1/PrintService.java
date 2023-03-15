package generics1;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

List<T> list = new ArrayList<T>();

public void addValue(T value){
    this.list.add(value);
}

public T first(){

    if(list.isEmpty()){
        throw new IllegalStateException("List is empty!");
    }
    return this.list.get(0);
}

public void print(){
    System.out.println(this.list);
}
}
