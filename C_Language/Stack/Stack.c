#include <stdio.h>

#define SIZE 5

int stack[SIZE];
int top = -1;

void push(int value){
    if(top == SIZE -1){
        printf("Stack overflow\n");
    } else {
        top++;
        stack[top]= value;
        printf("%d inserted\n", value);
    }
}

void pop(){
    if(top == -1){
        printf("Stack underflow\n");
    } else {
        printf("%d deleted\n", stack[top]);
        top--;
    }
}
int main(){
    push(10);
    push(20);
    push(30);

    pop();
}