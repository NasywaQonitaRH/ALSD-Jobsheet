|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020170|
| Nama |  Nasywa Qonita RH |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/NasywaQonitaRH/ALSD-Jobsheet) |

# Labs #13 DoubleLinkedLists

## 12.2.1 Experiment 1 - Actuvity 1
### Verification Experiment Result
The solution is implemented in Student.java, Node.java, DoubleLinkedLists.java and DoubleLinkedListsMain.java. 

Below is screenshot of the result.

![Image](https://github.com/user-attachments/assets/f1ccd8f1-62bd-4cfe-ae46-ec54040d6268)


## Answers to Questions
1. Difference between singly and doubly linked lists:
A singly linked list has nodes that only point to the next node, while a doubly linked list has nodes that point to both the next and previous nodes, allowing traversal in both directions.
2. Purpose of next and prev attributes in Node class:
next points to the next node in the list, while prev points to the previous node, enabling bidirectional traversal.
3. Purpose of the constructor in DoubleLinkedLists class:
It initializes head and tail to null, ensuring the list starts empty.
4. Meaning of if(isEmpty()){ head = tail = newNode; } in addFirst():
If the list is empty, the new node becomes both the head and tail.
5. Meaning of head.prev = newNode in addFirst():
It sets the previous pointer of the current head to the new node, linking them.
6. Meaning of current.next.prev = newNode in insertAfter():
It ensures the new node is correctly linked to the next node in the list.
7. Traversal process in the experiment:
Implemented in the print() method using temp = temp.next, which moves through the list.
8. Purpose of if(temp == tail){ addLast(data); } in insertAfter():
If the key is found at the tail, the new node is added at the end.
9. Purpose of if(temp.data.nim.equalsIgnoreCase(key)) in insertAfter():
It checks if the current node contains the specified key before inserting a new node.
