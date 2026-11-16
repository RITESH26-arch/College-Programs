#include <iostream>
using namespace std;

struct Node{
    int data;
    Node* next;

    Node(int value){ // constructor same as java 
        data = value;
        next = NULL;
    }
};


class SinglyLinkedList{

    Node* head;

    public:
    SinglyLinkedList(){
        head = NULL;
    };

    void insertAtBeginning(int value){
        Node* newNode = new Node(value); // creates a new Node
        newNode -> next = head; // newnode's next points to the old First node
        head = newNode; // now the newNode is the new head  
    }

    void insertAtEnd(int value){
        Node* newNode = new Node(value);

        if(head == NULL){ // a special case if the list is empty directly assign head as the newNode
            head = newNode;
        }
        Node* temp = head; // a walking pointer
        while(temp -> next != NULL){
            temp = temp -> next; 
        }
        temp -> next = newNode; // attach the new node at the end of the list
   }



};

int main(){
    SinglyLinkedList list;

    list.insertAtBeginning(10);
    return 0;

}


