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