**NOTE!**
*Check out [HelloWorld](HelloWorld.java) for reference* 

### `package basics;`
## PACKAGE
> a.k.a., Package Declaration
- Folders are called `Packages`. Like, subfolders inside a folder, say `src/` are called packages and so inside src/ we create multiple packages and then to assign new files in those `Packages` by writing:
```java
package package-name;
```
---
### `public class HelloWorld {`
## 1. class
> A class is like a blueprint.

Java programes are built using classes. The JVM cannot run code outside of a class.
## 2. HelloWorld
> CLass name

Entry class for this program. The public class must have the same class name as the file name.
## 3. public
> Access modifier.

This makes the file accessible from anywhere. `public` is required if the class contains `main()` and if we want the JVM to access it.

**IF the class is `public`, then it's class name shoudl be the same as the file name.**

---

### `public static void main(String[] args) {`
## 1. public
> Access modifier

Controls visibility (who can call the method).

## 2. static
> Non-access modifier

When we write `static`, it makes it so that the JVM starts execution without creating an object.

## 3. void
> Return Type

`void` means that there is no return (data) type. Or that there is no value to return to the JVM.

## 4. main
> Method name.

`main()` marks the entry point of the program.

## 5. String[] args
> Command-line arguements

Allows passing data to the program when it starts.

Example:
```bash
java HelloWorld hello 123
```
Then:
```java
args[0] = "hello"
args[1] = "123"
```
---
### `System.out.println("Hello World!");`
| Component | Part of Speech | What it represents |
|:---------:|:--------------:|:------------------:|
|`System`|Class| "A built-in class that provides access to "system-standard" resources (like keyboard input or console output)."|
|`out`|Member/Field|"A static field within the System class. It represents the ""standard output stream"" (your console/terminal)."|
|`println`|Method|"Short for ""print line."" It’s the actual command that tells the computer to display text and then move the cursor to a new line."|
|`"Hello World!"`|Argument|A String literal. This is the specific data you are passing into the method to be printed.|