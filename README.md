# 📚 Stack Implementation in Java

A simple **Stack Data Structure implementation in Java** using an array.

This program demonstrates the basic stack operations **Push, Pop, Peek, and Display** using a menu-driven console interface.

## 🚀 Features

- Create a stack with a user-defined size
- **Push** an element into the stack
- **Pop** the top element
- **Peek** at the top element without removing it
- **Display** all stack elements
- Handles **Stack Overflow**
- Handles **Stack Underflow**
- Menu-driven console interface

## 🧠 What is a Stack?

A **Stack** is a linear data structure that follows the:

> **LIFO (Last In, First Out)** principle

This means the element added last is the first element to be removed.

### Example

If we push:

```text
10 → 20 → 30
```

The stack looks like:

```text
TOP
 ↓
30
20
10
```

A `pop()` operation will remove **30** first.

## 🛠️ Technologies Used

- **Java**
- `Scanner` class for user input
- Arrays for stack implementation
- Object-Oriented Programming concepts

## 📂 Project Structure

```text
Stack/
│
├── stack_io.java
└── README.md
```

## ⚙️ How It Works

### 1. Push

Adds an element to the top of the stack.

```java
stack.push(value);
```

If the stack is already full:

```text
Stack Overflow!
```

### 2. Pop

Removes the element from the top of the stack.

```java
stack.pop();
```

If the stack is empty:

```text
Stack Underflow!
```

### 3. Peek

Displays the top element without removing it.

```java
stack.peek();
```

### 4. Display

Displays all elements from **TOP to BOTTOM**.

```java
stack.display();
```

## ▶️ How to Run

### Step 1: Check Java Installation

Make sure Java is installed:

```bash
java --version
```

### Step 2: Compile the Program

```bash
javac stack_io.java
```

### Step 3: Run the Program

```bash
java stack_io
```

## 💻 Sample Output

```text
Enter stack size: 5

===== STACK MENU =====
1. Push
2. Pop
3. Peek
4. Display
5. Exit

Enter your choice: 1
Enter value: 10
10 pushed into stack.

===== STACK MENU =====
1. Push
2. Pop
3. Peek
4. Display
5. Exit

Enter your choice: 1
Enter value: 20
20 pushed into stack.

===== STACK MENU =====
1. Push
2. Pop
3. Peek
4. Display
5. Exit

Enter your choice: 4
Stack elements:
20
10

===== STACK MENU =====
1. Push
2. Pop
3. Peek
4. Display
5. Exit

Enter your choice: 3
Top element: 20

===== STACK MENU =====
1. Push
2. Pop
3. Peek
4. Display
5. Exit

Enter your choice: 2
20 popped from stack.

===== STACK MENU =====
1. Push
2. Pop
3. Peek
4. Display
5. Exit

Enter your choice: 5
Exiting program...
```

## ⏱️ Time Complexity

| Operation | Time Complexity |
|---|---|
| Push | `O(1)` |
| Pop | `O(1)` |
| Peek | `O(1)` |
| Display | `O(n)` |

## 📌 Stack Conditions

### Stack Overflow

Occurs when trying to push an element into a **full stack**.

```text
Stack Overflow!
```

### Stack Underflow

Occurs when trying to pop an element from an **empty stack**.

```text
Stack Underflow!
```

## 🎯 Learning Objectives

This project helps understand:

- Stack data structure
- LIFO principle
- Arrays
- Classes and objects
- Constructors
- Encapsulation using `private`
- Methods in Java
- Conditional statements
- Loops
- Switch-case
- User input using `Scanner`
- Basic error handling for stack operations

## 👨‍💻 Author

**Raj**

A simple Java implementation created for learning and practicing **Data Structures and Java programming**.
