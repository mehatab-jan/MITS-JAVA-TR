class Tstack{

	int data;

	Tstack Link;

}

class StackDSA {

	Tstack head;




		void push(int value) {

			Tstack newNode = new Tstack();

			newNode.data=value;

			if(head==null) {

				head=newNode;

			}else {

				newNode.Link=head;

				head=newNode;

			}

		}




		void pop() {

			if(!isEmpty())

			head=head.Link;

			else {

				System.out.println("Stack empty");

			}

		}

		int peek() {

			if(!isEmpty()) {

				return head.data;

			}

			return -1;

		}

		boolean isEmpty() {

			return head==null;

		}

	public static void main(String[] args) {

		StackDSA ob = new StackDSA() ;

		ob.push(10);

		ob.push(20);

		ob.push(30);

		ob.push(40);

		ob.pop();

		System.out.println(ob.peek());

		System.out.println(ob.isEmpty());

	}

}