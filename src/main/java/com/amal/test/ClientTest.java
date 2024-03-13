package com.amal.test;

import com.amal.dao.ClientDao;
import com.amal.entities.Client;

public class ClientTest {
	public static void main(String[] args) {
//créer un objet client
		Client c = new Client();
		c.setNom("amal");
		c.setVille("Nabeul");
//ajouter l'objet client à la BD
		ClientDao cltDao = new ClientDao();
		cltDao.ajouter(c);
		System.out.println("Appel de la méthode listerTous");
		for (Client cl : cltDao.listerTous())
			System.out.println(cl.getCode() + " " + cl.getNom());
		System.out.println("Appel de la méthode listerParNom");
		for (Client cl : cltDao.listerParNom("am"))

			System.out.println(cl.getCode() + " " + cl.getNom());

//tester les autres méthodes de la classe ClientDao
	}
}
