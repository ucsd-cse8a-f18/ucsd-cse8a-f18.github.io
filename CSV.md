---
layout: page
title: "Documentation for CSV.java"
---
# Documentation for CSV.java

### Constructor Summary
<table class="table table-striped">
<thead>
  <tr>
    <th>Constructor</th><th>Description</th>
  </tr>
</thead>
<tr>
<td class="monospace"><a href="#constr">CSV</a><br>(String table)</td><td>Constructs a CSV object with rows created by splitting the given string on newlines, and a header from the first row.</td>
</tr>
</table>

### Method Summary
<table class="table table-striped">
<thead>
  <tr>
    <th>Modifier and Type</th><th>Method</th><th>Description</th>
  </tr>
</thead>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#getData">getData</a><br>(int rowIndex,<br>int colIndex)</td><td>Consumes a table as a String and an integer number of lines. Returns the first specified number of rows (not including the header row) of the table as a String.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#getNumCols">getNumCols</a>()</td><td>Returns the number of columns in the table</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#getNumRows">getNumRows</a>()</td><td>Returns the number of rows in the table</td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#getRow">getRow</a><br>(int rowIndex)</td><td>Returns the row at the given index as a String</td>
</tr>
<tr>
<td class="monospace">String[]</td><td class="monospace"><a href="#getRows">getRows</a>()</td><td>Returns the rows of the table as an array of Strings</td>
</tr>
<tr>
<td class="monospace">double</td><td class="monospace"><a href="#maxDouble">maxDouble</a><br>(int colIndex)</td><td>Assuming that values at column colIndex are formatted as doubles, returns the maximum value among the data at the given column index across all rows in this CSV object.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#maxInt">maxInt</a><br>(int colIndex)</td><td>Assuming that values at column colIndex are formatted as integers, returns the maximum value among the data at the given column index across all rows in this CSV object.</td>
</tr>
<tr>
<td class="monospace">double</td><td class="monospace"><a href="#minDouble">minDouble</a><br>(int colIndex)</td><td>Assuming that values at column colIndex are formatted as doubles, returns the minimum value among the data at the given column index across all rows in this CSV object.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#minInt">minInt</a><br>(int colIndex)</td><td>Assuming that values at column colIndex are formatted as integers, returns the maximum value among the data at the given column index across all rows in this CSV object.</td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#toString">toString</a>()</td><td>Returns the String representation of the CSV object</td>
</tr>
</table>


### Constructor Detail

<a id="constr"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>CSV</th>
  </tr>
</thead>
<tr>
  <td><pre>public CSV(String table)</pre>Constructs a CSV object with rows created by splitting the given string on newlines, and a header from the first row.</td>
</tr>
</table>

### Method Detail

<a id="getNumRows"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>getNumRows</th>
  </tr>
</thead>
<tr>
  <td><pre>public int getNumRows()</pre>Returns the number of columns in the table<br><br><b>Returns:</b><br>the number of rows in the table</td>
</tr>
</table>

<a id="getNumCols"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>getNumCols</th>
  </tr>
</thead>
<tr>
  <td><pre>public int getNumCols()</pre>Returns the number of columns in the table<br><br><b>Returns:</b><br>the number of columns in the table</td>
</tr>
</table>

<a id="getRows"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>getRows</th>
  </tr>
</thead>
<tr>
  <td><pre>public String[] getRows()</pre>Returns the rows of the table as an array of Strings<br><br><b>Returns:</b><br>the array of rows in the table</td>
</tr>
</table>

<a id="getData"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>getData</th>
  </tr>
</thead>
<tr>
  <td><pre>public String getData(int rowIndex<br>                      int colIndex)</pre><b>Parameters:</b><br><code>rowIndex</code> - the index of the row to look up<br><code>colIndex</code> - the index of the column to look up<br><br><b>Returns:</b><br>the data at the given row and column index in the table, as a String</td>
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
  <td><pre>public String getRow(int rowIndex)</pre>Returns the row at the given index as a String<br><br><b>Parameters:</b><br><code>rowIndex</code> - the index of the row to look up<br><br><b>Returns:</b><br>the data in the given row as a String</td>
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
  <td><pre>public int maxInt(int colIndex)</pre>Assuming that values at column colIndex are formatted as integers, returns the maximum value among the data at the given column index across all rows in this CSV object.<br><br><b>Parameters:</b><br><code>colIndex</code> - the index of the column to consider<br><br><b>Returns:</b><br>the maximum value</td>
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
  <td><pre>public int minInt(int colIndex)</pre>Assuming that values at column colIndex are formatted as integers, returns the minimum value among the data at the given column index across all rows in this CSV object.<br><br><b>Parameters:</b><br><code>colIndex</code> - the index of the column to consider<br><br><b>Returns:</b><br>the minimum value</td>
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
  <td><pre>public double maxDouble(int colIndex)</pre>Assuming that values at column colIndex are formatted as doubles, returns the maximum value among the data at the given column index across all rows in this CSV object.<br><br><b>Parameters:</b><br><code>colIndex</code> - the index of the column to consider<br><br><b>Returns:</b><br>the maximum value</td>
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
  <td><pre>public double minDouble(int colIndex)</pre>Assuming that values at column colIndex are formatted as doubles, returns the minimum value among the data at the given column index across all rows in this CSV object.<br><br><b>Parameters:</b><br><code>colIndex</code> - the index of the column to consider<br><br><b>Returns:</b><br>the minimum value</td>
</tr>
</table>

<a id="toString"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>toString</th>
  </tr>
</thead>
<tr>
  <td><pre>public String toString()</pre>Returns the String representation of the CSV object<br><br><b>Overrides:</b><br><code>toString</code> in class java.lang.Object<br><br><b>Returns:</b><br>a String representation of this CSV data</td>
</tr>
</table>