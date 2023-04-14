/*
    This program was written by the one and only Carter Meredith, and cannot be reproduced, or distributed 
    by any purposes. Thank you for your compliance, and please enjoy this beutifully made program.

    One more thing to note is that the objects are each put inside of a set of lines above, and below. 
 */

public class Cat {
    int weight; 
    String name;   // These three variables are the object attributes. 
    int age; 
    Boolean runs;   // This is the behaviour that will change one of the attributes. 
   
    public Cat(int weight, String name, int age, Boolean runs) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.runs = runs;
    }

    public Boolean getruns() {
        return runs;
    }
    public int getweight() {   // All of the cat objects have a weight of about 15, or 20.        
        if(runs == true) {
            weight = 15;
        } else {
            weight = 20;
        }
        return weight;
    }
    public String getname() {
        return name;
    }
    public int getage() {
        return age;
    }
    
    public String toString() {
        return("____________________________________" + "\n This cat weighs about " + getweight() + " pounds. \n Its name is " + getname() + ".\n This cat is " + getage() + " years old. \n This cat runs: " + getruns() + "\n_____________________________________ \n");
    }
    
    // "This cat runs: true" means that the cat runs regularly, and if it is false, then the cat does not run at all. 
    public static void main(String[] args) {
        Cat cat1 = new Cat(20, "Jeff", 4, true);
        Cat cat2 = new Cat(74, "Jill", 7, true);
        Cat cat3 = new Cat(15, "Joe", 3, false);

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
    }
}