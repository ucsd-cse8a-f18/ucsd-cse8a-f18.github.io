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
<td class="monospace">String</td><td class="monospace"><a href="#abridge">abridge</a><br>(String csv,<br>int numLines)</td><td>Consumes a table as a String and an integer number of lines. Returns the first specified number of rows (not including the header row) of the table as a String.</td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#commafy">commafy</a><br>(String s)</td><td>Add comma at start and end of row of data.</td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#concat">concat</a><br>(String left,<br>String right)</td><td>Takes two Strings and produces a new String containing the characters of the first followed by the characters of the second.</td>
</tr>
<tr>
<td class="monospace">double</td><td class="monospace"><a href="#cos">cos</a><br>(double n)</td><td>Takes a double and returns the cosine of the double value.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#count">count</a><br>(String base,<br>String toFind)</td><td>Takes two Strings and produces the number of times the second appears in the first.</td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#dataAtColumn">dataAtColumn</a><br>(String dataRow,<br>int col)</td><td>Takes a comma separated String of data and a column index and outputs the data in the appropriate column.</td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#dataAtProcColumn">dataAtProcColumn</a><br>(String dataProcRow,<br>int col)</td><td>Takes a comma separated String representing a row of data <b>which starts and ends with commas</b> and a column index and outputs the data in the appropriate column in this row.</td>
</tr>
<tr>
<td class="monospace">long</td><td class="monospace"><a href="#dateMonthDayYearTime">dateMonthDayYearTime</a><br>(String date)</td><td>Returns the String formatted date as a long indicating how many milliseconds have passed since January 1, 1970, 00:00:00 GMT.</td>
</tr>
<tr>
<td class="monospace">long</td><td class="monospace"><a href="#dateYearMonthDayTime">dateYearMonthDayTime</a><br>(String date)</td><td>Returns the String formatted date as a long indicating how many milliseconds have passed since January 1, 1970, 00:00:00 GMT.</td>
</tr>
<tr>
<td class="monospace">double</td><td class="monospace"><a href="#doubleAtColumn">doubleAtColumn</a><br>(String dataRow,<br>int col)</td><td>Takes a comma separated String of data and a column index and outputs the data in the appropriate column as a double.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#doubleToInt">doubleToInt</a><br>(double d)</td><td>Takes a double and returns the rounded down integer value of the double.</td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#doubleToString">doubleToString</a><br>(double d)</td><td>Returns the String representation of the double input.</td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#filter">filter</a><br>(String csv,<br>RowFilter rowChecker)</td><td>Consumes a table as a String and a method <code>rowChecker</code> that returns a boolean in the format <code>r->rowChecker(r, ...)</code> and produces a new table as a String that has only the rows where <code>rowChecker</code> returned true.</td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#getRow">getRow</a><br>(String t,<br>int row)</td><td>Consumes a table as a String and an integer row index. Returns the row at the given row index as a String.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#indexForColumn">indexForColumn</a><br>(String headerRow,<br>String colName)</td><td>Takes a String storing a header row of a data file and a String column name, and outputs the column index of the given column name.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#indexOf">indexOf</a><br>(String base,<br>String toFind)</td><td>Takes two Strings  and produces the index of the first time the second appears in the first, or -1 otherwise.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#indexOfNth">indexOfNth</a><br>(String base,<br>String toFind,<br>int n)</td><td>Takes a String and a String to find and produces the index of the nth occurrence of toFind within base (the first occurrence corresponds to n = 0). Produces -1 if toFind appears less than (n + 1) times.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#intAtColumn">intAtColumn</a><br>(String dataRow,<br>int col)</td><td>Takes a comma separated String of data and a column index and outputs the data in the appropriate column as an integer.</td>
</tr>
<tr>
<td class="monospace">double</td><td class="monospace"><a href="#intToDouble">intToDouble</a><br>(int n)</td><td>Takes an integer and returns a double-valued result of the integer.</td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#intToString">intToString</a><br>(int n)</td><td>Takes an integer and returns a String containing the decimal digits of the integer.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#length">length</a><br>(String s)</td><td>Takes a String and produces its length.</td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#longToString">longToString</a><br>(long l)</td><td>Returns the String representation of the long input.</td>
</tr>
<tr>
<td class="monospace">double</td><td class="monospace"><a href="#maxDouble">maxDouble</a><br>(String csv,<br>int col)</td><td>Consumes a table as a String and a column index. Returns the maximum value of the data in that column, assuming all of the data can be parsed as doubles.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#maxInt">maxInt</a><br>(String csv,<br>int col)</td><td>Consumes a table as a String and a column index. Returns the maximum value of the data in that column, assuming all of the data can be parsed as integers.</td>
</tr>
<tr>
<td class="monospace">double</td><td class="monospace"><a href="#meanDouble">meanDouble</a><br>(String csv,<br>int col)</td><td>Consumes a table as a String and a column index. Returns the mean of the data in that column, assuming all of the data can be parsed as a double.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#meanInt">meanInt</a><br>(String csv,<br>int col)</td><td>Consumes a table as a String and a column index. Returns the mean of the data in that column, assuming all of the data can be parsed as an integer.</td>
</tr>
<tr>
<td class="monospace">double</td><td class="monospace"><a href="#medianDouble">medianDouble</a><br>(String csv,<br>int col)</td><td>Consumes a table as a String and a column index. Returns the median of the data in that column, assuming all of the data can be parsed as doubles.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#medianInt">medianInt</a><br>(String csv,<br>int col)</td><td>Consumes a table as a String and a column index. Returns the median of the data in that column, assuming all of the data can be parsed as integers.</td>
</tr>
<tr>
<td class="monospace">double</td><td class="monospace"><a href="#minDouble">minDouble</a><br>(String csv,<br>int col)</td><td>Consumes a table as a String and a column index. Returns the minimum of the data in that column, assuming all of the data can be parsed as doubles.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#minInt">minInt</a><br>(String csv,<br>int col)</td><td>Consumes a table as a String and a column index. Returns the minimum of the data in that column, assuming all of the data can be parsed as integers.</td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#newLinefy">newLinefy</a><br>(String t)</td><td>Add a new line at start and end of row of data.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#numColumns">numColumns</a><br>(String header)</td><td>Takes a String storing header row of a data file and outputs the number of columns in this file.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#numRows">numRows</a><br>(String csv)</td><td>Consumes a table as a String and produces the number of rows in it (including the header row).</td>
</tr>
<tr>
<td class="monospace">double</td><td class="monospace"><a href="#parseDouble">parseDouble</a><br>(String s)</td><td>Takes a string with characters in double format—including with a decimal point and/or in scientific notation—and produces an approximation of that number. Results in an error if the string isn't in double format.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#parseInt">parseInt</a><br>(String s)</td><td>Takes a String and interprets its characters as a signed decimal integer or causes an error if the characters do not form a decimal number.</td>
</tr>
<tr>
<td class="monospace">long</td><td class="monospace"><a href="#parseLong">parseLong</a><br>(String s)</td><td>Takes a String an parses it as a signed decimal long or causes an error if the characters do not form a long.</td>
</tr>
<tr>
<td class="monospace">double</td><td class="monospace"><a href="#pow">pow</a><br>(double base,<br>double expt)</td><td>Takes a double as a base number and another double as the exponent and calculates the base to the power of the exponent in terms of a double.</td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="readFile">readFile</a><br>(String path)</td><td>Takes a String representing a path to a file and returns a String of the contents of the file.</td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#readLine">readLine</a><br>(String path,<br>int index)</td><td>Takes a String representing a path to a file and a 0-based line index and produces a String containing the characters from that line in that file.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#roundTo">roundTo</a><br>(int n,<br>int toRoundTo)</td><td>Takes two ints and produces the first number rounded to the nearest multiple of the second</td>
</tr>
<tr>
<td class="monospace">boolean</td><td class="monospace"><a href="#show">show</a><br>(String s,<br>int numLines)</td><td>Takes a String and a number of lines to display, prints that many lines of the string (or the whole string if it has fewer lines). Returns true if numLines were printed, false if fewer were printed.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#sign">sign</a><br>(int n)</td><td>Takes an integer and produces 1 if the integer is positive, -1 if the integer is negative, and produces 0 if the integer is zero.</td>
</tr>
<tr>
<td class="monospace">double</td><td class="monospace"><a href="#sin">sin</a><br>(double n)</td><td>Takes a double and returns the sine of the double value.</td>
</tr>
<tr>
<td class="monospace">double</td><td class="monospace"><a href="#sqrt">sqrt</a><br>(double n)</td><td>Takes a double and returns the square root of the double value.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#square">square</a><br>(int n)</td><td>Takes a number and returns the square of the number.</td>
</tr>
<tr>
<td class="monospace">boolean</td><td class="monospace"><a href="stringEquals">stringEquals</a><br>(String s1,<br>String s2)</td><td>Takes two Strings and returns true if they contain the same characters in the same order, false otherwise.</td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#substring">substring</a><br>(String base,<br>int beginIndex,<br>int endIndex)</td><td>Takes a String, a start index, and end index. Produces a String containing the characters of the input String from start (inclusive) to end (exclusive). Causes an error if indices are out of range or in the wrong order.</td>
</tr>
<tr>
<td class="monospace">double</td><td class="monospace"><a href="#sumDouble">sumDouble</a><br>(String csv,<br>int col)</td><td>Consumes a table as a String and a column index. Returns the sum of the data in that column, assuming all of the data can be parsed as a double.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#sumInt">sumInt</a><br>(String csv,<br>int col)</td><td>Consumes a table as a String and a column index. Returns the sum of the data in that column, assuming all of the data can be parsed as an integer.</td>
</tr>
<tr>
<td class="monospace">double</td><td class="monospace"><a href="#tan">tan</a><br>(double n)</td><td>Takes a double and returns the trigonometric tangent of the double value.</td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#trim">trim</a><br>(String base s)</td><td>Takes a String and produces a String with all whitespace characters (spaces, tabs, and newlines) removed from the beginning and end.</td>
</tr>
</table>




