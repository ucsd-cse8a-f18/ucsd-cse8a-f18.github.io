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
<td class="monospace"><a href="#constr">CSV</a>(String table)</td><td>Constructs a CSV object with rows created by splitting the given string on newlines, and a header from the first row.</td>
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
<td class="monospace">String</td><td class="monospace"><a href="#getData">getData</a>(int rowIndex,<br>int colIndex)</td><td>Consumes a table as a String and an integer number of lines. Returns the first specified number of rows (not including the header row) of the table as a String.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#getNumCols">getNumCols</a>()</td><td></td>
</tr>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#getNumRows">getNumRows</a>()</td><td></td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#getRow">getNumRow</a>(int rowIndex)</td><td></td>
</tr>
<td class="monospace">String[]</td><td class="monospace"><a href="#getRows">getNumRows</a>()</td><td></td>
</tr>
<tr>
<td class="monospace">double</td><td class="monospace"><a href="#maxDouble">maxDouble</a>(int colIndex)</td><td>Assuming that values at column colIndex are formatted as doubles, returns the maximum value among the data at the given column index across all rows in this CSV object.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#maxInt">maxInt</a>(int colIndex)</td><td>Assuming that values at column colIndex are formatted as integers, returns the maximum value among the data at the given column index across all rows in this CSV object.</td>
</tr>
<tr>
<td class="monospace">double</td><td class="monospace"><a href="#minDouble">minDouble</a>(int colIndex)</td><td>Assuming that values at column colIndex are formatted as doubles, returns the minimum value among the data at the given column index across all rows in this CSV object.</td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#minInt">minInt</a>(int colIndex)</td><td>Assuming that values at column colIndex are formatted as integers, returns the maximum value among the data at the given column index across all rows in this CSV object.</td>
</tr>
</tr>
<td class="monospace">String</td><td class="monospace"><a href="#toString">toString</a>()</td><td></td>
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
  <td><pre>public CSV(String table)</pre><br><br>Constructs a CSV object with rows created by splitting the given string on newlines, and a header from the first row.</td>
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
  <td><pre>public int getNumRows()</pre><br><br><b>Returns:</b><br>the number of rows in the table</td>
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
  <td><pre>public int getNumCols()</pre><br><br><b>Returns:</b><br>the number of columns in the table</td>
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
  <td><pre>public String[] getRows()</pre><br><br><b>Returns:</b><br>the array of rows in the table</td>
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
  <td><pre>public String getData(int rowIndex<br>                      int colIndex)</pre><br><br><b>Parameters:</b><br><code>rowIndex</code> - the index of the row to look up<br><code>colIndex</code> - the index of the column to look up<br><br><b>Returns:</b><br>the data at the given row and column index in the table, as a String</td>
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
  <td><pre>public String getRow(int rowIndex)</pre><br><br><b>Parameters:</b><br><code>rowIndex</code> - the index of the row to look up<br><br><b>Returns:</b><br>the data in the given row as a String</td>
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
  <td><pre>public int maxInt(int colIndex)</pre><br><br>Assuming that values at column colIndex are formatted as integers, returns the maximum value among the data at the given column index across all rows in this CSV object.<br><br><b>Parameters:</b><br><code>colIndex</code> - the index of the column to consider<br><br><b>Returns:</b><br>the maximum value</td>
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
  <td><pre>public int minInt(int colIndex)</pre><br><br>Assuming that values at column colIndex are formatted as integers, returns the minimum value among the data at the given column index across all rows in this CSV object.<br><br><b>Parameters:</b><br><code>colIndex</code> - the index of the column to consider<br><br><b>Returns:</b><br>the minimum value</td>
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
  <td><pre>public double maxDouble(int colIndex)</pre><br><br>Assuming that values at column colIndex are formatted as doubles, returns the maximum value among the data at the given column index across all rows in this CSV object.<br><br><b>Parameters:</b><br><code>colIndex</code> - the index of the column to consider<br><br><b>Returns:</b><br>the maximum value</td>
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
  <td><pre>public double minDouble(int colIndex)</pre><br><br>Assuming that values at column colIndex are formatted as doubles, returns the minimum value among the data at the given column index across all rows in this CSV object.<br><br><b>Parameters:</b><br><code>colIndex</code> - the index of the column to consider<br><br><b>Returns:</b><br>the minimum value</td>
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
  <td><pre>public String toString()</pre><br><br><b>Overrides:<br><code>toString</code> in class java.lang.Object<br><br><b>Returns:</b><br>a String representation of this CSV data</td>
</tr>
</table>