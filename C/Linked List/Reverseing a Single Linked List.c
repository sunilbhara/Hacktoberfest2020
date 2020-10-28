//Program to create and reverse a linked list


#include <malloc.h>
#include <stdio.h>
#include <stdlib.h>

//Structure of the linked list
struct node{
	int data;
	struct node *next;
}*head=NULL,*ptr;

void display(struct node *head);
struct node *reverse(struct node *head);

int main(){
	int num;
	char option;
	struct node *new_node;
	printf("Creating the linked list...");
	while(option!='N'){
		printf("\nEnter the number to be entered in the linked list: ");
		scanf("%d",&num);
		new_node=(struct node*)malloc(sizeof(struct node));
		if(new_node==NULL)
		{
			printf("Unable to allocate free memory space");
			exit(0);
		}
		new_node->data=num;
		if(head==NULL){
			new_node->next=NULL;
			head=new_node;
		}
		else{
			ptr=head;
			while(ptr->next!=NULL)
				ptr=ptr->next;
			ptr->next=new_node;
			new_node->next=NULL;		
		}
		printf("Do you want to add more data?(Y/N): ");
		scanf(" %c",&option);
	}
	printf("\nLinked list before reversing: ");
	display(head);
	printf("\n*** Reversing the linked list now ***\n");
	head=reverse(head);	
	printf("\nLinked List after reversal is: ");
	display(head);
}

//Display function for the linked list
void display(struct node *head){
	struct node *ptr;
	ptr=head;
	while(ptr!=NULL)
	{
		printf("%d -> ",ptr->data);
		ptr=ptr->next;
	}
	printf("NULL\n");
}

//Reversing the linked list
struct node *reverse(struct node *head){
	struct node *prev=NULL,*current=head,*next=NULL;
	while(current!=NULL){
		next=current->next;
		current->next=prev;
		prev=current;
		current=next;
	}
	head=prev;
	return(head);

}
















