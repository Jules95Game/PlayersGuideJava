package org.example.missies;

public class OmdraaiException extends Exception {
  public OmdraaiException() {
    super("Woord komt niet overeen!");
  }
}