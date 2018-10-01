---
layout: page
title: "Documentation for 8ALib.java"
---
# Documentation for 8ALib.java

### Method Summary
<table class="table table-striped">
<thead>
  <tr>
    <th>Modifier and Type</th><th>Method</th><th>Description</th>
  </tr>
</thead>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#concat">concat</a><br>(String left,<br>String right)</td><td>Takes two Strings and produces a new String containing the characters of the first followed by the characters of the second.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#count">count</a><br>(String base,<br>String toFind)</td><td>Takes two Strings and produces the number of times the second appears in the first.</td>
</tr>
<tr>
<td class="monospace">long</td><td class="monospace"><a href="#dateMonthDayYearTime">dateMonthDayYearTime</a><br>(String date)</td><td>Returns the String formatted date as a long</td>
</tr>
<tr>
<td class="monospace">long</td><td class="monospace"><a href="#dateYearMonthDayTime">dateYearMonthDayTime</a><br>(String date)</td><td>Returns the String formatted date as a long</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#indexOf">indexOf</a><br>(String base,<br>String toFind)</td><td>Takes two Strings  and produces the index of the first time the second appears in the first, or -1 otherwise.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#indexOfNth">indexOfNth</a><br>(String base,<br>String toFind,<br>int n)</td><td>Takes a String and a String to find and produces the index of the nth occurrence of toFind within base (the first occurrence corresponds to n = 0). Produces -1 if toFind appears less than (n - 1) times.</td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#intToString">intToString</a><br>(int n)</td><td>Returns an integer represented as a String</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#length">length</a><br>(String s)</td><td>Takes a String and produces its length.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#parseInt">parseInt</a><br>(String s)</td><td>Takes a String and interprets its characters as a signed decimal integer or causes an error if the characters do not form a decimal number.</td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="readFile">readFile</a><br>(String path)</td><td>Reads file specified by a path and returns its contents as a String</td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#readLine">readLine</a><br>(String path,<br>int index)</td><td>Takes a String representing a path to a file and a 0-based line index and produces a String containing the characters from that line in that file.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#roundTo">roundTo</a><br>(int n,<br>int toRoundTo)</td><td>Takes an int and produces that number rounded to the nearest multiple of toRoundTo.</td>
</tr>
<tr>
<td class="monospace">boolean</td><td class="monospace"><a href="#show">show</a><br>(String s,<br>int numLines)</td><td>Prints a specified number of lines of a String and returns true when successfully completed;<br>returns false if the specified number of lines is greater than the number of lines in the String</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#sign">sign</a><br>(int n)</td><td>Takes an integer and produces 1 if the integer is positive, -1 if the integer is negative, and produces 0 if the integer is zero.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#square">square</a><br>(int n)</td><td>Takes a number and returns the square of the number.</td>
</tr>
<tr>
<td class="monospace">boolean</td><td class="monospace"><a href="stringEquals">stringEquals</a><br>(String s1,<br>String s2)</td><td>Compares two Strings and returns true if they are equal, false otherwise</td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#substring">substring</a><br>(String base,<br>int beginIndex,<br>int endIndex)</td><td>Takes a String, a start index, and end index. Produces a String containing the characters from start (inclusive) to end (exclusive). Causes an error if indices are out of range or in the wrong order.</td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#trim">trim</a><br>(String base s)</td><td>Returns a copy of a string with leading and trailing white space removed</td>
</tr>
</table>




### Method Detail

<a id="concat"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>concat</th>
  </tr>
</thead>
<tr>
  <td><pre>String concat​(String left,<br>              String right)</pre>Takes two Strings and produces a new String containing the characters of the first followed by the characters of the second.<br><br><b>Parameters:</b><br><code>left</code> - first string in concatenation<br><code>right</code> - second string in concatenation<br><br><b>Returns:</b><br>Returns a new String containing the characters of <code>left</code> followed by the characters of <code>right</code>.</td>
</tr>
</table>

<a id="count"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>count</th>
  </tr>
</thead>
<tr>
  <td><pre>int count(String base,<br>          String toFind)</pre>Takes two Strings and produces the number of times the second appears in the first.<br><br><b>Parameters:</b><br><code>base</code> - String being searched<br><code>toFind</code> - substring to be found<br><br><b>Returns:</b><br>Returns the number of times <code>toFind</code> appears in <code>base</code>.</td>
