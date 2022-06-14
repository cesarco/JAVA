public class Main {

    public static void main(String[] args) {
        Person Cesar =  Person.Builder.aPerson()
                .withName("Cesar Luis")
                .withLastName("Rodriguez Solera")
                .withEmail("devcesarco@outlook.es")
                .withPhone("302415889")
                .build();


       if( Cesar.getLastName().equals("Rodriguez")){

       }

    }


}
/*
el buider lo que trata en si, es mantener esa inmutabilidad, no permitir la modificaion
de parametros internos y asi prevenir los nullPointerException esos campo nulos
 */