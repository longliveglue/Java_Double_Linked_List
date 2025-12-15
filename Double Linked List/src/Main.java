public class Main{

    public static void main(String[] args){

        DoubleLinkedList listy = new DoubleLinkedList(1);

        listy.addNext(2);
        listy.addNext(3);
        listy.addNext(4);

        System.out.println(listy.getValue());
        listy.next();
        System.out.println(listy.getValue());
        listy.next();
        System.out.println(listy.getValue());
        listy.next();
        System.out.println(listy.getValue());
        listy.next();
        System.out.println(listy.getValue());
        listy.next();
        System.out.println(listy.getValue());



    }

}