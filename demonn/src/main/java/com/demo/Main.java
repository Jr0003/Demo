package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import Entidades.Habilidades;
import Entidades.Persona;
import Entidades.Ranking;

public class Main {

	 static final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure() // configures settings from hibernate.cfg.xml
				.build();
	 static SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
	 public static void main(String[] args) {
			Persona per1 = new Persona("joel");
			ingresarPersona(per1);
			Persona per2 = new Persona("leslie");
			ingresarPersona(per2);
			
			Habilidades hab1 = new Habilidades ("volar");
			ingresarHabilidades(hab1);
			Habilidades  hab2 = new Habilidades ("teletrasportacion");
			ingresarHabilidades(hab2);
			
			Ranking ran1 = new Ranking (1);
			ingresarRanking(ran1);
			Ranking ran2 = new Ranking (5);
			ingresarRanking(ran2);
			
			
			
				
			
			
	 }			
			static void ingresarPersona(Persona persona) {
				Session session = sessionFactory.openSession();
				session.beginTransaction();
				session.save(persona);
				
				session.getTransaction().commit();
				session.close();

			}
			static void ingresarHabilidades(Habilidades habilidades) {
				Session session = sessionFactory.openSession();
				session.beginTransaction();
				session.save(habilidades);
				
				session.getTransaction().commit();
				session.close();

			}
			static void ingresarRanking(Ranking ranking) {
				Session session = sessionFactory.openSession();
				session.beginTransaction();
				session.save(ranking);
				
				session.getTransaction().commit();
				session.close();

			}


}
