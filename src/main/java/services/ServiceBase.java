package services;

import javax.persistence.EntityManager;

import utils.DBUtil;

public class ServiceBase {

    protected EntityManager em = DBUtil.creteEntityManager();
    
    public void close() {
        if(em.isOpen()) {
            em.close();
        }
    }
}
