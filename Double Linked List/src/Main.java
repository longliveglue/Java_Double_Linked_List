public class Main{

    public static void main(String[] args){

        DoubleLinkedList link = new DoubleLinkedList( "Hey");

        link.addNext("you");
        link.addNext("there");
        link.addNext("what");


        System.out.println(link.getValue());
        while(link.hasNext()){
            link.next();
            System.out.println(link.getValue());
        }

        System.out.println();

        System.out.println(link.getValue());
        while(link.hasPrevious()){
            link.previous();
            System.out.println(link.getValue());
        }




    }

}