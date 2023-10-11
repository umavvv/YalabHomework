package org.example.View;

import org.example.Model.Gamer;
import org.example.Controller.RegisterAndAuthorization;

import java.io.FileOutputStream;
import java.util.Scanner;
//Класс для вывода в консоль
public class BankAccount {
    Gamer gamer = new Gamer();
    RegisterAndAuthorization gamerRegister = new RegisterAndAuthorization();
// Начисляем денежные средства в наш банк
   private void deposit(int amount) {
        if (amount != 0) {
            gamer.setBalance(gamer.getBalance() + amount);
            gamer.setBalance(amount);
        }
    }
    // Если на счету не дастаточно средств вывод средств не будет выполнен
   private void withdraw(int amount) {
        if (amount < gamer.getBalance()) {
            gamer.setBalance(gamer.getBalance()- amount);
            gamer.setTransaction(-amount);
        } else System.out.println("Не достаточно средств для вывода!");
    }
//Данный метод оповещает сколько средств было изъято в последней транзакции
    void getPeviousTransaction() {
        if (gamer.getTransaction() < 0) {
            System.out.println("Withdrawal: " + Math.abs(gamer.getTransaction()));
        } else {
            System.out.println("Транзакция не прошла");
        }
    }
// Метод показывает весь доступный функционал в консоли
    public FileOutputStream showMenu() {
        char option;
        Scanner scanner = new Scanner(System.in);
        System.out.println("A. Баланс");
        System.out.println("B. Дебет");
        System.out.println("C. Вывод");
        System.out.println("D. Предыдущая транзакция");
        System.out.println("E. Выход");
        System.out.println("F. Регистрация и Авторизация");
            do {
                System.out.println("Введите опцию");
                option = scanner.next().charAt(0);//запуск консоли
                switch (option) {//Предоставляем выбор пользователю
                    case 'A':
                        System.out.println("Баланс = " + gamer.getBalance());
                        break;
                    case 'B':
                        System.out.println("Депозит ");
                        int amount = scanner.nextInt();
                        deposit(amount);
                        break;
                    case 'C':
                        System.out.println("Вывода");
                        int amount2 = scanner.nextInt();
                        withdraw(amount2);
                        break;
                    case 'D':
                        getPeviousTransaction();
                        break;
                    case 'E':
                        System.out.println("Выход");
                        break;
                    case 'F':
                        System.out.println("Registration!");
                        gamerRegister.registerAndAuthorization();
                        System.out.println();
                        break;
                    default:
                        System.out.println("Не корректное выражение");
                        break;
                }
            }
            //При выходе из банка вы получите оповещение
           while (option != 'E');
           System.out.println("До встречи!");


        return null;
    }
}