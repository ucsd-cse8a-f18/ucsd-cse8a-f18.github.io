---
layout: post
title: "Using jshell"
authors: "Joe Gibbs Politz and Mia Minnes"
---


<p class="summary"> Summary: We used <code>jshell</code> to teach the first
part of an introductory Java course. We describe how we get more control over
when to introduce language features, some nice affordances of
<code>jshell</code>, and some pitfalls we ran into, especially with (a lack of)
error reporting.  </p>

## The First (Java) Program to Show

Say you want to teach a lower-division course for first-time programmers in
Java. Set aside your praise or complaints about Java itself for the moment;
assume you're going to do it and you're going to use Java. For students' first
program, you face a decision:

- You could use plain, out-of-the-box JDK and main, so you'll write programs
  that look like

  <pre class="file">
  <span class="filename">IMadeThisNameUpBecauseIHadTo.java</span>
  public class IMadeThisNameUpBecauseIHadTo {
    public static void main(String[] weAllCallItArgs) {

    }
  }
  </pre>

  If you do this, you will have to pick which jargon and keywords you describe,
  and which you simply hand-wave away with “we'll get to that” or “just write
  that for now.”

- You could use something that _isn't_ the usual plain Java project setup,
  maybe <a href="https://www2.ccs.neu.edu/javalib/Tester/">Northeastern's
  libraries</a> for testing and printing values, or a pedagogic environment
  like <a href="http://www.drjava.org/">DrJava</a>. Designed-for-pedagogy tools
  can be terrific! They _do_ face some tradeoffs, especially with authenticity
  and transfer, so it's useful to have a closer look at tools that ship with
  Java to see if they can meet our pedagogic needs.

As of Java version 9, <a
href="https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm#JSHEL-GUID-630F27C8-1195-4989-9F6B-2C51D46F52C8">`jshell`</a>
has been included in each release. At a high level, you can think of `jshell`
as doing for Java what the `python` command-line tool does for Python – it
allows for both interactive evaluation of code, as well as running entire
programs. The langauge supported by `jshell` has features that Java itself does
_not_ have, which makes writing certain programs much simpler.

## Using `jshell` Early

We used `jshell` for the first part of CSE8A in fall 2018. Here's what
students' first interactions with programs looked like:

<pre class="terminal">
$ jshell
jshell> int x = 10;
x ==> 10
jshell> int y = x + 7;
y ==> 17
</pre>

That is, we run the `jshell` command and interactively evaluate definitions,
seeing the result each time.

We quickly grew into using methods. In the beginning, all methods were defined
in a single library file that the course staff defined:

<pre class="terminal">
$ jshell 8ALib.java
jshell> int x = square(10);
x ==> 100
jshell> int y = roundTo(445, 100);
y ==> 400
</pre>

This provided a number of exercises in the first lecture or two, where we
focused on numbers and calling methods based on their documentation.

Next, students could write their own files using methods from the provided
library:

<pre class="file">
<span class="filename">data.csv</span>
date,time,lat,long,wind,pressure
Oct 9,09:00 GMT,31.1000,-39.9000,35,1008
Oct 9,15:00 GMT,31.4000,-39.9000,40,1008
Oct 9,21:00 GMT,31.5000,-39.6000,45,1005
...
</pre>

<pre class="file">
<span class="filename">readData.java</span>
int line2 = readLine("data.csv", 2);
String column1 = substring(line2, 0, indexOf(line2, ","));
</pre>

<pre class="terminal">
$ jshell 8ALib.java readData.java
jshell> /vars
|    String line2 = "Oct 9,15:00 GMT,31.4000,-39.9000,40,1008"
|    String column1 = "Oct 9"
</pre>

There are a few things to note in this example:

- The `/vars` command, which is a really nice feature for showing the value of
  all currently-defined top-level variables. This is a great debugging aid and
  can be much more friendly than requiring the insertion of print statements
  all over a program to visualize its values.
