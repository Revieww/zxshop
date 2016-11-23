package me.gacl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.BeforeClass;
import org.junit.Test;

public class JpaTest {

    @BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
    }  
  
    @Test  
    public void createTable(){  
        //验证表  
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("user");  
        factory.close();  
    }  
}
