/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebafernandolugo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 *
 * @author FERAN
 */
public class LoginPage {
    
    public static final Target USERNAME_FIELD = Target.the("campo de nombre de usuario")
        .located(By.xpath("//input[contains(@class, 'oxd-input') and contains(@class, 'oxd-input--active') and @name='username']"));
    
    public static final Target PASSWORD_FIELD = Target.the("campo de contraseña")
        .located(By.xpath("//input[@class='oxd-input oxd-input--active' and @type='password' and @name='password']"));
    
    public static final Target LOGIN_BUTTON = Target.the("botón de inicio de sesión")
        .located(By.xpath("//button[@type='submit' and contains(@class, 'oxd-button') and contains(@class, 'orangehrm-login-button')]"));
    
    
}