### Method Detail

<a id="abridge"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>abridge</th>
  </tr>
</thead>
<tr>
  <td><pre>String abridge(String csv,<br>               int numLines)</pre>Consumes a table as a String and an integer number of lines. Returns the first specified number of rows (not including the header row) of the table as a String.<br><br><b>Parameters:</b><br><code>csv</code> - table to be abridged<br><code>numLines</code> - number of rows to abridge the table to<br><br><b>Returns:</b><br>Returns the first <code>numLines</code> rows of <code>csv</code>.</td>
</tr>
</table>

<a id="commafy"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>commafy</th>
  </tr>
</thead>
<tr>
  <td><pre>String commafy(String s)</pre>Add comma at start and end of row of data<br><br><b>Parameters:</b><br><code>s</code> - String to be commafied<br><br><b>Returns:</b><br>Returns <code>s</code> with a comma added to the start and end of it.</td>
</tr>
</table>

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

<a id="cos"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>cos</th>
  </tr>
</thead>
<tr>
  <td><pre>double cos(double n)</pre>Takes a double and returns the cosine of the double value.<br><br><b>Parameters:</b><br><code>n</code> - a double<br><br><b>Returns:</b><br>Returns the cosine value as a double based off of the input double.</td>
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

<a id="dataAtColumn"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>dataAtColumn</th>
  </tr>
