public class Main{

    public static void main(String[] args){

        DoubleLinkedList listy = new DoubleLinkedList(1);

        listy.addNext(2);

        System.out.println(listy.getValue());

        listy.next();

        System.out.println(listy.getValue());

        listy.addNext(3);
        listy.addNext(4);


        listy.next();

        System.out.println(listy.getValue());

        listy.next();
        System.out.println(listy.getValue());

        listy.previous();

        System.out.println(listy.getValue());

    }

}