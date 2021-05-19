package fr.diginamic.testexceptions;

public class ReflectionException extends Exception {
    public ReflectionException() {
        System.out.println("Aucun pays selectionné!");;
    }
}
