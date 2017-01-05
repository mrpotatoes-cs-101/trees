# CS 101: Trees Bro
## Why
If I can teach it to you (self learning) then I can teach it to anyone. It's
good to know and this isn't something that you need to spend 100K on in order to
learn. Computer science shouldn't be hard and should be fun.

Seriously though, computer science isn't hard. People make it hard but doing
this day in and day out is actually pretty easy. Getting into the mindset is
more difficult than actually doing the work. So, to learn, and so that I can
remember, I have decided to put together a CS101 "course" all in github for self
teaching. Hopefully everything is really easy to follow along.

## Prerequisites
* Know Java or some sort of programming language.
  * I will not cover this and assume you know static vs non-static, member
    variables, inheritance et al, creating/running unit tests.
* Netbeans/Eclipse
  * This code should run directly if you download it.
* Unit Tests
  * Everything is written in unit tests (no `main` method) for tests.
* (optional) Git

## How to use
* Start with the docs and they are in order.
  * Learn that.
* Draw it out from memory
  * Using either paper or a white board explain to yourself how any of these
    data structures work w/o having to go into either the code or the
    explanations in the docs. Think of it like an oral example. This is even
    better if you can do this in front of someone that already knows CS.
  * Do your oral presentation again in front of someone that has no idea about
    CS like you're the teacher. If they can learn it then you know it.
* Go through the code
  * The code in here is highly commented and is built in order to automatically
    compile and run. Give it a shot.
* Write the code yourself, maybe.

The code is the least important aspect just like in real life (at any good
company that is). Writing code isn't important as that is the easy part but
being able to express your abstract thought is much more important.

## Syllabus
I go over 4 tree data structures.
* Binary Trees
* AVL Trees
* Expression Trees
* N-ary Trees

I separate out most of this functionality differently from how people normally
teach the material. The code is separated out into their own classes and they
are functionally the same but I believe it's easier to read. Classes <= 200
(including comments) lines are the easiest to read and follow along. Preferably
under 100 lines including comments.

Most of this is broken out into groups of functionality (insertion, deletion, 
update, search et al) and in turn it makes everything even easier to follow 
along although it looks more complicated it isn't [much] more complicated.

Also, with a lot of this functionality it doesn't make sense that it's part of
the tree structure because even abstractly the tree class just calls the node
class and the node class contains the actual tree structure. Everything else is
an operation on that tree structure and they need not be part of the class but
rather an outside operating force.

I also added templates. For some reason.

## Closing Notes
The information here is sourced from multiple different places and I tried my
best to note them all. The bibliography will be compiled in this file if you so
choose to go elsewhere for more self teaching.

Feel free to make pull requests.

# Bibliography
B, Rajinikanth B. "DATA STRUCTURES." __Algorithms__. Btechsmartclass.com, 5 Jan. 2017.<br />
&nbsp;&nbsp;&nbsp;Web. 05 Jan. 2017. <http://btechsmartclass.com/DS/U1_T1.html>.
&nbsp;&nbsp;&nbsp;Learn the important data structures abstractly.

Banas, Derek. "Java Algorithms" Youtube.com. Jul 2, 2014.<br />
&nbsp;&nbsp;&nbsp;Web. 05 Jan. 2017. <https://www.youtube.com/playlist?list=PLGLfVvz_LVvReUrWr94U-ZMgjYTQ538nT>.
&nbsp;&nbsp;&nbsp;Where most of my code originally hails.
