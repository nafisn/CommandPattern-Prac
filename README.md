## Command Pattern
This lab will aim to teach you about a behavioral design pattern known as theCommand Pattern. 
Behavioral design patterns aim to manage some kind of relationship or responsibility between objects.
As with any design pattern, before you decide to implement it, you should think about the problem you
are facing.

## The Problem
In your project, if you ever find yourself thinking, **"I need to keep a history of
the actions I'm doing"** or **"I need to perform certain tasks in certain orders"** or
**"I need a way to separate an object, the action its performing, and the thing its
performing that action to"**, then this design pattern is for you.

## How it Works
This pattern essentially allows you to turn actions/methods into objects. In this lab,
we will define a **"Lights.Command"** interface with a simple **"execute()"** method. There will be
an **"Invoker"** which calls a "command" to execute a method. And there will be a 
**"Receiver"** which that can carry out the request of a command. How is this useful? Think
about a simple text editor such as MS Word. When you perform a various actions like
typing, copying, pasting, and deleting, how do you undo those actions? If those
actions could be stored in a list of some sort, you can iterate through that list
and simply undo or reverse those actions to go back to an earlier state. Try to think
of more ways you could use this pattern.

## See the Example
In the Lights directory, you will see an example of a command pattern in place. The Lights.Command interface defines
a way to execute and undo a certain command. Then we have various Light related 
classes which are the actions (LightColorBlue/Red etc. LightOn/Off etc). Then 
we have the Light itself along with a remote controller. The remote controller is
the Invoker that executes the commands on the Receiver which is the Light. The 
remote has two buttons, one to execute a command, and one to undo a command. One 
of the core ideas of this pattern is to create an undo implementation for each
"action" class. Look through the Client which makes the Invoker(RemoteController), 
makes the Receiver(Light), makes the Commands, and then executes them all with one
loop. Then it undoes them all with another loop which goes through the list of commands
in reverse order. 


