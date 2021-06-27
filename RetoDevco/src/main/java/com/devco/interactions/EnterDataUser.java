package com.devco.interactions;

import com.devco.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import static com.devco.userinterfaces.CreateAccount.FIRST_NAME;
import static com.devco.userinterfaces.CreateAccount.LAST_NAME;
import static com.devco.userinterfaces.CreateAccount.EMAIL;
import static com.devco.userinterfaces.CreateAccount.PASSWORD;
import static com.devco.userinterfaces.CreateAccount.CONFIRM_PASSWORD;
import static com.devco.utils.HashUtil.decode;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnterDataUser  implements Interaction {

    private User user;

    public EnterDataUser(User user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(WaitUntil.the(FIRST_NAME, isVisible()),
             Enter.theValue(user.getFirstname()).into(FIRST_NAME),
             Enter.theValue(user.getLastname()).into(LAST_NAME),
             Enter.theValue(user.getEmail()).into(EMAIL),
             Enter.theValue(decode(user.getPassword())).into(PASSWORD),
             Enter.theValue(decode(user.getPassword())).into(CONFIRM_PASSWORD));
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }
    }

    public static EnterDataUser inTheCreationForm(User user) {
        return new EnterDataUser(user);
    }

}