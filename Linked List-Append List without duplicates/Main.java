#include<stdio.h>
struct node{
int data;
struct node* next;
};
void appendNode(struct node** headRef, int data){
struct node* current = *headRef;
struct node* newNode = NULL;
newNode = malloc(sizeof(struct node));
newNode->data = data;
newNode->next = NULL;
if(current == NULL){
*headRef = newNode;
}else{
while(current->next != NULL){
current = current->next;
}
current->next = newNode;
}
}
main(){
struct node* head = NULL;
appendNode(&head,9);
appendNode(&head,4);
appendNode(&head,3);
appendNode(&head,2);
appendNode(&head,8);
  printf("The assigned roll numbers are: ");
while(head != NULL){
printf("%d ",head->data);
head = head->next;
}
  printf("\n");

}