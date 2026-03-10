class Tqueue {
    int data;
    Tqueue link;
}

class Queue {

    Tqueue head;

    void enqueue(int value) {
        Tqueue newNode = new Tqueue();
        newNode.data = value;
        newNode.link = null;

        if (head == null) {
            head = newNode;
        } else {
            Tqueue temp = head;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = newNode;
        }
    }

    void dequeue() {
        if (!isEmpty()) {
            head = head.link;
        } else {
            System.out.println("Queue is empty");
        }
    }

    int peek() {
        if (!isEmpty()) {
            return head.data;
        }
        return -1;
    }

    boolean isEmpty() {
        return head == null;
    }

    boolean contains(int target) {
        Tqueue temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return true;
            }
            temp = temp.link;
        }
        return false;
    }

    public static void main(String[] args) {

        Queue ob = new Queue();

        ob.enqueue(10);
        ob.enqueue(20);
        ob.enqueue(30);
        ob.enqueue(40);

        ob.dequeue(); // removes 10
        ob.dequeue(); // removes 20

        System.out.println("Front element: " + ob.peek());
        System.out.println("Contains 10? " + ob.contains(10));
        System.out.println("Is Empty? " + ob.isEmpty());
    }
}