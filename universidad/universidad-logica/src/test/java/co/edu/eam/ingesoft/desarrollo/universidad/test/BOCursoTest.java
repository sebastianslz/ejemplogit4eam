package co.edu.eam.ingesoft.desarrollo.universidad.test;

import java.util.List;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BOAsignatura;
import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BOCurso;
import co.edu.eam.ingesoft.desarrollo.universidad.logica.bos.BODocente;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Docente;
import junit.framework.Assert;


public class BOCursoTest {

	private BOCurso boCurso;
	private BOAsignatura boAsignatura;
	private BODocente boDocente;
	
	@BeforeClass
	public static void beforeClass(){
		TestDataUtil.ejecutarSQL("sqltest/BOCursoTest-add.sql");
	}
	
	@Before
	public void setUp(){
		boCurso = new BOCurso();
		boAsignatura = new BOAsignatura();
		boDocente = new BODocente();
	}
	
	@Test
	public void testCrearCurso(){
		try{
			
			Asignatura asignatura = boAsignatura.buscarAsignatura("555");
			Docente docente = boDocente.buscarDocente("222");
			Curso curso = new Curso("123451234", asignatura, docente);
			
				boCurso.crearCurso(curso);
				Assert.assertNotNull(curso);
				Assert.assertEquals("222", curso.getDocente().getCedula());
			
		}catch(Exception ex){
			Assert.fail();
			ex.printStackTrace();
		}
	}
	
	@Test
	public void buscarCursoTest(){
		try{
			Curso curso = boCurso.buscarCurso("777");
			if(curso!=null){
				if(curso.getCodigo().equals("777")){
				Assert.assertNotNull(curso);
				}else{
					Assert.fail();
				}
			}else{
				Assert.fail();
			}
		}catch(Exception ex){
			Assert.fail();
			ex.printStackTrace();
		}
	}
	
	@Test
	public void listarCursosPorAsignaturaTest(){
		try{
			Asignatura asignatura = boAsignatura.buscarAsignatura("555");
			List<Curso> cursos = boCurso.listarCursosPorASignatura(asignatura);
			if(!cursos.isEmpty()){
				if(cursos.get(0).getCodigo().equals("777")){
					Assert.assertNotNull(cursos);
				}else{
					Assert.fail();
				}
			}else{
				Assert.fail();
			}
		}catch(Exception ex){
			Assert.fail();
			ex.printStackTrace();
		}
	}
	
	
	
	@AfterClass
	public static void afterClass(){
		TestDataUtil.ejecutarSQL("sqltest/BOCursoTest-del.sql");
	}
	
	
}
