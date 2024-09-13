/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebafernandolugo.tasks;

import com.pruebafernandolugo.ui.RecruitmentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

/**
 *
 * @author FERAN
 */
public class AddCandidate implements Task {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String vacancy;
    
    public AddCandidate(String firstName, String lastName, String email, String vacancy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.vacancy = vacancy;
    }
    
    public static AddCandidate withInfo(String firstName, String lastName, String email, String vacancy) {
        return instrumented(AddCandidate.class, firstName, lastName, email, vacancy);
    }
    
    @Override
    public <T extends Actor> void performAs(T actor) {
        
        actor.remember("fullName", firstName + " " + lastName);
        
        actor.attemptsTo(
            Click.on(RecruitmentPage.RECRUITMENT_MENU),
            WaitUntil.the(RecruitmentPage.ADD_BUTTON, isClickable()),
            Click.on(RecruitmentPage.ADD_BUTTON),
            Enter.theValue(firstName).into(RecruitmentPage.FIRST_NAME),            
            Enter.theValue(lastName).into(RecruitmentPage.LAST_NAME),           
            Enter.theValue(email).into(RecruitmentPage.EMAIL),
            Click.on(RecruitmentPage.VACANCY),
            Hit.the(Keys.ARROW_DOWN).into(RecruitmentPage.VACANCY),
            Hit.the(Keys.ENTER).into(RecruitmentPage.VACANCY),
            WaitUntil.the(RecruitmentPage.SAVE_BUTTON, isClickable()),
            Click.on(RecruitmentPage.SAVE_BUTTON)
        );
    }
    
    
    
}
