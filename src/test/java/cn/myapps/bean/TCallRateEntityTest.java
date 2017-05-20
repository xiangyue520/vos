package cn.myapps.bean;

import cn.myapps.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Created by wanggan on 2017/5/19.
 */
public class TCallRateEntityTest {
    @Test
    public void t(){
        //加载hibernate.hbm.xml

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
//        TCallRateEntity tr = new TCallRateEntity();
//        tr.setCountry("china");
//        tr.setBillingCycle(1);
//        tr.setCallPrefixNum("86");
//        tr.setPerSecondRate(1234);
//        tr.setRemarks("hello");
//        session.save(tr);
//        t.commit();
        TCallRateEntity tr = (TCallRateEntity) session.get(TCallRateEntity.class,4);
        System.out.println(tr.getBillingCycle()+tr.getRemarks());
        session.close();
        sf.close();


    }


}