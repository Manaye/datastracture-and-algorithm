## Singly Linked List

Linkedlist class and node In Java, LinkedList class implements the list interface.
The LinkedList class also consists of various constructors and methods

## Challenge

* create a node and LinkedList class
* define a method called insert which takes  any value as an argument and add a new node with that value to the head
 * define a method called include which takes  any value as an argument returns boolean  result
* define a method called print  which takes no arguments and outputs all of the current Node values in the linked list



## Approach & Efficiency

The includes and print methods iterate over the nodes while the last node next is not pointing to null.
Includes uses if statement to check if the value exists or not and return a boolean.
Big O of include is O(n) time and space O(1) , insert O(1) time and O(1) space and print O (n) time and O(1)space.

## API
 1. insert
 1. include
 1. print