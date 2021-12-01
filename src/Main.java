import java.util.Scanner;
import Logic.*;
import GUI.*;
public class Main {
    public static void main(String[] args){
        new Helper().createRandomUser();
        GUI.LogInGui.showMenu();

    }
}
