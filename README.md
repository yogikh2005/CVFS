CVFS -Customised Virtual File System

---
* This project provides all functionality to the user which is same as Linux File system. 

* It provides necessary commands, system calls implementations of file system through 
customised shell. 
* In this project we implement all necessary data structures of file system like Incore Inode 
Table, File Table, UAREA, User File Descriptor table. 
* Using this project we can use every system level functionality of Linux operating system on any 
other operating system platform. 
* We provide our own customised shell to interact with the customised database management 
system
---
## 📘 Project Documentation

### 1. **Project Name**

**Customised Virtual File System (CVFS)**

---

### 2. **Technology Used**

* Programming Language: **C++**
* Compiler: **G++ / Turbo C++**
* Platform API: **Standard C/C++ libraries**

---

### 3. **User Interface Used**

* **Command-Line Interface (CLI)**

---

### 4. **Platform Required**

* **Operating System:** Windows or Linux with support for GCC
* **Compiler:** GCC, Turbo C++, or any standard C/C++ compiler

---

### 5. **Hardware Requirements**

* CPU: Minimum 1 GHz
* RAM: Minimum 512 MB
* Storage: Minimum 5 MB
* I/O: Keyboard for CLI interaction

---

### 6. **Description of the Project**

The **CVFS** project emulates a simplified version of a Unix-like file system. It enables the user to create, read, write, open, close, and delete files, all within a virtual environment using user-defined data structures like inodes, superblocks, file tables, and directory listings.

---

### 7. **Data Structures Used**

* `SUPERBLOCK`: Manages total and free inodes
* `INODE`: Represents metadata for files
* `FILETABLE`: Represents open file instance
* `UFDT`: User File Descriptor Table – links files to file tables



### 8. **Flow of the Project**

1. Initialize SuperBlock & DILB
2. Input command from user (via CLI)
3. Parse command and arguments
4. Match to supported system calls
5. Execute system-like operation (create, open, read, etc.)
6. Print output and wait for next input

---

### 9. **Actual Code**

➡ The full code is included in your uploaded file: \[**cvfs.cpp**]
(Already reviewed — see below for extracted documentation headers and function-level comments.)

