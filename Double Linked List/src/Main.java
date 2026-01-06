public class Main{

    public static void main(String[] args){

        DoubleLinkedList link = new DoubleLinkedList( "Hey");

        link.addNext("you");
        link.addNext("there");

        while(link.hasNext()){
            System.out.println(link.getValue());
            link.next();
        }

        link.getValue();


    }

}