- We (the course staff) wrote `readLine`, `substring`, and `indexOf` as
  top-level methods in the `8ALib.java` library for students to use. This
  enabled this straightforward style of introducing methods for the operations
  we want to perform, talking about any new datatypes, and making simple
  progress for the first week or two.

Over the following weeks, we slowly built up through typical first-quarter
content, including arrays, loops, instance methods, classes, constructors, and
`main`. Each of these was introduced on our terms, rather than being forced on
us by the language. This was the main win of `jshell` – it removed early
friction and language-feature-based curricular dependencies, while still
keeping us squarely in “stock” Java.

We were able to use `jshell` quite flexibly to do a number of nice things that
would have been trickier with regular java:

- Integrate with the libraries from <a
  href="http://coweb.cc.gatech.edu/mediaComp-teach">Media Computation</a> using
  typical classpath support with only a little light editing to get package
  names to work the way we wanted.
- Do a lightweight form of unit testing by having students write the expected
  and actual values as two variable declarations next to one another, and
  visually compare the output with `/vars`.
- Avoid some of the annoyances of talking around `try/catch` and `throws`
  clauses for I/O by providing top-level `jshell` methods like `readLine` that
  we wrote ourselves.
- Live-code in class, showing the results of intermediate expressions along the
  way without waiting for a re-compile and re-run, and without having to type
  out print statements when students wondered about a particular value.

## Tricks and Happy Surprises

There are a few techniques we used repeatedly, and some features we were
pleasantly surprised by.

### Array Printing

The default `toString()` methods on arrays in Java provides almost no
information, but `jshell` by default will show arrays' contents when the
variable is shown:

<pre class='terminal'>
jshell> int[] a = { 1, 2, 3};
a ==> int[3] { 1, 2, 3 }

