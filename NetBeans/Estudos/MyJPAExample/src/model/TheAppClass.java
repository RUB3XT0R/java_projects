

package model;

import javax.persistence.*;

public class TheAppClass {

    public static void main(String[] args) {
        //fábrica que carrega a persistencia. vantagem: vc pode carregar várias persistencias.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPAExamplePU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();


        //People p = em.find(People.class,1);
        //System.out.println("The people is "+p.getName());
        //p.setAge(23);
        //em.persist(p);
        
        //p = em.find(People.class,2);
        //System.out.println("The people is "+p.getName());
        //People newp = new People();
        //newp.setName("Ana");
        //em.persist(newp);
        //newp = new People();
        //newp.setName("Gabriel");
        //newp.setAge(20);
        //em.persist(newp);
        //p = em.find(People.class,2);
        //System.out.println("The people is "+p.getName());

        //PeopleCP compositepeople = new PeopleCP();
        //PeopleCPPK pcp = new PeopleCPPK(1,1);
        //compositepeople.setId(pcp);
        //compositepeople.setName("teste");
        //em.persist(compositepeople);
        //PeopleCP cp = em.find(PeopleCP.class,new PeopleCPPK(1,1));
        //System.out.println("->> "+cp.getName());

        //People p = em.find(People.class,12);
        //System.out.println("---> "+p.getName()+" : "+p.getInfo());
        //PeopleInfo pinfo = new PeopleInfo();
        //pinfo.setId(12);
        //pinfo.setPeople(p);
        //pinfo.setObs("the obs");
        //pinfo.setNameOfPet("toto");
        //pinfo.setTypeOfPet("worm");
        //p.setInfo(pinfo);
        //detecção automatica de estado de objeto.
        
        /*
        People p = em.find(People.class,1);
        System.out.println("---> "+p.getName()+" : ");
        for(Address a : p.getAddress())
           System.out.println("-> "+a.getId()+", "+a.getAddress());
        
        Address addr = new Address();
        addr.setId(3);
        addr.setAddress("Address three");
        addr.setPeople(p);
        addr.setNumber(244);
        em.merge(addr);
        
        p = em.find(People.class,1);
        System.out.println("---> "+p.getName()+" : ");
        for(Address a : p.getAddress())
           System.out.println("-> "+a.getId()+", "+a.getAddress()+", nº. "+a.getNumber());
        
        addr = new Address();
        addr.setId(4);
        addr.setAddress("Address four");
        addr.setPeople(p);
        addr.setNumber(357);
        p.getAddress().add(addr);
        
        p = em.find(People.class,1);
        System.out.println("---> "+p.getName()+" : ");
        for(Address a : p.getAddress())
           System.out.println("-> "+a.getId()+", "+a.getAddress()+", nº. "+a.getNumber());
        */
        
        /*
        Group g = em.find(Group.class,3);
        System.out.println("Grupo : "+g.getName()
                +", number of peoples: "+g.getPeoples().size());
        for(People pl : g.getPeoples())
           System.out.println("--> "+pl.getName());
        /*
        People pl = em.find(People.class,1);
        System.out.println("The people:"+ pl.getName()+" has "+
                pl.getGroups().size()+" groups.");
        for(Group gg : pl.getGroups())
           System.out.println(" --> "+gg.getName());
        */
        //g = em.find(Group.class,3);
        //pl.getGroups().add(g);
        //g.getPeoples().add(pl);
        
        
        
        
        
        
        
        
        
        em.getTransaction().commit();
        em.close();
        emf.close();
    }


}
