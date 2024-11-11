This program passes in a text file and counts the number of times the word is encountered

How to run the program:
```
java -jar --enable-preview countWords.jar words.txt
```

Example of output:
```
$ java -jar --enable-preview countWords.jar words.txt
apple: 210
banana: 139
orange: 139
grape: 139
```

Example of providing too many or no files
```
$ java -jar --enable-preview countWords.jar 
No file provided or too many files provided
------------------------------------------
$ java -jar --enable-preview countWords.jar words.txt words.txt 
No file provided or too many files provided
```