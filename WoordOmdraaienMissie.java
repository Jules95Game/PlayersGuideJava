package org.example.missies;

public class WoordOmdraaienMissie extends Missie{
  @Override
  int voerUit(boolean sloper){
    GebruikerInteractie.toonBericht("Schijf het woord \"goudzoeker\" achterstevoren.");
    String input = GebruikerInteractie.leesInput();

    try {
      reverseWord(input);
      setPunten(!sloper);

    } catch(OmdraaiException e) {
      e.printStackTrace();
      System.out.println(e.getMessage());
      setPunten(sloper);

    } finally {
      System.out.printf("Behaalde punten %d\n", behaaldePunten);
    }
    return behaaldePunten;
  }

  private void reverseWord(String input) throws OmdraaiException {
    StringBuilder builder = new StringBuilder(input);
    builder.reverse();
    if (!builder.toString().toLowerCase().equals("goudzoeker")) {
      throw new OmdraaiException();
    }
  }
}