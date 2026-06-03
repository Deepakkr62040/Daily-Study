#include <stdio.h>

#define SIZE 5

int queue[SIZE];
int front = -1;
int rear = -1;

void enqueue(int value){
    if(rear == SIZE -1){
        printf("Queue overflow\n");
    } else {
        if(front = -1){
            front = 0;
        }
        rear++;
        queue[rear] = value;
        printf("%d inserted\n", value);
    }
}

void dequeue(){
    if(rear == -1 || front > rear){
        printf("Queue underflow\n");
    } else {
        printf("%d deleted\n", queue[front]);
        front++;
    }
}

void display(){
    int i;
    if(front == -1 || front > rear){
        printf("Queue is empty\n");
    } else {
        for(i = front; i <= rear; i++){
            printf("%d\n", queue[front]);
        }
    }
}

int main(){
    enqueue(10);
    enqueue(20);
    enqueue(30);
    display();
    dequeue();

    display();
}