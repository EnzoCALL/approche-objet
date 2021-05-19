package fr.diginamic.recensement.service;

import fr.diginamic.recensement.Recensement;

import java.util.Scanner;

public abstract class MenuService {
    public abstract void traiter(Recensement recensement, Scanner scanner);
}