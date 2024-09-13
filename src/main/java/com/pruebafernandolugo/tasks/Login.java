/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebafernandolugo.tasks;

import com.pruebafernandolugo.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

/**
 *
 * @author FERAN
 */
public class Login implements Task{

    private final String username;
    private final String password;
    
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public static Login withCredentials(String username, String password) {
        return instrumented(Login.class, username, password);
    }
                
    @Override
    public <T extends Actor> void performAs(T actor) {       
        actor.attemptsTo(
                Enter.theValue(username).into(LoginPage.USERNAME_FIELD),
                Enter.theValue(password).into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }
    
    
    
}
