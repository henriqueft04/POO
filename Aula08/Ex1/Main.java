package Aula08.Ex1;

public class Main {
    
    public static void main(String[] args) {
        
        EmpresaAluguer empresa = new EmpresaAluguer("RicRent", "4615-511", "ricrent@gmail.com");
        Ligeiro li1 = new Ligeiro("PH-12-PH", "Renault", "Twingo", 48 , 69, 100 );
        Motociclo mo1 = new Motociclo("PU-68-TO", "Honda", "CBR", 350, "Deportivo" );
        Taxi ta1 = new Taxi("AA-12-PH", "Mercedes" , "Benz", 48 , 100 , 4 );
        PesadoPassageiros pepa1 = new PesadoPassageiros("AB-12-PH", "Mercedes" , "AutoCarro", 300 , 103 , 50, 1000 );
        PesadoMercadorias pem1 = new PesadoMercadorias("AC-12-PH", "Mercedes" , "Cam", 300 , 3000 , 1500, 3 );
        empresa.addVeiculo(li1);
        empresa.addVeiculo(mo1);
        empresa.addVeiculo(ta1);
        empresa.addVeiculo(pepa1);
        empresa.addVeiculo(pem1);
        li1.trajeto(300);
        mo1.trajeto(200);
        li1.trajeto(100);
        System.out.println(li1.ultimoTrajeto()); 
        System.out.println(li1.distanciaTotal());
        System.out.println(empresa);
        System.out.println("veiculo mais usado");
        System.out.println( empresa.maisUsado(empresa));
        empresa.removeVeiculo("PH-12-PH");

        LigeiroEletrico twingoAco = new LigeiroEletrico("EL-12-ET", "Renault", "Twingo", 690 , 69, 100, 10000);
        empresa.addVeiculo(twingoAco);
        twingoAco.trajeto(100);
        twingoAco.carregar(70);
        System.out.println(twingoAco);

        PesadoPassaEletrico autocarroTesla = new PesadoPassaEletrico( "EL-67-ET", "Tesla", "Autocarro", 690 , 69, 100, 10000, 1000);
        empresa.addVeiculo(autocarroTesla);
        autocarroTesla.trajeto(100);
        autocarroTesla.carregar(70);
        System.out.println(autocarroTesla);
        System.out.println("Ordem de portencia: ");
        empresa.ordemPotentencia(empresa);

    }
}