---
layout: page
title: "Documentation for Media.java"
---
# Documentation for Media.java

### Method Summary
<table class="table table-striped">
<thead>
  <tr>
    <th>Modifier and Type</th><th>Method</th><th>Description</th>
  </tr>
</thead>
<tr>
<td class="monospace">static boolean</td><td class="monospace"><a href="#exploreSound">explore</a><br>(int[] sound)</td><td>Opens an interactive explore window that interprets an integer array as an array of samples.</td>
</tr>
<tr>
<td class="monospace">static boolean</td><td class="monospace"><a href="#exploreImage">explore</a><br>(Image picture)</td><td>Opens an interactive explore window that interprets an Image object as an image.</td>
</tr>
<tr>
<td class="monospace">static String</td><td class="monospace"><a href="#readFile">readFile</a><br>(String path)</td><td>Reads a file from the given path into a String.</td>
</tr>
<tr>
<td class="monospace">static Image</td><td class="monospace"><a href="#readImage">readImage</a><br>(String path)</td><td>Reads a file from the given path into an Image object, assuming the file is a png or bmp file.</td>
</tr>
<tr>
<td class="monospace">static int[]</td><td class="monospace"><a href="#readSound">readSound</a><br>(String path)</td><td>Reads a file from the given path into an integer array, assuming the file is an audio file. Always tries to read the file at a rate of 22050 Hz</td>
</tr>
  
<tr>
<td class="monospace">static void</td><td class="monospace"><a href="#saveSound">saveSound</a><br>(int[] sound, String path)</td><td>Saves the given sound as a 22050 Hz wav file at the given path.</td>
</tr>
<tr>
<td class="monospace">static void</td><td class="monospace"><a href="#saveImage">saveImage</a><br>(Image image, String path)</td><td>Saves the given image as a file at the given path.</td>
</tr>

</table>

### Method Detail

<a id="readFile"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>readFile</th>
  </tr>
</thead>
<tr>
  <td><pre>public static String readFile(String path)</pre>Reads a file from the given path into a String. Produces an error if the path does not exist or the file cannot be read.<br><br><b>Parameters:</b><br><code>path</code> the path to read the file from<br><br><b>Returns:</b><br>the contents as a String</td>
</tr>
</table>

<a id="readSound"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>readSound</th>
  </tr>
</thead>
<tr>
  <td><pre>public static int[] readSound(path)</pre>Reads a file from the given path into an integer array, assuming the file is an audio file. Always tries to read the file at a rate of 22050 Hz<br><br><b>Parameters:</b><br><code>path</code> - the path to read the file from<br><br><b>Returns:</b><br>the sound as an array of samples of amplitudes</td>
</tr>
</table>

<a id="readImage"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>readImage</th>
  </tr>
</thead>
<tr>
  <td><pre>public static Image readImage(String path)</pre>Reads a file from the given path into an Image object, assuming the file is a png or bmp file.<br><br><b>Parameters:</b><br><code>path</code> - the path to read the image from<b>Returns:</b><br>an Image object with pixels read from the given file</td>
</tr>
</table>

<a id="exploreSound"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>explore</th>
  </tr>
</thead>
<tr>
  <td><pre>public static boolean explore(int[] sound)</pre>Opens an interactive explore window that interprets an integer array as an array of samples.<br><br><b>Parameters:</b><br><code>sound</code> - the sound as an array of samples<b>Returns:</b><br>always returns true</td>
</tr>
</table>

<a id="exploreImage"></a>
<table class="table table-striped">
<thead>
  <tr>
    <th>explore</th>
  </tr>
</thead>
<tr>
  <td><pre>public static boolean explore(Image picture)</pre>Opens an interactive explore window that interprets an Image object as an image.<br><br><b>Parameters:</b><br><code>picture</code> - the Image object to explore<b>Returns:</b><br>always returns true</td>
</tr>
</table>
