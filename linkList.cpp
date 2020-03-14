#include <bits/stdc++.h>
using namespace std;
#include <string>

struct Employee{
  string name;
  int id;
  double salary;
  struct Employee* next;
};

struct Employee* head = NULL;

void append(string name, int id, double salary){
    struct Employee* newEmployee = new Employee();

    newEmployee->name = name;
    newEmployee->id = id;
    newEmployee->salary = salary;
    newEmployee->next = NULL;

    if(head == NULL){
        head = newEmployee;
        return;
    }

    struct Employee* current = head;
    while(current->next != NULL){
        current=current->next;
    }
    current->next = newEmployee;
}

void printList(){
  	Employee* node = head;
  	cout<<"________LIST_________"<<endl;
    while(node !=NULL){
        cout << node->id << " " << node->name << " " << node->salary << endl;
        node = node->next;
    }
  	cout<<"_____________________"<<endl;
}

void deleteNode(int i){
  	if (i == 0)
    {
      	head = head->next;
      	return;
    }

    int count = 0;
    Employee* current = head;

    while(count < i-1){
        current = current->next;
        count++;
    }

  	Employee* nextNode = current->next;
  	Employee* nextnextNode = nextNode->next;
  	current->next = nextnextNode;
}
void deleteByName(string name){
  	if (name == head->name)
    {
      head = head->next;
      return;
    }

    Employee* current = head;
    while(1){
        if(name == current->next->name){
            break;
        }
        current = current->next;
    }
    Employee* nextNode = current->next;
    Employee* nextNextNode = nextNode->next;
    current->next = nextNextNode;
}
void addEmployee(int id, string name, double salary, int i){
    int count = 0;
    Employee* current = head;
    Employee* node = new Employee();
    node->id = id;
    node->name = name;
    node->salary = salary;

  	if (i == 0)
    {
      	node->next = head;
      	head = node;
      	return;
    }

    while(count < i-2){
    current = current->next;
    count++;
    }
    Employee* temp = current->next;
    current->next = node;
    node->next = temp;

}
int main(){
   append("AAA",1,11000);
   append("ABA",2,1999);
   append("AAB",3,11998);
   append("AAC",4,118679);
   append("ADD",5,115676);
   //deleteNode(3);
   //deleteByName("AAB");
   addEmployee(7,"Sinthy",1000,3);
   printList();
}

