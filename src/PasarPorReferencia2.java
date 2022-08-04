//Lo ideal siempre es crear la clase en otro archivo pero para este ejemplo es algo simple
class Persona {
  private String name;

  public void modifyName( String newName ) {
    this.name = newName;
  }

  public String readName() {
    return this.name;
  }
}

public class PasarPorReferencia2 {
  public static void main(String[] args) {
    Persona persona = new Persona();
    persona.modifyName("Irving");

    System.out.println("persona.readName() = " + persona.readName());

    System.out.println("Antes de llamar el metodo test");
    test( persona );
    System.out.println("Despues de llamar el metodo test");

    System.out.println("persona.readName() = " + persona.readName());
  }

  public static void test( Persona persona ) {
    persona.modifyName("Mauricio");
  }

}