</tr>
</table>

<a id="dateMonthDayYearTime"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>dateMonthDayYearTime</th>
  </tr>
</thead>
<tr>
  <td><pre>long dateMonthDayYearTime(String date)</pre>Returns the String formatted date as a long<br><br><b>Parameters:</b><br><code>date</code> - String in month, day, year, time format "MMMMM dd yyyy hh:mm z"<br><br><b>Returns:</b><br>returns how many milliseconds have passed since January 1, 1970, 00:00:00 GMT</td>
</tr>
</table>

<a id="dateYearMonthDayTime"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>dateYearMonthDayTime</th>
  </tr>
</thead>
<tr>
  <td><pre>int dateYearMonthDayTime(String s)</pre>Returns the String formatted date as a long<br><br><b>Parameters:</b><br><code>date</code> - a String in year, month, day, time format "yyyy-MM-dd'T'HH:mm:ss"<br><br><b>Returns:</b><br>returns how many milliseconds have passed since January 1, 1970, 00:00:00 GMT</td>
</tr>
</table>

<a id="indexOf"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>indexOf</th>
  </tr>
</thead>
<tr>
  <td><pre>int indexOf​(String base,<br>            String toFind)</pre>Takes two Strings  and produces the index of the first time the second appears in the first, or -1 otherwise.<br><br><b>Parameters:</b><br><code>base</code> - String being searched<br><code>toFind</code> - substring to be found<br><br><b>Returns:</b><br>Returns the index of the first time <code>toFind</code> appears in <code>base</code>, or -1 otherwise.</td>
</tr>
</table>

<a id="indexOfNth"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>indexOfNth</th>
  </tr>
</thead>
|<tr>
  <td><pre>int indexOf​Nth(String base,<br>               String toFind,<br>               int n)</pre>Takes a String and a String to find and produces the index of the nth occurrence of toFind within base (the first occurrence corresponds to n = 0). Produces -1 if toFind appears less than (n - 1) times.<br><br><b>Parameters:</b><br><code>base</code> - String being searched<br><code>toFind</code> - substring to be found<br><code>n</code> - which occurrence of toFind to return the index of<br><br><b>Returns:</b><br>Returns the index of the nth occurrence of <code>toFind</code> within <code>base</code>.<br>Returns -1 if <code>toFind</code> appears less than (<code>n</code> - 1) times.</td>
</tr>
</table>

<a id="intToString"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>intToString</th>
  </tr>
</thead>
<tr>
  <td><pre>String intToString(int n)</pre>Returns an integer represented as a String<br><br><b>Parameters:</b><br><code>n</code> - integer to be represented as a String<br><br><b>Returns:</b><br>returns a String object representing the specified integer</td>
</tr>
</table>

<a id="length"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>length</th>
  </tr>
</thead>
<tr>
  <td><pre>int length​(String s)</pre>Takes a String and produces its length.<br><br><b>Parameters:</b><br><code>s</code> - a String<br><br><b>Returns:</b><br>Returns the length of <code>s</code>.</td>
</tr>
</table>

<a id="parseInt"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>parseInt</th>
  </tr>
</thead>
<tr>
  <td><pre>int parseInt(String s)</pre>Takes a String and interprets its characters as a signed decimal integer or causes an error if the characters do not form a decimal number.<br><br><b>Parameters:</b><br><code>s</code> - String to be parsed<br><br><b>Returns:</b><br>Returns <code>s</code> as a signed decimal integer.</td>
</tr>
</table>

<a id="readFile"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>readFile</th>
  </tr>
</thead>
<tr>
  <td><pre>String readFile(String path)<br>                throws java.io.IOException</pre>Reads file specified by a path and returns its contents as a String<br><br><b>Parameters:</b><br><code>path</code> - String path of the file to be read<br><br><b>Returns:</b><br>returns the file contents of path as a String<br><br><b>Throws:</b><br><code>java.io.IOException</code> - if file at path cannot be read or found</td>
</tr>
</table>