</thead>
<tr>
  <td><pre>String dataAtColumn(String dataRow,<br>                    int col)</pre>Takes a comma separated String of data and a column index and outputs the data in the appropriate column.<br><br><b>Parameters:</b><br><code>dataRow</code> - String of a data row<br><code>col</code> - integer column index<br><br><b>Returns:</b><br>Returns the data as a String from a row at the given column index.</td>
</tr>
</table>

<a id="dataAtProcColumn"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>dataAtProcColumn</th>
  </tr>
</thead>
<tr>
  <td><pre>String dataAtProcColumn(String dataProcRow,<br>                        int col)</pre>Takes a comma separated String representing a row of data <b>which starts and ends with commas</b> and a column index and outputs the data in the appropriate column in this row.<br><br><b>Parameters:</b><br><code>dataProcRow</code> - String of a data row<br><code>col</code> - integer column index<br><br><b>Returns:</b><br>Returns the data as a String from a row at the given column index.</td>
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
  <td><pre>long dateMonthDayYearTime(String date)</pre>Returns the String formatted date as a long indicating how many milliseconds have passed since January 1, 1970, 00:00:00 GMT<br><br><b>Parameters:</b><br><code>date</code> - String in month, day, year, time format "MMMMM dd yyyy hh:mm z"<br><br><b>Returns:</b><br>returns how many milliseconds have passed since January 1, 1970, 00:00:00 GMT</td>
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
  <td><pre>int dateYearMonthDayTime(String s)</pre>Returns the String formatted date as a long indicating how many milliseconds have passed since January 1, 1970, 00:00:00 GMT<br><br><b>Parameters:</b><br><code>date</code> - a String in year, month, day, time format "yyyy-MM-dd'T'HH:mm:ss"<br><br><b>Returns:</b><br>Returns how many milliseconds have passed since January 1, 1970, 00:00:00 GMT</td>
