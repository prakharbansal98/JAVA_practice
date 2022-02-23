package LinkedLists;

public class Stack_Using_LinkList {

    LinkLists ll = new LinkLists();

    public void push(Integer i){
        ll.insertAtTail(i);
    }

    public Integer pop(){
     return ll.removeAtTail();
    }

    public void print(){
        ll.print();
    }

    public static void main(String[] args) {

        Stack_Using_LinkList sul= new Stack_Using_LinkList();
        sul.push(1);
        sul.push(2);
        sul.push(3);
        sul.push(4);
        sul.push(5);

        sul.print();

       for(int i=0; i<6; i++) {
           sul.pop();
           sul.print();
       }
    }
}
