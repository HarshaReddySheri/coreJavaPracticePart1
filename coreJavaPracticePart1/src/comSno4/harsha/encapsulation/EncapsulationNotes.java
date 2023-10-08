package comSno4.harsha.encapsulation;

public class EncapsulationNotes {
	/*
	 *Agenda
	 *******
	 *
	 *1.What is encapsulation?
	 *Ans: Implementation of encapsulation
	 *
	 *2.What is encapsulation?
	 *FIRST DEFINATION
	 *
	 *Ans: Encapsulation is a mechanism of wrapping the data and code acting on the data (methods) together as a single unit
	 *
	 *where we keep the code & data in single unit encapsulation?
	 *Code-->means
	 *->methods or Behavior or Action's
	 *Data-->means
	 *->fields or properties or variables
	 *
	 *
	 *Explanation FIRST DEFINATION
	 ******************************
	 *Inside the class we keep the data & code in combined manner
	 *
	 * class is a container in which we will have the data as will as code
	 * class can't be use directly
	 * class can use by using object
	 * 
	 * class & object both are example for encapsulation
	 * because both are wrapping the data inside them.
	 * 
	 * Basically class is example 
	 * class is main
	 * 		--> then class have n-number of object
	 *
	 *OR
	 *
	 *Oracle SECOUND DEFINATION
	 **************************
	 *Encapsulation describes the ability of an object to hide its data and methods from the rest of the world.
	 *
	 *that why encapsulation is also called as data-hiding
	 *we are trying to hide the data from the rest of the by providing the methods to access the data
	 *
	 *Explanation SECOND DEFINATION
	 *******************************
	 *
	 *Here we know that code & data
	 *--> these 2 how to hide from the rest of the world
	 *
	 *Hidding mean
	 *************
	 *class is defined with variable & method are created
	 *
	 *we are accessing data directly from variable's but it wrong way
	 *Whenever we accessing data it must not be directly 
	 * 
	 *Imagine
	 ********
	 *Inside Object data these can't be assess or set directly
	 *it's a bad practice
	 *
	 * What we have to do inOrder to hide the data & code from the rest of the world?
	 * Ans: you have provide access level or accessibility modifier.
	 * 
	 *  -> By using access modifier for object we have to create the visibility
	 *  
	 *  Rest of the world -> means
	 *  		-->Only for that object & Inside the object is useful.
	 *  		-->You can't use to rest of the world.
	 *  Let see hoe to implement in the code
	 *  Create 2 class 
	 *  	->Student
	 *  	->Teacher
	 *  
	 *  *Student & Teacher is a Demo for Encapsulation
	 *  *I wanna insert some data & code in student class
	 *  *Next i wanna access through Teacher class
	 *  
	 *  *isAtended variable data is set toward in teacher class
	 *  
	 *  object of student is create and At same time isAttended variable data is assigned.
	 *  
	 *  we miss the complete grip or control due to we place the data & code in Teacher class
	 *  
	 *  Control is missed
	 *  *****************
	 *  
	 *  let say student is giving attendance to teacher that time i wanna print in the console
	 *  1. Let say Teacher is assigned the Attendance to the student 
	 *  OR
	 *  2.I want to verify the attendance and then i want to assign the attendance
	 *  3.These i want to maintain in the logger file's
	 *  
	 *  Whenever we creating application
	 *  		->everything we mentioned in the log file's
	 *  		->whenever we have a problem in feature we have check in log file
	 *  because whatever the action we did in program we assign in log file
	 *  
	 *  We can track any time with the help of logfile's
	 *  
	 *  we can find the problem from where, WhichData, why?
	 *  Log file are very impotent
	 *  
	 *  By these work
	 *  *************
	 *  1. Console print
	 *  2. Data Insert in log file
	 *  3. Weather student is attended
	 *   
	 *  Inside Teacher class
	 *  ********************
	 *  How many time you would write let say in you class 100 member of student
	 *  --> we can't write same sys.out statement every time
	 *  --> By this way code is duplicated
	 *  
	 *  1.Here the true operation is done for student attendance 
	 *  2.Next extra operation I want to assign the sys.out statement
	 *  		--> As a teacher i don't want or need
	 *  
	 *  when teacher assign attendance 
	 *  -->Automate it will fill in log file's & console 
	 *  --> These is my requirement
	 *  
	 *  can i do direct action on isAttended?
	 *  No
	 *  Why?
	 *  
	 *  Inside java what are the variable we assign in class
	 *  that variable are not in Our control
	 *  
	 *  --> We can Do only data assign & data get
	 *  
	 *  we can't do extra operation's
	 *  -->If we want to do some extra operation?
	 *  Ans: data OR variable can't be access directly
	 *  --> data can't be give outside directly through object
	 *  
	 *  then how can we pass?
	 *  through the method's
	 *  -->For assign one method
	 *  -->For receiving or retrieving one method
	 *  
	 *  we wanna create some extra methods
	 *  -->By using method you can do operation
	 *  -->By these we can achieve full control
	 *  
	 *  We have a method and what we need to write in 
	 *  ->sys.out statement
	 *  ->Log file
	 *  ->you can verify the condition isAttendend
	 *  
	 *  you can do multiple operation
	 *  
	 *  java have a complete control 
	 *  When it a variable
	 *  ->Operation you can?
	 *  ->Only assigning & retrieving
	 *  
	 *  Whenever we created a method to perform the operation on data
	 *  --> We have a complete control on data or variable
	 *  
	 *   Let create a Method
	 *   
	 *   for assigning & retrieving we want to create a method
	 *   
	 *   you have do sys.out statement & log file in method 
	 *  
	 *  you can control you data
	 *  
	 *  *************************************************************
	 *  you need a method to control the data
	 *  
	 *  method
	 *  1. setStudentAttendence(boolean flag)
	 *  2. getStudentAttendence()
	 *  
	 *  Encapsulation is a famous principle
	 *  ***********************************
	 *  
	 *    It all getter & setter for Instance variable
	 *    
	 *    ->Right click & click on source
	 *    					--> Generate getters & setters
	 *    
	 *    First Definition
	 *    ****************
	 *    ->Wrapping the code & data in a single unit
	 *    Second Definition
	 *    *****************
	 *    ->Hidding the code & data from the rest of the world
	 *    
	 *    Why encapsulation?
	 *    ->To secure the data
	 *    ->Dta can't be expose through object outSide 
	 *    How to secure?
	 *    By using only methods you have more control
	 *    
	 *    If you are not using the method
	 *    ->User have chance's for setting any value
	 *      
	 *
	 *  
	 *  
	 *  		
	 * 
	 */
}