</tr>
</table>

<a id="doubleAtColumn"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>doubleAtColumn</th>
  </tr>
</thead>
<tr>
  <td><pre>double doubleAtColumn(String dataRow,<br>                      int col)</pre>Takes a comma separated String of data and a column index and outputs the data in the appropriate column as a double.<br><br><b>Parameters:</b><br><code>dataRow</code> - a String row of data<br><code>col</code> - integer column index<br><br><b>Returns:</b><br>Returns the data as a double from a row at the given column index.</td>
</tr>
</table>

<a id="doubleToInt"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>doubleToInt</th>
  </tr>
</thead>
<tr>
  <td><pre>int doubleToInt(double d)</pre>Takes a double and returns the rounded down integer value of the double.<br><br><b>Parameters:</b><br><code>d</code> - double to be represented as an integer<br><br><b>Returns:</b><br>Returns <code>d</code> as an integer</td>
</tr>
</table>

<a id="doubleToString"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>doubleToString</th>
  </tr>
</thead>
<tr>
  <td><pre>String doubleToString(double d)</pre>Returns the String representation of the double input.<br><br><b>Parameters:</b><br><code>d</code> - double being represented as a String<br><br><b>Returns:</b><br>Returns the String representation of the input double.</td>
</tr>
</table>

<a id="filter"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>filter</th>
  </tr>
</thead>
<tr>
  <td><pre>String filter(String csv,<br>              RowFilter rowChecker)</pre>Consumes a table as a String and a method rowChecker that returns a boolean in the format <code>r->rowChecker(r, ...)</code> and produces a new table as a String that has only the rows where <code>rowChecker</code> returned true.<br><br><b>Parameters:</b><br><code>csv</code> - table to be filtered<br><code>rowChecker</code> - boolean method used to filter the table<br><br><b>Returns:</b><br>Returns a new table with rows filtered by <code>rowChecker</code></td>>
</tr>
</table>

<a id="getRow"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>getRow</th>
  </tr>
</thead>
<tr>
  <td><pre>String getRow(String t,<br>              int row)</pre>Consumes a table as a String and an integer row index. Returns the row at the given row index as a String.<br><br><b>Parameters:</b><br><code>t</code> - table of data as a String<br><code>row</code> - row index of row to be returned<br><br><b>Returns:</b><br>Returns the row at the specified index of the given table.</td>
</tr>
</table>

<a id="indexForColumn"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>indexForColumn</th>
  </tr>
</thead>
<tr>
  <td><pre>int indexForColumn(String headerRow,<br>                   String colName)</pre>Takes a String storing a header row of a data file and a String column name, and outputs the column index of the given column name.<br><br><b>Parameters:</b><br><code>headerRow</code> - String header row<br><code>colName</code> - String column name<br><br><b>Returns:</b><br>Returns the column index of <code>colName</code></td>
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
  <td><pre>int indexOf​Nth(String base,<br>               String toFind,<br>               int n)</pre>Takes a String and a String to find and produces the index of the nth occurrence of toFind within base (the first occurrence corresponds to n = 0). Produces -1 if toFind appears less than (n + 1) times.<br><br><b>Parameters:</b><br><code>base</code> - String being searched<br><code>toFind</code> - substring to be found<br><code>n</code> - which occurrence of toFind to return the index of<br><br><b>Returns:</b><br>Returns the index of the nth occurrence of <code>toFind</code> within <code>base</code>.<br>Returns -1 if <code>toFind</code> appears less than (<code>n</code> - 1) times.</td>
</tr>
</table>

<a id="intAtColumn"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>intAtColumn</th>
  </tr>
