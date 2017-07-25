# UoPeople-CS-1102-DF06
Polymorphism in Java example

According to Oracle Documentation, the "definition of polymorphism refers to a principle in biology in which an organism or species can have many different forms or stages. This principle can also be applied to object-oriented programming and languages like the Java language. Subclasses of a class can define their own unique behaviors and yet share some of the same functionality of the parent class" (The Java™ Tutorials).


Let's pretend what we have two classes:


Student.java

package bachelor;
/**
 *
 * @author Eugene Vereshchagin (g7skim)
 */
public class Student {
    
    void univ () {System.out.println ("Studies in the University");}
    void study (){System.out.println("Can earn a degree");}
    
}

and  Bachelor.java

package bachelor;
/**
 *
 * @author Eugene Vereshchagin (g7skim)
 */
public class Bachelor extends Student {

    @Override
    void study (){System.out.println("Can earn a degree in four years");}
    
    public static void main(String[] args) {
        Student s1 = new Bachelor ();//upcasting
        s1.univ();
        s1.study();
    }
    
}

As you can see, the Bachelor class extends the Student class and overrides its study() method. In other words, the Bachelor class is the child of the Student Parent class. Because Bachelor needs around 4 years to earn a degree, bachelor class clarifies it fact. Therefore, a student can earn a degree in general and Bachelor can earn this degree in four years (with refinement).


It can be done very simple, all we have is:

class Student{...}  // It is a student, we know nothing about his program but we know what the student studies in the University. It is our first univ() method. The second study() method defines to us what this student can earn a degree in general just because we don't know how long time the student should to study.

class Bachelor extends Student{...} // Bachelor student is a student, so he inherits the univ() method as that fact what he studies in the University. Because we know what Bachelor can earn a degree in four years we can override the study() method.

Student s1 = new Bachelor(); // What we have here is a new object s1 what have the univ() method from the parental  Student class and overridden study() method from the Bachelor.java not from the Student.java because in the Bachelor.java we already changed the output of the study() method.
The output of the Bachelor.java will:

Studies in the University
Can earn a degree in four years

This mutation of the Parent class methods known as runtime polymorphism.

You can find, download and research my example on my GitHub

