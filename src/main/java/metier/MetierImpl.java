package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class MetierImpl implements IMetier {
    //Couplage faible


    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*540 ;
        return res;
    }

       /*
       Injecter  un objet d'une classe qui implémente l'interface IDao dans la var dao
       */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