</thead>
<tr>
  <td><pre>int intAtColumn(String dataRow,<br>                int col)</pre>Takes a comma separated String of data and a column index and outputs the data in the appropriate column as an integer.<br><br><b>Parameters:</b><br><code>dataRow</code> - a String row of data<br><code>col</code> - integer column index<br><br><b>Returns:</b><br>Returns the data as an integer from a row at the given column index.</td>
</tr>
</table>

<a id="intToDouble"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>intToDouble</th>
  </tr>
</thead>
<tr>
  <td><pre>double intToDouble(int n)</pre>Takes an integer and returns a double-valued result of the integer.<br><br><b>Parameters:</b><br><code>n</code> - integer to be represented as a double<br><br><b>Returns:</b><br>Returns <code>n</code> as a double.</td>
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
  <td><pre>String intToString(int n)</pre>Takes an integer and returns a String containing the decimal digits of the integer.<br><br><b>Parameters:</b><br><code>n</code> - integer to be represented as a String<br><br><b>Returns:</b><br>Returns a String object representing the specified integer</td>
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
  <td><pre>int length(String s)</pre>Takes a String and produces its length.<br><br><b>Parameters:</b><br><code>s</code> - a String<br><br><b>Returns:</b><br>Returns the length of <code>s</code>.</td>
</tr>
</table>

<a id="longToString"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>longToString</th>
  </tr>
</thead>
<tr>
  <td><pre>int longToString(long l)</pre>Returns the String representation of the long input.<br><br><b>Parameters:</b><br><code>l</code> - a long<br><br><b>Returns:</b><br>Returns a String object representing the specified long</td>
</tr>
</table>

<a id="maxDouble"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>maxDouble</th>
  </tr>
</thead>
<tr>
  <td><pre>double maxDouble(String csv,<br>                 int col)</pre>Consumes a table as a String and a column index. Returns the maximum value of the data in that column, assuming all of the data can be parsed as doubles.<br><br><b>Parameters:</b><br><code>csv</code> - table of data<br><code>col</code> - column index to find maximum double in<br><br><b>Returns:</b><br>Returns the maximum of double data in a column.</td>
</tr>
</table>

<a id="maxInt"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>maxInt</th>
  </tr>
</thead>
<tr>
  <td><pre>int maxInt(String csv,<br>           int col)</pre>Consumes a table as a String and a column index. Returns the maximum value of the data in that column, assuming all of the data can be parsed as ints.<br><br><b>Parameters:</b><br><code>csv</code> - table of data<br><code>col</code> - column index to find maximum integer in<br><br><b>Returns:</b><br>Returns the maximum of integer data in a column.</td>
</tr>
</table>

<a id="meanDouble"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>meanDouble</th>
  </tr>
</thead>
<tr>
  <td><pre>double meanDouble(String csv,<br>                  int col)</pre>Consumes a table as a String and a column index. Returns the mean value of the data in that column, assuming all of the data can be parsed as a double.<br><br><b>Parameters:</b><br><code>csv</code> - table of data<br><code>col</code> - column index to find the mean of<br><br><b>Returns:</b><br>Returns the mean of double data in a column.</td>
</tr>
</table>

<a id="meanInt"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>meanInt</th>
  </tr>
</thead>
<tr>
  <td><pre>int meanInt(String csv,<br>            int col)</pre>Consumes a table as a String and a column index. Returns the mean value of the data in that column, assuming all of the data can be parsed as an integer.<br><br><b>Parameters:</b><br><code>csv</code> - table of data<br><code>col</code> - column index to find the mean of<br><br><b>Returns:</b><br>Returns the mean of integer data in a column.</td>
</tr>
</table>

<a id="medianDouble"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>medianDouble</th>
  </tr>
</thead>
<tr>
  <td><pre>double medianDouble(String csv,<br>                    int col)</pre>Consumes a table as a String and a column index. Returns the median value of the data in that column, assuming all of the data can be parsed as a double.<br><br><b>Parameters:</b><br><code>csv</code> - table of data<br><code>col</code> - column index to find the median of<br><br><b>Returns:</b><br>Returns the median of double data in a column.</td>
</tr>
</table>

<a id="medianInt"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>medianInt</th>
  </tr>
