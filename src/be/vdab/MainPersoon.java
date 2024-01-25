package be.vdab;

public class MainPersoon {
    public static void main(String[] args) {
        var persoon1 = new Persoon("Altuntas", "Semih");
        var persoon2 = new Persoon("Altuntas", "Ayhan");

        System.out.println("persoon1 = " + persoon1.getNaam());
        System.out.println("persoon2 = " + persoon2.getNaam());

        System.out.println("-------------");

        var partij = new PolitiekePartij("AKP",15);
        var tayyip = new Politieker("Tayyip","Erdoğan");
        System.out.println(tayyip.getNaam());
        tayyip.setPartij(partij);
        System.out.println(tayyip);

    }
}
