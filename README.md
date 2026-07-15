# Random 2D Array Highlighter

## Description
This is a Java console application that generates a **P × P** array filled with random even numbers between **2 and 16** (inclusive). The program allows the user to select an even number, highlights all its occurrences in the array, and displays the total number of times it appears.

## Features
- Accepts user input for the array size (P × P).
- Generates random even numbers from **2 to 16**.
- Displays the generated array in a formatted table.
- Highlights all occurrences of the selected even number using **[ ]**.
- Counts and displays the total occurrences of the selected number.
- Handles invalid inputs such as:
  - Non-numeric values
  - Odd numbers
  - Numbers outside the range 2–16

## Technologies Used
- Java
- Scanner (User Input)
- Random (Random Number Generation)

## Project Structure

```
HighlightArray.java
README.md
```

## How to Compile

```bash
javac HighlightArray.java
```

## How to Run

```bash
java HighlightArray
```

## Sample Execution

```
Enter array size (for P×P array): 4

Generated 2D array:

    00   01   02   03
00 | 10 | 4 | 16 | 2 |
01 | 14 | 10 | 6 | 8 |
02 | 2 | 12 | 10 | 16 |
03 | 4 | 14 | 10 | 8 |

Enter a number to highlight (even number 2–16): 10

Array with 10 highlighted:

00 | [10] | 4 | 16 | 2 |
01 | 14 | [10] | 6 | 8 |
02 | 2 | 12 | [10] | 16 |
03 | 4 | 14 | [10] | 8 |

Number 10 appeared 4 time(s).
```

## Input Validation
The program validates:
- Array size must be a positive integer.
- Highlight number must be an even number between **2** and **16**.
- Invalid inputs are rejected, and the user is prompted again.