</thead>
<tr>
  <td><pre>int medianInt(String csv,<br>              int col)</pre>Consumes a table as a String and a column index. Returns the median value of the data in that column, assuming all of the data can be parsed as an integer.<br><br><b>Parameters:</b><br><code>csv</code> - table of data<br><code>col</code> - column index to find the median of<br><br><b>Returns:</b><br>Returns the median of integer data in a column.</td>
</tr>
</table>

<a id="minDouble"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>minDouble</th>
  </tr>
</thead>
<tr>
  <td><pre>double minDouble(String csv,<br>                 int col)</pre>Consumes a table as a String and a column index. Returns the minimum value of the data in that column, assuming all of the data can be parsed as a double.<br><br><b>Parameters:</b><br><code>csv</code> - table of data<br><code>col</code> - column index to find the minimum in<br><br><b>Returns:</b><br>Returns the minimum of double data in a column.</td>
</tr>
</table>

<a id="minInt"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>minInt</th>
  </tr>
</thead>
<tr>
  <td><pre>int minInt(String csv,<br>           int col)</pre>Consumes a table as a String and a column index. Returns the minimum value of the data in that column, assuming all of the data can be parsed as an integer.<br><br><b>Parameters:</b><br><code>csv</code> - table of data<br><code>col</code> - column index to find the minimum in<br><br><b>Returns:</b><br>Returns the minimum of integer data in a column.</td>
</tr>
</table>

<a id="newLinefy"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>newLinefy</th>
  </tr>
</thead>
<tr>
  <td><pre>String newLinefy(String t)</pre>Add new line at start and end of row of data.<br><br><b>Parameters:</b><br><code>t</code> - String to be newLinefied<br><br><b>Returns:</b><br>Returns <code>t</code> with a new line added to the start and end of it.</td>
</tr>
</table>

<a id="numColumns"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>numColumns</th>
  </tr>
</thead>
<tr>
  <td><pre>int numColumns(String header)</pre>Takes a String storing header row of a data file and outputs the number of columns in this file.<br><br><b>Parameters:</b><br><code>header</code> - a String header row<br><br><b>Returns:</b><br>Returns the number of columns in <code>header</code></td>
</tr>
</table>

<a id="numRows"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>numRows</th>
  </tr>
</thead>
<tr>
  <td><pre>int numRows(String csv)</pre>Consumes a table as a String and produces the number of rows in it (including the header row).<br><br><b>Parameters:</b><br><code>csv</code> - table to count the number of rows in<br><br><b>Returns:</b><br>Returns the number of rows in <code>csv</code></td>
</tr>
</table>

<a id="parseDouble"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>parseDouble</th>
  </tr>
</thead>
<tr>
  <td><pre>double parseDouble(String s)</pre>Takes a string with characters in double format—including with a decimal point and/or in scientific notation—and produces an approximation of that number. Results in an error if the string isn't in double format.<br><br><b>Parameters:</b><br><code>s</code> - String to be parsed<br><br><b>Returns:</b><br>Returns <code>s</code> as a double.</td>
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

<a id="parseLong"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>parseLong</th>
  </tr>
</thead>
<tr>
  <td><pre>long parseLong(String s)</pre>Takes a String an parses it as a signed decimal long or causes an error if the characters do not form a long.<br><br><b>Parameters:</b><br><code>s</code> - String to be parsed<br><br><b>Returns:</b><br>Returns <code>s</code> as a long.</td>
</tr>
</table>

<a id="pow"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>pow</th>
  </tr>
</thead>
<tr>
  <td><pre>double pow(double base,<br>  double expt)</pre>Takes a double as a base number and another double as the exponent and calculates the base to the power of the exponent in terms of a double.<br><br><b>Parameters:</b><br><code>base</code> - a double as the base of the power operation<br><code>expt</code> - a double as the exponent of the power operation<br><br><b>Returns:</b><br>Returns the  base to the exponent power value as a double based off of the input double.</td>
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
  <td><pre>String readFile(String path)<br>                throws java.io.IOException</pre>Takes a String representing a path to a file and returns a String of the contents of the file.<br><br><b>Parameters:</b><br><code>path</code> - String path of the file to be read<br><br><b>Returns:</b><br>returns the file contents of path as a String<br><br><b>Throws:</b><br><code>java.io.IOException</code> - if file at path cannot be read or found</td>
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
  <td><pre>int roundTo​(int n,<br>            int toRoundTo)</pre>Takes two ints and produces the first number rounded to the nearest multiple of the second<br><br><b>Parameters:</b><br><code>n</code> - an integer<br><code>toRoundTo</code> - the integer which n will be rounded to the nearest multiple of<br><br><b>Returns:</b><br>Returns <code>n</code> rounded to the nearest multiple of <code>toRoundTo</code>.</td>
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
  <td><pre>boolean show(String s,<br>             int numLines)</pre>Takes a String and a number of lines to display, prints that many lines of the string (or the whole string if it has fewer lines). Returns true if numLines were printed, false if fewer were printed.<br><br><b>Parameters:</b><br><code>s</code> - String part or all of which will be printed<br><code>numLines</code> - integer number of lines of s to print<br><br><b>Returns:</b><br>returns true upon successfully printing all numLines number of lines; returns false if numLines is greater than the number of lines in s</td>
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