<a id="readLine"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>readLine</th>
  </tr>
</thead>
<tr>
  <td><pre>String readLine​(String path,<br>                int index)<br>                throws java.io.IOException</pre>Takes a String representing a path to a file and a 0-based line index and produces a String containing the characters from that line in that file.<br><br><b>Parameters:</b><br><code>path</code> - String path of the file to be read<br><code>index</code> - integer line index to be read from the file specified by path<br><br><b>Returns:</b><br>Returns a String containing the characters from the <code>index</code>th line in the file at <code>path</code>.<br><br><b>Throws:</b><br><code>java.io.IOException</code> - if file at path cannot be read or found</td>
</tr>
</table>

<a id="roundTo"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>roundTo</th>
  </tr>
</thead>
<tr>
  <td><pre>int roundTo​(int n,<br>            int toRoundTo)</pre>Takes an int and produces that number rounded to the nearest multiple of toRoundTo.<br><br><b>Parameters:</b><br><code>n</code> - an integer<br><code>toRoundTo</code> - the integer which n will be rounded to the nearest multiple of<br><br><b>Returns:</b><br>Returns <code>n</code> rounded to the nearest multiple of <code>toRoundTo</code>.</td>
</tr>
</table>

<a id="show"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>show</th>
  </tr>
</thead>
<tr>
  <td><pre>boolean show(String s,<br>             int numLines)</pre>Prints a specified number of lines of a String and returns true when successfully completed; returns false if the specified number of lines is greater than the number of lines in the String<br><br><b>Parameters:</b><br><code>s</code> - String part or all of which will be printed<br><code>numLines</code> - integer number of lines of s to print<br><br><b>Returns:</b><br>returns true upon successfully printing all numLines number of lines; returns false if numLines is greater than the number of lines in s</td>
</tr>
</table>

<a id="sign"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>sign</th>
  </tr>
</thead>
<tr>
  <td><pre>int sign(int n)</pre>Takes an integer and produces 1 if the integer is positive, -1 if the integer is negative, and produces 0 if the integer is zero.<br><br><b>Parameters:</b><br><code>n</code> - an integer<br><br><b>Returns:</b><br>Returns 1 if <code>n</code> is positive, -1 if <code>n</code> is negative, and 0 if <code>n</code> is zero.</td>
</tr>
</table>

<a id="square"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>square</th>
  </tr>
</thead>
<tr>
  <td><pre>int square(int n)</pre>Takes a number and returns the square of the number.<br><br><b>Parameters:</b><br><code>n</code> - an integer<br><br><b>Returns:</b><br>Returns the square of <code>n</code>.</td>
</tr>
</table>

<a id="stringEquals"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>stringEquals</th>
  </tr>
</thead>
<tr>
  <td><pre>boolean stringEquals(String s1,<br>                     String s2)</pre>Compares two Strings and returns true if they are equal, false otherwise<br><br><b>Parameters:</b><br><code>s1</code> - first String to be compared<br><code>s2</code> - second String to be compared<br><br><b>Returns:</b><br>returns true if s1 and s2 are equal, false otherwise</td>
</tr>
</table>

<a id="substring"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>substring</th>
  </tr>
</thead>
<tr>
  <td><pre>String substring(String base,<br>                 int beginIndex,<br>                 int endIndex)</pre>Takes a String, a start index, and end index. Produces a String containing the characters from start (inclusive) to end (exclusive). Causes an error if indices are out of range or in the wrong order.<br><br><b>Parameters:</b><br><code>base</code> - a String<br><code>beginIndex</code> - integer start index of substring<br><code>endIndex</code> - integer end index of substring, not inclusive<br><br><b>Returns:</b><br>Returns a String containing the characters from <code>beginIndex</code> (inclusive) to <code>endIndex</code> (exclusive).</td>
</tr>
</table>

<a id="trim"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>trim</th>
  </tr>
</thead>
<tr>
  <td><pre>String trim(String s)</pre>Returns a copy of a string with leading and trailing white space removed<br><br><b>Parameters:</b><br><code>s</code> - String to be trimmed<br><br><b>Returns:</b><br>returns a copy of s with leading and trailing white space removed</td>
</tr>
</table>