jshell> System.out.println(a)
[I@29ee9faa
</pre>

Yes, there's `Arrays.toString`, but it's tricky to type 15 characters while
live-coding in lecture to show the class an array's contents.

### Loading Files and .jars

`jshell` can accept multiple files at the command line, and will run the
scripts in the order provided. We used this to write grading scripts that would
run after students' definitions and expect certain variables and methods to be
defined. We also used it to provide students with support and library code that
could rely just on their variable definitions to make something happen, without
them writing boilerplate to call out to library methods. On many assignments
the final command lines would “sandwich” student code in between ours:

<pre class='terminal'>
$ jshell 8ALib.java StudentCode.java OurGrader.java
</pre>

`jshell` accepts a classpath command-line argument as usual, which we used to
link up with libraries that weren't written with the script-based includes of
`jshell` in mind.

### Loading Classes

`jshell` has pretty reasonable behavior when loading classes. A class
definition is a perfectly valid `jshell` entry, and causes the class to be
defined within the session. Class definitions can refer to one another, even
with forward references to yet-undefined classes. In fact, `jshell` is pretty
lenient about forward references in general, which causes some issues (<a
href="#methods-can-use-names-before-their-definition">this is discussed more
below</a>).

### Commands

There are a few commands in `jshell` that aren't Java statements and are
invaluable.

- The first is `/vars`, which we saw above. It lists all the variables that
  have been defined in the session, with their types. This provides a nice
  reinforcement that type information is attached to variables, especially when
  comparing, say, `"5"` and `5`:

  <pre class='terminal'>
  jshell> int x = 5;
  x ==> 5

  jshell> String five = "5";
  five ==> "5"

  jshell> /vars
  |    int x = 5
  |    String five = "5"
  </pre>

- The second is `/methods`, which prints the signatures of all defined methods.
  While useful for illustration purposes, we also used it to great effect in
  _grading scripts_. Rather than using reflection or parsing, we could simply
  load student programs, run `/methods`, and check that everything appeared as
  expected.

  <pre class='terminal'>
  jshell> int square(int n) { return n * n; }
  |  created method square(int)

  jshell> String repeat(String s) { return s + s; }
  |  created method repeat(String)

  jshell> /methods
  |    int square(int)
  |    String repeat(String)
  </pre>

- A third is `/open`, which takes a filename and reloads the script at that
  file, which re-runs all its definitions. Since `jshell` takes a second or two
  to start up (getting a JVM going isn't free!), but can run `/open` nearly
  instantaneously, this can make in-class examples dramatically easier to run.
  It's possible to have an editor and a `jshell` session open side-by-side and
  use `/open` judiciously to get a nearly-live update of a running code
  example.

There are plenty of other commands that you can see by using `/help`; these are
the ones we most commonly used.

## Quirks and Unhappy Surprises

There were some features of `jshell` that surprised us, and that we would
design differently. These revolve around a few fundamental design decisions in
`jshell`, and once we understood them, we could explain (even if we didn't
_like_) the behavior we saw.

### Runtime Errors Don't Stop Definitions

Consider this interaction:

<pre class="terminal">
$ jshell
jshell> int x = 1 / 0;
|  java.lang.ArithmeticException thrown: / by zero
|        at (#1:1)

jshell> x
// What do you expect to see here?
</pre>

We **wish** that `jshell` reported a static name-not-found error. Alas, the
actual output is:

<pre class="terminal">
jshell> x
x ==> 0
</pre>

What happened? The variable `x` was created with its default value `0`. Then a
runtime error happened, so it was never updated to any other value. Crucially,
and unfortunately, these two steps are _separate_, and we can observe it. This
observation, that **declaration and update are separate operations**, is key to
understanding `jshell`'s behavior.

This is frustrating because if a student makes a mistake, they may still see
some value for a declared variable (`false` for booleans, `null` for objects).
It may not be immediately obvious whether `x` has the value `0` as the result
of some computation (correct or incorrect), or if it's just holding its default
value.

Note that if there is a _static_ error, the definition is not run at all:

<pre class="terminal">
jshell> int y = "not-an-int";
|  Error:
|  incompatible types: java.lang.String cannot be converted to int
|  int y = "not-an-int";
|          ^----------^

jshell> y
|  Error:
|  cannot find symbol
|    symbol:   variable y
|  y
|  ^
</pre>

This requires particular care, because students don't know the difference
between static and runtime errors at first. The distinction between these cases
can be particularly mysterious to students.

### Methods Can Use Names Before Their Definition

A programmer might assume that a variable is declared, or make a typo in its
name, and try using it when it's not defined. For example, `PI` is not defined
in this example:

<pre class="terminal">
$ jshell
jshell> double usesPi(double radius) {
   ...>   return radius * radius * PI;
   ...> }
|  created method usesPi(double), however, it cannot be invoked until variable PI is declared
jshell> usesPi(5.0)
|  attempted to call method usesPi(double) which cannot be invoked until variable PI is declared
</pre>

This same warning applies to other types of forward declarations as well, for
example using another method or a type name within a method when it's not
defined. The analog of `/vars` for methods, `/methods`, will show these warnings as well:

<pre class="terminal">
jshell> /methods
|    double usesPi(double)
|       which cannot be invoked until variable PI is declared
</pre>

This on its own is fairly innocuous because it comes with an immediate warning.
That said, the “attempted to call” error is a _runtime error_, so we can
already see one troubling interaction:

<pre class="terminal">
jshell> double d = usesPi(5.0)
|  attempted to call method usesPi(double) which cannot be invoked until variable PI is declared

jshell> d
d ==> 0.0
</pre>

As we saw before, here the variable `d` gets declared and has the default value
`0.0`, then the call to `usesPi` errors.  (For extra credit, we can see that
this really is a runtime exception by using `try/catch`, of type
`jdk.jshell.spi.SPIResolutionException`).

### `jshell` Runs Sequences of Interactions, Not Programs

Let's take our erroneous definition of `int x = 1 / 0` above and put it in a
file. Let's also _add_ another variable declaration after it, then try loading
it with `jshell`:

<pre class="file">
<span class="filename">error.java</span>
int x = 1 / 0;
int y = 100;
</pre>

<pre class="terminal">
$ jshell error.java
java.lang.ArithmeticException thrown: / by zero
      at (#1:1)
jshell> /vars
|    int x = 0
|    int y = 100
</pre>

The main important thing to note here is that the runtime error from `1 / 0`
didn't stop the entire script from executing. It caused an error during the
`int x ...` line, reported it, and then continued on to the declaration of `y`.

The important, crucial underlying semantics here is that when `jshell` loads a
file, **the file is interpreted as a sequence of separate interactions**. In
particular, it is not interpreted as an entire program, where a single error,
if uncaught, terminates it entirely.

This includes type errors. Consider this program:

<pre class="file">
<span class="filename">type-error.java</span>
int x = "not-a-number";
String y = "yes-a-string";
int z = x;
</pre>

<pre class="terminal">
$ jshell type-error.java
Error:
incompatible types: java.lang.String cannot be converted to int
int x = "not-a-number";
        ^------------^
Error:
cannot find symbol
  symbol:   variable x
int z = x;
        ^
|  Welcome to JShell -- Version 10.0.2
|  For an introduction type: /help intro

jshell> /vars
|    String y = "yes-a-string"
</pre>

In this case, since a type error occurred, the variable `x` is not defined. The
script then continues to run the full declaration of `y`. When it gets to the
definition of `z`, due to the type error `x` was never defined so another error
is reported. This makes total sense if we combine the lessons we learned above
with the notion that these are all separate interactions in a sequence, just as
if we'd typed them individually. Indeed, we wouldn't expect `jshell` to quit
when we type the first error, we expect it to give us the prompt back for more
input.

### Some Messages are Suppressed When Loading Scripts

In the examples we saw above, all errors were reported as they happened.
However, and this seems like an **objectively bad design decision**, _some_
error messages are suppressed when loading scripts. In particular, both
defining and calling a method when it uses a variable that isn't defined _does
not print_ if the error happens during loading a script.

The worst thing about this is that a common cause of a “use of an undefined
variable” is a typo in the name of a parameter. For example:

<pre class="file">
<span class="filename">no-message-prints.java</span>
int rectArea(int w, int h) {
  return width * height;
}

int example1 = rectArea(4, 5);
</pre>

<pre class="terminal">
$ jshell no-message-prints.java
jshell>
</pre>

Here, `jshell` has apparently succeeded (if we can take a lack of error
messages as success). No addition of verbose flags or fancy printing that we
have found will make the messages we'd like to see print. If a student used the
variables to check their work, they would next see the baffling result that
`example1` has the value `0`, when no error was reported:

<pre class="terminal">
jshell> /vars
|    int example1 = 0
</pre>

To deal with this situation we coached students to use `/methods` frequently to
check if a method had an issue, which in this case would yield the message
below, which has the right diagnostic information:

<pre class="terminal">
jshell> /methods
|    int rectArea(int,int)
|       which cannot be invoked until variable width, and variable height are declared
</pre>

## A (Qualified) Recommendation

We would use `jshell` again, especially now that we understand the sharp edges
and how to coach around them. It gives us freedom to order content and build
understanding of language features ground-up without telling students to ignore
boilerplate. It ships with stock Java, so students can start to expect it to be
installed and usable anywhere they use Java, and it doesn't require extra setup
to use. It's invaluable for live-coding in class and for quick experiments.

That said, the sharp edges exist, and `jshell` is in no way designed in a way
that gives beginners (or, we'd argue, professionals) friendly error messages.
These problems are felt most strongly as programs increase in size and the
permissiveness around errors allows confusion to propagate around the program.

