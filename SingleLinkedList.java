class Snode{
    int data;
    Snode link;
}

public class SingleLinkedList {
    Snode head;
    int length;
    void addFirst(int value){
        Snode newNode = new Snode();
        newNode.data = value;
        if(head == null){
            head = newNode;
        }
        else{
            newNode.link = head;
            head = newNode;
        }
    }
    void addLast(int value){

        Snode newNode = new Snode();
        newNode.data = value;
        Snode temp = head;
        while(temp.link!=null){
            temp = temp.link;

        }
        temp.link = newNode;

     }
    // void addpos(int pos,int value){
    //     Snode newNode = new Snode();
    //     newNode.data = value;
    //     if(pos<0 || pos>len()){
    //         System.out.println("Invalid postion");
    //         return;
    //     }
    //     if(pos==0) addFirst(value);
    //     else{
    //         Snode temp = head;
    //         while(pos>1){
    //             temp = temp.link;
    //             pos--;
    //         }
    //         newNode.link = temp.link;
    //         temp.link = newNode;
    //     }
    // }
    int len(){
        Snode temp = head;
        length = 0;
        while(temp!=null){
            length++;
            temp = temp.link;
        }
        return length;
    }
    void deleteFirst() {

			head=head.link;

		}
    void deleteLast(){
        Snode temp = head;
        if(len()==1) deleteFirst();
        while(temp.link.link!=null){
            temp=temp.link;
        }
        temp.link=null;
    }
    // void update(int target,int value){
    //     Snode temp = head;
    //     while(temp!=null){
    //         if(temp.data==target){
    //             temp.data = value;

    //         }
    //         temp = temp.link;

    //     }
    // }
    // void deletePos(int pos){
    //     if(pos<0 || pos>=len()){
    //         System.out.println("invalid");
    //         return;
    //     }
    //     if(pos==0) deleteFirst();
    //     else{
    //         Snode temp = head;
    //         while(pos>1){
    //             temp=temp.link;
    //             pos--;
    //         }
    //         temp.link=temp.link.link;
    //     }

    // }

    void display(){
        Snode temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.link;
        }
    }

    

public static void main(String[] args){
    SingleLinkedList sl = new SingleLinkedList();
    sl.addFirst(10);
    sl.addFirst(20);
    sl.addFirst(30);
    // sl.addpos(1,5);
    // sl.addLast(25);
    // sl.addLast(50);

    sl.display();
    sl.deleteFirst();
    sl.deleteLast();
    // sl.deletePos(3);
    // sl.update(5 ,15 );

    System.out.println("len = "+sl.len());
}
}