<a id="sin"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>sin</th>
  </tr>
</thead>
<tr>
  <td><pre>double sin(double n)</pre>Takes a double and returns the sine of the double value.<br><br><b>Parameters:</b><br><code>n</code> - a double<br><br><b>Returns:</b><br>Returns the sine value as a double based off of the input double.</td>
</tr>
</table>

<a id="sqrt"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>sqrt</th>
  </tr>
</thead>
<tr>
  <td><pre>double sqrt(double n)</pre>Takes a double and returns the square root of the double value.<br><br><b>Parameters:</b><br><code>n</code> - a double<br><br><b>Returns:</b><br>Returns the square root value as a double based off of the input double.</td>
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
  <td><pre>boolean stringEquals(String s1,<br>                     String s2)</pre>Takes two Strings and returns true if they contain the same characters in the same order, false otherwise.<br><br><b>Parameters:</b><br><code>s1</code> - first String to be compared<br><code>s2</code> - second String to be compared<br><br><b>Returns:</b><br>returns true if s1 and s2 are equal, false otherwise</td>
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
  <td><pre>String substring(String base,<br>                 int beginIndex,<br>                 int endIndex)</pre>Takes a String, a start index, and end index. Produces a String containing the characters of the input String from start (inclusive) to end (exclusive). Causes an error if indices are out of range or in the wrong order.<br><br><b>Parameters:</b><br><code>base</code> - a String<br><code>beginIndex</code> - integer start index of substring<br><code>endIndex</code> - integer end index of substring, not inclusive<br><br><b>Returns:</b><br>Returns a String containing the characters from <code>beginIndex</code> (inclusive) to <code>endIndex</code> (exclusive).</td>
</tr>
</table>

<a id="sumDouble"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>sumDouble</th>
  </tr>
</thead>
<tr>
  <td><pre>double sumDouble(String csv,<br>                 int col)</pre>Consumes a table as a String and a column index. Returns the sum of the data in that column, assuming all of the data can be parsed as a double.<br><br><b>Parameters:</b><br><code>csv</code> - table of data<br><code>col</code> - column index to find the sum of<br><br><b>Returns:</b><br>Returns the sum of double data in a column.</td>
</tr>
</table>

<a id="sumInt"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>sumInt</th>
  </tr>
</thead>
<tr>
  <td><pre>int sumInt(String csv,           int col)</pre>Consumes a table as a String and a column index. Returns the sum of the data in that column, assuming all of the data can be parsed as an integer.<br><br><b>Parameters:</b><br><code>csv</code> - table of data<br><code>col</code> - column index to find the sum of<br><br><b>Returns:</b><br>Returns the sum of integer data in a column.</td>
</tr>
</table>

<a id="tan"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>tan</th>
  </tr>
</thead>
<tr>
  <td><pre>double tan(double n)</pre>Takes a double and returns the trigonometric tangent of the double value.<br><br><b>Parameters:</b><br><code>n</code> - a double<br><br><b>Returns:</b><br>Returns the trigonometric tangent value as a double based off of the input double.</td>
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
  <td><pre>String trim(String s)</pre>Takes a String and produces a String with all whitespace characters (spaces, tabs, and newlines) removed from the beginning and end.<br><br><b>Parameters:</b><br><code>s</code> - String to be trimmed<br><br><b>Returns:</b><br>returns a copy of s with leading and trailing white space removed</td>
</tr>
</table>
