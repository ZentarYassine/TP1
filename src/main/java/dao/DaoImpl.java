package dao;


import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        /*
        Se connecter ò la BD pour récupérer la température
        */
        System.out.println("version BD");
        double temp=Math.random()*40;
        return temp;
    }
}
