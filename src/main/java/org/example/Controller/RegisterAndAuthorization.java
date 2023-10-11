package org.example.Controller;

import org.example.Model.Gamer;

import java.util.InputMismatchException;
import java.util.Scanner;

//Класс регистрации и авторизации пользователя
public class RegisterAndAuthorization {

    public void registerAndAuthorization() {
        Gamer gamer = new Gamer();
        Scanner scan = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Name");
        gamer.setCustomerName(scan.nextLine());//Получаем с консоли логин от пользователя
        System.out.println("Password");
        gamer.setPassword(scan.nextLine());//Получаем с консоли пароль от пользователя
        System.out.println("The identifier must be numeric");
        System.out.println("ID");
        try {
            /* на данном этапе разработки пользователь может указать свой ID вручную */
            gamer.setIdTransaction(scan.nextInt());
        } catch (InputMismatchException e) { //выведет ошибку если введете не верный формат ID
            System.out.println("Вы ввели не верный формат ID ");
            scan.next();
        }
        System.out.println("Authorization Name");
        String inpUser = keyboard.nextLine();// получение имени для авторизации
        System.out.println("Authorization Password");
        String inpPass = keyboard.nextLine();// получение пароля для авторизации

        //Проверка на наличие созданного аккаунта
        if (inpUser.equals(gamer.getCustomerName()) && inpPass.equals(gamer.getPassword())){
            System.out.print("Ты авторизовался/лась");
    } else {
            System.out.print("Авторизация не прошла!");
        }
    }
}