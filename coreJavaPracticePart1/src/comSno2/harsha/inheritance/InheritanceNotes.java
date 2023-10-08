package comSno2.harsha.inheritance;

public class InheritanceNotes {
	/*
	 * 1. What is Inheritance?
	 * Ans. Inheritance is a mechanism in which one class acquires all the properties and behaviors of another class with the specific relationship.
	 * 			Variable + Method = Code
	 * 			-> code reuseability
	 * 
	 * 2. Type Of Inheritance?
	 * Ans: Only One -> accepting Multiple thing is called Multiple Inheritance [with Interface]
	 * 		One by One -> accepting the Thing is called Multi level Inheritance [with classes]
	 * 
	 * **********************************************************************************
	 * Single Level Inheritance
	 * ========================
	 * EX: Class B extend A // here only one child inherits one parent
	 * 
	 * Multi Level Inheritance
	 * ======================= 
	 * EX: Class B extends A //Here One By One inherits
	 * 	   Class c extends B
	 * **********************************************************************************
	 * Multiple Inheritance ->[More Then One Super class]
	 * ==================================================
	 * ->When one class inherits Multiple classes is Known as Multiple Inheritance 
	 * EX: Class c extends A,B // here 1 child inherits 2 parent
	 * ->Only By interface can Achieve.
	 * 	 By class can't Achieve
	 * 
	 * HierarchicalInheritance ->[More then One SubClass]
	 * ==================================================
	 * EX: Class B extends A //here 2 child's inherits from 1 parent
	 * 	   Class C extends A	 
	 * 
	 * 
	 * **********************************************************************************
	 * Hybrid Inheritance [Hybrid = Hierarchical + Multiple]
	 * =====================================================
	 * EX: 
	 *  	Class B extends A //here 2 child's inherits from 1 parent
	 * 	    Class c extends A
	 * 
	 * 		Class D extends B,C // here 1 child inherits 2 parent
	 * 
	 * 		->Multiple and hybrid inheritance is supported through interface Only
	 * 
	 * 
	 * 3. Implementation Of Inheritance with classes?
	 * Ans: 
	 * 4. Implementation Of Inheritance with Interface?
	 * Ans:
	 * 5. Super Keyword?
	 * Ans: ->Super keyword represents the parent instance of a class
	 * 		->It is used to invoke a constructor of the parent class
	 * 		->It is used to invoke a method of the parent class
	 * Super has two general forms
	 * ->first calls the Super class constructor
	 * ->Second is used to access a member of superClass.
	 * that has been hidden by a member of a subclass
	 * 
	 * Call a constructor -> Super(arg-List);
	 * Super() must always be the first statement executed inside a Sub class constructor
	 * 
	 * 
	 * RealTimeApplicationLogin
	 * ========================
	 * 
	 * user access login
	 * 1> Normal user or guest user
	 * 2> Developer User
	 * 3> Administrator User
	 * 4> Master User
	 * 5> Owner User
	 * 
	 * How to create different type's of User
	 * EX:
	 * 1.Guest User        -> Only Read or View & no write operation
	 * 2.Developer User    -> View, Read & at the Same time write
	 * 3.Administrator User-> data view, read,at the same time entire page deletion
	 * 
	 * let create a class
	 * 
	 * class Admin
	 * class Developer
	 * class Guest
	 * 
	 * Let take an Example Amazon
	 * -> What we login Amazon is normal User's
	 * -> Can we change product information, as a normal user's?
	 * Ans: No Only Read or View
	 * -> If developer product info can change because read & write access
	 * -> If Administrator they can change complete application can delete, can they keep new product's
	 * 
	 * 
	 * Let Imagine the application implementation
	 * ********************************************
	 * 
	 * Inside Guest User
	 * ---> Only read method
	 * Inside Developer User
	 * ---> Read & Write method
	 * Inside Admin User
	 * ---> Read & write & manage Method
	 * 				--> Adding or deleting the product/Application
	 * 
	 * Observe closely [No improvement]
	 * 
	 *  What is disadvantage 
	 *  
	 *  1. Inside guest read code 
	 *   	--> Same repeated code in Admin, Developer
	 *   here read code is duplicated (code copy & pasted)
	 *   
	 *   If thousand lines Of code you keep it like these
	 *   
	 *  2. Inside Developer code
	 *  	--> Write access code
	 *  	--> Same repeated code in Admin is duplicated
	 *  
	 *  If I want to small change's in read or write code
	 *  --> new change like html component or any thing
	 *  --> All the place's were replace the new change's 
	 *  --> Every time it's a confusion job
	 *  --> Inorder to avoid Confusion for changes in all the places were read & write code
	 *  
	 *  Best idea is changes at one place & keep the code at one place.
	 *  these one we have to use it as reusability
	 *  
	 *  But Here
	 *  We duplicating the code 
	 *  --> So code performance is decreased & code readability & maintainability decreased.
	 *  
	 *  If i want to change the code, How many place's I want to update
	 *  If you placed code at one place & reuse the same code
	 *  then it increase the readability,maintainability & performance will increase.
	 *  then we use inheritance concept
	 */
	  
	/*  Let Imagine
	 *  Which one as to create
	 *  -> parent 
	 *  -> child
	 *  
	 *  --> Guest code use in developer
	 *  child is accessing from parent
	 *  parent can't access child so using 
	 *  -> read method I want to place in developer
	 *  
	 *  It mean
	 *  
	 *  Guest code in developer parent in child
	 *  
	 *  not accessing 
	 *  developer code in Guest --> child in parent
	 *  
	 *   so 
	 *   Guest is parent
	 *   developer is child
	 *   
	 *   class Developer extends Guest
	 *   
	 *   By this
	 *   
	 *   Super & Sub class implementation
	 *   
	 *   Using extends keyword parent code in child
	 *   
	 *   Developer extends Guest
	 *   Admin extends Developer
	 *   
	 *   Then create a new class User class with main method
	 *   
	 *   1. Create Object for Guest Inside guest only one method is read
	 *   --> Guest properties & behaviors to developer
	 *   --> developer is parent to admin
	 *   2. Create Object for developer 
	 *   --> You get a read & write methods.
	 *   3. create Object for Admin
	 *   --> You get a read & write & manage method
	 *   
	 *   Let see Only we have Only 3 method's
	 *   Inside Guest 1 Method
	 *   Inside Developer 1 Method
	 *   Inside Admin 1 Method
	 *   
	 *   If i want to modify or update the read method to s.o.pl("Read code updated")
	 *   I get the same code in all the method
	 *   No need to change every where 
	 *   --> Here we implemented the code reusability
	 *   before extends -> child
	 *   After extends -> parent
	 *   
	 *   Only multi level in class
	 *   Only Multiple in Interface
	 *   
	 *   Dummy Example for Inheritance
	 *   *****************************
	 *   ->Market SIM
	 *   		->2G SIM -> calling, SMS
	 *   		->3G SIM -> calling, SMS, GPRS (INTERNET)
	 *   		->4G SIM -> calling, SMS, GPRS, VOTLE, H+
	 *   		->5G SIM -> calling, SMS, GPRS, VOTLE, H+, may be 5G+
	 *   
	 *   calculator for inheritance
	 *   **************************
	 *   calculator
	 *   		-> Basic calculator
	 *   		-> Adv calculator
	 *   		-> Log calculator
	 *   		-> Scientific calculator
	 *   
	 */  
	 

}
