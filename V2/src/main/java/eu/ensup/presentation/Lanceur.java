package eu.ensup.presentation;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import eu.ensup.domaine.Employe;

public class Lanceur
{
	public static void main(String[] args)
	{
		ObjectMapper objectMapper = new ObjectMapper();

		Employe employe = new Employe("Boutrois", "Benjamin");

		// Objet vers fichier JSON
		File resultFile = new File("employe.json");

		// ECRITURE
		
		try
		{
			objectMapper.writeValue(resultFile, employe);
		}
		catch (JsonGenerationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (JsonMappingException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// LECTURE
		
		Employe employe2 = null;
		
		try
		{
			employe2 = objectMapper.readValue(resultFile, Employe.class);
		}
		catch (JsonParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (JsonMappingException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(employe2);
	}
}
