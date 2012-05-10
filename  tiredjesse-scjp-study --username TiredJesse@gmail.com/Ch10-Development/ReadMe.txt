Ch10 - Development

1. Introduction
To compile a class:
javac [filename].java

To run a compiled class
java [filename]


2. Dealing with directories
To compile classes and move the .class file to a different folder
javac -d [foldername] [filename].java

The folder must exist ahead of time or else javac will throw an error.

If the java file is enclosed within a directory structure
And has a package statement, -d ../[foldername] will copy that structure.
// This doesn't seem to work with windows cmd prompt

IE: 
package company.scjp; // in MainClass2.java

com.company.scjp.MainClass2.java
javac -d classes com/company/scjp/MainClass2.java

Compiled class will be listed as:
/classes/company/scjp/MainClass2.class


3. Command line properties
To set a new property use the following syntax: // note -D and [propertyName] has no whitespace in between them
java -D[propertyName]=[propertyValue] [filename]

In TestProps.java, the code is the following:
import java.util.*;

public class TestProps {
  public static void main(String[] args) {
    String property;
    Properties p = System.getProperties();
    p.setProperty("myProp", "myValue"); // adds property myProp with value of myValue
    p.list(System.out);
    property = p.getProperty("newProp", "newValue"); // adds property newProp with value of newValue only if newProp has a null as its' value
    System.out.printf("The prorperty of newProp is: %s\n", property);
  }

}

When this is done:
java TestProps
RESULT: 
myProp = myValue
newProp = newValue

java -DmyPersonalProp=myPersonalValue TestProps
Adds a property named myPersonalProp with value myPersonalValue
RESULT: 
myProp = myValue
newProp = newValue
myPersonalProp = myPersonalValue

When this is done:
java -DmyProp=newValue TestProps
Adds a property named myProp with value newValue, but then the value becomes "myValue" due to p.setProperty("myProp", "myValue");
RESULT: 
myProp = myValue
newProp = newValue

When this is done:
java -DnewProp=abc123 TestProps
Adds a property named newProp with value newValue
RESULT: 
myProp = myValue
newProp = abc123


4. Command line arguments
Arguments can be entered after declaring the filename shown by the following:
java [filename] arg0 arg1 arg2...

These String arguments are inserted into an array in the main parameter
public static void main(String[] args) or (String... args) or (String[] anyNameYouWant)


5. Classpath
Most of the time, classes require other classes to function, this is where -classpath/-cp comes in handy.
javac -classpath [path] [filename].class
java -classpath [path] [filename].class

IE:
TestClass is dependent on FolderClass which is located within another folder

// In folder: Ch10-Development
public class TestClass extends FolderClass {
  public static void main(String[] args) {
    System.out.printf("This class using %s\n", message);
  }
}

// In folder: Ch10-Development\folderOne
public class FolderClass{
  protected static final String message = "Folder One";
}

In order to run and compile, enter the following:
javac -classpath folderOne TestClass.java
java -classpath folderOne;. TestClass \\ . denotes the local directory which is needed to find TestClass.class

To search multiple folders use the : (UNIX) ; (WINDOWS).
Also to traverse through directories in Unix forward slash is used '/' while in Windows backslash is used '\'
The -classpath option reads from left to right

javac -classpath folderOne;folderTwo TestClass.java // Look for FolderClass in folderOne, then look for FolderClass in folderTwo
javac -classpath folderTwo;folderone TestClass.java // Look for FolderClass in folderTwo, then look for FolderClass in folderOne


6. Relative and Absolute Path
Relative Path is denoted without the slash in the front. Relative Path is dependent on where the current directory is.
Absolute Path is denoted with the slash in the front. Absolute Path is independent of the current directory.

/ (root)
     |
     |--dirA
          |
          |-- dirB
                |
                |--dirC

-cp dirB:dirB/dirC

If current directory is at:
/, will find nothing
dirA, will find dirB and dirC
dirB, will find nothing
dirC, will find nothing


-cp /dirB:/dirA/dirB/dirC

If current directory is at:
/, dirB and dirC
dirA, dirB and dirC
dirB, dirB and dirC
dirC, dirB and dirC


7. Using jar files
// NOT ON TEST
Convert a folder to a jar. The directory structure will be preserved
jar -cf [jarname].jar [foldername]

Look in contents of a jar file.
jar -tf [jarname].jar
// NOT ON TEST

Use a jar file just like any other folder, except add the .jar extension at the end
javac -cp [jarname].jar [filename]
java -cp [jarname].jar;. [filename] // . to look for the [filename].class


8. Additional Options
-ea or -enableassertions: enables assertions within the program. Can specify certain packages and classes
-da or -disableassertions: on by default
-source [VERSION]: compile java file according to VERSION

9. Important changes among Java versions
1.3: Can use assert as an identifier, will show as warnings when compiled.
1.4: Cannot use assert as an identifier. 'assert' is now a keyword
1.5: Introduction of Autoboxing and Generics, as well as other classes such as StringBuilder
1.6: Introduction of Console class. TreeSet and TreeMap also implemented differently with navigable methods
