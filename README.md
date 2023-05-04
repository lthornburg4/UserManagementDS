# UserManagmentDataStructure

Final Project for Data Structures
A linked list program for an employer to use to manage User Management

Problem Statement
-----------------
Currently, employer ABC Company uses a manual (primitive) User Management System for maintaining a list of the applications that employees have access to for user management. In the existing system, there is a lot of manual work and tracking to have a listing of what applications employees have been given access to for user management. As a very manual and paper based process, this program will give the user that the employer has designated to enter the information into the program as a way to be able to add users, search users, and remove users in a system instead of on paper.

Project Overview
----------------
This system will provide a menu driven option to add, search and remove employees from the list.  Users will be added as an object, so all employee information is included in the listing to make it easier when searching the list. The new system will be accessible from terminals within the ABC company’s network. 

Users
-----
1) General User (Human Resources staff)
2) Administrative User (Human Resources Manager, Information Technology)

User Interface
--------------
User interfaces for all users is menu driven.  This program will be accessible when using a computer from the ABC Company network.  This helps with security regarding user management information. The user interface is pretty simple and straight-forward.

A few dummy employees have been created and are available in the system for this demonstration purpose.

How to use program
-----------------
User will start program and make choice from menu provided to either add employees, view list, remove employee from list, view updated list, or exit program.  The user will follow prompts on screen for how to enter information and what information should be added.  Unfortunately, I was not able to get the menu to continue to appear so after each menu choice you will have to run the program again.  Future iteration of program will have this known issue fixed.

Time/Change Logs
----------------
I did intermittent work on the program throughout the end of the semester.  Most of that was research to determine how to set up the program.  In the last two weeks when I have really focused on the project I have worked about 25 hours/week on the project.

Lessons Learned
--------------
There are so many lessons learned in this project and if I am being honest, I don’t think I would set this project up with the same structure or in the same way again.  When trying to figure out how I wanted to do it I thought the best and easiest way to maintain this was to do one list and keep all employee information together.  If I did it again, I think I would probably do a linked list for each application, and add each employee added to the application under that list.  I thought the way that I started doing this was better and more efficient, but managing the program has become much more difficult and I was not able to figure out ways to make things work that I thought should work.  

I also would seriously consider using a map structure instead of a linked list.  I know that the Big(O) time would be longer and that the linked list is a fast structure, but I found the structure to be cumbersome to work with.  I do realize that some of what makes it cumbersome is that I probably don’t have the structure set up the most effective way and  my code is most likely a big part of the issue I had with getting things to work correctly.  However, I would say that I have learned a lot by doing this project.  I ran into a number of things that didn’t work and then I had to implement work arounds (searching the list) or drop the implementation altogether.  I wanted to be able to search the list by name and have it display the information attached to that employee.  However, I was never able to get that to work.  I did find a work around that allowed me to display the list by iterating through it and then having the user enter the index of the employee they wanted to view.  To compensate for the fact that most users are not going to start their index at 0, and to pull the correct information I had to subtract 1 from the user input to use the correct index to get the employee information desired by the user.

I also wanted to implement a menu method to call the menu at the end of each menu option to navigate through the program from earlier choices, but for some reason, no matter how I tried to input that information, I could not get it to work.  I think that the issue was caused by how I set up the classes to create the list entries as object to keep all employee information together.  As a work around, I have duplicated code, which is in no way ideal and very inefficient, but it still allows the program to function as intended for the user.  Coding it was cumbersome and the code is much longer than it needs to be, but to me, at this point, the main goal is to have the program function in a manner that the user would expect.  Changes can be made and implemented in future iterations of the program to correct mistakes made and lessons learned and incorporating assistance from those more knowledgeable than myself.

There were a number of things that worked well and some worked better than I intended.  There were a lot of things that didn’t.  However, I am grateful for getting to work on the project and my intention when going into this project was to learn, from the things that worked, but perhaps more importantly, from the things that didn’t work.

Conclusion/Summary
-----------------
Overall, this project ended up working in a similar form to what I had envisioned.  I have detailed in the above section in Lessons Learned about all the things that didn’t work as intended and the steps or work arounds that I implemented to get this program to work in a manner that made it functional for the user.  There are a number of things I would do differently if I repeated this same project, and I’m sure there are a number of things that should be done differently or more efficiently than what I am doing them.  This is a learning project so I’m going to take away as much from what went wrong as I am going to take away from what went right.  I might even say that I learned more from what didn’t work.  While I had high hopes for this project, I really struggled to get it to function as I had envisioned.  In the end, I really had to work to make it functional for the user and I tried to accomplish that task.


