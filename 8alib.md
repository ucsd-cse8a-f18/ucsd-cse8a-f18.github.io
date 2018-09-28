---
layout: page
title: "8ALib.java Javadoc"
---
# PA1 8ALib Javadoc

## 8ALib.java

<style>
table {
    width:100%;
}
</style>

### Method Summary
| Modifier and Type | Method | Description |
| ----------------- | ------ | ----------- |
| `java.lang.String`| [`concat`](#conct)<br>`(java.lang.String left,`<br>`java.lang.String right)` | Returns a String of two concatentated Strings |
| `int` | [`count`](#count)<br>`(java.lang.String base,`<br>`java.lang.String toFind)` | Returns the number of times a substring appears in a String |
| `long` | [`dateMonthDayYearTime`](#dateMonthDayYearTime)<br>`(java.lang.String date)` | Returns the String formatted date as a long |
| `long` | [`dateYearMonthDayTime`](#dateYearMonthDayTime)<br>`(java.lang.String date)` | Returns the String formatted date as a long |
| `int` | [`indexOf`](#indexOf)<br>`(java.lang.String base,`<br>`java.lang.String toFind)` | Returns the index within a String of the first occurrence of the specified substring |
| `int` | [`indexOfNth`](#indexOfNth)<br>`(java.lang.String base,`<br>`java.lang.String toFind)` | Returns the index of the nth occurrence of a substring in a String |
| `java.lang.String` | [`intToString`](#intToString)<br>`(int n)` | Returns an integer represented as a String |
| `int` | [`length`](#length)<br>`(java.lang.String s)` | Returns the length of a String |
| `int` | [`parseInt`](#parseInt)<br>`(java.lang.String s)` | Parses the String argument and returns its represented integer value |
| `java.lang.String` | [`readFile`](#readFile)<br>`(java.lang.String path)` | Reads file specified by a path and returns its contents as a String |
| `java.lang.String` | [`readLine`](#readLine)<br>`(java.lang.String path,`<br>`int index)` | Returns the line index of a file specified by a path |
| `int` | [`roundTo`](#roundTo)<br>`(int n,`<br>`int toRoundTo)` | Returns an integer rounded to the nearest multiple of another integer. |
| `boolean` | [`show`](#show)<br>`(java.lang.String s,`<br>`int numLines)` | Prints a specified number of lines of a String and returns true when successfully completed;<br>returns false if the specified number of lines is greater than the number of lines in the String |
| `int` | [`sign`](#sign)<br>`(int n)` | Returns -1, 0, or 1 based on the sign of an integer |
| `int` | [`square`](#square)<br>`(int n)` | Returns the square of an integer |
| `boolean` | [`stringEquals`](#stringEquals)<br>`(java.lang.String s1,`<br>`java.lang.String s2)` | Compares two Strings and returns true if they are equal, false otherwise |
| `java.lang.String` | [`substring`](#substring)<br>`(java.lang.String base,`<br>`int beginIndex,`<br>`int endIndex)` | Returns the substring of a String from one specified index until the second specified index. |
| `java.lang.String` | [`trim`](#trim)<br>`(java.lang.String base s)` | Returns a copy of a string with leading and trailing white space removed |

### Method Detail

<a id="square"></a>

| square |
| :--- |
| <pre>int square(int n)</pre>Returns the square of an integer<br><br><b>Parameters:</b><br>`n` - an integer<br><br><b>Returns:</b><br>returns the square of n |

<a id="sign"></a>

| sign |
| :--- |
| <pre>int sign(int n)</pre>Returns -1, 0, or 1 based on the sign of an integer<br><br><b>Parameters:</b><br>`n` - an integer<br><br><b>Returns:</b><br>returns -1 if n is negative, 0 if n is 0, 1 if n is positive |

<a id="roundTo"></a>

| roundTo |
| :--- |
| <pre>int roundTo​(int n,<br>            int toRoundTo)</pre>Returns an integer rounded to the nearest multiple of another integer. If the integer is equidistant between two multiples, the lesser value is returned.<br><br><b>Parameters:</b><br>`n` - an integer<br><br><b>Returns:</b><br>returns n rounded to the nearest multiple of toRoundTo |

<a id="length"></a>

| length |
| :--- |
| <pre>int length​(java.lang.String s)</pre>Returns the length of a String<br><br><b>Parameters:</b><br>`s` - a String<br><br><b>Returns:</b><br>returns the length of String s |

<a id="substring"></a>

| substring |
| :--- |
| <pre>java.lang.String substring(java.lang.String base,<br>                           int beginIndex,<br>                           int endIndex)</pre>Returns the substring of a String from one specified index until the second specified index.<br><br><b>Parameters:</b><br>`base` - a String<br>`beginIndex` - integer start index of substring<br>`endIndex` - integer end index of substring, not inclusive<br><br><b>Returns:</b><br>returns the substring from beginIndex until endIndex of base |

<a id="concat"></a>

| concat |
| :--- |
| <pre>java.lang.String concat​(java.lang.String left,<br>                        java.lang.String right)</pre>Returns a String of two concatenated Strings<br><br><b>Parameters:</b><br>`left` - first string in concatenation<br>`right` - second string in concatenation<br><br><b>Returns:</b><br>returns the concatenated String of left and right |

<a id="indexOf"></a>

| indexOf |
| :--- |
| <pre>int indexOf​(java.lang.String base,<br>            java.lang.String toFind)</pre>Returns the index within a String of the first occurrence of the specified substring<br><br><b>Parameters:</b><br>`base` - String being searched<br>`toFind` - substring to be found<br><br><b>Returns:</b><br>returns the index of the first occurrence of toFind in base |

<a id="indexOfNth"></a>

| indexOfNth |
| :--- |
| <pre>int indexOf​Nth(java.lang.String base,<br>               java.lang.String toFind,<br>               int n)</pre>Returns the index of the nth occurrence of a substring in a String<br><br><b>Parameters:</b><br>`base` - String being searched<br>`toFind` - substring to be found<br>`n` - which occurrence of toFind to return the index of<br><br><b>Returns:</b><br>returns the index of the nth occurrence of toFind in base |

<a id="parseInt"></a>

| parseInt |
| :--- |
| <pre>int parseInt(java.lang.String s)</pre>Parses the String argument and returns its represented integer value<br><br><b>Parameters:</b><br>`s` - String to be parsed<br><br><b>Returns:</b><br>returns String s represented as an integer |

<a id="readLine"></a>

| readLine |
| :--- |
| <pre>java.lang.String readLine​(java.lang.String path,<br>                          int index)<br>                          throws java.io.IOException</pre>Returns the line index of a file specified by a path<br><br><b>Parameters:</b><br>`path` - String path of the file to be read<br>`index` - integer line index to be read from the file specified by path<br><br><b>Returns:</b><br>returns the line specified by index as a String<br><br><b>Throws:</b><br>`java.io.IOException` - if file at path cannot be read or found |

<a id="count"></a>

| count |
| :--- |
| <pre>int count(java.lang.String base,<br>          java.lang.String toFind)</pre>Returns the number of times a substring appears in a String<br><br><b>Parameters:</b><br>`base` - String being searched<br>`toFind` - substring to be found<br><br><b>Returns:</b><br>returns the number of occurrences of toFind in base |

<a id="dateMonthDayYearTime"></a>

| dateMonthDayYearTime |
| :--- |
| <pre>long dateMonthDayYearTime(java.lang.String date)</pre>Returns the String formatted date as a long<br><br><b>Parameters:</b><br>`date` - String in month, day, year, time format "MMMMM dd yyyy hh:mm z"<br><br><b>Returns:</b><br>returns how many milliseconds have passed since January 1, 1970, 00:00:00 GMT |

<a id="dateYearMonthDayTime"></a>

| dateYearMonthDayTime |
| :--- |
| <pre>long dateYearMonthDayTime(java.lang.String date)</pre>Returns the String formatted date as a long<br><br><b>Parameters:</b><br>`date` - String in year, month, day, time format "yyyy-MM-dd'T'HH:mm:ss"<br><br><b>Returns:</b><br>returns how many milliseconds have passed since January 1, 1970, 00:00:00 GMT |

<a id="show"></a>

| show |
| :--- |
| <pre>boolean show(java.lang.String s,<br>             int numLines)</pre>Prints a specified number of lines of a String and returns true when successfully completed; returns false if the specified number of lines is greater than the number of lines in the String<br><br><b>Parameters:</b><br>`s` - String part or all of which will be printed<br>`numLines` - integer number of lines of s to print<br><br><b>Returns:</b><br>returns true upon successfully printing all numLines number of lines; returns false if numLines is greater than the number of lines in s |

<a id="readFile"></a>

| readFile |
| :--- |
| <pre>java.lang.String readFile(java.lang.String path)<br>                          throws java.io.IOException</pre>Reads file specified by a path and returns its contents as a String<br><br><b>Parameters:</b><br>`path` - String path of the file to be read<br><br><b>Returns:</b><br>returns the file contents of path as a String<br><br><b>Throws:</b><br>`java.io.IOException` - if file at path cannot be read or found |

<a id="intToString"></a>

| intToString |
| :--- |
| <pre>java.lang.String intToString(int n)</pre>Returns an integer represented as a String<br><br><b>Parameters:</b><br>`n` - integer to be represented as a String<br><br><b>Returns:</b><br>returns a String object representing the specified integer |

<a id="trim"></a>

| trim |
| :--- |
| <pre>java.lang.String trim(java.lang.String s)</pre>Returns a copy of a string with leading and trailing white space removed<br><br><b>Parameters:</b><br>`s` - String to be trimmed<br><br><b>Returns:</b><br>returns a copy of s with leading and trailing white space removed |

<a id="stringEquals"></a>

| stringEquals |
| :--- |
| <pre>boolean stringEquals(java.lang.String s1,<br>                     java.lang.String s2)</pre>Compares two Strings and returns true if they are equal, false otherwise<br><br><b>Parameters:</b><br>`s1` - first String to be compared<br>`s2` - second String to be compared<br><br><b>Returns:</b><br>returns true if s1 and s2 are equal, false otherwise |
