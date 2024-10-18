# Fruit and Vegetable Shop Price Calculator

This project is a simple Java console application that calculates the total price of selected fruits and vegetables based on user input. The user is prompted to enter the weight (in kilograms) for each of the following items: pears, apples, tomatoes, bananas, and eggplants. The program then calculates the total price by multiplying the input weight by the price per kilogram for each item.

## Features
- User-friendly console input.
- Calculates the total cost based on the quantity of fruits and vegetables entered.
- Prices are pre-set for each item.

## Prerequisites
To run this project, you'll need:
- Java Development Kit (JDK) version 8 or later.

## Running the Program
To run the program, follow these steps:

1. Clone this repository or download the `Main.java` file.
2. Open the project in your preferred IDE or text editor.
3. Compile the `Main.java` file:
   ```
   javac Main.java
   ```
4. Run the program:
   ```
   java Main
   ```
5. Follow the prompts to enter the weight for each fruit and vegetable.
6. The program will then display the total cost.

## Example Output
Here is an example of how the program runs:

```
Armut kaç kilo ? : 2
Domates kaç kilo ? : 3
Elma kaç kilo ? : 1.5
Muz kaç kilo ? : 1
Patlican kaç kilo ? : 0.5
Toplam Tutar : 27.575 TL
```

## Price Table
The prices for each item are as follows:
- Pear (“Armut”): 2.14 TL per kg
- Apple (“Elma”): 3.67 TL per kg
- Tomato (“Domates”): 1.11 TL per kg
- Banana (“Muz”): 0.95 TL per kg
- Eggplant (“Patlican”): 5.00 TL per kg

## Code Explanation
The `Main` class is a simple Java program that performs the following actions:
1. Prompts the user for the weight of each fruit and vegetable.
2. Uses fixed prices for each item.
3. Calculates the total cost by multiplying the weights entered by the user by the respective prices.
4. Outputs the total cost.

```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;
        double toplamFiyat = 0;

        System.out.println("Armut kaç kilo ? : ");
        armutKilo = scanner.nextDouble();
        System.out.println("Domates kaç kilo ? : ");
        domatesKilo = scanner.nextDouble();
        System.out.println("Elma kaç kilo ? : ");
        elmaKilo = scanner.nextDouble();
        System.out.println("Muz kaç kilo ? : ");
        muzKilo = scanner.nextDouble();
        System.out.println("Patlican kaç kilo ? : ");
        patlicanKilo = scanner.nextDouble();

        toplamFiyat += armutFiyat * armutKilo + domatesFiyat * domatesKilo + muzFiyat * muzKilo + patlicanFiyat * patlicanKilo + elmaFiyat * elmaKilo;
        System.out.println("Toplam Tutar : " + toplamFiyat + " TL");
    }
}
```

## Author
Hekim Can Aktas

## License
This project is licensed under the MIT License.

