class Employee {
    int id;
    String name;
    double salary;
    Employee next;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.next = null;
    }
}

class LinkedList {
    Employee head;

    LinkedList()
    {
        this.head = null;
    }

    void append(int id, String name, double salary) {
        if (this.head == null) {
            this.head = new Employee(id, name, salary);
            this.head.next = null;
            return;
        }

        Employee newEmployee = new Employee(id, name, salary);
        newEmployee.next = null;

        Employee current; // a reference, not a new object
        current = this.head; // both current and head refers to the same object

        while(current.next != null) {
            current = current.next;
        }
        current.next = newEmployee;
    }

    void printList(){
        Employee node;
        node = this.head;
        while(node != null){
            System.out.println(node.id+" "+node.salary+" "+node.name);
            node = node.next;
        }
    }

    void deleteNode(int i){
        if( i == 0){
            head = head.next;
        }
        Employee current;
        current = this.head;
        int count = 0;
        while (count < i-2){
            current = current.next;
            count++;
        }

        current.next = current.next.next;
    }

    void deleteByName(String name){
        if(head.name == name){
            head = head.next;
            return;
        }
        Employee current;
        current = this.head;
        while (current.next.name != name ){
            current = current.next;
        }
        current.next = current.next.next;
    }

    void addNode( int id,String name,double salary,int i){
        if(i == 0){
            Employee newNode = new Employee(id,name,salary);
            newNode.next = null;
            Employee current;
            current = this.head;

            head = newNode;
            newNode.next = current;
            return;
        }
        Employee newNode = new Employee(id,name,salary);
        newNode.next = null;
        Employee temp;
        Employee current;
        current = this.head;
        int count = 0;
        while (count < i-2){
            current = current.next;
            count++;
        }
        temp = current.next;
        current.next = newNode;
        newNode.next = temp;

    }
}




public class main {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.append(10, "Tom", 5.4);
        list.append(20, "Harry", 1.4);
        list.append(30,"Jerry",3.0);
        list.append(40,"puppe",3.0);
        list.append(50,"shjk",5.0);
        //list.deleteNode(3);
        //list.deleteByName("Tom");
        list.addNode(45,"dfs",34.4,0);
        list.printList();
    }
}

