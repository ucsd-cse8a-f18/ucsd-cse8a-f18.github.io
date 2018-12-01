---
layout: page
title: "Documentation for Image.java"
---
# Documentation for Image.java

### Constructor Summary
<table class="table table-striped">
<thead>
  <tr>
    <th>Constructor</th><th>Description</th>
  </tr>
</thead>
<tr>
<td class="monospace"><a href="#constr">Image</a><br>(int width,<br>int height,<br>Color[] pixels)</td><td>Constructor that creates an image with width-many pixels across, height-many pixels down, and where the colors of the pixels are specified by successive elements of the given array of Colors, starting at the top-left corner and moving across (left to right) and then down.</td>
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
<td class="monospace">Color</td><td class="monospace"><a href="#getColorAtPos">getColorAtPos</a><br>(int col,<br>int row)</td><td></td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#getHeight">getHeight</a>()</td><td></td>
</tr>
<tr>
<td class="monospace">Color[]</td><td class="monospace"><a href="#getPixels">getPixels</a>()</td><td></td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#getWidth">getWidth</a>()</td><td></td>
</tr>
<tr>
<td class="monospace">int</td><td class="monospace"><a href="#size">size</a>()</td><td></td>
</tr>
<tr>
<td class="monospace">String</td><td class="monospace"><a href="#toString">toString</a>()</td><td></td>
</tr>
</table>


### Constructor Detail

<a id="constr"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>Image</th>
  </tr>
</thead>
<tr>
  <td><pre>Image(int width,<br>      int height,<br>      Color[] pixels)</pre>Constructor that creates an image with width-many pixels across, height-many pixels down, and where the colors of the pixels are specified by successive elements of the given array of Colors, starting at the top-left corner and moving across (left to right) and then down.</td>
</tr>
</table>

### Method Detail

<a id="toString"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>toString</th>
  </tr>
</thead>
<tr>
  <td><pre>public String toString()</pre><b>Overrides:</b><br><code>toString</code> in class java.lang.Object<br><br><b>Returns:</b><br>a String representation of this Image.</td>
</tr>
</table>

<a id="getColorAtPos"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>getColorAtPos</th>
  </tr>
</thead>
<tr>
  <td><pre>Color getColorAtPos(int col,<br>                    int row)</pre><b>Parameters:</b><br><code>col</code> - the column of the pixel to look up<br><code>row</code> - the row of the pixel to look up<br><br><b>Returns:</b><br>the Color at the given location in the image</td>
</tr>
</table>

<a id="getWidth"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>getWidth</th>
  </tr>
</thead>
<tr>
  <td><pre>int getWidth()</pre><b>Returns:</b><br>the width in pixels of this Image object</td>
</tr>
</table>

<a id="getHeight"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>getHeight</th>
  </tr>
</thead>
<tr>
  <td><pre>int getHeight()</pre><b>Returns:</b><br>the height in pixels of this Image object</td>
</tr>
</table>

<a id="getPixels"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>getPixels</th>
  </tr>
</thead>
<tr>
  <td><pre>Color getPixels()</pre><b>Returns:</b><br>the array of Colors representing pixels in this Image object</td>
</tr>
</table>

<a id="size"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>size</th>
  </tr>
</thead>
<tr>
  <td><pre>int size()</pre><b>Returns:</b><br>the number of pixels in this Image object</td>
</tr>
</table>